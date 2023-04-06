package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.NgaySanXuat;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NgaySanXuatRepository {

    public List<NgaySanXuat> getAllNgaySanXuat() {
        List<NgaySanXuat> listsNgaySanXuat = new ArrayList<>();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM NgaySanXuat ", NgaySanXuat.class);
            listsNgaySanXuat = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listsNgaySanXuat;
    }

    public NgaySanXuat getOneNgaySanXuat(UUID id){
        NgaySanXuat ngaySanXuat = new NgaySanXuat();
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("FROM NgaySanXuat WHERE id=:id", NgaySanXuat.class);
            query.setParameter("id", id);
            ngaySanXuat = (NgaySanXuat) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ngaySanXuat;
    }

    public void addNgaySanXuat(NgaySanXuat ngaySanXuat){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(ngaySanXuat);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateNgaySanXuat(NgaySanXuat ngaySanXuat){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.merge(ngaySanXuat);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteNgaySanXuat(NgaySanXuat ngaySanXuat){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.remove(ngaySanXuat);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new NgaySanXuatRepository().getAllNgaySanXuat().forEach(s-> System.out.println(s.toString()));
        UUID id = UUID.fromString("edb19bb0-6d79-e94f-9453-8e21ca0e274c");
        System.out.println(new NgaySanXuatRepository().getOneNgaySanXuat(id));
    }
}
