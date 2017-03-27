package software_design.adapter.tabajara;

import java.io.IOException;

/**
 * Exemplo da motivação para uso de wrappers.
 */
interface Imagem {
    /**
     * Desenha a imagem.
     */
    void draw() throws IOException;
}
