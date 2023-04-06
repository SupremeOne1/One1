package com.poly.manhhh.AssignmentJV4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "CuaHang")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class CuaHang {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "ThanhPho")
    private String thanhPho;

    @Column(name = "QuocGia")
    private String quocGia;

    @OneToMany(mappedBy = "cuaHang",  fetch = FetchType.EAGER)
    private Set<NhanVien> nhanViens;

    @Override
    public String toString() {
        return "CuaHang{" +
                "id=" + id +
                ", ma=" + ma +
                ", ten=" + ten +
                ", diaChi=" + diaChi +
                ", thanhPho=" + thanhPho +
                ", quocGia=" + quocGia +
                '}';
    }
}
