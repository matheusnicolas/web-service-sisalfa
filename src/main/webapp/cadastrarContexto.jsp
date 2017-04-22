<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 

	<title>Cadastrar Contexto</title>
	<link type="text/css" rel="stylesheet" href="corpo.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
		<script>
			$(document).ready(function() {
				$('#btnEnviar').click(function(event) {
					$.ajax({
						url : 'http://localhost:8080/meuProjetoWeb/webapi/contextos',
    					type : 'POST',
    					data: JSON.stringify({
    					palavra: $('#palavra').val(),
    					id_usuario: $('#idUser').val(),
    					imagem: $('#imagem').val(),
    					audio: $('#audio').val()
    				}),
    				contentType : "application/json; charset=utf-8",
    	    		dataType : 'json',
    	    		success: function (result) {
    	    			alert("Contextos enviados com sucesso!");
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
	<h1>Cadastrar Contexto</h1>
	
	<CENTER><img src="http://revista.hupe.uerj.br/imagebank/images/v11s1a18-fig02.jpg"/></CENTER>
	<p style="text-align:center">Informe respectivamente os dados abaixo: Palavra, Imagem, Áudio e seu id de usuário</p>
	
	
			
			<CENTER>Palavra: <input id="palavra" type="text" name="plvra" placeholder="Digite a palavra"></CENTER><br>
			
			<CENTER>Imagem: <input id="imagem" type="text" name="img" placeholder="Submeter imagem"></CENTER><br>
			
			<CENTER>Áudio: <input id="audio" type="text" name="aud" placeholder="Submeter áudio"></CENTER><br>
			
			<CENTER>ID do usuário: <input id="idUser" type="text" name="idUsuario" placeholder="Digite o ID"></CENTER><br>
			
			<!-- <CENTER><input type="reset"></CENTER>-->
			<CENTER><button id="btnEnviar">Enviar contexto</button></CENTER>

	<p style="font-size:20px"><a href="index.jsp">Voltar</a></p>
</body>
</html>