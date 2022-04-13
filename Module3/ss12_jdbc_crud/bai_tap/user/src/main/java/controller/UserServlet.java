package controller;

import dao.IUserDAO;
import dao.UserDAO;
import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    IUserDAO userServlet = new UserDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "delete":
                try {
                    showDeleteForm(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case"edit":
                showEditForm(request,response);
                break;
            case "search":
                try {
                    searchUser(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "sort":
                try {
                    sortByName(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "permision":
                addUserPermision(request,response);
                break;
            default:
                showListUser(request, response);
        }

    }

    private void addUserPermision(HttpServletRequest request, HttpServletResponse response) {

        User user = new User("quan", "quan.nguyen@codegym.vn", "vn");

        int[] permision = {1, 2, 4};

        userServlet.addUserTransaction(user, permision);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userServlet.selectUser(id);
        RequestDispatcher requestDispatcher;
        if(user != null){
            requestDispatcher = request.getRequestDispatcher("user/edit.jsp");
            request.setAttribute("user",user);
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws SQLException {
            RequestDispatcher requestDispatcher;
            int id = Integer.parseInt(request.getParameter("id"));
            boolean check = userServlet.deleteUser(id);
            if(check){
                requestDispatcher = request.getRequestDispatcher("user/list.jsp");
                List<User> list = userServlet.selectAllUser();
                request.setAttribute("listUser",list);
                try {
                    requestDispatcher.forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListUser(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/list.jsp");
        List<User> userList = userServlet.selectAllUser();
        request.setAttribute("listUser", userList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sortByName(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/sort.jsp");
        List<User> userList = userServlet.sort();
        request.setAttribute("listUser", userList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/search.jsp");
        String search = request.getParameter("search");
        List<User> list = userServlet.search(search);
        request.setAttribute("listUser",list);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acction = request.getParameter("action");
        if (acction == null) acction = "";
        switch (acction) {
            case "create":
                insertUser(request, response);
                break;
            case"edit":
                try {
                    updateUser(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

        }
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id,name,email,country);
        boolean check = userServlet.updateUser(user);
        if(check){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/create.jsp");
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name,email,country);
        userServlet.insertUser(user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/list.jsp");
        List<User> list =userServlet.selectAllUser();
        request.setAttribute("listUser",list);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
