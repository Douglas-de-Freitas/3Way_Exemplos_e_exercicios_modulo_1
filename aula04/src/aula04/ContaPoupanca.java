package aula04;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		System.out.println("Criando objeto ContaPoupan�a");
	}
	
	public void sacar(double quantidade) {
		
		if(quantidade < getSaldo() && quantidade <= 100) {
			System.out.println("verifique seu saldo e o limete de saque para esta conta poupan�a");
		}else {
			setSaldo(getSaldo() - quantidade);
			System.out.println(quantidade + " reais sacado com sucesso da sua conta poupan�a");
		}
		
	}

}
