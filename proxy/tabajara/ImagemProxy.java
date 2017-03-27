package software_design.proxy.tabajara;

import java.io.IOException;

class ImagemProxy implements Imagem {
    Cabecalho cabecalho;
    Imagem imagem;

    ImagemProxy(Imagem imagem, Cabecalho cabecalho) {
        this.imagem = imagem;
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
        this.imagem.draw();
    }

    @Override
    public String toString() {
        return "largura:" + largura() + " altura:" + altura();
    }
}
