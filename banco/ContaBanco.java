package banco;

public class ContaBanco {

  // Atributos
  private int numConta;
  private String tipo;
  private float saldo;
  private String status;

  // Método Construtor
  public ContaBanco(int numConta, String tipo, float saldo, String status) {
    this.numConta = numConta;
    this.tipo = tipo;
    this.saldo = saldo;
    this.numConta = numConta;
  }

  // Métodos Acessores
  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  // Métodos da Conta
  public void depositar() {
    
  }
}