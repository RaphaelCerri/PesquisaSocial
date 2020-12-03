
import javax.swing.JOptionPane;

public class aula6ex3 {
    public static void main(String[] args) {
        float altM = 0, contH = 0, altH = 0, contM = 0, alturaM, alturaH;
        boolean x = true;
        String sexo, h, H, S, N, resp;
        while(x = true){
            sexo = JOptionPane.showInputDialog(null, "Digite se você é originariamente H para Homem ou M para Mulher", "Sexo",
                        JOptionPane.INFORMATION_MESSAGE);
            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("h")){
                alturaH = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digite sua altura", "Altura",
                        JOptionPane.INFORMATION_MESSAGE));
                contH++;
                altH++;
            }
            else{
                alturaM = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digite sua altura", "Altura",
                        JOptionPane.INFORMATION_MESSAGE));
                contM++;
                altM++;
            }
           
            resp = JOptionPane.showInputDialog(null, "Quer continuar? S ou N", "mensagem",
                        JOptionPane.INFORMATION_MESSAGE);
            
            if (resp.equalsIgnoreCase("S")){
		x = true;
            }
        }
        JOptionPane.showMessageDialog(null, "Estatura média das mulheres " + altM/contM,"Média Altura das Mulheres",
                        JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de homens do grupo são de " + contH,"Quantidade de Homens",
                        JOptionPane.INFORMATION_MESSAGE);
    }
}
