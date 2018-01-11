<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Wesarut</title>
</head>
<body>
	<h1>Hello <s:property value="myModel.name" /> &nbsp; <s:property value="myModel.surname" /><br>
		<s:property value="myModel.email" />
	</h1>
</body>
</html>