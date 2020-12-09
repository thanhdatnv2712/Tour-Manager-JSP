<%-- 
    Document   : gdQLThanhtoanDT
    Created on : Dec 8, 2020, 10:42:01 AM
    Author     : datnvt
--%>

<%@page import="dao.HoadonDTDAO"%>
<%@page import="model.Dichvuchangtour"%>
<%@page import="model.Doitac"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.HoadonDT"%>
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
                <h2>Thanh toán cho đối tác</h2>
                <%
                    
                    int id = Integer.parseInt((String)request.getParameter("inListId"));
                    ArrayList<Doitac> roomList = (ArrayList<Doitac>)session.getAttribute("dtlist");
                    System.out.println(roomList.size());
                    pageContext.setAttribute("doitac", roomList.get(id));
                    Doitac dt = roomList.get(id);
                    System.out.println("Bat dau");
                    HoadonDTDAO rd = new HoadonDTDAO();
                    HoadonDT hd = rd.getHoadonDT(dt);
                    session.setAttribute("hoadon", hd);                   
                    System.out.println("hoadon");
                    pageContext.setAttribute("dichvulist", (ArrayList <Dichvuchangtour>) hd.getDvctList()); 
                    System.out.println(hd.toString());
                %>
            </div>
            
            <div class="row d-flex justify-content-center" style="margin-top: 100px">
                <form>
                    <label for="type">ID: </label>
                    <input type="text" class="form-control" id="type" value="${doitac.id}" name="id" readonly>
                    
                    <label for="name">Tên đối tác: </label>
                    <input type="text" class="form-control" id="name" value="${doitac.hodem} ${doitac.tendem} ${doitac.ten}" name="name" readonly>
                    
                    <label for="desc">Email: </label>
                    <input type="text" class="form-control" id="desc" value="${doitac.email}" name="desc" readonly>      
                    
                    <label for="price">SDT: </label>
                    <input type="text" class="form-control" id="price" value="${doitac.sdt}" name="price" readonly>
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
                            <th scope="col">Tên dịch vụ</th>
                            <th scope="col">Số lượng</th>
                            <th scope="col">Giá</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${dichvulist}" var="current" varStatus="loop">
                            <tr>
                                <td><c:out value="${loop.index + 1}" /></td>
                                <td><c:out value="${current.getDvdulich().getDv().getTen()}" /></td>
                                <td><c:out value="${current.getDvdulich().getTotal()}" /></td>
                                <td><c:out value="${current.getDvdulich().getDv().getGia()}" /></td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>
            <div class="row d-flex justify-content-center _btn">
                <form action="doLuuthanhtoan.jsp" method="post" class="row">
                    <div class="col-md-10">
                        <label for="type">Tổng tiền: </label>
                        <input type="text" class="form-control" id="type" value="${hoadon.tongtien}" name="id" readonly>
                    </div>
                    <div class="col-md-2">
                        <button class="btn btn-primary" type="submit" id="submitName" style="">Thanh toán</button>
                        
                    </div>
                </form>
                
            </div>
        </div>

    </body>
</html>
