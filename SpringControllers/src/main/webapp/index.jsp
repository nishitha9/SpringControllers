<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="controller">
<input type="submit" value="GoToController"/>
Index page called ! 
<%= request.getAttribute("greet") %>
</form>
<form action="add"> 
<input type="submit" value="Calculator"/>
</form>
<form action="BundleResolverEG">

<input type="submit" value="BundleResolverView"/>

</form>
<form action="xmlViewResolverEG">

<input type="submit" value="XMLViewResolver"/>

</form>
</body>
</html>