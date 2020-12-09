<%-- 
    Document   : doDangnhap.jsp
    Created on : Dec 8, 2020, 7:57:22 AM
    Author     : datnvt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.*,dao.*" %>

<%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Thanhvien user = new Thanhvien();
            user.setUsername(username);
            user.setPassword(password);
            ThanhvienDAO dao = new ThanhvienDAO();
            if (username.isEmpty() || password.isEmpty()) {
                response.sendRedirect("gdDangnhap.jsp");
            } else if (dao.kiemtraDN(user)) {
                if (user.getVitri().equalsIgnoreCase("Quản lí")) {
                    response.sendRedirect("../quanli/gdChinhquanly.jsp");
                } else if (user.getVitri().equalsIgnoreCase("Kế toán")) {
                    response.sendRedirect("../ketoan/gdChinhketoan.jsp");
                } else {
                    response.sendRedirect("gdDangnhap.jsp");
                }
            } else {
                response.sendRedirect("gdDangnhap.jsp");
            }
%>
