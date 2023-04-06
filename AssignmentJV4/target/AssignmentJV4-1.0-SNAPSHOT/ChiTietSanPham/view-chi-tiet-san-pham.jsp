<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 005 05/04/2023
  Time: 07:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Chi Tiết Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

    <section>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">ID Sản Phẩm</th>
                <th scope="col">ID Ngày Sản Xuất</th>
                <th scope="col">ID Màu Sắc</th>
                <th scope="col">ID Dòng Sản Phẩm</th>
                <th scope="col">Năm Bảo Hành</th>
                <th scope="col">Mô Tả</th>
                <th scope="col">Số Lượng Tồn</th>
                <th scope="col">Giá Nhập</th>
                <th scope="col">Giá Bán</th>
                <th colspan="3">Action</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${listChiTietSP}" var="chiTietSP">
                <tr>
                    <td>${chiTietSP.id}</td>
                    <td>${chiTietSP.idSP}</td>
                    <td>${chiTietSP.idNsx}</td>
                    <td>${chiTietSP.idMauSac}</td>
                    <td>${chiTietSP.idDongSP}</td>
                    <td>${chiTietSP.namBH}</td>
                    <td>${chiTietSP.moTa}</td>
                    <td>${chiTietSP.soLuongTon}</td>
                    <td>${chiTietSP.giaNhap}</td>
                    <td>${chiTietSP.giaBan}</td>
                    <td>
                        <a href="/chi-tiet-san-pham/view-update?id=${chiTietSP.id}" class="btn btn-success" type="button">Detail</a>
                        <a href="/chi-tiet-san-pham/view-update?id=${chiTietSP.id}" class="btn btn-primary" type="button">Update</a>
                        <a href="/chi-tiet-san-pham/remove?id=${chiTietSP.id}" class="btn btn-danger" type="button">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </section>

</body>
</html>
