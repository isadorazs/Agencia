public class Conta
{
    private int codigoConta;
    private int tipo;
    private double saldo;
    private double limite;
    private double sacar;
    private double depositar;
    private double transferir;
    
    
public Conta() {
    


  
}
    public int getcodigoConta(int codigoConta) {
		    return codigoConta;
	}
     public void setcodigoConta(int codigo) {
		this.codigoConta = codigoConta;
	}
     public int gettipo() {
		return tipo;
	}
     public void settipo(int tipo) {
		this.tipo = tipo;
	
	}
    
     public double getSaldo(double saldo){
                 this.saldo = saldo;
                 return saldo;
        }	
     public double getLimite(double limite){
                this.limite = limite;
                return limite;
        
        }

    public void sacar(double valor){
        
      
        if(saldo >= valor){
            saldo -= valor;
            //saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void depositar(double valor){ 
      
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    

}

    
