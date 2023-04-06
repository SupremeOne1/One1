package com.poly.manhhh.AssignmentJV4.controller;


import com.poly.manhhh.AssignmentJV4.entity.ChiTietSanPham;
import com.poly.manhhh.AssignmentJV4.repository.ChiTietSanPhamRepository;
import com.poly.manhhh.AssignmentJV4.service.ChiTietSanPhamService;
import com.poly.manhhh.AssignmentJV4.service.Impl.ChiTietSanPhamServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "ChiTietSanPhamController", value = {
        "/chi-tiet-san-pham/hien-thi",
        "/chi-tiet-san-pham/detail",
        "/chi-tiet-san-pham/remove",
        "/chi-tiet-san-pham/add",
        "/chi-tiet-san-pham/update",
        "/chi-tiet-san-pham/view-update",
        "/chi-tiet-san-pham/view-add",
})
public class ChiTietSanPhamController extends HttpServlet {

    private ChiTietSanPhamRepository chiTietSanPhamRepository = new ChiTietSanPhamRepository();
    private ChiTietSanPhamService chiTietSanPhamService = new ChiTietSanPhamServiceImpl();
    private List<ChiTietSanPham> listChiTietSanPham = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.hienThiChiTietSP(request, response);
        } else if (uri.contains("detail")) {
            this.detailChiTietSP(request, response);
        } else if (uri.contains("remove")) {
            this.removeChiTietSP(request, response);
        } else if (uri.contains("view-add")) {
            this.viewAddChiTietSP(request, response);
        } else if (uri.contains("view-update")) {
            this.viewUpdateChiTietSP(request, response);
        } else {
            this.hienThiChiTietSP(request, response);
        }
    }

    private void hienThiChiTietSP(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listChiTietSanPham = chiTietSanPhamService.getAllChiTietSanPham();
        request.setAttribute("listChiTietSP", listChiTietSanPham);
        request.getRequestDispatcher("/ChiTietSanPham/view-chi-tiet-san-pham.jsp").forward(request, response);
    }

    private void detailChiTietSP(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeChiTietSP(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddChiTietSP(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateChiTietSP(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        UUID id = UUID.fromString(idStr);
        ChiTietSanPham chiTietSanPham = chiTietSanPhamRepository.getOneChiTietSanPham(id);
        request.setAttribute("chiTietSP", chiTietSanPham);
        request.getRequestDispatcher("/ChiTietSanPham/update-chi-tiet-san-pham.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add")) {
            this.addChiTietSP(request, response);
        } else if (uri.contains("update")) {
            this.updateChiTietSP(request, response);
        }
    }

    private void addChiTietSP(HttpServletRequest request, HttpServletResponse response) {


    }

    private void updateChiTietSP(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String idStr = request.getParameter("id");
        UUID id = UUID.fromString(idStr);
        ChiTietSanPham chiTietSanPham = chiTietSanPhamService.getOneChiTietSanPham(id);
        if (chiTietSanPham != null) {
            Integer namBH = Integer.valueOf(request.getParameter("namBH"));
            Integer soLuongTon = Integer.valueOf(request.getParameter("soLuongTon"));
            String moTa = request.getParameter("moTa");
            BigDecimal giaNhap = new BigDecimal(request.getParameter("giaNhap"));
            BigDecimal giaBan = new BigDecimal(request.getParameter("giaBan"));

            chiTietSanPham.setNamBH(namBH);
            chiTietSanPham.setSoLuongTon(soLuongTon);
            chiTietSanPham.setMoTa(moTa);
            chiTietSanPham.setGiaNhap(giaNhap);
            chiTietSanPham.setGiaBan(giaBan);
//            ChiTietSanPham chiTietSanPham1 = ChiTietSanPham.builder().id(id).namBH(namBH).soLuongTon(soLuongTon).moTa(moTa).giaNhap(giaNhap).giaBan(giaBan).build();
//            chiTietSanPhamService.updateChiTietSanPham(chiTietSanPham1);
        }
        response.sendRedirect("/chi-tiet-san-pham/hien-thi");
    }
}
