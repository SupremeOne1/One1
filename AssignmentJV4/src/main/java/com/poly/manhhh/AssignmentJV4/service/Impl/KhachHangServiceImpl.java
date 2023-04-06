package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.KhachHang;
import com.poly.manhhh.AssignmentJV4.repository.KhachHangRepository;
import com.poly.manhhh.AssignmentJV4.service.KhachHangService;

import java.util.List;
import java.util.UUID;

public class KhachHangServiceImpl implements KhachHangService {

    KhachHangRepository khachHangRepository = new KhachHangRepository();

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.getAllKhachHang();
    }

    @Override
    public KhachHang getOneKhachHang(UUID id) {
        return khachHangRepository.getOneKhachHang(id);
    }

    @Override
    public void addKhachHang(KhachHang khachHang) {
        khachHangRepository.addKhachHang(khachHang);
    }

    @Override
    public void updateKhachHang(KhachHang khachHang) {
        khachHangRepository.updateKhachHang(khachHang);
    }

    @Override
    public void deleteKhachHang(UUID id) {
        khachHangRepository.deleteKhachHang(getOneKhachHang(id));
    }
}
