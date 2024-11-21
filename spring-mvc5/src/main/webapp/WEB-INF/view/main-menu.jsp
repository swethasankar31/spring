<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter your name</h2>
<form:form action="displayName"  modelAttribute="s">
First Name:<form:input type="text" path="firstName"/>
Last Name:<form:input type="text" path="lastName"/>
<label>Name</label>
<input type="text" name="studentName">
<input type="submit" name="submit">
</form:form>
</body>
</html>