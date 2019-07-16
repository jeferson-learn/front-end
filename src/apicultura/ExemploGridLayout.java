package apicultura;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ExemploGridLayout {

	//criamos e instaciamos um JFrame chamado 'janela'
		JFrame janela = new JFrame();
		//criamos um JPanel chamado painel
		JPanel painel = new JPanel();
		//criamos um JLabel chamado rotulo e com o texto "Escolha uma fruta: "
		JLabel rotulo1 = new JLabel("Escolha uma fruta: ");
		//criamos um JLabel chamado rotulo e com o texto "Escolha uma bebida: "
		JLabel rotulo2 = new JLabel("Escolha uma bebida: ");
		/*criamos um ListaModel que � o objeto que contem as opcoes da lista
		 * nao se preocupem com isso agora, pois veremos com mais detalhes
		 */
		DefaultListModel listModel = new DefaultListModel();
		//criamos um JList chamado lista e definimos onde estao os objetos da lista
		JList lista = new JList (listModel);
		//criamos um JComboBox chamado combo
		JComboBox combo = new JComboBox();
		//criamos e instaciamos um JButton chamado 'botao' e com o texto "ok"
		JButton botao = new JButton("OK");
	
	public static void main(String[] args) {

		new ExemploGridLayout();

	}
	
	private ExemploGridLayout() {
		//definimos o titulo da janela
		janela.setTitle("Exemplo de um FlowLayout");
		//definimos a largura e a altura da janela
		janela.setSize(300, 100);
		//define a posicao da janela na tela
		janela.setLocation(50, 50);
		//define que ao fechar a janela, encerre a aplicacao
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//definimos o layout do painel
		painel.setLayout(new GridLayout(3, 2, 5, 1));
		//adicionamos o rotulo1 ao painel
		painel.add(rotulo1);
		//acrescentamos algumas frutas a lista
		listModel.addElement("Ma��");
		listModel.addElement("Uva");
		listModel.addElement("Pera");
		//adicionamos a lista ao painel
		painel.add(lista);
		//adicionamos a rotulo2 ao painel
		painel.add(rotulo2);
		//acrescentamos algumas bebidas ao combo
		combo.addItem("Agua");
		combo.addItem("Refrigerante");
		combo.addItem("Suco");
		//adicionamos o combo ao painel
		painel.add(combo);
		//adicionamos o botao ao painel
		painel.add(botao);
		//adicionamos o painel a janela
		janela.add(painel);
		//mostramos a janela
		janela.setVisible(true);
	}

}
