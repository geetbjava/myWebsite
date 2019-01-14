<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="product.js"></script>
Welcome
	<form action="http://localhost:8444/checkout" method="POST">
	<tr>
				    <td>Product name <input type="text" id="pname" name="pname"/>
				    </tr>
				    <tr>
				    <td>Quanity<input type="text" id="qty" name="qty"/></td> 
				    </tr>
				    <tr>
				    <td>Price <input type="text" id="price" name="price"/></td> 
				    </tr>
				    <tr>
				    <td><label id ="addtocart" >Add 2 Cart</label></td> 
				    </tr>
				    <tr>
					<td><input type="Submit" value ="CheckOut"></td>
				   </tr>
				</table> 
	
	</form>
</body>

</html>