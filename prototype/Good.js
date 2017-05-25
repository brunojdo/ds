// Código http://jordankobellarz.github.io/javascript/2015/01/30/guia-rapido-de-padroes-de-projeto-javascript.html

function Carro( modelo, ano, km ) {

    this.modelo = modelo;
    this.ano = ano;
    this.km = km;

}

// usando protype para definir um método
Carro.prototype.toString = function () {
    return this.modelo + " andou " + this.km + " km desde " + this.ano;
};

// instanciando Carro
var opala = new Carro( "Chevrolet Opala", 1979, 130000 );
var belina = new Carro( "Ford Belina", 1982, 200000 );

// chamando o método toString() de cada Carro
console.log( opala.toString() );
console.log( belina.toString() );