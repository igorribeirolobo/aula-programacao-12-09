package Aula;


import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		funcoes funcao = new funcoes();
		int num = 0;
		int op = 0;
		op = funcao.lerNumero("Escolha a opera��o: \n 1 - soma \n 2 - subtracao \n 3 - multiplicacao \n 4 - divisao ");
		if(op == 1)
		{
		while(num < 2)
		{
		num = funcao.lerNumero("Informe o numero > 1: ");
		}
	    funcao.qtdNum(num);
		for(int i = 1; i <= funcao.getQtd(); i++)
		{    int a = i + 1;
			funcao.Somar(funcao.lerNumero("Informe o numero "+i+" : "));
		}
		JOptionPane.showMessageDialog(null,"A soma dos n�meros �: "+funcao.getResultado());
	    } 
		
		if(op == 2)
		{
			while(num < 2)
			{
				num = funcao.lerNumero("Informe o numero > 1: ");
			}
			funcao.qtdNum(num);
		  for(int i = 1; i<= funcao.getQtd(); i++)
		  {
			  
			  funcao.Subtrair(funcao.lerNumero("Informe o numero"+i+" : "));
	      }
		  JOptionPane.showMessageDialog(null,"A subtra��o dos n�meros �: "+funcao.getResultado());
		}
		if(op == 3)
		{
			while(num< 2)
			{
				num = funcao.lerNumero("Informe o numero > 1: ");
			}
			funcao.qtdNum(num);
			for(int i = 1; i <= funcao.getQtd();i++)
			{
				funcao.Multiplicar(funcao.lerNumero("Informe o numero"+i+" : "));
			}
			JOptionPane.showMessageDialog(null,"A multiplica��o dos n�meros � : "+funcao.getResultado());
		}
		if(op == 4)
		{
			funcao.qtdNum(2);
			for(int i = 1; i <= funcao.getQtd();i++)
			{
				funcao.Dividir(funcao.lerNumero("Informe o numero"+i+" : "));
			}
			JOptionPane.showMessageDialog(null,"A divis�o dos n�meros �: "+funcao.getResultado());
		}
	}
	

}
