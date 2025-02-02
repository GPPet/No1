import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class CreateItem extends JDialog {

	private Item mainItem;

	public Item getMainItem() {
		return mainItem;
	}

	/**
	 * Create the dialog.
	 */
	public CreateItem() {
		mainItem = new Item();
		setTitle("CREATE NEW ITEM");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(25, 28, 100, 19);
		getContentPane().add(lblName);
		
		JLabel lblBarcode = new JLabel("Barcode:");
		lblBarcode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBarcode.setBounds(25, 66, 100, 19);
		getContentPane().add(lblBarcode);
				
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrice.setBounds(25, 103, 100, 19);
		getContentPane().add(lblPrice);
		
		JLabel lblCount = new JLabel("Count:");
		lblCount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCount.setBounds(25, 138, 100, 19);
		getContentPane().add(lblCount);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedTextField.setBounds(209, 23, 200, 29);
		getContentPane().add(formattedTextField);
		
		JFormattedTextField formattedBarcodeTextField = new JFormattedTextField("{0,number,#}");
		formattedBarcodeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedBarcodeTextField.setBounds(209, 61, 200, 29);
		formattedBarcodeTextField.setValue(new Long(0L));
		getContentPane().add(formattedBarcodeTextField);
		
		JFormattedTextField formattedPriceTextField = new JFormattedTextField();
		formattedPriceTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedPriceTextField.setBounds(209, 98, 200, 29);
		formattedPriceTextField.setValue(new Double(0d));
		getContentPane().add(formattedPriceTextField);
		
		JFormattedTextField formattedCountTextField = new JFormattedTextField();
		formattedCountTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedCountTextField.setBounds(209, 133, 200, 29);
		formattedCountTextField.setValue(new Integer(0));
		getContentPane().add(formattedCountTextField);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//custom code
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				String name = formattedTextField.getText();
				long barcode = 0;
				double price = 0;
				int count = 0;
				try {
					barcode = numberFormat.parse(formattedBarcodeTextField.getText()).longValue();
					price = numberFormat.parse(formattedPriceTextField.getText()).doubleValue();
					count = numberFormat.parse(formattedCountTextField.getText()).intValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");
					ex.printStackTrace();
				}
				
				if (formattedTextField.getText() == null || formattedTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter a name!");
					
				} else if (formattedBarcodeTextField.getText() == null || 
						formattedBarcodeTextField.getText().equals("") ||
						barcode <= 0) {
							JOptionPane.showMessageDialog(null, "Please enter a barcode greater than 0!");	
				} else if (formattedPriceTextField.getText() == null || 
						formattedPriceTextField.getText().equals("") ||
						price < 0)
						 {
					JOptionPane.showMessageDialog(null, "Please enter a valid and positive price!");
					
				} else if (formattedCountTextField.getText() == null || 
						formattedCountTextField.getText().equals("") ||
						count < 0) {
					JOptionPane.showMessageDialog(null, "Please enter a barcode greater than 0!");
					
				} else {
					mainItem.setName(name);
					mainItem.setBarcode(barcode);
					mainItem.setPrice(price);
					mainItem.setCount(count);
					setVisible(false);
				}
			}
		});
		btnAddItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddItem.setBounds(10, 208, 194, 29);
		getContentPane().add(btnAddItem);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainItem = null;
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(230, 208, 194, 29);
		getContentPane().add(btnCancel);

	}
}
