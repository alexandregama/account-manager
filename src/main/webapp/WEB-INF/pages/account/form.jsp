<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Account</title>
</head>
<body>
	<h2>Add new Account Transaction</h2>
	
	<form action="addAccount" method="post">
		Descrition <br/>
		<textarea rows="5" cols="50" name="description"></textarea> <br/>
		
		Value <br/>
		<input type="text" name="value"/> <br/><br/>
		
		Type <br/>
		<select name="type">
			<option value="INPUT">Input</option>
			<option value="OUTPUT">Output</option>
		</select>
		
		<input type="submit" value="Add"/>		
	</form>
</body>
</html>