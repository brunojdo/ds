package software_design.decorator.tabajara;

import java.io.IOException;

/**
 * Exemplo da motivação para uso de wrappers.
 */
interface Imagem {
    /**
     * @return Altura da imagem em pixels.
     */
    short altura();

    /**
     * @return Largura da imagem em pixels.
     */
    short largura();
    
    /**
     * Desenha a imagem.
     */
    void draw() throws IOException;
    
    /**
     * @return o conteúdo do imagem, sem cabeçalho.
     */
    byte[][] content() throws IOException;
}
