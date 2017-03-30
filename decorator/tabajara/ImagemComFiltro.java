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
        byte[][] content = this.img.content();
        // aplica filtro ao conteúdo da imagem.
        System.out.println("Desenha imagem com filtro " + this.img.largura() + " x " + this.img.altura());
    }
    
    @Override
    public byte[][] content() throws IOException { 
      return this.img.content(); 
    }
}
