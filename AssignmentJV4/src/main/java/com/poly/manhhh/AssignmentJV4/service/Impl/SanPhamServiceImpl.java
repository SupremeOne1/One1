package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.SanPham;
import com.poly.manhhh.AssignmentJV4.repository.SanPhamRepository;
import com.poly.manhhh.AssignmentJV4.service.SanPhamService;

import java.util.List;
import java.util.UUID;

public class SanPhamServiceImpl implements SanPhamService {

    SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.getAllSanPham();
    }

    @Override
    public SanPham getOneSanPham(UUID id) {
        return sanPhamRepository.getOneSanPham(id);
    }

    @Override
    public void addSanPham(SanPham sanPham) {
        sanPhamRepository.addSanPham(sanPham);
    }

    @Override
    public void updateSanPham(SanPham sanPham) {
        sanPhamRepository.updateSanPham(sanPham);
    }

    @Override
    public void deleteSanPham(UUID id) {
        sanPhamRepository.deleteSanPham(getOneSanPham(id));
    }
}
