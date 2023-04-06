package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.NhanVien;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NhanVienRepository {

    public List<NhanVien> getAllNhanVien(){
        List<NhanVien> listsNhanVien = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM NhanVien ", NhanVien.class);
            listsNhanVien = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listsNhanVien;
    }

    public NhanVien getOneNhanVien(UUID id){
        NhanVien nhanVien = new NhanVien();
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM NhanVien WHERE id =: id", NhanVien.class);
            query.setParameter("id", id);
            nhanVien = (NhanVien) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return nhanVien;
    }

    public void addNhanVien(NhanVien nhanVien){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(nhanVien);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateNhanVien(NhanVien nhanVien){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(nhanVien);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteNhanVien(NhanVien nhanVien){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(nhanVien);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new NhanVienRepository().getAllNhanVien().forEach(s-> System.out.println(s.toString()));
    UUID id = UUID.fromString("a88ce737-8faa-664f-9758-c140e72eead2");
        System.out.println(new NhanVienRepository().getOneNhanVien(id));

    }
}
