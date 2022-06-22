public class Conta
{
    private int codigo;
    private int tipo;
    private double saldo;
    private double limite;
    
    
public Conta() {

}
    public int getcodigo(int codigo) {
		    return codigo;
	}
     public void setcodigo(int codigo) {
		this.codigo = codigo;
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
}

    
