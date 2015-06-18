package DeviceFactory;

import javax.swing.table.TableColumn;

public class Factory {
	
	public Device getDevice(String deviceType){
		 
		 if(deviceType == null){
			 return null;
		 }
		 
		 if(deviceType.equalsIgnoreCase("Tablet")){
			 return new Tablet();
		 } else if(deviceType.equalsIgnoreCase("Phone")){
			 return new Phone();
		 } else if(deviceType.equalsIgnoreCase("Laptop")){
			 return new Laptop();
		 }
		 	return null;
		 }

}
