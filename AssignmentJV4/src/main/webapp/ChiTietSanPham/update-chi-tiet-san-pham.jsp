<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 005 05/04/2023
  Time: 07:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Chi Tiết Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 mx-auto">
<form class="row g-3" action="/chi-tiet-san-pham/update?id=${chiTietSP.id}" method="post">
<%--    <div class="form-group">--%>
<%--        <label>ID: </label>--%>
<%--        <input type="text"  class="form-control-plaintext" value="${chiTietSP.id}">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>ID Sản Phẩm: </label>--%>
<%--        <input type="text"  class="form-control-plaintext" value="${chiTietSP.idSP}">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>ID Ngày Sản Xuất: </label>--%>
<%--        <input type="text"  class="form-control-plaintext" value="${chiTietSP.idNsx}">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>ID Màu Sắc: </label>--%>
<%--        <input type="text"  class="form-control-plaintext" value="${chiTietSP.idMauSac}">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>ID Dòng Sản Phẩm: </label>--%>
<%--        <input type="text"  class="form-control-plaintext" value="${chiTietSP.idDongSP}">--%>
<%--    </div>--%>

    <div class="form-group col-md-6">
        <label>Mô Tả: </label>
        <input type="text" class="form-control" value="${chiTietSP.moTa}" name="moTa">
    </div>
    <div class="form-group col-md-6">
        <label>Số Lượng Tồn: </label>
        <input type="text" class="form-control" value="${chiTietSP.soLuongTon}" name="soLuongTon">
    </div>
    <div class="form-group col-md-6">
        <label>Giá Nhập: </label>
        <input type="text" class="form-control" value="${chiTietSP.giaNhap}" name="giaNhap">
    </div>
    <div class="form-group col-md-6">
        <label>Giá Bán: </label>
        <input type="text" class="form-control" value="${chiTietSP.giaBan}" name="giaBan">
    </div>
    <div class="form-group col-md-6 mx-auto">
        <label>Năm Bảo Hành: </label>
        <input type="text" class="form-control" value="${chiTietSP.namBH}" name="namBH">
    </div>

    <div class="col-12">
        <button type="submit" class="btn btn-primary">Update</button>
    </div>
</form>
        </div>
    </div>
</div>
</body>
</html>
