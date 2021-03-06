package aula01.lab;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaPrincipal2 {
	
	public static void main(String[] args) {
		Aluno alunos[] = new Aluno[4];
		
		alunos[0] = new Aluno("Paulo",111,8.0,6.0,5.0);
		alunos[1] = new Aluno("Maria",222,4.0,6.0,3.0);
		alunos[2] = new Aluno("Jos�",333,6.0,4.0,9.0);
		alunos[3] = new Aluno("Patr�cia",444,7.0,8.0,9.0);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double total = 0;
		for (int i=0; i<=3;i++) {
			JOptionPane.showMessageDialog(null, "M�dia do Aluno " + alunos[i] + " = " + 	df.format(alunos[i].calculaMedia()));
			total = total + alunos[i].calculaMedia();
		}
		
		JOptionPane.showMessageDialog(null,"M�dia Geral = " + df.format(total/4));
	}
}