class Persona{
	private String nombre;

	public Persona(){
		nombre = "Pedro";
	}
	public Persona(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nom){
		nombre = nom;
	}
}