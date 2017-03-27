package software_design.proxy.tabajara;

/**
 * Implementação de imagem, 1997.
 */
class Gif implements Imagem {
   
    Gif() {}

    @Deprecated
    @Override
    public short altura() {
        throw new RuntimeException("Nuuuunca seja chamado");
    }

    @Deprecated
    @Override
    public short largura() {
        throw new RuntimeException("Nuuuunca seja chamado");
    }

    @Override
    public void draw() throws IOException {
        System.out.println("Desenha imagem " + largura() + " x " + altura());
    }

    @Override
    public String toString() {
        return "largura:" + largura() + " altura:" + altura();
    }
}
