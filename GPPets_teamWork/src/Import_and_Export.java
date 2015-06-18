import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;


public class Import_and_Export {

	private JFrame frmGPP;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Locale.setDefault(Locale.US);
					Import_and_Export window = new Import_and_Export();
					window.frmGPP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Import_and_Export() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGPP = new JFrame();
		frmGPP.setTitle("GPPframe");
		frmGPP.setBounds(100, 100, 450, 300);
		frmGPP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGPP.getContentPane().setLayout(null);
		
		//GPP table
		Object[][] rowData = new Object[0][3];
		Object[] columnNames = {"Date", "Expence", "Price"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 422, 214);
		frmGPP.getContentPane().add(scrollPane);
		
		table = new JTable(new DefaultTableModel(rowData, columnNames));
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(184, 236, 117, 25);
		frmGPP.getContentPane().add(btnImport);
		
		btnImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Data file", "txt"));
					fileChooser.showDialog(null, "Choose file...");
					
					File file = fileChooser.getSelectedFile();
					
					List<String> fileContent = Files.readAllLines(file.toPath());
					
					for (String line : fileContent) {
						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
						
						String[] row = line.split(" | ");
//						Date date = row[0];//Varaible?!
						String name = "";
						double price = 0;
						
						try {
							name = row[1];
							price = numberFormat.parse(row[2]).doubleValue();
						} catch (ParseException ex) {
							JOptionPane.showMessageDialog(null, "Error parsing data!");
							ex.printStackTrace();
						}
//						Item item = new Item(date, name, price);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
//						model.addRow(new Object[] { item.getDate(), item.getName(), item.getPrice()});
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error loading file!");
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "File loaded successfully!");
				
			}
		});
		
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(315, 236, 117, 25);
		frmGPP.getContentPane().add(btnExport);
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Data file", "txt"));
					fileChooser.showDialog(null, "Choose file...");
					
					File file = fileChooser.getSelectedFile();
					if (file == null){
						return;
					}
					
					String path = file.getPath();
					if (path == null){
						return;
					}
					
					path = path.endsWith(".txt") ? path : path + ".txt";
					
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);
					
					ArrayList<String> list = new ArrayList<String>();
					
					int rowCount = table.getRowCount();
					for (int i = 0; i < rowCount; i++) {
						String line = String.format("%s|%s|%s", table.getValueAt(i, 0),
																table.getValueAt(i, 1),
																table.getValueAt(i, 2));
						list.add(line);
			        }
					
					for (String line : list) {
						writer.append(line);
						writer.newLine();
					}
					
					writer.close();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error! File is not saved correctly!");
				}
				JOptionPane.showMessageDialog(null, "File saved successfully!");
			}
		});
		
		
		
		
	}
}
