package com.poly.manhhh.AssignmentJV4.repository;

import com.poly.manhhh.AssignmentJV4.entity.CuaHang;
import com.poly.manhhh.AssignmentJV4.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CuaHangRepository {

    public List<CuaHang> getAllCuaHang(){
        List<CuaHang> listsCuaHang = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM CuaHang ", CuaHang.class);
            listsCuaHang = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();;
        }
        return  listsCuaHang;
    }


    public CuaHang getOneCuaHang(UUID id){
        CuaHang cuaHang = new CuaHang();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            Query query = session.createQuery("FROM CuaHang Where id =: id", CuaHang.class);
            query.setParameter("id", id);
            cuaHang = (CuaHang) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();;
        }
        return cuaHang;
    }

    public void updateCuaHang(CuaHang cuaHang){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.merge(cuaHang);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    public void addCuaHang(CuaHang cuaHang){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(cuaHang);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    public void deleteCuaHang(CuaHang cuaHang){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.remove(cuaHang);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    public static void main(String[] args) {
//        new CuaHangRepository().getAllCuaHang().forEach(s -> System.out.println(s.toString()));
        UUID id = UUID.fromString("83154000-fa21-ef46-be64-1c1c42b576f1");
        System.out.println(new CuaHangRepository().getOneCuaHang(id));
    }

}
