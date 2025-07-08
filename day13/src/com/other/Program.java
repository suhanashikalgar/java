package com.other;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;


import com.dkte.Vehicle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeVehicles();
		readVehicles();
		
	}
	
	public static void readVehicles() {
		Queue<Vehicle> queue= new LinkedList<Vehicle>();
		try (FileInputStream fin = new FileInputStream("Vehicles.db")) {
	        try (DataInputStream din = new DataInputStream(fin)) {
	            while (true) {
	                Vehicle v = new Vehicle();
	                v.setVehicleId(din.readInt());
	                v.setModel(din.readUTF());
	                v.setType(din.readUTF());
	                v.setPrice(din.readDouble());

	                if (v.getPrice() > 0) {
	                    queue.add(v); // ✅ Only add valid vehicles
	                } else {
	                    System.out.println("Skipping vehicle with ID " + v.getVehicleId() + ": Invalid price " + v.getPrice());
	                }
	            }
	        }
	    } catch (Exception e) {
	        
	    }
		List<Vehicle> list = new ArrayList<>(queue);
        list.sort((v1,v2)-> Double.compare(v2.getPrice(),v1.getPrice()));
	    list.forEach(v -> System.out.println(v));
	}
	
	
	
	
	
	
	
	public static void writeVehicles() {
		Queue<Vehicle> queue = new LinkedList<>();
		queue.add(new Vehicle(1, "Toyota Camry","Sedan", -25000.0));
		queue.add(new Vehicle(2, "Honda Civic","Sedan", 22000.0));
		queue.add(new Vehicle(3, "Ford Mustang","Sports Car", 35000.0));
		queue.add(new Vehicle(4, "Tesla Model","Electric Car", 40000.0));
		queue.add(new Vehicle(5, "Nissan Altima","Sedan", 28000.0));
		
		
		 try (FileOutputStream fout = new FileOutputStream("Vehicles.db")) {
		        try (DataOutputStream dout = new DataOutputStream(fout)) {
		            for (Vehicle v : queue) {
		                if (v.getPrice() > 0) {  // ✅ Validation: skip vehicles with non-positive prices
		                    dout.writeInt(v.getVehicleId());
		                    dout.writeUTF(v.getModel());
		                    dout.writeUTF(v.getType());
		                    dout.writeDouble(v.getPrice());
		                } else {
		                    System.out.println("Skipping vehicle with ID " + v.getVehicleId() + ": Invalid price " + v.getPrice());
		                }
		            }
		            System.out.println("Vehicles saved...");
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
	}


