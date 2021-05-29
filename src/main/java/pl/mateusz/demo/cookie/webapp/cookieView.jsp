<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
   <head>
   </head>
   <body>
        <h1>
            <b><c:out value="${requestScope.Message1}" /></b>
        </h1>
        <c:forEach items="${requestScope.cookie}" var="cookie">
            <tr>
                <td>${cookie.id}</td>
                <td>${cookie.product}</td>
            </tr>
            <br>
        </c:forEach>
   </body>
</html>