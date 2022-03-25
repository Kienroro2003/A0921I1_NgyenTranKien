package controller;

import model.bean.Product;
import model.service.ProductService;
import model.service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                showViewForm(request,response);
                break;
            case "search":
                showSearchForm(request,response);
                break;
            default:
                showListCustomer(request, response);
                break;
        }
    }

    private void showSearchForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/search.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showViewForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher requestDispatcher;
        Product product = productService.findById(id);
        if (product == null) {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("product/view.jsp");
            request.setAttribute("product", product);
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher requestDispatcher;
        Product product = productService.findById(id);
        if (product == null) {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("product/delete.jsp");
            request.setAttribute("product", product);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher requestDispatcher;
        Product product = productService.findById(id);
        if (product == null) {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("product/edit.jsp");
            request.setAttribute("product", product);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = this.productService.findAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        request.setAttribute("products", productList);
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
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
            default:
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        RequestDispatcher requestDispatcher;
        List<Product> products = productService.findByName(search);
        if(products == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else{
            request.setAttribute("products",products);
            requestDispatcher = request.getRequestDispatcher("product/listSearch.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher requestDispatcher;
        if(product == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else{
            productService.delete(id);
            try {
                response.sendRedirect("/product");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String detail = request.getParameter("detail");
        String producer = request.getParameter("producer");
        Product product = productService.findById(id);
        RequestDispatcher requestDispatcher;
        if (product == null) {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            product.setProductName(name);
            product.setPrice(price);
            product.setDetail(detail);
            product.setProducer(producer);
            productService.update(id, product);
            requestDispatcher = request.getRequestDispatcher("product/edit.jsp");
            request.setAttribute("message", "Edit OK!");
            request.setAttribute("product", product);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = (int) Math.round(Math.random() * 1000);
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String detail = request.getParameter("detail");
        String producer = request.getParameter("producer");
        Product product = new Product(id, name, price, detail, producer);
        productService.save(product);
        request.setAttribute("message", "Create OK!");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
