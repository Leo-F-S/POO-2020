package aula01.lab;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Paulo",111,8.0,6.0,5.0);
		Aluno aluno2 = new Aluno("Maria",222,4.0,6.0,3.0);
		Aluno aluno3 = new Aluno("Jos�",333,6.0,4.0,9.0);
		Aluno aluno4 = new Aluno("Patr�cia",444,7.0,8.0,9.0);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		JOptionPane.showMessageDialog(null, "M�dia do Aluno " + aluno1 + " = " + 	df.format(aluno1.calculaMedia()));
		JOptionPane.showMessageDialog(null, "M�dia do Aluno " + aluno2 + " = " + 	df.format(aluno2.calculaMedia()));
		JOptionPane.showMessageDialog(null, "M�dia do Aluno " + aluno3 + " = " + 	df.format(aluno3.calculaMedia()));
		JOptionPane.showMessageDialog(null, "M�dia do Aluno " + aluno4 + " = " + 	df.format(aluno4.calculaMedia()));
		
		JOptionPane.showMessageDialog(null,"M�dia Geral = " +
			df.format((aluno1.calculaMedia() + aluno2.calculaMedia() +
			 aluno3.calculaMedia() + aluno4.calculaMedia())/4 ));
	}
}

