package com.poly.manhhh.AssignmentJV4.service.Impl;

import com.poly.manhhh.AssignmentJV4.entity.MauSac;
import com.poly.manhhh.AssignmentJV4.repository.MauSacRepository;
import com.poly.manhhh.AssignmentJV4.service.MauSacService;

import java.util.List;
import java.util.UUID;

public class MauSacServiceImpl implements MauSacService {

    MauSacRepository mauSacRepository = new MauSacRepository();

    @Override
    public List<MauSac> getAllMauSac() {
        return mauSacRepository.getAllMauSac();
    }

    @Override
    public MauSac getOneMauSac(UUID id) {
        return mauSacRepository.getOneMauSac(id);
    }

    @Override
    public void addMauSac(MauSac mauSac) {
        mauSacRepository.addMauSac(mauSac);
    }

    @Override
    public void updateMauSac(MauSac mauSac) {
        mauSacRepository.updateMauSac(mauSac);
    }

    @Override
    public void deleteMauSac(UUID id) {
        mauSacRepository.deleteMauSac(getOneMauSac(id));
    }
}
