package aula04;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		System.out.println("Criando objeto ContaPoupanša");
	}
	
	public void sacar(double quantidade) {
		
		if(quantidade < getSaldo() && quantidade <= 100) {
			System.out.println("verifique seu saldo e o limete de saque para esta conta poupanša");
		}else {
			setSaldo(getSaldo() - quantidade);
			System.out.println(quantidade + " reais sacado com sucesso da sua conta poupanša");
		}
		
	}

}
