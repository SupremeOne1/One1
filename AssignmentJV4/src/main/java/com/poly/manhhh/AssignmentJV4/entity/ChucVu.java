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

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "ChucVu")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter


public class ChucVu {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @OneToMany(mappedBy = "chucVu", fetch = FetchType.EAGER)
    private Set<NhanVien> nhanViens;

    @Override
    public String toString() {
        return "ChucVu{" +
                "Id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}