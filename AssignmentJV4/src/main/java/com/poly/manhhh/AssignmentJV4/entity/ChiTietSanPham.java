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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "ChiTietSP")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter


public class ChiTietSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    private SanPham sanPham;
//    @Column(name = "IdSP")
    private UUID idSP;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdNsx", referencedColumnName = "Id")
    private NgaySanXuat ngaySanXuat;
//    @Column(name = "IdNsx")
    private UUID idNsx;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    private MauSac mauSac;
//    @Column(name = "IdMauSac")
    private UUID idMauSac;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    private DongSanPham dongSanPham;
//    @Column(name = "IdDongSP")
    private UUID idDongSP;

    @Column(name = "NamBH")
    private Integer namBH;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;

    @Column(name = "GiaBan")
    private BigDecimal giaBan;

    @Override
    public String toString() {
        String sanPhamId = sanPham == null ? "null" : sanPham.getId().toString();
        String nsxId = ngaySanXuat == null ? "null" : ngaySanXuat.getId().toString();
        String mauSacId = mauSac == null ? "null" : mauSac.getId().toString();
        String dongSanPhamId = dongSanPham == null ? "null" : dongSanPham.getId().toString();

        return "ChiTietSanPham{" +
                "id=" + id +
                ", sanPham=" + sanPhamId +
                ", nsx=" + nsxId +
                ", mauSac=" + mauSacId +
                ", dongSanPham=" + dongSanPhamId +
                ", namBH=" + namBH +
                ", moTa='" + moTa + '\'' +
                ", soLuongTon=" + soLuongTon +
                ", giaNhap=" + giaNhap +
                ", giaBan=" + giaBan +
                '}';
    }
}
