package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.KhachHang;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAllKhachHang();

    KhachHang getOneKhachHang(UUID id);

    void addKhachHang(KhachHang khachHang);

    void updateKhachHang(KhachHang khachHang);

    void deleteKhachHang(UUID id);
}
