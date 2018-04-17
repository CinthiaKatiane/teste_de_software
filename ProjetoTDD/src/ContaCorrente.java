import java.util.List;
import java.util.ArrayList;

public class ContaCorrente {
	private int balance = 0;
	private int i_balance = 0;
	private String correntista = "James Grenning";
	private List<Deposito> historico = new ArrayList<Deposito>();
	
	public ContaCorrente() {

	}

	public ContaCorrente(int i) {
		this.balance = i;
		this.i_balance = i;
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String string) {
		// TODO Auto-generated constructor stub
		this.correntista = string;
	}

	public ContaCorrente(String string, int i) {
		// TODO Auto-generated constructor stub
		this.balance = i;
		this.i_balance = i;
		this.correntista = string;
	}

	public Object saldo() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	public void creditar(Deposito deposito) {
		// TODO Auto-generated method stub
		this.balance += deposito.valor();
		this.historico.add(deposito);
	}

	public String extrato() {
		String extrato;
		if (this.historico.size() == 0)
		{
			extrato = 
					"Conta de " + this.correntista + "\n" +
					"Saldo Inicial $" + this.i_balance + "\n" +
					"Saldo Final $" + this.balance + "\n" +
					"Nenhuma trasacao realizada\n";
		} else 
		{
			extrato = 
					"Conta de " + this.correntista + "\n" +
					"Saldo Inicial $" + this.i_balance + "\n" +
					"Saldo Final $" + this.balance + "\n" ;
			for (Deposito deposito : historico) {
				extrato += deposito.data() + "\tDeposito\t$" + deposito.valor() + "\n";
			}
		}
				
		return extrato;
	}

}
