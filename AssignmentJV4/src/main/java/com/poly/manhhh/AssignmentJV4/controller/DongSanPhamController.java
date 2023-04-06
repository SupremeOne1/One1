package com.poly.manhhh.AssignmentJV4.controller;


import com.poly.manhhh.AssignmentJV4.entity.DongSanPham;
import com.poly.manhhh.AssignmentJV4.repository.DongSanPhamRepository;
import com.poly.manhhh.AssignmentJV4.service.DongSanPhamService;
import com.poly.manhhh.AssignmentJV4.service.Impl.DongSanPhamServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DongSanPhamController", value = {
        "/dong-san-pham/hien-thi",
        "/dong-san-pham/detail",
        "/dong-san-pham/remove",
        "/dong-san-pham/add",
        "/dong-san-pham/update",
        "/dong-san-pham/view-add",
        "/dong-san-pham/view-update",
})
public class DongSanPhamController extends HttpServlet {

    private DongSanPhamRepository dongSanPhamRepository = new DongSanPhamRepository();
    private DongSanPhamService dongSanPhamService = new DongSanPhamServiceImpl();
    private List<DongSanPham> listDongSanPham = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThiDongSanPham(request, response);
        } else if (uri.contains("detail")){
            this.detailDongSanPham(request, response);
        } else if (uri.contains("remove")){
            this.removeDongSanPham(request, response);
        } else if (uri.contains("view-add")){
            this.viewAddDongSanPham(request, response);
        } else if (uri.contains("view-update")){
            this.viewUpdateDongSanPham(request, response);
        } else {
            this.hienThiDongSanPham(request, response);
        }
    }

    private void hienThiDongSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listDongSanPham = dongSanPhamService.getAllDongSanPham();
        request.setAttribute("listDongSP", listDongSanPham);
        request.getRequestDispatcher("/DongSanPham/view-dong-san-pham.jsp").forward(request, response);
    }

    private void detailDongSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeDongSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddDongSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateDongSanPham(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
