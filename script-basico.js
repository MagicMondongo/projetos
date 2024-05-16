//O vento DOM é acionado quando o HTML foi completamente carregado

document.addEventListener('DOMContentLoaded', function (){
//Tipos de dados
//Stringer: Sequencia de caracter
//Number: números inteiros ou pontos flutuantes (10.4)
//BooLean: Retorna dois valores, true ou false
//object: Estrutura de dados que pode armazenar múltiplos valores
//NULL: quando esta vazio;
//array: objeto especial ordenado
//function: bloco de código reutilizavel

//CONST É usado para declarar uma variável cujo valor é permanente 
        const teste = 50;
        
        //LET é usado para declarar variáveis que os valores podem ser
        //retribuidos
        let C = 0;
        C = 10;
        //console.log("---us guri tao com tudo---")
       
        //const notaMedia = 3;

        //if (notaMedia >= 6){
            //alert("Aluno passou");
       //} 
        //else if (notaMedia >= 4 && notaMedia <6){
           // alert("aluno quase passou");
        //}
        //else {
            //alert("aluno reprovou");
        //}
        
       //----------- Operadores----------
       
       // = sinal de atribuição 
       // == sinal de comparação 
       // === verifica se os dois são iguais e têm o mesmo tipo de dados
       // != se é diferente
       // !== se é estritamente diferente
       // > maior
       // <menor
        
       //const num = 6;
       //if (num === 6) {
        //alert("é igual");
       //}
       //else{
       // alert("O tipo de dado é diferente")
       //}

      //const aluno = "Charles";
      //if(aluno == "Charles") {
       //console.log("Sim é o Charles")
      //} else{
        //console.log("Não é o Charles")
      //}



      //Funções são blocos de código que podem ser chamados e reutilizados
      //Dentro dos parenteses da função vai os parâmetros

      function primeiraFunção(parametro, segundoParametro) {

        return parametro + segundoParametro;

      }
      
      const parametro = "Essa é uma função com parãmetro"
      const segundoParametro = ", agora com dois parametros"

      console.log(primeiraFunção(parametro, segundoParametro));
 
});