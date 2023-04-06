package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.ChiTietSanPham;

import java.util.List;
import java.util.UUID;

public interface ChiTietSanPhamService {
    List<ChiTietSanPham> getAllChiTietSanPham();

    ChiTietSanPham getOneChiTietSanPham(UUID id);

    void addChiTietSanPham(ChiTietSanPham chiTietSanPham);

    void updateChiTietSanPham(ChiTietSanPham chiTietSanPham);

    void deleteChiTietSanPham(UUID id);
}
