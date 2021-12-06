import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chatting_List extends JFrame {
	private JTextField textField;
	private JLabel lbNum;
	private JButton jb1;
	private JButton jb2;
	private JTextArea textArea;

	public chatting_List() {
		init();
	}

	private void init() {
		JFrame fr = new JFrame("JS");
		JPanel jp = new JPanel();
		BorderLayout fl = new BorderLayout();
        jp.setLayout(fl);
		setTitle("¼­¹ö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton CreateBtn
		
		
		jp.add(bt[0], BorderLayout.NORTH);
        jp.add(bt[1], BorderLayout.EAST);
        jp.add(bt[2], BorderLayout.CENTER);
        jp.add(bt[3], BorderLayout.WEST);
        jp.add(bt[4], BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		fr.setContentPane(jp);
		fr.setSize(400,300);
		fr.setVisible(true);
	}

//	setTitle("hello")

	public static void main(String[] args) {
		new chatting_List();

	}
}
