package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.ChucVu;
import com.poly.manhhh.AssignmentJV4.repository.ChucVuRepository;
import com.poly.manhhh.AssignmentJV4.service.ChucVuService;

import java.util.List;
import java.util.UUID;

public class ChucVuServiceImpl implements ChucVuService {

    ChucVuRepository chucVuRepository = new ChucVuRepository();

    @Override
    public List<ChucVu> getAllChucVu() {
        return chucVuRepository.getAllChucVu();
    }

    @Override
    public ChucVu getOneChucVu(UUID id) {
        return chucVuRepository.getOneChucVu(id);
    }

    @Override
    public void addChucVu(ChucVu chucVu) {
        chucVuRepository.addChucVu(chucVu);
    }

    @Override
    public void updateChucVu(ChucVu chucVu) {
        chucVuRepository.updateChucVu(chucVu);
    }

    @Override
    public void deleteChucVu(UUID id) {
        chucVuRepository.deleteChucVu(getOneChucVu(id));
    }
}
