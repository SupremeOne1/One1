package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.KhachHang;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class KhachHangRepository {

    public List<KhachHang> getAllKhachHang(){
        List<KhachHang> listsKhachHang = new ArrayList<>();
        try (Session session= HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM KhachHang ", KhachHang.class);
            listsKhachHang = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return listsKhachHang;
    }

    public KhachHang getOneKhachHang(UUID id){
        KhachHang khachHang = new KhachHang();
        try (Session session= HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM KhachHang WHERE id =: id", KhachHang.class);
            query.setParameter("id", id);
            khachHang =(KhachHang) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return khachHang;
    }

    public void addKhachHang(KhachHang khachHang){
        Transaction transaction = null;
        try (Session session= HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(khachHang);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateKhachHang(KhachHang khachHang){
        Transaction transaction = null;
        try (Session session= HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(khachHang);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public  void deleteKhachHang(KhachHang khachHang){
        Transaction transaction = null;
        try (Session session= HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(khachHang);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new KhachHangRepository().getAllKhachHang().forEach(s -> System.out.println(s.toString()));
    UUID id = UUID.fromString("a4240fc9-23f2-f049-a42b-b31a86a302ab");
        System.out.println(new KhachHangRepository().getOneKhachHang(id));
    }
}
