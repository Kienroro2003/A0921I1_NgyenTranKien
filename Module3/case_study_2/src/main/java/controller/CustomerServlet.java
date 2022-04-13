package controller;

import model.bean.Customer;
import model.bean.Employee;
import model.service.CustomerService;
import model.service.CustomerTypeService;
import model.service.Impl.CustomerServiceImpl;
import model.service.Impl.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    private CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "search":
                searchByName(request, response);
                break;
            default:
                showCustomerList(request, response);
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        String search = request.getParameter("search");
        List<Customer> customerList = customerService.search(search);
        request.setAttribute("customerList",customerList);
        request.setAttribute("customerTypeList",customerTypeService.selectFindAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.selectCustomer(id);
        request.setAttribute("customer",customer);
        request.setAttribute("customerType",customerTypeService.select_customerType_by_id(id));
        request.setAttribute("customerTypeList",customerTypeService.selectFindAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
        customerService.deleteCustomer(id);
        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("customerTypeList", customerTypeService.selectFindAll());
        try {
            response.sendRedirect("/employees");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        request.setAttribute("customerList", customerService.selectFindAll());
        request.setAttribute("customerTypeList", customerTypeService.selectFindAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("customerTypeList", customerTypeService.selectFindAll());
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
                createEmployee(request, response);
                break;
            case "edit":
                editEmployee(request, response);
                break;
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
//            double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = new Customer(id,name,birthday,gender,idCard,phone,email,address,customerTypeId);
        String mess = "Edit thanh cong";
        boolean check = customerService.updateCustomer(customer);
        if(!check){
            mess = "Edit khong thanh cong";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        request.setAttribute("mess",mess);
        request.setAttribute("customer",customer);
        request.setAttribute("customerType",customerTypeService.select_customerType_by_id(id));
        request.setAttribute("customerTypeList",customerTypeService.selectFindAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
            String name = request.getParameter("name");
            String birthday = request.getParameter("birthday");
            boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
            String idCard = request.getParameter("idCard");
//            double salary = Double.parseDouble(request.getParameter("salary"));
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            int customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
            Customer customer = new Customer(name, birthday,gender, idCard, phone, email, address, customerTypeId);
            String mess = "Them moi thanh cong";
            List<String> stringList = customerService.insertCustomer(customer);
            for(String string : stringList){
                if(!string.equals("")){
                    mess="Them moi khong thanh cong";
                    break;
                }
            }
            request.setAttribute("customerTypeList",customerTypeService.selectFindAll());
            request.setAttribute("stringList",stringList);
            request.setAttribute("mess", mess);
            request.setAttribute("customer",customer);
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
