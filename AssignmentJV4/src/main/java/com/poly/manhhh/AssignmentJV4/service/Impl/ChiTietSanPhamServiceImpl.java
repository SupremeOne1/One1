package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.ChiTietSanPham;
import com.poly.manhhh.AssignmentJV4.repository.ChiTietSanPhamRepository;
import com.poly.manhhh.AssignmentJV4.service.ChiTietSanPhamService;

import java.util.List;
import java.util.UUID;

public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    ChiTietSanPhamRepository chiTietSanPhamRepository = new ChiTietSanPhamRepository();

    @Override
    public List<ChiTietSanPham> getAllChiTietSanPham() {
        return chiTietSanPhamRepository.getAllChiTietSanPham();
    }

    @Override
    public ChiTietSanPham getOneChiTietSanPham(UUID id) {
        return chiTietSanPhamRepository.getOneChiTietSanPham(id);
    }

    @Override
    public void addChiTietSanPham(ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamRepository.addChiTietSanPham(chiTietSanPham);
    }

    @Override
    public void updateChiTietSanPham(ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamRepository.updateChiTietSanPham(chiTietSanPham);
    }

    @Override
    public void deleteChiTietSanPham(UUID id) {
        chiTietSanPhamRepository.deleteChiTietSanPham(getOneChiTietSanPham(id));
    }
}
