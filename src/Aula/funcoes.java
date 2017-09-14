package Aula;

import javax.swing.JOptionPane;

public class funcoes {
   private int num = 0;
   private int resultado = 0;
	public void Somar(int a)
	{  
		this.resultado = this.resultado + a;

	}
	public void qtdNum(int num)
	{  boolean valida = true;
	   while(valida)
	   {
		if(num < 2)
		{
			JOptionPane.showMessageDialog(null, "Informe mais de 2 numeros!");
		}
		else
		{
		this.num = num;
		valida = false;
     	}
		
	   }
	}
	public int getResultado()
	{
		return this.resultado;
	}
	public int getQtd()
	{
		return this.num;
	}
	public static int lerNumero(String mensagem)
	{  int numero = 0;
	   boolean valida = true;
	   while(valida)
	   {
		   try {
			   numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			   valida = false;
		   }
		   catch(NumberFormatException e)
		   {
			   JOptionPane.showMessageDialog(null, "informe um numero válido, erro: "+ e.toString());
	       }
	   }
	    

		return numero;
	}
	
}
