package june12th_demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class StorageSystem extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorageSystem frame = new StorageSystem();
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
	public StorageSystem() {
		setTitle("Storage System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add new item");
		btnNewButton.setBounds(9, 425, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Edit item");
		button.setBounds(135, 425, 117, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Delete item");
		button_1.setBounds(261, 425, 117, 25);
		contentPane.add(button_1);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(387, 425, 117, 25);
		contentPane.add(btnExport);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(513, 425, 117, 25);
		contentPane.add(btnImport);
		
		table = new JTable();
		table.setBounds(12, 12, 618, 394);
		contentPane.add(table);
	}
}
