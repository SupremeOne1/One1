package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.CuaHang;

import java.util.List;
import java.util.UUID;

public interface CuaHangService {
    List<CuaHang> getAllCuaHang();

    CuaHang getOneCuaHang(UUID id);

    void addCuaHang(CuaHang cuaHang);

    void updateCuaHang(CuaHang cuaHang);

    void deleteCuaHang(UUID id);
}
