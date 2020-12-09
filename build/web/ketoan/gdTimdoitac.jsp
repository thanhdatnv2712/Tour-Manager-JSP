<%-- 
    Document   : gdTimdichvu
    Created on : Dec 8, 2020, 8:51:25 AM
    Author     : datnvt
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Doitac"%>
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
            <h1 class="row d-flex justify-content-center" style="padding-bottom: 100px">Tìm kiếm đối tác</h1>
            <div class="row d-flex justify-content-center _btn">
                <form action="doTimdoitac.jsp" method="post" class="row">
                    <div class="col-md-10">
                        <label for="roomName">Nhập vào tên đối tác:</label>
                        <input type="text" class="form-control" id="roomName" name="roomName">
                    </div>
                    <div class="col-md-2">
                        <button class="btn btn-primary" type="submit" id="submitName" style="">Tìm kiếm</button>
                        
                    </div>
                </form>
                
            </div>
            <div class="row d-flex justify-content-center" style="margin-top: 10px">
                <a class="btn btn-primary" href="gdChinhketoan.jsp" role="button">Quay lại</a>
            </div>
            <div class="row d-flex justify-content-center _btn" id="roomTable">
                <table class="table">
                    <thead class="thead-light">
                        <tr>
                            <th scope="col">STT</th>
                            <th scope="col">Tên đối tác</th>
                            <th scope="col">Email</th>
                            <th scope="col">SĐT</th>
                            <th scope="col">Thanh toán</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ArrayList<Doitac> dtlist = (ArrayList<Doitac>) session.getAttribute("dtlist");
                            pageContext.setAttribute("dtlist", dtlist);
                        %>

                        <c:forEach items="${dtlist}" var="current" varStatus="loop">
                            <tr>
                                <td><c:out value="${loop.index + 1}" /></td>
                                <td><c:out value="${current.hodem} ${current.tendem} ${current.ten}" /></td>
                                <td><c:out value="${current.email}" /></td>
                                <td><c:out value="${current.sdt}" /></td>
                                <form action="gdThanhtoanDT.jsp" method="post">
                                    <input name="inListId" value="${loop.index}"hidden/>
                                    <td><button class="btn btn-primary" type="submit">Thanh toán</button></td>
                                </form>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>

    </body>
</html>
