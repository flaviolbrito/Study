package ex01;

// exemplo de Herança
public class ContaEspecial extends ContaBancaria{
	
	public void saque(double valor){
		saldo -= (valor+valor*0.1);
	}
	
	public void deposita(double valor){
		saldo += (valor-valor*0.1);
	}

}
