<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Wesarut</title>
</head>
<body>
	<h1>Wesarut</h1>

	<form action="view-louise" method="post" name="frm-send">
		Name : <input type="text" name="myModel.name" />
		Surname : <input type="text" name="myModel.surname" />
		Email : <input type="text" name="myModel.email" />
		<input type="submit" value="send">
	</form>
</body>
</html> 