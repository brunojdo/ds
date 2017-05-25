var singletonEstacionamento = (function () {
 
    // armazena uma referência ao singleton
    var instance;
 
    function init(){
    
        // métodos e propriedades do singleton vão aqui
 
        // objetos privados
        var patio = [];
        var deletaCarro = function (carro) {
            index = patio.indexOf(carro);
            if (index > -1) {
                patio.splice(index, 1);
            }
        };

        // objetos públicos
        return {
            lista: patio,
            entrar: function (carro) {
                patio.push(carro);
            },
            sair: function (carro) {
                deletaCarro(carro);
            }
        };
    };
    // retorna sempre a mesma instância dessa classe
    return {
 
        // se a instância existir, retorna ela, senão cria uma nova
        getInstance: function () {
            if ( !instance ) {
                instance = init();
            }
            return instance;
        }
    };
})();

est1 = singletonEstacionamento.getInstance();
est2 = singletonEstacionamento.getInstance();

// true!
console.log(est1 === est2);