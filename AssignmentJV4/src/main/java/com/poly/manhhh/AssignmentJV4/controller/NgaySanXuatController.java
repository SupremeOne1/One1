package com.poly.manhhh.AssignmentJV4.controller;


import com.poly.manhhh.AssignmentJV4.entity.NgaySanXuat;
import com.poly.manhhh.AssignmentJV4.repository.NgaySanXuatRepository;
import com.poly.manhhh.AssignmentJV4.service.Impl.NgaySanXuatServiceImpl;
import com.poly.manhhh.AssignmentJV4.service.NgaySanXuatService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "NgaySanXuatController", value = {
        "/ngay-san-xuat/hien-thi",
        "/ngay-san-xuat/detail",
        "/ngay-san-xuat/remove",
        "/ngay-san-xuat/add",
        "/ngay-san-xuat/update",
        "/ngay-san-xuat/view-add",
        "/ngay-san-xuat/view-update",
})
public class NgaySanXuatController extends HttpServlet {

    private NgaySanXuatRepository ngaySanXuatRepository = new NgaySanXuatRepository();
    private NgaySanXuatService ngaySanXuatService = new NgaySanXuatServiceImpl();
    private List<NgaySanXuat> listNgaySanXuat = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThiNgaySanXuat(request, response);
        } else if (uri.contains("detail")){
            this.detailNgaySanXuat(request, response);
        } else if (uri.contains("remove")){
            this.removeNgaySanXuat(request, response);
        } else if (uri.contains("view-add")){
            this.viewAddNgaySanXuat(request, response);
        } else if (uri.contains("view-update")){
            this.viewUpdateNgaySanXuat(request, response);
        } else {
            this.hienThiNgaySanXuat(request, response);
        }
    }

    private void hienThiNgaySanXuat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listNgaySanXuat = ngaySanXuatService.getAllNgaySanXuat();
        request.setAttribute("listNgaySanXuat", listNgaySanXuat);
        request.getRequestDispatcher("/NgaySanXuat/view-ngay-san-xuat.jsp").forward(request, response);
    }

    private void detailNgaySanXuat(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeNgaySanXuat(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddNgaySanXuat(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateNgaySanXuat(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
