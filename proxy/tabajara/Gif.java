package software_design.proxy.tabajara;

/**
 * Implementação de imagem, 1997.
 */
class Gif implements Imagem {
   
    @Override
    public void draw() throws IOException {
        System.out.println("Desenha imagem " + largura() + " x " + altura());
    }

    @Override
    public String toString() {
        return "largura:" + largura() + " altura:" + altura();
    }
}
