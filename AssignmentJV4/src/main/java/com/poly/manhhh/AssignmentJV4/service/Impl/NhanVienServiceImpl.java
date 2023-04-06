package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.NhanVien;
import com.poly.manhhh.AssignmentJV4.repository.NhanVienRepository;
import com.poly.manhhh.AssignmentJV4.service.NhanVienService;

import java.util.List;
import java.util.UUID;

public class NhanVienServiceImpl implements NhanVienService {

    NhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.getAllNhanVien();
    }

    @Override
    public NhanVien getOneNhanVien(UUID id) {
        return nhanVienRepository.getOneNhanVien(id);
    }

    @Override
    public void addNhanVien(NhanVien nhanVien) {
        nhanVienRepository.addNhanVien(nhanVien);
    }

    @Override
    public void updateNhanVien(NhanVien nhanVien) {
        nhanVienRepository.updateNhanVien(nhanVien);
    }

    @Override
    public void deleteNhanVien(UUID id) {
        nhanVienRepository.deleteNhanVien(getOneNhanVien(id));
    }
}
