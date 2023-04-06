package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.DongSanPham;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DongSanPhamRepository {

    public List<DongSanPham> getAllDongSanPham() {
        List<DongSanPham> listsDongSanPham = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM DongSanPham ", DongSanPham.class);
            listsDongSanPham = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listsDongSanPham;
    }

    public DongSanPham getOneDongSanPham(UUID id){
        DongSanPham dongSanPham = new DongSanPham();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM DongSanPham Where id =: id", DongSanPham.class);
            query.setParameter("id", id);
            dongSanPham = (DongSanPham) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dongSanPham;
    }

    public void deleteDongSanPham(DongSanPham dongSanPham){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(dongSanPham);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addDongSanPham(DongSanPham dongSanPham){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(dongSanPham);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateDongSanPham(DongSanPham dongSanPham){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(dongSanPham);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new DongSanPhamRepository().getAllDongSanPham().forEach(s -> System.out.println(s.toString()));
    UUID id = UUID.fromString("64546b76-a3af-0641-81fc-7447734d3657");
        System.out.println(new DongSanPhamRepository().getOneDongSanPham(id));
    }
}
