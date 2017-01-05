<%@ page language="java" import="java.sql.*" %>

<HTML>
<HEAD> <TITLE> The JDBCQuery JSP  </TITLE> </HEAD>
<BODY BGCOLOR="white">

<% String searchCondition = request.getParameter("cond"); 
   if (searchCondition != null) { %>
      <H3> Search results for  <I> <%= searchCondition %> </I> </H3>
      <B> <%= runQuery(searchCondition) %> </B> <HR><BR>
<% }  %>
<B>Enter a search condition:</B>
<form action="LoginServlet" method="post">
Enter Name:<input type="text" name="uname"> <br>
Password:  <input type="text" name="pswd"><br>
<input type="submit" value="login"></form>
</BODY>
</HTML>

<%-- Declare and define the runQuery() method. --%>
<%! private String runQuery(String cond) throws SQLException {
     Connection conn = null; 
     Statement stmt = null; 
     ResultSet rset = null; 
     try {
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        conn = DriverManager.getConnection("jdbc:oracle:oci8:@",
                                           "vikasprathap", "vikas");
        stmt = conn.createStatement();
        // dynamic query
        rset = stmt.executeQuery ("SELECT uname FROM userData "+ 
                           (cond.equals("") ? "" : "WHERE " + cond ));
       return (formatResult(rset));
     } catch (SQLException e) { 
         return ("<P> SQL error: <PRE> " + e + " </PRE> </P>\n");
     } finally {
         if (rset!= null) rset.close(); 
         if (stmt!= null) stmt.close();
         if (conn!= null) conn.close();
     }
  }
  private String formatResult(ResultSet rset) throws SQLException {
    StringBuffer sb = new StringBuffer();
    if (!rset.next())
      sb.append("<P> No matching rows.<P>\n");
    else {  sb.append("<UL>"); 
            do {  sb.append("<LI>" + rset.getString(1) + 
                            " earns $ " + rset.getInt(2) + ".</LI>\n");
            } while (rset.next());
           sb.append("</UL>"); 
    }
    return sb.toString();
  }
%>
