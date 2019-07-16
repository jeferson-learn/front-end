package apicultura;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeiroSwing {
	//criamos e instaciamos um JFrame chamado 'janela'
	JFrame janela = new JFrame();
	//criamos um JPanel chamado painel
	JPanel painel = new JPanel();
	//criamos um JLabel chamado rotulo e com o texto "seu nome: "
	JLabel rotulo = new JLabel();
	//criamos um JTextField chamado texto com o tamanho 5
	JTextField texto = new JTextField(5);
	//criamos e instaciamos um JButton chamado 'botao' e com o texto "ok"
	JButton botao = new JButton("OK");
	
	public static void main(String[] args) {
		
		new PrimeiroSwing();

	}
	
	private PrimeiroSwing() {
		//definimos o titulo da janela
		janela.setTitle("Primeira Aplicação Grafica");
		//definimos a largura e a altura da janela
		janela.setSize(500, 350);
		//define a posicao da janela na tela
		janela.setLocation(50, 50);
		//define que ao fechar a janela, encerre a aplicacao
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//adicionamos o botao a janela
		janela.add(botao);
		//mostramos a janela
		janela.setVisible(true);
	}

}
