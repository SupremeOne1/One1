package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.NgaySanXuat;

import java.util.List;
import java.util.UUID;

public interface NgaySanXuatService {

    List<NgaySanXuat> getAllNgaySanXuat();

    NgaySanXuat getOneNgaySanXuat(UUID id);

    void addNgaySanXuat(NgaySanXuat ngaySanXuat);

    void updateNgaySanXuat(NgaySanXuat ngaySanXuat);

    void deleteNgaySanXuat(UUID id);
}
