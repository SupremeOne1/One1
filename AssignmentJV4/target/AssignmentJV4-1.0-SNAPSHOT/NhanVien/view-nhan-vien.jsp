<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 005 05/04/2023
  Time: 07:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Nhân Viên</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<section>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
            <th scope="col">Tên Đệm</th>
            <th scope="col">Họ</th>
            <th scope="col">Giới Tính</th>
            <th scope="col">Ngày Sinh</th>
            <th scope="col">Địa Chỉ</th>
            <th scope="col">Số Điện Thoại</th>
            <th scope="col">Mật Khẩu</th>
            <th scope="col">Chức Vụ</th>
            <th scope="col">Cửa Hàng</th>
            <th scope="col">Trạng Thái</th>
            <th colspan="3">Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${listNhanVien}" var="nhanVien">
            <tr>
                <td>${nhanVien.id}</td>
                <td>${nhanVien.ma}</td>
                <td>${nhanVien.ten}</td>
                <td>${nhanVien.tenDem}</td>
                <td>${nhanVien.ho}</td>
                <td>${nhanVien.gioiTinh}</td>
                <td>${nhanVien.ngaySinh}</td>
                <td>${nhanVien.diaChi}</td>
                <td>${nhanVien.sdt}</td>
                <td>${nhanVien.matKhau}</td>
                <td>${nhanVien.chucVu}</td>
                <td>${nhanVien.cuaHang}</td>
                <td>${nhanVien.trangThai}</td>
                <td>
                    <a href="" class="btn btn-success" type="button">Detail</a>
                    <a href="" class="btn btn-primary" type="button">Update</a>
                    <a href="" class="btn btn-danger" type="button">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
</body>
</html>
