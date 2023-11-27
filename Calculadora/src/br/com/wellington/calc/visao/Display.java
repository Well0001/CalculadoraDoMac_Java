package br.com.wellington.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.wellington.calc.modelo.Memoria;
import br.com.wellington.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label;
	
	public Display(){
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46,49,50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier",Font.PLAIN, 30));
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,17));
		add(label);
	}

	@Override
	public void alterarValor(String novoValor) {
		label.setText(novoValor);
		
		
	}

}