<!DOCTYPE html>
<html lang="en">
<head>
  <title>Projeto SISALFA</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
		$(document).ready(function(){
			$.getJSON("http://localhost:8080/meuProjetoWeb/webapi/contextos", function(result){
				$.each(result, function(indice, value){
					$("#contextos").append('<tr> <td>' + value.id + '</td>' + 
						'<td>' + value.palavra + '</td>' + 
						'<td>' + value.id_usuario + '</td>' + 
						'<td> <img width="100" height="100" src="data:image/png;base64,'+ value.imagem +'"></img> </td>' + 
						'</tr>'
					);	
				});
			});
		});
	
	<!--Pesquisar como fazer um post com JQUERY-->
	</script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="https://ctrle2017.dcx.ufpb.br/">Sobre
					o CTRL+E</a>
			</div>
			<ul class="nav navbar-nav">
				<a href="index.jsp"><button class="btn btn-primary navbar-btn">Início</button></a>
				<a href="cadastrarContexto.jsp"><button class="btn btn-primary navbar-btn">Cadastrar Contexto</button></a>
				<a href="tabela.jsp"><button class="btn btn-primary navbar-btn">Listar Contatos</button></a>
				<a href="https://github.com/matheusnicolas/"><button class="btn btn-primary navbar-btn">Contato</button></a>
			</ul>
			
		</div>
	</nav>




	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<p>
					<a href="#"></a>
				</p>
				<p>
					<a href="#"></a>
				</p>
				<p>
					<a href="#"></a>
				</p>
			</div>
			<div class="col-sm-8 text-left">
				<div class="container">
					<h2>Contextos Cadastrados</h2>

					<table class="table table-striped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Palavra</th>
								<th>ID_usuario</th>
								<th>Imagem</th>
							</tr>
						</thead>
						<tbody id="contextos"></tbody>
					</table>
				</div>

				<p></p>
			</div>
		</div>
	</div>
	</div>
	<footer class="container-fluid text-center">
		<p>SISALFA</p>
	</footer>

</body>
</html>
