package socket;

import java.awt.Color;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Screen extends JFrame {
	private JTextField textField;
	private JLabel lblNum;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnReset;
	private JTextArea textArea;

	public Screen() {
		init();
	}

	private void init() {
		setTitle("Hi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(1200, 400, 500, 300);
		setResizable(false);
		getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(textArea);
		

        textField = new JTextField();
        textField.setBounds(0, 230, 390, 31);
        getContentPane().add(textField);
        textField.setBackground(Color.white);
        textField.setColumns(10);
        
        JButton btnInput = new JButton("ют╥б");
        btnInput.setForeground(Color.BLUE);
        btnInput.setBackground(Color.YELLOW);
        btnInput.setBounds(387, 230, 97, 31);
        getContentPane().add(btnInput);
 
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 484, 22);
        getContentPane().add(panel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 23, 484, 208);
        getContentPane().add(scrollPane);
        scrollPane.setViewportView(textArea);
	}

	public static void main(String[] args) {
		new Screen();

	}

}
