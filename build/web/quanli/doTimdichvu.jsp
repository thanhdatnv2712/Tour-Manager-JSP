    Document   : doTimdichvu
    Created on : Dec 8, 2020, 8:55:44 AM
    Author     : datnvt
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Dichvu"%>
<%@page import="dao.DichvuDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        
        DichvuDAO rd = new DichvuDAO();
        String dvName = (String) request.getParameter("roomName");
        ArrayList<Dichvu> dvList = rd.getDVwithName(dvName);
        session.setAttribute("dichvulist", dvList);
        response.sendRedirect("gdTimdichvu.jsp");
    %>
</html>
