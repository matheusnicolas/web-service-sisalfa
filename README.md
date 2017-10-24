## WebService Sisalfa

* Sisalfa é um Projeto e Desenvolvimento de um Sistema Colaborativo para apoiar o Processo de Alfabetização de Jovens e Adultos, o principal problema a ser abordado por este projeto de pesquisa é a investigação a respeito do projeto, desenvolvimento e aplicação de um serviço que seja colaborativo e apoie o	processo de alfabetização inspirado nas ideias de Paulo Freire.

## Operations 

| Title|Sisalfa<br/> Projeto e Desenvolvimento de um Sistema Colaborativo para apoiar o Processo de Alfabetização de Jovens e Adultos. |
| ------------- | ------------- |
| **URL**  | http://app.sisalfa.dcx.ufpb.br/v1/{Params}  |
| **Method** | **POST**  **GET**  **PUT**  **DELETE** |
|**URL** **Params** |  **Users:**<br /><br />/v1/getAllUsers<br />/v1/addUser<br />/v1/removeUser<br />/v1/alterUser<br /><br />**Context:**<br /><br />/v1/getAllContexts<br />/v1/addContext<br />/v1/removeContext<br /> /v1/alterContext<br /><br />**Challenge:**<br /><br />/v1/getAllChallenges<br />/v1/addChallenge<br />/v1/removeChallenge</br>/v1/alterChallenge</br> |
|**Data** **Params** | { <br />  User: { <br />    nome: [string], <br />  } <br />}<br /><br />{ <br /><br />   Context: {<br />    nome: [string],<br />   idUsuario: [long], <br />    imagem: [string], <br />    som: [string], <br />    video: [string], <br />  } <br />}<br /><br />{ <br /> <br />  Challenge: {<br />    palavra: [string],<br />    idUsuario: [string], <br />    idContexto: [string], <br />    som: [string], <br />    video: [string], <br />    imagem: [string], <br />  } <br />}<br /><br />   |
|**Sample Call in Html file** | $.ajax({<br />  url: "/v1/addUser",<br />  dataType: "json",<br />  data : { <br />    u: { <br />      nome : "Joao"<br />    }<br />  },<br />  type : "POST",<br />  success : function(r) {<br />    console.log(r);<br />  }<br />});<br />  |

## Contributors

* [Robson Alves](https://github.com/robsonalvz)
* [Matheus Nícolas](https://github.com/matheusnicolas)
* [Ayla Rebouças](https://github.com/ayladebora)
