package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAllSanPham();

    SanPham getOneSanPham(UUID id);

    void addSanPham(SanPham sanPham);

    void updateSanPham(SanPham sanPham);

    void deleteSanPham(UUID id);
}
