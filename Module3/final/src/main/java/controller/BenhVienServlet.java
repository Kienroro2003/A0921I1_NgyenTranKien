package controller;

import model.bean.BenhVien;
import model.service.BenhVienService;
import model.service.Impl.BenhVienServiceImpl;


import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.List;

@WebServlet(name = "BenhVienServlet", value = "/benhvien")
public class BenhVienServlet extends HttpServlet {
    private BenhVienService benhVienService = new BenhVienServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
switch (action){
    case "create":
        showFormCreate(request,response);
        break;
    case "edit":
        showFormEdit(request,response);
        break;
    case "delete":
        delete(request,response);
        break;
    default:
        showList(request,response);
        break;
}
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        benhVienService.deleteBenhVien(id);
        try {
            response.sendRedirect("/benhvien");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        BenhVien benhVien = benhVienService.selectBenhVien(id);
        request.setAttribute("benhNhan",benhVien);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/list.jsp");
        request.setAttribute("benhVienList",benhVienService.selectFindAll());
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
        String action = request.getParameter("action");
        if(action == null)action="";
        switch (action){
            case "create":
                insert(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/edit.jsp");
        String tenBenhNhan = request.getParameter("name");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDo = request.getParameter("liDo");
        int id = Integer.parseInt(request.getParameter("id"));
        BenhVien benhVien = new BenhVien(id,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDo);
        String mess = "Edit thanh cong";
        List<String> strCheck = benhVienService.updateBenhVien(benhVien);
        for(String string : strCheck){
            if(!string.equals("")){
                mess="Them moi khong thanh cong";
                break;
            }
        }
        request.setAttribute("stringList",strCheck);
        request.setAttribute("mess",mess);
        request.setAttribute("benhNhan",benhVien);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/create.jsp");
        String maBenhAn = request.getParameter("maBenhAn");
        String maBenhNhan = request.getParameter("maBenhNhan");
        String tenBenhNhan = request.getParameter("name");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDo = request.getParameter("liDo");
        BenhVien benhVien = new BenhVien(maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDo);
        String mess = "Them moi thanh cong";
        List<String> strCheck = benhVienService.insertBenhVien(benhVien);
        for(String string : strCheck){
            if(!string.equals("")){
                mess="Them moi khong thanh cong";
                break;
            }
        }
        request.setAttribute("benhNhan",benhVien);
        request.setAttribute("stringList",strCheck);
        request.setAttribute("mess",mess);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
