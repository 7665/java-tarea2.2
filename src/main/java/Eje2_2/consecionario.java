package Eje2_2;

//Herencia
//Polimorfismos

public class consecionario extends proveedor{	
    String Asesor;
    String Proveedor;
	public consecionario(){                                     	                                                                                            
	} 
	public void imprimirconsecionario(){                                   	
	consecionario objConse = new consecionario();	

//Encapsulamiento

	objConse.setAsesor("Johan & Alejandro & Duvan");
	objConse.setProveedor("Vehiculos : BMW y Chevrolet");
	
	Asesor = objConse.getAsesor();
	Proveedor = objConse.getProveedor();
		
		System.out.println("Venta de Vehiculos");
		System.out.println("Asesor:"+Asesor);
		System.out.println("Proveedor:"+Proveedor);
		System.out.println("Datos");						
	}
	public static void  main(String[] args){

		consecionario objConse = new consecionario();
		objConse.imprimirconsecionario();	
	}                                                                         
}
