import javax.swing.JFrame;
import javax.swing.JTextArea;

public class App extends JFrame{
	public  App() {
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 30, 300, 200);
		//ajueste el texto a la ventana
		textArea.setLineWrap(true);
		//ajusta palabras completas
		textArea.setWrapStyleWord(true);
		//mover el cursor a una posicion
		//introducir un texto en text area
		textArea.setText("Ejemplo de campo de texto");
		textArea.setCaretPosition(10);
		
		
		add(textArea);
		setSize(350, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
	}

}
