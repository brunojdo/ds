package software_design.facade;

/**
 * Problema de acesso a vários subsistemas. 
 * Ref: https://brizeno.wordpress.com/category/padroes-de-projeto/facade/
 */
class Facade {

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
  /**
   * Fachada que o cliente deve se comunicar. Abstrai a necessidade do cliente 
   * entender o funcionamento dos três subsistemas.
   */
  public class SistemasFacade {
    protected SistemaDeAudio audio;
    protected SistemaDeInput input;
    protected SistemaDeVideo video;

    public void inicializarSubsistemas() {
      video = new SistemaDeVideo();
      video.configurarCores();
      video.configurarResolucao();

      input = new SistemaDeInput();
      input.configurarJoystick();
      input.configurarTeclado();

      audio = new SistemaDeAudio();
      audio.configurarCanais();
      audio.configurarFrequencia();
      audio.configurarVolume();
    }

    public void reproduzirAudio(String arquivo) {
      audio.reproduzirAudio(arquivo);
    }

    public void renderizarImagem(String imagem) {
      video.renderizarImagem(imagem);
    }

    public void lerInput() {
      input.lerInput();
    }

  }
  // Manipulação através da fachada. 
  public static void main(String[] args) {
    System.out.println("##### Configurando subsistemas #####");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();
  }
}
