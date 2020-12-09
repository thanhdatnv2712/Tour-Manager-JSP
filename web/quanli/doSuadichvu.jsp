<%-- 
    Document   : doSuadichvu
    Created on : Dec 8, 2020, 10:11:45 AM
    Author     : datnvt
--%>

<%@page import="dao.DichvuDAO"%>
<%@page import="model.Dichvu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String ten = (String)request.getParameter("name");
        String mota = (String)request.getParameter("desc");
        float gia = Float.parseFloat(request.getParameter("price"));
        Dichvu fixingRoom = (Dichvu)session.getAttribute("fixingRoom");
        DichvuDAO roomDAO = new DichvuDAO();
        fixingRoom.setTen(ten);
        fixingRoom.setMota(mota);
        fixingRoom.setGia(gia);
        int status = roomDAO.updateDichvu(fixingRoom);
        if (status != -99){
            %>
            <header>
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
                <!--<link href="../statics/css/gdTimKiemPhongHat.css" rel="stylesheet"/>-->
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
                <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            </header>
            <body>
                <div class="container">
                    <div class="row d-flex justify-content-center">
                        <h2>Cập nhật thông tin dịch vụ thành công</h2>
                    </div>
                    <div class="row d-flex justify-content-center">
                        <a class="btn btn-primary" href="gdTimdichvu.jsp">Ok</a>
                    </div>
                </div>
            </body>
        <%}
        else{
            %>
            <header>
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
                <!--<link href="../statics/css/gdTimKiemPhongHat.css" rel="stylesheet"/>-->
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
                <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            </header>
            <body>
                <div class="container">
                    <div class="row d-flex justify-content-center">
                        <h2>có lỗi xảy ra, vui lòng thực hiện lại sau</h2>
                    </div>
                    <div class="row d-flex justify-content-center">
                        <a class="btn btn-primary" href="gdTimdichvu.jsp">Ok</a>
                    </div>
                </div>
            </body>
            <%
        }
    %>
    
</html>
