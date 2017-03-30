package software_design.adapter.tabajara;

import java.io.IOException;

/**
 * Adaptador de imagens gif. Usa a biblioteca <code>ImprovedGif</code> para
 * desenhar imagens Gif e o cabeçalho para responder informações sobre
 * a altura e a largura.
 */
class Gif implements Imagem {
    Cabecalho cabecalho;
    ImprovedGif ig;

    Gif(ImprovedGif ig, Cabecalho cabecalho) {
        this.ig = ig;
        this.cabecalho = cabecalho;
    }

    public short altura() {
        return this.cabecalho.altura();
    }

    public short largura() {
        return this.cabecalho.largura();
    }

    @Override
    public void draw() throws IOException {
        try {
            this.ig.draw();
        } catch (ImprovedGif.TenteiENaoConseguiAbrirException e) {
            throw new IOException(e);
        }
    }

    @Override
    public String toString() {
        return "largura:" + largura() + " altura:" + altura();
    }
}
