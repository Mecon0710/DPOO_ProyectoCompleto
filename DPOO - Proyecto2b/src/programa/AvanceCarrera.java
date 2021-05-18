package programa;


import java.util.HashMap;
import java.util.ArrayList;

public class AvanceCarrera {

	private boolean CandidatoGrado;
	private boolean RequisitoIngles;
	private boolean PracticaProfesional;
	private boolean RequisitoSegundaLengua;
	
	private HashMap<Integer, ArrayList<Curso>> CursadosE;
	private HashMap<Integer, ArrayList<Curso>> Cursados;
	private HashMap<Integer, ArrayList<Curso>> EnProceso;
	private HashMap<Integer, ArrayList<Curso>> CursadosEpsilon;
	
	private ArrayList<Curso> Homologados;
	private ArrayList<Curso> CursosFaltantes;
	
	private ArrayList<String> RequisitosCumplidos;
	private ArrayList<String> RequisitosFaltantes;
	
	private ReporteNotas ReporteGeneral;
	
	/**
	 * Constructor de la clase, inicializa los atributos con los valores de los
	 * parámetros creando listas y mapas vacíos.
	 * 
	 * @param CandidatoGrado 
	 * @param RequisitoIngles
	 * @param PracticaProfesional
	 * @param RequisitoSegundaLengua
	
	 * @param Cursados Llave: Semestre, Valor: Lista con las asignaturas cursadas
	 * @param EnProceso
	 * @param CursadosE
	 * @param CursadosEpsilon
	 * @param ReporteNotasTotal
	 * @param ReporteNotasSemestre
	
	 * @param Homologados
	 * @param CursosFaltantes
	 * @param RequisitosCumplidos
	*/
	
	public AvanceCarrera(boolean candidatoGrado, boolean requisitoIngles, boolean practicaProfesional, boolean requisitoSegundaLengua, ReporteNotas notas)
	{
		CandidatoGrado = candidatoGrado; RequisitoIngles = requisitoIngles; PracticaProfesional = practicaProfesional;
		RequisitoSegundaLengua = requisitoSegundaLengua;
		ReporteGeneral = notas;
		
		Cursados = new HashMap<>(); CursadosE = new HashMap<>(); CursadosEpsilon = new HashMap<>();
		
		Homologados = new ArrayList<>(); CursosFaltantes = new ArrayList<>(); RequisitosCumplidos = new ArrayList<>();
		EnProceso = new HashMap<>(); RequisitosFaltantes = new ArrayList<>(); 
	}
	

	// ************************************************************************
	// Getters y Setters
	// ************************************************************************
	

	public boolean isCandidatoGrado() {
		return CandidatoGrado;
	}
	
	/*
	 * Verifica que la lista de cursos faltantes este vacía y si es así el estudiante es candidato a grado.
	 */
	public void setCandidatoGrado(boolean candidatoGrado) {
		CandidatoGrado = candidatoGrado; 
	}

	public boolean isRequisitoIngles() {
		return RequisitoIngles;
	}

	public void setRequisitoIngles(boolean requisitoIngles) {
		RequisitoIngles = requisitoIngles;
	}

	public boolean isPracticaProfesional() {
		return PracticaProfesional;
	}

	public void setPracticaProfesional(boolean practicaProfesional) {
		PracticaProfesional = practicaProfesional;
	}

	public boolean isRequisitoSegundaLengua() {
		return RequisitoSegundaLengua;
	}

	public void setRequisitoSegundaLengua(boolean requisitoSegundaLengua) {
		RequisitoSegundaLengua = requisitoSegundaLengua;
	}

	public HashMap<Integer, ArrayList<Curso>> getCursados() {
		return Cursados;
	}

	public void setCursados(HashMap<Integer, ArrayList<Curso>> cursados) {
		Cursados = cursados;
	}

	public HashMap<Integer, ArrayList<Curso>> getEnProceso() {
		return EnProceso;
	}

	public void setEnProceso(HashMap<Integer, ArrayList<Curso>> enProceso) {
		EnProceso = enProceso;
	}

	public HashMap<Integer, ArrayList<Curso>> getCursadosE() {
		return CursadosE;
	}

	public void setCursadosE(HashMap<Integer, ArrayList<Curso>> cursadosE) {
		CursadosE = cursadosE;
	}

	public HashMap<Integer, ArrayList<Curso>> getCursadosEpsilon() {
		return CursadosEpsilon;
	}

	public void setCursadosEpsilon(HashMap<Integer, ArrayList<Curso>> cursadosEpsilon) {
		CursadosEpsilon = cursadosEpsilon;
	}

	public ArrayList<Curso> getHomologados() {
		return Homologados;
	}

	public void setHomologados(ArrayList<Curso> homologados) {
		Homologados = homologados;
	}

	public ArrayList<Curso> getCursosFaltantes() {
		return CursosFaltantes;
	}

	public void setCursosFaltantes(ArrayList<Curso> cursosFaltantes) {
		CursosFaltantes = cursosFaltantes;
	}

	public ArrayList<String> getRequisitosCumplidos() {
		return RequisitosCumplidos;
	}

	public void setRequisitosCumplidos(ArrayList<String> requisitosCumplidos) {
		RequisitosCumplidos = requisitosCumplidos;
	}
	
	public ArrayList<String> getRequisitosFaltantes() {
		return RequisitosFaltantes;
	}


	public void setRequisitosFaltantes(ArrayList<String> requisitosFaltantes) {
		RequisitosFaltantes = requisitosFaltantes;
	}
	
	public ReporteNotas getReporteGeneral() {
		return ReporteGeneral;
	}


	public void setReporteGeneral(ReporteNotas reporteGeneral) {
		ReporteGeneral = reporteGeneral;
	}
	
	// ************************************************************************
	// Métodos
	// ************************************************************************
	
	/*
	 * Llama getcursados de AvanceCarrera. Crea un arraylist donde guarda las materias de un semestre.
	 * Recorre la lista de cursados y si la llave es igual al semestre que nos dieron guarda el valor de la llave en el array que se creo y lo retorna.
	 */
	public Curso generarPromedioInscritos(int semestre) {
		return null;
		
	}
	
	/*
	 * Genera un csv para que guarde la información de esta clase.
	 */
	public void generarCsv() {
		
	}
	
	public String toStringCG() {
		String infoCG = "ERROR";
		if (CandidatoGrado == true)
		{
			infoCG = "El estudiante es candidato a grado y cumplio con los siguientes cursos: " + Cursados +
					  ", Requisitos cumplidos: " + RequisitosCumplidos + ". Sin embargo, le hacen falta los siguientes requisitos: " + RequisitosFaltantes;
		}
		else
			 {infoCG = "El estudiante no es candidato a grado";}
		return infoCG; 	   
	}
	
	public String toStringAC() {
		return "AvanceCarrera [CandidatoGrado=" + CandidatoGrado + ", RequisitoIngles=" + RequisitoIngles
				+ ", PracticaProfesional=" + PracticaProfesional + ", RequisitoSegundaLengua=" + RequisitoSegundaLengua
				+ ", CursadosE=" + CursadosE + ", Cursados=" + Cursados + ", EnProceso=" + EnProceso + ", CursadosEpsilon=" + CursadosEpsilon
			    + ", Homologados=" + Homologados + ", CursosFaltantes=" + CursosFaltantes + ", RequisitosCumplidos=" + RequisitosCumplidos 
			    + ", RequisitosFaltantes=" + RequisitosFaltantes + "]";
	}
}
