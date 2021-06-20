<html>
 
 <head>
 	<title>Calculator</title>
 	
	<script type="text/javascript">
		function btnaction(str){
			document.getElementById("formaction").action=str;
			document.getElementById("formaction").submit();
		
		}

	</script>
 </head>
 <body>
	<fieldset>
		<legend>Calculator</legend>

	<form action="" id="formaction">
	
	<table collpadding="2" cellspacing="2">
		<tr>
			<td>Number 1</td>
			<td><input type="number" name="t1" id="fname"></td>
		</tr>
		<tr>
			<td>Number 2</td>
			<td><input type="number" name="t2" id="lname"></td>
		</tr>
		<tr>
			<td>&nbsp</td>
			<td><button type="button" onclick="btnaction('add')">Add</button></td>
		
			<td>&nbsp</td>
			<td><button type="button" onclick="btnaction('subtract')">Subtract</button></td>
		</tr>
		<tr>
			<td>&nbsp</td>
			<td><button type="button" onclick="btnaction('multiply')">Multiply</button></td>
		
			<td>&nbsp</td>
			<td><button type="button" onclick="btnaction('divide')">Divide</button></td>
		</tr>
	
	</table>
	</form>
  </fieldset>
 </body>
</html>
