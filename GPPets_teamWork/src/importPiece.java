//
//public class importPiece {
//
//	public static void main(String[] args) {
//		//Import part of the code
//		
//		JButton btnImport = new JButton("Import");
//		btnImport.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					JFileChooser fileChooser = new JFileChooser();
//					fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "sss"));
//					fileChooser.showDialog(null, "Choose...");
//					
//					File file = fileChooser.getSelectedFile();
//					
//					List<String> fileContent = Files.readAllLines(file.toPath());
//					
//					for (String line : fileContent) {
//						
//						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
//						String[] row = line.split(";");
//						String name = row[0];
//						long barcode = 0;
//						double price = 0;
//						int count = 0;
//						try {
//							barcode = numberFormat.parse(row[1]).longValue();
//							price = numberFormat.parse(row[2]).doubleValue();
//							count = numberFormat.parse(row[3]).intValue();
//						} catch (ParseException ex) {
//							JOptionPane.showMessageDialog(null, "Error parsing!");
//							ex.printStackTrace();
//						}
//						Item item = new Item(name,barcode, price, count);
//						DefaultTableModel model = (DefaultTableModel) table.getModel();
//						model.addRow(new Object[] { item.getName(), item.getBarcode(),
//								item.getPrice(), item.getCount(), item.getTotalPrice() });
//
//					
//					}
//					
//				} catch (Exception ex) {
//					JOptionPane.showMessageDialog(null, "Error while loading file!");
//				}	
//				
//				JOptionPane.showMessageDialog(null, "Successfully loaded file!");
//			}
//		});
//		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btnImport.setBounds(505, 519, 155, 31);
//		frmStorageSystem.getContentPane().add(btnImport);
//		
//		JButton btnExport = new JButton("Export");
//		btnExport.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					JFileChooser fileChooser = new JFileChooser();
//					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
//					fileChooser.showDialog(null, "Choose...");
//					
//					File file = fileChooser.getSelectedFile();
//					if (file == null){
//						return;
//					}
//					String path = file.getPath();
//					if (path == null){
//						return;
//					}
//					path = path.endsWith(".sss") ? path : path + ".sss";
//					
//					FileWriter fileStream = new FileWriter(path);
//					BufferedWriter writer = new BufferedWriter(fileStream);
//
//					ArrayList<String> list = new ArrayList<String>();
//
//			        int rowCount = table.getRowCount();
//			        		        
//			        for (int i = 0; i < rowCount; i++) {
//			        		String line = String.format("%s;%s;%s;%s", table.getValueAt(i, 0),
//							        								   table.getValueAt(i, 1), 
//							        								   table.getValueAt(i, 2),
//							        								   table.getValueAt(i, 3));
//					        list.add(line);
//			        }
//					
//					for (String line : list) {
//						writer.append(line);
//						writer.newLine();
//					}
//					
//					writer.close();
//					
//				} catch (Exception ex) {
//					JOptionPane.showMessageDialog(null, "Error while saving file!");
//				}
//				JOptionPane.showMessageDialog(null, "Successfully saved file!");
//			}
//		});
//		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btnExport.setBounds(670, 519, 155, 31);
//		frmStorageSystem.getContentPane().add(btnExport);
//		
//
//	}
//
//}
