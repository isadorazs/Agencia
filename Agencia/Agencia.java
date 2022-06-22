import java.util.ArrayList;

public class Agencia
{
    int codigoAgencia;
    private ArrayList<Conta> contas;

public Agencia(){
contas = new ArrayList <> ();

}

    public int getcodigoAgencia(int codigoAgencia) {
		    return codigoAgencia;
	}
     public void setcodigoAgencia(int codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}
    public void adicionar (Conta c){
      contas.add (c);
}
}
