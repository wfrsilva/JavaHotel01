<%
 
   out.println(ConexaoMySQL.statusConection());
 
%>

<%
 
    ConexaoMySQL.getConexaoMySQL();
 
   out.println(ConexaoMySQL.statusConection());
 
 %>