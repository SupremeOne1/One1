package com.poly.manhhh.AssignmentJV4.controller;


import com.poly.manhhh.AssignmentJV4.entity.ChucVu;
import com.poly.manhhh.AssignmentJV4.repository.ChucVuRepository;
import com.poly.manhhh.AssignmentJV4.service.ChucVuService;
import com.poly.manhhh.AssignmentJV4.service.Impl.ChucVuServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ChucVuController", value = {
        "/chuc-vu/hien-thi",
        "/chuc-vu/detail",
        "/chuc-vu/remove",
        "/chuc-vu/add",
        "/chuc-vu/update",
        "/chuc-vu/view-add",
        "/chuc-vu/view-update",
})
public class ChucVuController extends HttpServlet {

    private ChucVuRepository chucVuRepository = new ChucVuRepository();
    private ChucVuService chucVuService = new ChucVuServiceImpl();
    private List<ChucVu> listChucVu = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThiChucVu(request, response);
        } else if (uri.contains("detail")){
            this.detailChucVu(request, response);
        } else if (uri.contains("remove")){
            this.removeChucVu(request, response);
        } else if (uri.contains("view-add")){
            this.viewAddChucVu(request, response);
        } else if (uri.contains("view-update")){
            this.viewUpdateChucVu(request, response);
        } else {
            this.hienThiChucVu(request, response);
        }
    }

    private void hienThiChucVu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listChucVu = chucVuService.getAllChucVu();
        request.setAttribute("listChucVu", listChucVu);
        request.getRequestDispatcher("/ChucVu/view-chuc-vu.jsp").forward(request, response);
    }

    private void detailChucVu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeChucVu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddChucVu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateChucVu(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
