package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.DongSanPham;
import com.poly.manhhh.AssignmentJV4.repository.DongSanPhamRepository;
import com.poly.manhhh.AssignmentJV4.service.DongSanPhamService;

import java.util.List;
import java.util.UUID;

public class DongSanPhamServiceImpl implements DongSanPhamService {

    DongSanPhamRepository dongSanPhamRepository = new DongSanPhamRepository();

    @Override
    public List<DongSanPham> getAllDongSanPham() {
        return dongSanPhamRepository.getAllDongSanPham();
    }

    @Override
    public DongSanPham getOneDongSanPham(UUID id) {
        return dongSanPhamRepository.getOneDongSanPham(id);
    }

    @Override
    public void addDongSanPham(DongSanPham dongSanPham) {
        dongSanPhamRepository.addDongSanPham(dongSanPham);
    }

    @Override
    public void updateDongSanPham(DongSanPham dongSanPham) {
        dongSanPhamRepository.updateDongSanPham(dongSanPham);
    }

    @Override
    public void deleteDongSanPham(UUID id) {
        dongSanPhamRepository.deleteDongSanPham(getOneDongSanPham(id));
    }
}
