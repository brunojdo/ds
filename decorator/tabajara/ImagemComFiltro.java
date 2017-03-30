package software_design.decorator.tabajara;

import java.io.IOException;

/**
 * Exemplo do padrão decorador. A idéia principal aqui é adicionar funcionalidade a <code>Imagem</code>(através
 * da aplicação do filtro), sem alterar a interface <code>Imagem</code>.
 *
 * <p>Importante notar que optamos por utilizar composição da <code>Imagem</code>, mas o mesmo comportamento
 * poderia ser conseguido através de herança.
 */
class ImagemComFiltro implements Imagem {
    Imagem img;
    ImagemComFiltro(Imagem img) {
        this.img = img;
    }

    @Override
    public void draw() throws IOException {
        System.out.println("Desenha imagem com filtro " + largura() + " x " + altura());
        // Draw this.content() internamente. Desenhando a imagem com o filtro aplicado.
        this.img.draw();
    }
    
    public short altura() {
        return this.img.altura();
    }

    public short largura() {
        return this.img.largura();
    }

    @Override
    public byte[][] content() throws IOException { 
      byte[][] conteudoComFiltro = new byte[altura()][largura()];
      // Realiza operações de aplicação do filtro.
      return conteudoComFiltro;
    }
}
