import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Life novaSimulacao = new Life();
		int MAX = 5;
		int i,j;
	    int [][] matriz = new int[MAX][MAX];
		
		for(i = 1; i<MAX - 1; i++){
			for(j=1; j < MAX -1; j++){
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("0 = Morta, 1 = Vida"));
			}
		}
		novaSimulacao.inicializa(matriz);
		novaSimulacao.simulaVida(5);
	}

}
