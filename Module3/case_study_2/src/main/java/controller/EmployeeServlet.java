package controller;

import model.bean.Employee;
import model.bean.Position;
import model.repository.PositionRepository;
import model.service.EmployeeService;
import model.service.Impl.EmployeeServiceImpl;
import model.service.Impl.PositionServiceImpl;
import model.service.PositionService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employees")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService = new EmployeeServiceImpl();
    PositionService positionService = new PositionServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            case"edit":
                showFormEdit(request,response);
                break;
            case"search":
                searchByName(request,response);
                break;
            default:
                showEmployeeList(request, response);
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
        List<Employee> searchList = employeeService.search(search);
        request.setAttribute("employeeList",searchList);
        request.setAttribute("positionList",positionService.selectFindAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.selectEmployee(id);
        request.setAttribute("employee",employee);
        request.setAttribute("positionList",positionService.selectFindAll());
        Position position = positionService.selectPositionById(employee.getPositionId());
        request.setAttribute("position",position);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/create.jsp");
        request.setAttribute("positionList", positionService.selectFindAll());


        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
        employeeService.deleteEmployee(id);
        request.setAttribute("employeeList", employeeService.selectFindAll());
        request.setAttribute("positionList", positionService.selectFindAll());
        try {
            response.sendRedirect("/employees");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void showEmployeeList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/list.jsp");
        request.setAttribute("employeeList", employeeService.selectFindAll());
        request.setAttribute("positionList", positionService.selectFindAll());
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
            case"edit":
                editEmployee(request,response);
                break;
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = new Employee(id,name,birthday,idCard,salary,phone,email,address,positionId);
        String mess = "Edit thanh cong";
        boolean check = employeeService.updateEmployee(employee);
        if(!check){
            mess = "Edit khong thanh cong";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/edit.jsp");
        request.setAttribute("mess",mess);
        request.setAttribute("employee",employee);
        request.setAttribute("positionList",positionService.selectFindAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee/create.jsp");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        Employee employee = new Employee(name, birthday, idCard, salary, phone, email, address, positionId);
        String mess = "Them moi thanh cong";
        List<String> stringList = employeeService.insertEmployee(employee);
        for(String string : stringList){
            if(!string.equals("")){
                mess="Them moi khong thanh cong";
                break;
            }
        }
        request.setAttribute("positionList",positionService.selectFindAll());
        request.setAttribute("stringList",stringList);
        request.setAttribute("mess", mess);
        request.setAttribute("employee",employee);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
