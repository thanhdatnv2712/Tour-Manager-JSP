<%-- 
    Document   : doThanhtoanDT
    Created on : Dec 8, 2020, 12:32:27 PM
    Author     : datnvt
--%>

<%@page import="model.Doitac"%>
<%@page import="model.HoadonDT"%>
<%@page import="dao.HoadonDTDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        HoadonDTDAO rd = new HoadonDTDAO();
        Doitac dt = (Doitac) session.getAttribute("doitac");
        HoadonDT hd = rd.getHoadonDT(dt);
        session.setAttribute("hoadon", hd);
        response.sendRedirect("gdThanhtoanDT.jsp");
    %>
</html>
