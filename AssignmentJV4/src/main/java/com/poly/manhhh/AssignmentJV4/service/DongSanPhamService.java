package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.DongSanPham;

import java.util.List;
import java.util.UUID;

public interface DongSanPhamService {
    List<DongSanPham> getAllDongSanPham();

    DongSanPham getOneDongSanPham(UUID id);

    void addDongSanPham(DongSanPham dongSanPham);

    void updateDongSanPham(DongSanPham dongSanPham);

    void deleteDongSanPham(UUID id);
}
