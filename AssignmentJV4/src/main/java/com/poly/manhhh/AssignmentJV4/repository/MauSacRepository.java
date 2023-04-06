package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.KhachHang;
import com.poly.manhhh.AssignmentJV4.entity.MauSac;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MauSacRepository {

    public List<MauSac> getAllMauSac(){
        List<MauSac> listsMauSac = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from MauSac ", MauSac.class);
            listsMauSac = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return listsMauSac;
    }

    public MauSac getOneMauSac(UUID id){
        MauSac mauSac = new MauSac();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("from MauSac WHERE id =:id", MauSac.class);
            query.setParameter("id", id);
            mauSac = (MauSac) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return mauSac;
    }

    public void addMauSac(MauSac mauSac){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(mauSac);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateMauSac(MauSac mauSac){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(mauSac);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteMauSac(MauSac mauSac){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.remove(mauSac);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new MauSacRepository().getAllMauSac().forEach(s -> System.out.println(s.toString()));
        UUID id = UUID.fromString("23fefe64-1251-9446-8cbb-6e9d74f66eae");
        System.out.println(new MauSacRepository().getOneMauSac(id));
    }
}

