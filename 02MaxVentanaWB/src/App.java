import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Frame;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(false);
		setMinimumSize(new Dimension(300, 300));
		getContentPane().setSize(new Dimension(400, 400));
		getContentPane().setLocation(new Point(100, 100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("New button");
		btn1.setBounds(50, 50, 200, 30);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("New button");
		btn2.setBounds(50, 100, 200, 30);
		getContentPane().add(btn2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	
	}
}
