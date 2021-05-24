import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TestCalculation {

	private JFrame frame;
	private JTextField textFieldint1;
	private JTextField textFieldint2;
	private JTextField AnswertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestCalculation window = new TestCalculation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestCalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JButton AddButton = new JButton("Add");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,answer;
				try {
					num1 =Integer.parseInt(textFieldint1.getText()); 
					num2 =Integer.parseInt(textFieldint2.getText()); 
					
					answer = num1 + num2; // addition
					AnswertextField.setText(Integer.toString(answer));
				} catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Enter the valid number"); //if enter other than numbers 
				}
			}
		});
		AddButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		AddButton.setBounds(88, 95, 97, 35);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("Minus");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,answer;
				try {
					num1 =Integer.parseInt(textFieldint1.getText()); 
					num2 =Integer.parseInt(textFieldint2.getText());
					
					answer = num1 - num2; // minus
					AnswertextField.setText(Integer.toString(answer));
				} catch (Exception arg0) {
					JOptionPane.showInternalMessageDialog(null, "Enter the valid number!");;
				}
			}
		});
		MinusButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		MinusButton.setBounds(267, 95, 97, 35);
		frame.getContentPane().add(MinusButton);
		
		textFieldint1 = new JTextField();
		textFieldint1.setBounds(43, 54, 182, 30);
		frame.getContentPane().add(textFieldint1);
		textFieldint1.setColumns(10);
		
		textFieldint2 = new JTextField();
		textFieldint2.setBounds(235, 54, 190, 30);
		frame.getContentPane().add(textFieldint2);
		textFieldint2.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("Answer is");
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		AnswerLabel.setBounds(32, 183, 125, 23);
		frame.getContentPane().add(AnswerLabel);
		
		AnswertextField = new JTextField();
		AnswertextField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		AnswertextField.setForeground(Color.ORANGE);
		AnswertextField.setBackground(Color.GRAY);
		AnswertextField.setBounds(136, 179, 228, 35);
		frame.getContentPane().add(AnswertextField);
		AnswertextField.setColumns(10);
	}
}
