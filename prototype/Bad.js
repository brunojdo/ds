function Carro( modelo, ano, km ) {

    this.modelo = modelo;
    this.ano = ano;
    this.km = km;
 
    this.toString = function () {
        return this.modelo + " andou " + this.km + " km desde " + this.ano;
    };
}
 
// instanciando Carro
var opala = new Carro( "Chevrolet Opala", 1979, 130000 );
var belina = new Carro( "Ford Belina", 1982, 200000 );

// chamando o método toString() de cada Carro
console.log( opala.toString() );
console.log( belina.toString() );