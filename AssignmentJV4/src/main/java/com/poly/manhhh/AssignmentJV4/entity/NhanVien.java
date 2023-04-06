package com.poly.manhhh.AssignmentJV4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "NhanVien")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TenDem")
    private String tenDem;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Temporal(TemporalType.DATE)
    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "MatKhau")
    private String matKhau;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCV", referencedColumnName = "Id")
    private ChucVu chucVu;
//    @Column(name = "IdCV")
    private UUID idCV;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCH", referencedColumnName = "Id")
    private CuaHang cuaHang;
//    @Column(name = "IdCH")
    private UUID idCH;


    @Column(name = "TrangThai")
    private Integer trangThai;

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tenDem='" + tenDem + '\'' +
                ", ho='" + ho + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", chucVu=" + chucVu +
                ", cuaHang=" + cuaHang +
                ", trangThai=" + trangThai +
                '}';
    }
}
