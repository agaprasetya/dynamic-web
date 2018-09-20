<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="orang" scope="request" class="com.inibae.training01.Model1"></jsp:useBean>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Nama:<jsp:getProperty property="nama" name="orang"/>
<br>
Alamat:<jsp:getProperty property="alamat" name="orang"/>

<form action="Training01" method="post">
<input type="text" name="nama">
<br>
<input type="text" name="alamat">
<br>
<input type="submit" value="daftar">
</form>

</body>
</html>