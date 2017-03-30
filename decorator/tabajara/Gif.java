package software_design.decorator.tabajara;

import java.io.IOException;

/**
 * Adaptador de imagens gif. Usa a biblioteca <code>ImprovedGif</code> para
 * desenhar imagens Gif e o cabeçalho para responder informações sobre
 * a altura e a largura.
 */
class Gif implements Imagem {
 
    @Override
    public short altura() {
        return 256;
    }

    @Override
    public short largura() {
        return 256;
    }

    @Override
    public void draw() throws IOException {
        System.out.println("Desenha imagem " + largura() + " x " + altura());
    }
    
    @Override
    public byte[][] content() throws IOException {
        return new byte[][]{
            new byte[]{0, 1}
        };
    }
}
