package com.poly.manhhh.AssignmentJV4.controller;



import com.poly.manhhh.AssignmentJV4.entity.SanPham;
import com.poly.manhhh.AssignmentJV4.repository.SanPhamRepository;
import com.poly.manhhh.AssignmentJV4.service.Impl.SanPhamServiceImpl;
import com.poly.manhhh.AssignmentJV4.service.SanPhamService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SanPhamController", value = {
        "/san-pham/hien-thi",
        "/san-pham/detail",
        "/san-pham/remove",
        "/san-pham/add",
        "/san-pham/update",
        "/san-pham/view-add",
        "/san-pham/view-update",
})
public class SanPhamController extends HttpServlet {
    
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();
    private SanPhamService sanPhamService = new SanPhamServiceImpl();
    private List<SanPham> listSanPham = new ArrayList<>();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThiSanPham(request, response);
        } else if (uri.contains("detail")){
            this.detailSanPham(request, response);
        } else if (uri.contains("remove")){
            this.removeSanPham(request, response);
        } else if (uri.contains("view-add")){
            this.viewAddSanPham(request, response);
        } else if (uri.contains("view-update")){
            this.viewUpdateSanPham(request, response);
        } else {
            this.hienThiSanPham(request, response);
        }
    }

    private void hienThiSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listSanPham = sanPhamService.getAllSanPham();
        request.setAttribute("listSanPham", listSanPham);
        request.getRequestDispatcher("/SanPham/view-san-pham.jsp").forward(request, response);
    }

    private void detailSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
