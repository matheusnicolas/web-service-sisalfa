<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
		<script>
			$(document).ready(function() {
				$('#btnEnviar').click(function(event) {
					$.ajax({
						url : 'http://localhost:8080/meuProjetoWeb/webapi/usuarios',
    					type : 'POST',
    					data: JSON.stringify({
    					nome: $('#nome').val()
    				}),
    				contentType : "application/json; charset=utf-8",
    	    		dataType : 'json',
    	    		success: function (result) {
    	    			alert("Usuario enviado com sucesso!");
                		window.location = "http://localhost:8080/meuProjetoWeb/";
             		},
             			error: function () {
                 		alert("Erro ao enviar contexto");
             		}
					});
				});	
			});
		</script>
</head>
<body>
nome : <input id="nome" name="nome"type="text"><button id="btnEnviar">Enviar contexto</button>

</body>
</html>