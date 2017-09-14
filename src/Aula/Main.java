package Aula;


import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		funcoes funcao = new funcoes();
		funcao.qtdNum(funcao.lerNumero("Informe o numero: "));
		for(int i = 0; i <= funcao.getQtd(); i++)
		{
			funcao.Somar(funcao.lerNumero("Informe o numero "+i+" : "));
		}
		JOptionPane.showMessageDialog(null,"A soma dos números é: "+funcao.getResultado());
	}
	

}
