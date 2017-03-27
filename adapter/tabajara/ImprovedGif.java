package software_design.adapter.tabajara;

/**
 * Representa uma classe que não pode ser modificada. No caso exemplo, imagine que vamos usar
 * uma biblioteca que desenha gifs de forma mais eficiente. O problema é que ela lança uma
 * exceção interna a biblioteca e não temos podemos modificá-la. Nesse caso, usamos um adapter.
 */
class ImprovedGif {
    class TenteiENaoConseguiAbrirException extends Exception{}

    ImprovedGif() {
    }

    public void draw() throws TenteiENaoConseguiAbrirException {
        System.out.println("Imagem adaptada usando ImprovedGif.");
    }
}
