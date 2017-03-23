package software_design.proxy;

 /**
  * Classe que implementa o conceito de Proxy Virtual no carregamento de imagens 
  * ref: https://pt.wikipedia.org/wiki/Proxy_(padr%C3%B5es_de_projeto)
  */
class VirtualProxy { 

    // Interface do Objeto
    public interface Image {
      void display();
    }

    // Objeto Real 
    public class RealImage implements Image {

      private String fileName;
      public RealImage(String fileName){
         this.fileName = fileName;
         loadFromDisk(fileName);
      }
      @Override
      public void display() {
         System.out.println("Displaying " + fileName);
      }
      private void loadFromDisk(String fileName){
         System.out.println("Loading " + fileName);
      }
    }
    
    // Objeto Proxy
    public class ProxyImage implements Image{
      private RealImage realImage;
      private String fileName;
      
      public ProxyImage(String fileName){
         this.fileName = fileName;
      }
      @Override
      public void display() {
         if(realImage == null){
            realImage = new RealImage(fileName);
         }
         realImage.display();
       }
    }   
    // Demonstração do uso de proxy
    public class ProxyPatternDemo {
      public static void main(String args) {
         Image image = new ProxyImage("test_10mb.jpg");
         // Imagem será carregada do disco
         image.display();
         System.out.println("");
         // Imagem NÃO será carregada do disco
         image.display();
        }
      }
    }
}
