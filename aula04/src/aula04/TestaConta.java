package aula04;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta(1234, 0, "Douglas");
		conta.depositar(1000);
		conta.sacar(500);
		conta.sacar(500);
		conta.sacar(1);
		conta.retornaSaldo();
		
		System.out.println();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(1000);
		contaPoupanca.sacar(500);
		contaPoupanca.sacar(101);
		contaPoupanca.retornaSaldo();
		
		System.out.println("Quantidade de contas " + Conta.contador);
		
	}

}
