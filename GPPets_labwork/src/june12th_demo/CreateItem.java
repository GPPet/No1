package june12th_demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CreateItem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateItem frame = new CreateItem();
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
	public CreateItem() {
		setTitle("Create item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 25, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblBarcode = new JLabel("Barcode");
		lblBarcode.setBounds(12, 65, 70, 15);
		contentPane.add(lblBarcode);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(12, 105, 70, 15);
		contentPane.add(lblPrice);
		
		JLabel lblCount = new JLabel("Count");
		lblCount.setBounds(12, 145, 70, 15);
		contentPane.add(lblCount);
		
		JButton btnAddItem = new JButton("Add item");
		btnAddItem.setBounds(12, 185, 117, 25);
		contentPane.add(btnAddItem);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(178, 185, 117, 25);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(144, 21, 151, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 61, 151, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 101, 151, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 141, 151, 19);
		contentPane.add(textField_3);
	}
}
