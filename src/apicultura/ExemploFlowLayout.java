package apicultura;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploFlowLayout {

	//criamos e instaciamos um JFrame chamado 'janela'
	JFrame janela = new JFrame();
	//criamos um JPanel chamado painel
	JPanel painel = new JPanel();
	//criamos um JLabel chamado rotulo e com o texto "seu nome: "
	JLabel rotulo = new JLabel("Seu nome: ");
	//criamos um JTextField chamado texto com o tamanho 5
	JTextField texto = new JTextField(5);
	//criamos e instaciamos um JButton chamado 'botao' e com o texto "ok"
	JButton botao = new JButton("OK");

	public static void main(String[] args) {

		new ExemploFlowLayout();
			
	}
			
		private ExemploFlowLayout() {
			//definimos o titulo da janela
			janela.setTitle("Exemplo de um FlowLayout");
			//definimos a largura e a altura da janela
			janela.setSize(300, 100);
			//define a posicao da janela na tela
			janela.setLocation(50, 50);
			//define que ao fechar a janela, encerre a aplicacao
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//definimos o layout do painel
			painel.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
			//adicionamos o rotulo ao painel
			painel.add(rotulo);
			//adicionamos o texto ao painel
			painel.add(texto);
			//adicionamos o botao a janela
			painel.add(botao);
			//adicionamos o painel a janela
			janela.add(painel);
			//mostramos a janela
			janela.setVisible(true);
		}

		


}


