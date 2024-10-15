<%@page import="java.util.List"%>
<%@page import="com.app.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	안녕! 여기는 상품 목록 페이지!
	
	<table>
		<tr>
			<th>선택</th>
			<th>상품번호</th>
			<th>상품명</th>
			<th>상품가격</th>
			<th>상품재고</th>
		</tr>
	</table>
	
	<form action="write-ok.order">
		<table id="order"></table>
		<button type="button">주문하기</button>
	</form>
	
	stream().map(JSONObject::new).forEach()
	products.put(json);
	
	JSON.parse("${products}");
	console.log(products)const products 
	console.log(products);
	
	products.forEach((product) => {
	table.innerHTML += (
		"<tr>" +
			"<td>" + 
			"<td>" + product.id + "</td>" +
			"<td>" + product.productName + "</td>" +
			"<td>" + product.productPric + "</td>" +
			"<td>" + product.productStock + "</td>" +
		"</tr>"
	
	)
		
	})
	
	const orderForm = document.querySelector("##orderForm");
	const order = document.querySelector("#order");
	const radios = document.querySelectorAll("table input[type='radio']");
	const productIdInput = document.querySelector("input[name = productid]");
	
	
	radios.forEach((input, i) => {
		input.addEventListener("click", () => {
			console.log(products[i])
			if(!products[i].productStock){
			alert("상품 품명")}
			return;
			
			}
			order.innerHTML = (
			 "<tr>" +
			 	<th>상품 번호</th> +
			 	<th>상품명</th> +
			 	<th>상품 상품가격</th> +
			 	<th>주문 수량</th> +
			  
			 "</tr>" +
			 "<tr>" + 
				 	"<td>" + 
					"<td>" + product.id + "</td>" +
					"<td>" + product.productName + "</td>" +
					"<td>" + product.productPric + "</td>" +
					"<td>" + product.productStock + "</td>" +
			 "</tr>" 
			)
			})
			})
			
			NodeList.prototype.filter = Array.prototype.filter;
			
			button.addEventListener("click, (e) => {
				e.preventDefault();
				const inputs = document.querySelectorALL("#order input");
				if()console.log((inputs) => input.value != 0){
					orderFrom.submit();
				}
				
			})
			<servlet-mapping>
				
			</servlet-mapping>
	
</body>
<script type="text/javascript">
	const table = document.querySelector("table");
	console.log()

</script>
</html>