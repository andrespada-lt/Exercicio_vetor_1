import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int quandidade = 4;
        int numero[] = new int[quandidade];
        for (int i =0; i<quandidade; i++){
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor "+i+" :"));
        }
        int soma = 0;
        for (int i =0; i<quandidade; i++){
            soma= soma+numero[i];
        }
        double media = soma/2;
        JOptionPane.showMessageDialog(null,"a soma: "+ soma + " As media dos valorers é: " + media);
    }
}
