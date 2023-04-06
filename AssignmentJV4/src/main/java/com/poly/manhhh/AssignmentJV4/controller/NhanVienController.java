package com.poly.manhhh.AssignmentJV4.controller;


import com.poly.manhhh.AssignmentJV4.entity.NhanVien;
import com.poly.manhhh.AssignmentJV4.repository.NhanVienRepository;
import com.poly.manhhh.AssignmentJV4.service.Impl.NhanVienServiceImpl;
import com.poly.manhhh.AssignmentJV4.service.NhanVienService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "NhanVienController", value = {
        "/nhan-vien/hien-thi",
        "/nhan-vien/detail",
        "/nhan-vien/remove",
        "/nhan-vien/add",
        "/nhan-vien/update",
        "/nhan-vien/view-add",
        "/nhan-vien/view-update",
})
public class NhanVienController extends HttpServlet {

    private NhanVienRepository nhanVienRepository = new NhanVienRepository();
    private NhanVienService nhanVienService = new NhanVienServiceImpl();
    private List<NhanVien> listNhanVien = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.hienThiNhanVien(request, response);
        } else if (uri.contains("detail")) {
            this.detailNhanVien(request, response);
        } else if (uri.contains("remove")) {
            this.removeNhanVien(request, response);
        } else if (uri.contains("view-add")) {
            this.viewAddNhanVien(request, response);
        } else if (uri.contains("view-update")) {
            this.viewUpdateNhanVien(request, response);
        } else {
            this.hienThiNhanVien(request, response);
        }
    }

    private void hienThiNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listNhanVien = nhanVienService.getAllNhanVien();
        request.setAttribute("listNhanVien", listNhanVien);
        request.getRequestDispatcher("/NhanVien/view-nhan-vien.jsp").forward(request, response);
    }

    private void detailNhanVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeNhanVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddNhanVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateNhanVien(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
