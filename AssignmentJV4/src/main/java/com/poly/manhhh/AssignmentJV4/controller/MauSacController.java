package com.poly.manhhh.AssignmentJV4.controller;


import com.poly.manhhh.AssignmentJV4.entity.MauSac;
import com.poly.manhhh.AssignmentJV4.repository.MauSacRepository;
import com.poly.manhhh.AssignmentJV4.service.Impl.MauSacServiceImpl;
import com.poly.manhhh.AssignmentJV4.service.MauSacService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MauSacController", value = {
        "/mau-sac/hien-thi",
        "/mau-sac/detail",
        "/mau-sac/remove",
        "/mau-sac/add",
        "/mau-sac/update",
        "/mau-sac/view-add",
        "/mau-sac/view-update",
})
public class MauSacController extends HttpServlet {

    private MauSacRepository mauSacRepository = new MauSacRepository();
    private MauSacService mauSacService = new MauSacServiceImpl();
    private List<MauSac> listMauSac = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")){
            this.hienThiMauSac(request, response);
        } else if (uri.contains("detail")){
            this.detailMauSac(request, response);
        } else if (uri.contains("remove")){
            this.removeMauSac(request, response);
        } else if (uri.contains("view-add")){
            this.viewAddMauSac(request, response);
        } else if (uri.contains("view-update")){
            this.viewUpdateMauSac(request, response);
        } else {
            this.hienThiMauSac(request, response);
        }
    }

    private void hienThiMauSac(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listMauSac = mauSacService.getAllMauSac();
        request.setAttribute("listMauSac", listMauSac);
        request.getRequestDispatcher("/MauSac/view-mau-sac.jsp").forward(request, response);
    }

    private void detailMauSac(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeMauSac(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddMauSac(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateMauSac(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
