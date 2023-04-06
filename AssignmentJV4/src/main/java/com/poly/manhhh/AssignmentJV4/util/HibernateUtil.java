package com.poly.manhhh.AssignmentJV4.util;


import com.poly.manhhh.AssignmentJV4.entity.ChiTietSanPham;
import com.poly.manhhh.AssignmentJV4.entity.ChucVu;
import com.poly.manhhh.AssignmentJV4.entity.CuaHang;
import com.poly.manhhh.AssignmentJV4.entity.DongSanPham;
import com.poly.manhhh.AssignmentJV4.entity.KhachHang;
import com.poly.manhhh.AssignmentJV4.entity.MauSac;
import com.poly.manhhh.AssignmentJV4.entity.NgaySanXuat;
import com.poly.manhhh.AssignmentJV4.entity.NhanVien;
import com.poly.manhhh.AssignmentJV4.entity.SanPham;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;


public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(ChiTietSanPham.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(DongSanPham.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(NgaySanXuat.class);
        conf.addAnnotatedClass(SanPham.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        System.out.println(getFACTORY());
    }
}