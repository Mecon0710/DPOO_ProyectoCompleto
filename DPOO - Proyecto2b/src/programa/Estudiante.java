package programa;

public abstract class Estudiante extends Usuario {
	
	private int Codigo;
	
	private String Correo;
	private String Nombre;
	
	private AvanceCarrera Avance;
	
	private ReporteNotas Notas;
	
	private Planeacion Plan;
	
	private Pensum Pensum;
	
	
	/**
	 * Constructor de la clase, inicializa los atributos con los valores de los
	 * par�metros creando listas y mapas vac�os.
	 * @param Notas 
	 * @param Avance 
	 * @param Plan 
	 * @param Pensum 
	 
	 * @param Codigo
	 * @param Correo
	 * @param Nombre
	 
	 */
	
	public Estudiante(int codigo, String correo, String nombre, ReporteNotas notas, AvanceCarrera avance, Planeacion plan, Pensum pensum)
	{
		super();
		Codigo = codigo;
		Correo = correo;
		Nombre = nombre;
		Pensum = pensum;
		Avance = avance;
		Notas = notas;
		Plan = plan;
		
	}
	
	// ************************************************************************
	// métodos
	// ************************************************************************
	










	// ************************************************************************
	// Getters y Setters
	// ************************************************************************
	
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public ReporteNotas getNotas() {
		return Notas;
	}


	public AvanceCarrera getAvance() {
		return Avance;
	}


	public Planeacion getPlan() {
		return Plan;
	}


	public Pensum getPensum() {
		return Pensum;
	}


	public void setNotas(ReporteNotas notas) {
		Notas = notas;
	}


	public void setAvance(AvanceCarrera avance) {
		Avance = avance;
	}


	public void setPlan(Planeacion plan) {
		Plan = plan;
	}


	public void setPensum(Pensum pensum) {
		Pensum = pensum;
	}
	
}
