<%-- 
    Document   : gdSuadichvu
    Created on : Dec 8, 2020, 8:59:57 AM
    Author     : datnvt
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Dichvu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <header>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="../statics/css/gdTimdichvu.css" rel="stylesheet"/>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </header>
    <body>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <h2>Sửa thông tin dịch vụ</h2>
                <%
                    
                    int id = Integer.parseInt((String)request.getParameter("inListId"));
                    ArrayList<Dichvu> roomList = (ArrayList<Dichvu>)session.getAttribute("dichvulist");
                    pageContext.setAttribute("dichvu", roomList.get(id));
                    Dichvu fixingRoom = roomList.get(id);
                    session.setAttribute("fixingRoom", fixingRoom);
                %>
            </div>
            
            <div class="row d-flex justify-content-center" style="margin-top: 100px">
                <form action="doSuadichvu.jsp" method="post">
                    <label for="type">ID: </label>
                    <input type="text" class="form-control" id="type" value="${dichvu.id}" name="id" readonly>
                    
                    <label for="name">Tên dịch vụ: </label>
                    <input type="text" class="form-control" id="name" value="${dichvu.ten}" name="name">
                    
                    <label for="desc">Mô tả: </label>
                    <input type="text" class="form-control" id="desc" value="${dichvu.mota}" name="desc">      
                    
                    <label for="price">Giá (nghìn đồng): </label>
                    <input type="text" class="form-control" id="price" value="${dichvu.gia}" name="price">
                    <div class="row d-flex justify-content-center" style="margin-top: 20px">
                        <button class="btn btn-primary" type="submit"> Submit </button>
                    </div>
                    <div class="row d-flex justify-content-center _btn">
                        <a class="btn btn-primary" href="gdTimdichvu.jsp" role="button">Quay lại</a>
                    </div>
                </form>
                    
            </div>
        </div>
    </body>
</html>
