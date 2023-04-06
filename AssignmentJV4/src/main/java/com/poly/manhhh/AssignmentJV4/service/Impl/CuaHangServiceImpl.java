package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.CuaHang;
import com.poly.manhhh.AssignmentJV4.repository.CuaHangRepository;
import com.poly.manhhh.AssignmentJV4.service.CuaHangService;

import java.util.List;
import java.util.UUID;

public class CuaHangServiceImpl implements CuaHangService {

    CuaHangRepository cuaHangRepository = new CuaHangRepository();

    @Override
    public List<CuaHang> getAllCuaHang() {
        return cuaHangRepository.getAllCuaHang();
    }

    @Override
    public CuaHang getOneCuaHang(UUID id) {
        return cuaHangRepository.getOneCuaHang(id);
    }

    @Override
    public void addCuaHang(CuaHang cuaHang) {
        cuaHangRepository.addCuaHang(cuaHang);
    }

    @Override
    public void updateCuaHang(CuaHang cuaHang) {
        cuaHangRepository.updateCuaHang(cuaHang);
    }

    @Override
    public void deleteCuaHang(UUID id) {
        cuaHangRepository.deleteCuaHang(getOneCuaHang(id));
    }
}
