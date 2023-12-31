<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  margin-left: 245px;
}
button {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: center;
}
button a {
  text-decoration: none;
  color: white;
}
input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  padding: 20px;
  width: 1450px;
  margin-left: 350px;
}
h2{
margin-left: 490px;
}
.col-25 {
  float: left;
  width: 8%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 35%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>
<title>THÊM KHÁCH HÀNG</title>
</head>
<body>
  <img src="images/logo.png">
<div>
	<div class="header">
	<h2>NHẬP LIỆU THÔNG TIN</h2>
</div>
<div class="container">
<form action="saveHoadon" method="post" >
  <div class="row">
    <div class="col-25">
      <label for="mahd">Mã hóa đơn: </label>
    </div>
    <div class="col-75">
      <input type="text" id="mahd" name="mahd">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="khachhang">Tên khách hàng</label>
    </div>
    <div class="col-75">
      <input type="text" id="khachhang" name="khachhang">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="tencongty_kh">Tên công ty: </label>
    </div>
    <div class="col-75">
      	<input type="text" id="tencongty_kh" name="tencongty_kh">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="ngayghi">Ngày: </label>
    </div>
    <div class="col-75">
      	<input type="text" id="ngayghi" name="ngayghi">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="masothue">Mã số thuế: </label>
    </div>
    <div class="col-75">
	<input type="text" id="masothue" name="masothue">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      	<label for="tongtien">Tổng tiền: </label>
    </div>
    <div class="col-75">
      	<input type="text" id="tongtien" name="tongtien">
    </div>
  </div>
  <br>
  <div class="row">
    <input type="submit" value="Lưu thông tin">
    <button type="submit"><a href="/hoadon/list">Quay lại</a></button>
  </div>
  </form>
</div>
</div>
</body>
</html>