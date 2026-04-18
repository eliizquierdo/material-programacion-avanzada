package Logica;

public class Articulo_Normal {
	
	//atributos para todo tipo de material
		private int codigo;
		private String titulo;    
		private String autores;
		private int CantEjemplares;
		
		public Articulo_Normal(){
		}
		
		public Articulo_Normal(int codigo, String titulo, String autores, int CantEjemplares) {
			this.codigo = codigo;
			this.titulo = titulo;
			this.autores = autores;
			this.CantEjemplares = CantEjemplares;
		}
		
		public int getCantEjemplares() {
			return CantEjemplares;
		}

		public void setCantEjemplares(int cantEjemplares) {
			CantEjemplares = cantEjemplares;
		}

		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		
		public String getAutores() {
			return autores;
		}
		public void setAutores(String autores) {
			this.autores = autores;
		}
		
		
		
		
	}


