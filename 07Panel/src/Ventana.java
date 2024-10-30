import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana() {
		this.setTitle("Panel con ventana");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		//añadimos a la ventana
		Panel01 panel01 = new Panel01();
		
		this.add(panel01);
		
		
		this.setVisible(true);
		
		
	}

	
	
}
