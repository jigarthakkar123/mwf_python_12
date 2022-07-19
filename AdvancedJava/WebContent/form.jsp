<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frm" action="">
	<table cellspacing="5px" cellpadding="5px">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea rows="5" cols="21" name="address"></textarea></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">Female
			</td>
		</tr>
		<tr>
			<td>Hobby</td>
			<td>
				<input type="checkbox" name="h" value="m">Music<br>
				<input type="checkbox" name="h" value="m">Cricket<br>
				<input type="checkbox" name="h" value="m">Reading<br>
				<input type="checkbox" name="h" value="m">Traveling
			</td>
		</tr>
		<tr>
			<td>Education</td>
			<td>
				<select name="education">
					<option>---Select Education---</option>
					<option>10th</option>
					<option>12th</option>
					<option>BE</option>
					<option>BTech</option>
					<option>BCA</option>
					<option>ME</option>
					<option>MTech</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td>Confirm Password</td>
			<td><input type="password" name="cpassword"></td>
		</tr>
		<tr>
			<td>Resume</td>
			<td><input type="file" name="resume"></td>
		</tr>
		<tr>
			
			<td colspan="2" align="center">
				<input type="submit" name="action" value="SUBMIT">
			</td>
		</tr>
	</table>
</form>
</body>
</html>