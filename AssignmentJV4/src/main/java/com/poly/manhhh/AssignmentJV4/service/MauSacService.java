package com.poly.manhhh.AssignmentJV4.service;

import com.poly.manhhh.AssignmentJV4.entity.MauSac;

import java.util.List;
import java.util.UUID;

public interface MauSacService {
    List<MauSac> getAllMauSac();

    MauSac getOneMauSac(UUID id);

    void addMauSac(MauSac mauSac);

    void updateMauSac(MauSac mauSac);

    void deleteMauSac(UUID id);
}
