package com.ec.edu;

public class DirectorEmpleado implements Empleados {
	
	//creacion de campo tipo CreacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	//creacion de constructor que inyecta dependencias
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo= informeNuevo;
		
	}
	
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el director: "+ informeNuevo.getInforme();
	}
	
    private String email;
	
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	//metodo Init. Ejecutar tareas antes que el bean este disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init. Aqui irian las tareas ejecutar "+
			"antes de que el bean esté listo");
		
		
	}
	// metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	
	public void metodoFinal() {
	System.out.println("Dentro del metodo destroy. Aqui irian las tareas ejecutar "+
			"despues de utilizar el bean");
	}

}
