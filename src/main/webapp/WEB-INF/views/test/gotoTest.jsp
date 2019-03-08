<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<script type="text/javascript" src="${basePath}/static/jQuery/jquery-1.12.4.js"></script>

<html>
<head>
    <title>Title</title>

    <script type="text/javascript">
        $(function(){
            $.ajax({
                url:"${basePath}/PurchaseTicketController/findOne",
                async:false,
                data:{id:"1114097"},
                method:"POST",
                success:function (result) {
                    console.log(result.pruductName);
                }

            })
        })

    </script>
</head>
<body>

</body>
</html>
