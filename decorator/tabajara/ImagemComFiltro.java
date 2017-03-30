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
    Cabecalho cabecalho;
    ImagemComFiltro(Imagem img, Cabecalho cabecalho) {
        this.img = img;
        this.cabecalho = cabecalho;
    }

    @Override
    public void draw() throws IOException {
        byte[][] content = this.img.content();
        // aplica filtro ao conteúdo da imagem.
        System.out.println("Desenha imagem com filtro " + largura() + " x " + altura());
    }
    
    public short altura() {
        return this.cabecalho.altura();
    }

    public short largura() {
        return this.cabecalho.largura();
    }

    @Override
    public byte[][] content() throws IOException { 
      return this.img.content(); 
    }
}
