package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.ChiTietSanPham;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChiTietSanPhamRepository {

    public List<ChiTietSanPham> getAllChiTietSanPham(){
        List<ChiTietSanPham> listsChiTietSanPham = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM ChiTietSanPham ", ChiTietSanPham.class);
            listsChiTietSanPham = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return listsChiTietSanPham;
    }

    public ChiTietSanPham getOneChiTietSanPham(UUID id){
        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM ChiTietSanPham WHERE id =: id", ChiTietSanPham.class);
            query.setParameter("id", id);
            chiTietSanPham = (ChiTietSanPham) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return chiTietSanPham;
    }

    public void deleteChiTietSanPham(ChiTietSanPham chiTietSanPham){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.remove(chiTietSanPham);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void addChiTietSanPham(ChiTietSanPham chiTietSanPham){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(chiTietSanPham);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateChiTietSanPham(ChiTietSanPham chiTietSanPham){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(chiTietSanPham);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ChiTietSanPhamRepository().getAllChiTietSanPham().forEach(s -> System.out.println(s.toString()));
//    UUID id = UUID.fromString("cad50af2-5547-664d-a9eb-9e791c81af72");
//        System.out.println(new ChiTietSanPhamRepository().getOneChiTietSanPham(id));

    }

}
