package controller;

import model.bean.Contract;
import model.service.ContractService;
import model.service.CustomerService;
import model.service.EmployeeService;
import model.service.Impl.ContractServiceImpl;
import model.service.Impl.CustomerServiceImpl;
import model.service.Impl.EmployeeServiceImpl;
import model.service.Impl.ServiceServiceImpl;
import model.service.ServiceService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContractServlet", value = "/contracts")
public class ContractServlet extends HttpServlet {
    private ContractService contractService = new ContractServiceImpl();
    private EmployeeService employeeService = new EmployeeServiceImpl();
    private CustomerService customerService = new CustomerServiceImpl();
    private ServiceService serviceService = new ServiceServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case"delete":
                deleteContract(request,response);
                break;
            default:
                showServiceList(request, response);
        }
    }

    private void deleteContract(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        contractService.deleteContract(id);
        try {
            response.sendRedirect("/contracts");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Contract contract = contractService.selectContract(id);
        request.setAttribute("contract",contract);
        request.setAttribute("employeeList", employeeService.selectFindAll());
        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("serviceList", serviceService.selectFindAll());
        request.setAttribute("employee",employeeService.selectEmployee(contract.getEmployeeId()));
        request.setAttribute("customer",customerService.selectCustomer(contract.getCustomerId()));
        request.setAttribute("service",serviceService.select_service_by_id(contract.getServiceId()));
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/create.jsp");
        request.setAttribute("employeeList", employeeService.selectFindAll());

        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("serviceList", serviceService.selectFindAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showServiceList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/list.jsp");
        request.setAttribute("contractList", contractService.selectFindAll());
        request.setAttribute("employeeList", employeeService.selectFindAll());
        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("serviceList", serviceService.selectFindAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "create":
                createContract(request, response);
            case "edit":
                editContract(request,response);
                break;
        }
    }

    private void editContract(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        Contract contract = new Contract(id,startDate,endDate,deposit,employeeId,customerId,serviceId);
        boolean check = contractService.updateContract(contract);
        String mess = "Them moi thanh cong";
        if(!check){
            mess = "Them moi khong thanh cong";
        }
        request.setAttribute("employeeList", employeeService.selectFindAll());
        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("serviceList", serviceService.selectFindAll());
        request.setAttribute("mess",mess);
        request.setAttribute("contract",contract);
        request.setAttribute("employee",employeeService.selectEmployee(contract.getEmployeeId()));
        request.setAttribute("customer",customerService.selectCustomer(contract.getCustomerId()));
        request.setAttribute("service",serviceService.select_service_by_id(contract.getServiceId()));
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contract/create.jsp");
        request.setAttribute("employeeList", employeeService.selectFindAll());
        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("serviceList", serviceService.selectFindAll());
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        Contract contract = new Contract(startDate,endDate,deposit,employeeId,customerId,serviceId);
        boolean check = contractService.insertContract(contract);
        String mess = "Them moi thanh cong";
        if(!check){
            mess = "Them moi khong thanh cong";
        }
        request.setAttribute("mess",mess);
        request.setAttribute("contract",contract);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
