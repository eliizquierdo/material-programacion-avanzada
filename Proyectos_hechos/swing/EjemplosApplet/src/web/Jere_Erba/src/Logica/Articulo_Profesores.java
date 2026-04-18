package Logica;

public class Articulo_Profesores {
	

	//atributos para docentes
		private int CI_P;
		private String nombreP;
		private String direccionP;
		private int telefonoP;
		private String asignaturaDictadaP;
		
		public Articulo_Profesores() {
	
		}
		
		public Articulo_Profesores(int CI_P, String nombreP, String direccionP, int telefonoP, String asignaturaDictadaP) {
			this.CI_P = CI_P;
			this.nombreP = nombreP;
			this.direccionP = direccionP;
			this.telefonoP = telefonoP;
		    this.asignaturaDictadaP = asignaturaDictadaP;
		}
		
		
		public int getCI_P() {
			return CI_P;
		}
		public void setCI_P(int cI_P) {
			CI_P = cI_P;
		}
		
		
		public String getNombreP() {
			return nombreP;
		}
		public void setNombreP(String nombreP) {
			this.nombreP = nombreP;
		}
		
		
		public String getDireccionP() {
			return direccionP;
		}
		public void setDireccionP(String direccionP) {
			this.direccionP = direccionP;
		}
		
		
		public int getTelefonoP() {
			return telefonoP;
		}
		
		public void setTelefonoP(int telefonoP) {
			this.telefonoP = telefonoP;
		}
		
		
		public String getAsignaturaDictadaP() {
			return asignaturaDictadaP;
		}
		public void setAsignaturaDictadaP(String asignaturaDictadaP) {
			asignaturaDictadaP = asignaturaDictadaP;
		}
		
		public String ToString() {
			return "Cedula: " + CI_P + ", Nombre: " + nombreP + ", Direccion: " + direccionP + ", Telefono: " + telefonoP + ", Asignatura que dicta: " + asignaturaDictadaP;
		}
		
		

}



