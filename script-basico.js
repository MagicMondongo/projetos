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
            console.log("---us guri tao com tudo---")
           
            const notaMedia = 3;
    
           // if (notaMedia >= 6){
                //alert("Aluno passou");
           // } 
           // else if (notaMedia >= 4 && notaMedia <6){
                //alert("aluno quase passou");
           // }
           // else {
               // alert("aluno reprovou");
           // }
            
           //----------- Operadores----------
           
           // = sinal de atribuição 
           // == sinal de comparação 
           // === verifica se os dois são iguais e têm o mesmo tipo de dados
           // != se é diferente
           // !== se é estritamente diferente
           // > maior
           // <menor
           
           //-----------------//
            
           //const num = 6;
           //if (num === 6) {
            //alert("é igual");
           //}
           //else{
            //alert("O tipo de dado é diferente")
           //}
    
          const aluno = "Charles";
          if(aluno == "Charles") {
           console.log("Sim é o Charles")
          } else{
            console.log("Não é o Charles")
          }

          //------------------//

          function primeiraFuncao(parametro) {
            return parametro + segundoParametro;
          }

          const parametro = "essa é uma função com parametro"
          const segundoParametro = ", agora com dois parametros"

          console.log(primeiraFuncao(parametro, segundoParametro));

          //------------------//

          //arrays em javascript são estruturas de dados que permitem 
          //armazenar uma coleçao ordenada de elementos.
          //const é permanente
          //let pode mudar não é permanente
          //--------------//

         let primeiroArray = ['Charles', 'Otavio','Igor', 'João'];

         console.log(primeiroArray[0])
         //---------------------//

         //Os objetos são coleções NÃO ORDENADAS de
         //pares chave-valor, onde cada valor é associado a uma chave única

         let pessoa = {
             nome: 'Charles',
             idade: '18',
             profissao: 'Gostoso'
         }

         console.log(pessoa['profissao']);

         //chgarlekdfia
    
    });