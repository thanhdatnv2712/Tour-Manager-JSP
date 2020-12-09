    Document   : doTimdichvu
    Created on : Dec 8, 2020, 8:55:44 AM
    Author     : datnvt
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Doitac"%>
<%@page import="dao.DoitacDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        
        DoitacDAO rd = new DoitacDAO();
        String dvName = (String) request.getParameter("roomName");
        ArrayList<Doitac> dvList = rd.getDTwithName(dvName);
        session.setAttribute("dtlist", dvList);
        response.sendRedirect("gdTimdoitac.jsp");
    %>
</html>
