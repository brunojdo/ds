package software_design.facade;

/**
 * Problema de acesso a vários subsistemas. 
 * Ref: https://brizeno.wordpress.com/category/padroes-de-projeto/facade/
 */
class Problem {

  public class SistemaDeAudio {

    public void configurarFrequencia() {
      System.out.println("Frequencia configurada");
    }

    public void configurarVolume() {
      System.out.println("Volume configurado");
    }

    public void configurarCanais() {
      System.out.println("Canais configurados");
    }

    public void reproduzirAudio(String arquivo) {
      System.out.println("Reproduzindo: " + arquivo);
    }
  }
  public class SistemaDeInput {
  
    public void configurarTeclado() {
      System.out.println("Teclado configurado");
    }

    public void configurarJoystick() {
      System.out.println("Joystick configurado");
    }

    public void lerInput() {
      System.out.println("Botão # pressionada");
    }
  }
  public class SistemaDeVideo {
  
    public void configurarResolucao() {
      System.out.println("Resolução configurada");
    }

    public void configurarCores() {
      System.out.println("Esquema de cores configurado");
    }

    public void renderizarImagem(String imagem) {
      System.out.println("Imagem: " + imagem + " renderizada");
    }
  }
  
  // Manipulação de vários subsistemas 
  public static void main(String[] args) {
      System.out.println("##### Configurando subsistemas #####");
      SistemaDeAudio audio = new SistemaDeAudio();
      audio.configurarCanais();
      audio.configurarFrequencia();
      audio.configurarVolume();

      SistemaDeInput input = new SistemaDeInput();
      input.configurarTeclado();
      input.configurarJoystick();

      SistemaDeVideo video = new SistemaDeVideo();
      video.configurarCores();
      video.configurarResolucao();

      System.out.println("##### Utilizando subsistemas #####");
      audio.reproduzirAudio("teste.mp3");
      input.lerInput();
      video.renderizarImagem("imagem.png");
  }
}
