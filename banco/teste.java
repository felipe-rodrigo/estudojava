package banco;

public class teste {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Contagem Regressiva: ");
    
    for (int i = 10; i >= 0; i--) {
      System.out.print(i + " ");
      Thread.sleep(1000);
      System.out.print("\r");
    }

    System.out.println("Tempo Esgotado!");

  }
}
