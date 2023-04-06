package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.ChucVu;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChucVuRepository {
    public List<ChucVu> getAllChucVu(){
        List<ChucVu> listsChucVu = new ArrayList<>();

        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM ChucVu ", ChucVu.class);
            listsChucVu = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  listsChucVu;
    }

    public  ChucVu getOneChucVu(UUID id){
        ChucVu chucVu = new ChucVu();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM ChucVu Where id =: id", ChucVu.class);
            query.setParameter("id", id);
            chucVu = (ChucVu) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return chucVu;
    }

    public void deleteChucVu(ChucVu chucVu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.remove(chucVu);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateChucVu(ChucVu chucVu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(chucVu);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addChucVu(ChucVu chucVu){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(chucVu);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        new ChucVuRepository().getAllChucVu().forEach(s -> System.out.println(s.toString()));
    UUID id = UUID.fromString("22a175b0-2db0-1e48-ba38-f5661e540c2b");
        System.out.println(new ChucVuRepository().getOneChucVu(id));
    }
}
