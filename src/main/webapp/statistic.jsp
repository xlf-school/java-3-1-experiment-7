<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
历史访问总量:<%=(application.getAttribute("count") == null) ? 0 : application.getAttribute("count")%><br>
在线用户人数:<%=(application.getAttribute("usercount") == null) ? 0 : application.getAttribute("usercount")%><br>
</body>
</html>
