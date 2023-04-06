package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.NhanVien;

import java.util.List;
import java.util.UUID;

public interface NhanVienService {
    List<NhanVien> getAllNhanVien();

    NhanVien getOneNhanVien(UUID id);

    void addNhanVien(NhanVien nhanVien);

    void updateNhanVien(NhanVien nhanVien);

    void deleteNhanVien(UUID id);
}
