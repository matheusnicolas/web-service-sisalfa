## WebService Sisalfa

* Sisalfa é um Projeto e Desenvolvimento de um Sistema Colaborativo para apoiar o Processo de Alfabetização de Jovens e Adultos, o principal problema a ser abordado por este projeto de pesquisa é a investigação a respeito do projeto, desenvolvimento e aplicação de um serviço que seja colaborativo e apoie o	processo de alfabetização inspirado nas ideias de Paulo Freire.

## Contribuidores

* [Robson Alves](https://github.com/robsonalvz)
* [Matheus Nícolas](https://github.com/matheusnicolas)
* [Ayla Rebouças](https://github.com/ayladebora)


| Title|Sisalfa * Projeto e Desenvolvimento de um Sistema Colaborativo para apoiar o Processo de Alfabetização de Jovens e Adultos. |
| ------------- | ------------- |
| URL  | /Sisalfa/{Params}  |
| Method | POST | GET | PUT | DELETE  |
|URL Params |  Users:

/Sisalfa/getAllUsers
/Sisalfa/addUser
/Sisalfa/removeUser

Context:

/Sisalfa/getAllContext
/Sisalfa/addContext
/Sisalfa/removeContext

Challenge:

/Sisalfa/getAllChallenge
/Sisalfa/addChalenge
/Sisalfa/removeChallenge  |
|Data Params | { 
  User: { 
    nome: [string], 
  } 
}

{ 
  Context: { 
    nome: [string], 
    idUsuario: [long], 
    imagem: [string], 
    som: [string], 
    video: [string], 
  } 
}



{ 
  Challenge: { 
    palavra: [string], 
    idUsuario: [string], 
    idContexto: [string], 
    som: [string], 
    video: [string], 
    imagem: [string], 
  } 
}



   |
|Sample Call in Html file | $.ajax({
  url: "/Sisalfa/addUser",
  dataType: "json",
  data : { 
    u: { 
      nome : "Joao" 
    }
  },
  type : "POST",
  success : function(r) {
    console.log(r);
  }
});

  |