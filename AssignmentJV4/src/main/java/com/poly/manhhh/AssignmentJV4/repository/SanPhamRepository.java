package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.SanPham;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SanPhamRepository {

    public List<SanPham> getAllSanPham(){
        List<SanPham> listsSanPham = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM SanPham ", SanPham.class);
            listsSanPham = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listsSanPham;
    }

     public SanPham getOneSanPham(UUID id){
        SanPham sanPham = new SanPham();
         try (Session session = HibernateUtil.getFACTORY().openSession()){
             Query query = session.createQuery("FROM SanPham WHERE id =: id", SanPham.class);
             query.setParameter("id", id);
             sanPham = (SanPham) query.getSingleResult();
         }catch (Exception e){
             e.printStackTrace();
         }
         return sanPham;
     }

     public void addSanPham(SanPham sanPham){
         Transaction transaction = null;
         try (Session session = HibernateUtil.getFACTORY().openSession()){
             transaction = session.beginTransaction();
             session.save(sanPham);
             transaction.commit();
         }catch (Exception e){
             e.printStackTrace();
         }
     }

    public void updateSanPham(SanPham sanPham){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(sanPham);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteSanPham(SanPham sanPham){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.remove(sanPham);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new SanPhamRepository().getAllSanPham().forEach(s-> System.out.println(s.toString()));
        UUID id = UUID.fromString("27924cb8-8830-7842-9f81-73ec13257671");
        System.out.println(new SanPhamRepository().getOneSanPham(id));
    }
}
