<%-- 
    Document   : doLuuthanhtoan
    Created on : Dec 8, 2020, 1:03:35 PM
    Author     : datnvt
--%>

<%@page import="dao.HoadonDTDAO"%>
<%@page import="model.HoadonDT"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        HoadonDT hd = (HoadonDT)session.getAttribute("hoadon");
        HoadonDTDAO hdDAO = new HoadonDTDAO();
        int status = hdDAO.luuhoadon(hd);
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
                        <h2>Thanh toán thành công</h2>
                    </div>
                    <div class="row d-flex justify-content-center">
                        <a class="btn btn-primary" href="gdChinhketoan.jsp">Ok</a>
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
                        <a class="btn btn-primary" href="gdChinhketoan.jsp">Ok</a>
                    </div>
                </div>
            </body>
            <%
        }
    %>
</html>
