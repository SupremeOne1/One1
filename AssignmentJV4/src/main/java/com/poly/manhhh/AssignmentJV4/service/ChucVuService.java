package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.ChucVu;

import java.util.List;
import java.util.UUID;

public interface ChucVuService {
    List<ChucVu> getAllChucVu();

    ChucVu getOneChucVu(UUID id);

    void addChucVu(ChucVu chucVu);

    void updateChucVu(ChucVu chucVu);

    void deleteChucVu(UUID id);
}
