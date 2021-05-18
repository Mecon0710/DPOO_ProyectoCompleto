package programa;


import java.util.HashMap;
import java.util.ArrayList;

public class Curso {

	private int Ciclo;
	private int Nivel;
	private int Duracion;
	private int SemestreSugerido;
	private int CantidadCreditos;
	
	private String Tipo;
	private String Nombre;
	private String Codigo;
	
	private boolean NotaAR;
	private boolean Obligatorio;
	private boolean NotaNumerica;
	
	private HashMap<Integer, ArrayList<String>> PreRequisitos;
	
	private ArrayList<Integer> SeccionesE;
	private ArrayList<String> Alternativas;
	private ArrayList<String> Restricciones;
	private ArrayList<String> Correquisitos;
	
	
	
	/**
	 * Constructor de la clase, inicializa los atributos con los valores de los
	 * par�metros creando listas y mapas vac�os.
	 
	 * 	@param Ciclo
	 * 	@param Nivel
	 * 	@param Codigo
	 * 	@param Duracion
	 * 	@param SemestreSugerido
	 * 	@param CantidadCreditos
	
	 * 	@param Tipo
	 * 	@param Nombre
	
	 * 	@param NotaAR
	 * 	@param Obligatorio
	 * 	@param NotaNumerica
	
	 * 	@param PreRequisitos
	
	 * 	@param SeccionesE
	 * 	@param Alternativas
	 * 	@param Restricciones
	 * 	@param Correquisitos
	 *
	 */
	
	public Curso(	int ciclo, int nivel, String codigo, int duracion, int semestreSugerido, int cantidadCreditos,
					String tipo, String nombre, boolean notaAR, boolean notaNumerica, boolean obligatorio) 
	{
		
		Ciclo = ciclo; Nivel = nivel; Codigo = codigo; Duracion = duracion; SemestreSugerido = semestreSugerido;
		CantidadCreditos = cantidadCreditos;
		
		Tipo = tipo; Nombre = nombre; 
		
		NotaAR = notaAR; NotaNumerica = notaNumerica; Obligatorio = obligatorio;
		
		PreRequisitos = new HashMap<>();
		
		SeccionesE = new ArrayList<>(); Alternativas = new ArrayList<>(); Restricciones = new ArrayList<>();
		Correquisitos = new ArrayList<>();
		
	}
	
	
	// ************************************************************************
	// Getters y Setters
	// ************************************************************************
	
	
	public int getCiclo() {
		return Ciclo;
	}



	public void setCiclo(int ciclo) {
		Ciclo = ciclo;
	}



	public int getNivel() {
		return Nivel;
	}



	public void setNivel(int nivel) {
		Nivel = nivel;
	}



	public String getCodigo() {
		return Codigo;
	}



	public void setCodigo(String codigo) {
		Codigo = codigo;
	}



	public int getDuracion() {
		return Duracion;
	}



	public void setDuracion(int duracion) {
		Duracion = duracion;
	}



	public int getSemestreSugerido() {
		return SemestreSugerido;
	}



	public void setSemestreSugerido(int semestreSugerido) {
		SemestreSugerido = semestreSugerido;
	}



	public int getCantidadCreditos() {
		return CantidadCreditos;
	}



	public void setCantidadCreditos(int cantidadCreditos) {
		CantidadCreditos = cantidadCreditos;
	}



	public String getTipo() {
		return Tipo;
	}



	public void setTipo(String tipo) {
		Tipo = tipo;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public boolean isNotaAR() {
		return NotaAR;
	}



	public void setNotaAR(boolean notaAR) {
		NotaAR = notaAR;
	}



	public boolean isObligatorio() {
		return Obligatorio;
	}



	public void setObligatorio(boolean obligatorio) {
		Obligatorio = obligatorio;
	}



	public boolean isNotaNumerica() {
		return NotaNumerica;
	}



	public void setNotaNumerica(boolean notaNumerica) {
		NotaNumerica = notaNumerica;
	}



	public HashMap<Integer, ArrayList<String>> getPreRequisitos() {
		return PreRequisitos;
	}



	public void setPreRequisitos(HashMap<Integer, ArrayList<String>> preRequisitos) {
		PreRequisitos = preRequisitos;
	}



	public ArrayList<Integer> getSeccionesE() {
		return SeccionesE;
	}



	public void setSeccionesE(ArrayList<Integer> seccionesE) {
		SeccionesE = seccionesE;
	}



	public ArrayList<String> getAlternativas() {
		return Alternativas;
	}



	public void setAlternativas(ArrayList<String> alternativas) {
		Alternativas = alternativas;
	}



	public ArrayList<String> getRestricciones() {
		return Restricciones;
	}



	public void setRestricciones(ArrayList<String> restricciones) {
		Restricciones = restricciones;
	}



	public ArrayList<String> getCorrequisitos() {
		return Correquisitos;
	}



	public void setCorrequisitos(ArrayList<String> correquisitos) {
		Correquisitos = correquisitos;
	}



	
}
