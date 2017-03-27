package software_design.adapter;

/**
 * Exemplo do padrão adapter
 * Ref: https://github.com/MarcosX/Padr-es-de-Projeto/tree/master/src/br/padroes/adapter
 */
 
class Adapter {

  // Interface alvo que o cliente acessa: 
  public interface ImagemTarget {
    void carregarImagem(String nomeDoArquivo);
    
    void desenharImagem(int posX, int posY, int largura, int altura);
  }
  
  // Implementação usando OpenGL 
  public class OpenGLImage {
    public void glCarregarImagem(String arquivo) {
      System.out.println("Imagem " + arquivo + " carregada.");
    }

    public void glDesenharImagem(int posicaoX, int posicaoY) {
      System.out.println("OpenGL Image desenhada");
    }
  }
  
  // Implementação usando SDL Surface 
  public class SDL_Surface {

    public void SDL_CarregarSurface(String arquivo) {
      System.out.println("Imagem " + arquivo + " carregada.");
    }

    public void SDL_DesenharSurface(int largura, int altura, int posicaoX,
        int posicaoY) {
      System.out.println("SDL_Surface desenhada");
    }
  }
  
  // Adapter para criar imagens em Open GL
  public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {
    @Override
    public void carregarImagem(String nomeDoArquivo) {
      glCarregarImagem(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
      glDesenharImagem(posX, posY);
    }
  }
  
  // Adapter para criar imagens em SDL Surface
  public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget {
    @Override
    public void carregarImagem(String nomeDoArquivo) {
      SDL_CarregarSurface(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
      SDL_DesenharSurface(largura, altura, posX, posY);
    }
  }
  
  public class Cliente {
    public static void main(String[] args) {
      // Cliente criando a imagem usando SDL 
      ImagemTarget imagem = new SDLImagemAdapter();
      imagem.carregarImagem("teste.png");
      imagem.desenharImagem(0, 0, 10, 10);
      
      // Cliente criando a imagem usando OpenGL 
      imagem = new OpenGLImageAdapter();
      imagem.carregarImagem("teste.png");
      imagem.desenharImagem(0, 0, 10, 10);
    }
  }
}
