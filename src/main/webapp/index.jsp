<!DOCTYPE html>
<html lang="en">
<head>
<title>Projeto SISALFA</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

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
	.row.content {
		height: auto;
	}
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
				<a href="cadastrarContexto.jsp"><button
						class="btn btn-primary navbar-btn">Cadastrar Contexto</button></a>
				<a href="tabela.jsp"><button class="btn btn-primary navbar-btn">Listar
						Contatos</button></a>
				<a href="https://github.com/matheusnicolas/"><button
						class="btn btn-primary navbar-btn">Contato</button></a>
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
				<h1>Bem-vindo!</h1>
				<p>O Projeto SISALFA tem como objetivo, o Desenvolvimento de uma
					ferramenta assistiva no processo de alfabetização de jovens e
					adultos</p>
				<hr>
				<h3>Título do Projeto:</h3>
				<p>Projeto e Desenvolvimento de um Sistema Colaborativo para
					apoiar o Processo de Alfabetização de Jovens e Adultos</p>
				<h3>Título(s) do(s) Plano(s)</h3>
				<p>Uma Revisão Sistemática da Literatura sobre Ferramentas de
					TIC para Apoiar a Alfabetização</p>
			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<p>ADS</p>
				</div>
				<div class="well">
					<p>ADS</p>
				</div>
			</div>
		</div>
	</div>
	<footer class="container-fluid text-center">

		<p>SISALFA</p>
	</footer>

</body>
</html>
