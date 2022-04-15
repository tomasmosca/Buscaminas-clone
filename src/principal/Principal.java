package principal;

import tablero.Tablero;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal extends JFrame {
	
	private JLabel statusbar;
	
	public Principal(){
		
		initUI();
		
	}
	
	private void initUI() {
		
		statusbar = new JLabel("");
		add(statusbar, BorderLayout.SOUTH);
		
		add(new Tablero(statusbar));
		
		setResizable(false);
		pack();
		
		setTitle("Buscaminas - v1.0");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {

            Principal ex = new Principal();
            ex.setVisible(true);
        });

	}

}
