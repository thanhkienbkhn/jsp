<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
    list.add("Student 1");
    list.add("Student 2");
    list.add("Student 3");
%>
    <table>
        <tr>
            <th>Name</th>
        </tr>

        <%
            for (String item : list ){
        %>
            <tr>
                <td>
                    <% out.print("Hello");%>
                </td>
            </tr>
        <%
            }
        %>

    </table>
</body>
</html>
