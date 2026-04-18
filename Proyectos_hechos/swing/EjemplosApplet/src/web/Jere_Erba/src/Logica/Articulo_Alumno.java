package Logica;

public class Articulo_Alumno {
	
	//atributos para alumnos 
		private int ci_A;
		private String nombreA;
		private String direccionA;
		private int telefonoA;
		private int grupoA;
		
		public Articulo_Alumno() {
		}
		
		public Articulo_Alumno(int ci_A, String nombreA, String direccionA, int telefonoA, int grupoA) {
			this.ci_A = ci_A;
			this.nombreA = nombreA;
			this.direccionA = direccionA;
			this.telefonoA = telefonoA;
			this.grupoA = grupoA;
		}
		
		public int getCi_A() {
			return ci_A;
		}
		public void setCi_A(int ci_A) {
			this.ci_A = ci_A;
		}
		
		
		public String getNombreA() {
			return nombreA;
		}
		public void setNombreA(String nombreA) {
			this.nombreA = nombreA;
		}
		
		
		public String getDireccionA() {
			return direccionA;
		}
		public void setDireccionA(String direccionA) {
			this.direccionA = direccionA;
		}
		
		
		public int getTelefonoA() {
			return telefonoA;
		}
		public void setTelefonoA(int telefonoA) {
			this.telefonoA = telefonoA;
		}
		
		
		public int getGrupoA() {
			return grupoA;
		}
		public void setGrupoA(int grupoA) {
			this.grupoA = grupoA;
		}
		
		
		public String ToString() {
			return "Cedula: " + ci_A + ", Nombre " + nombreA + ", Direccion: " + direccionA + ", Telefono: " + telefonoA + ", Grupo: " + grupoA;
		}
		

}

