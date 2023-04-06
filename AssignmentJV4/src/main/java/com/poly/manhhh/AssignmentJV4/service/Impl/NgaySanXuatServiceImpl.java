package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.NgaySanXuat;
import com.poly.manhhh.AssignmentJV4.repository.NgaySanXuatRepository;
import com.poly.manhhh.AssignmentJV4.service.NgaySanXuatService;

import java.util.List;
import java.util.UUID;

public class NgaySanXuatServiceImpl implements NgaySanXuatService {

    NgaySanXuatRepository ngaySanXuatRepository = new NgaySanXuatRepository();

    @Override
    public List<NgaySanXuat> getAllNgaySanXuat() {
        return ngaySanXuatRepository.getAllNgaySanXuat();
    }

    @Override
    public NgaySanXuat getOneNgaySanXuat(UUID id) {
        return ngaySanXuatRepository.getOneNgaySanXuat(id);
    }

    @Override
    public void addNgaySanXuat(NgaySanXuat ngaySanXuat) {
        ngaySanXuatRepository.addNgaySanXuat(ngaySanXuat);
    }

    @Override
    public void updateNgaySanXuat(NgaySanXuat ngaySanXuat) {
        ngaySanXuatRepository.updateNgaySanXuat(ngaySanXuat);
    }

    @Override
    public void deleteNgaySanXuat(UUID id) {
        ngaySanXuatRepository.deleteNgaySanXuat(getOneNgaySanXuat(id));
    }
}
