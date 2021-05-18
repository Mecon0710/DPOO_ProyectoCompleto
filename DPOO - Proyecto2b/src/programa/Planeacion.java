package programa;

import java.util.ArrayList;

public class Planeacion {

	private int MaxCreditosSemestre;
	private int SemestreActual;
	
	private boolean CumpleRequisitos;
	private boolean CumpleCreditos;
	
	
	private AvanceCarrera Cursados;
	
	private Pensum PlanSugerido;
	
	
	
	/**
	 * Constructor de la clase, inicializa los atributos con los valores de los
	 * par�metros creando listas y mapas vac�os.
	 * @param creditosSemestre 
	 * @param cumpleCreditos 
	 *
	 * @param MaxCreditosSemestre
	 * @param SemestreActual 
	 * @param CreditosPlanSemestre
	 * @param CumpleRequisitos
	 * @param Materias
	 * @param PlanGeneral
	 */
	
	public Planeacion(int maxCreditosSemestre, int semestre, boolean cumpleRequisitos, int creditosSemestre, boolean cumpleCreditos)
	{
		MaxCreditosSemestre = maxCreditosSemestre;
		SemestreActual = semestre;
		CumpleRequisitos = cumpleRequisitos;
		CumpleCreditos = cumpleCreditos;
		
	}
	
	// ************************************************************************
	// Getters y Setters
	// ************************************************************************

	public int getMaxCreditosSemestre() {
		return MaxCreditosSemestre;
	}

	public void setMaxCreditosSemestre(int maxCreditosSemestre) {
		MaxCreditosSemestre = maxCreditosSemestre;
	}
	
	public int getSemestre() {
		return SemestreActual;
	}

	public void setSemestre(int semestre) {
		SemestreActual = semestre;
	}

	public boolean isCumpleRequisitos() {
		return CumpleRequisitos;
	}

	public void setCumpleRequisitos(boolean cumpleRequisitos) {
		CumpleRequisitos = cumpleRequisitos;
	}

	public boolean isCumpleCreditos() {
		return CumpleCreditos;
	}

	public void setCumpleCreditos(boolean cumpleCreditos) {
		CumpleCreditos = cumpleCreditos;
	}

	public AvanceCarrera getCursados() {
		return Cursados;
	}

	public Pensum getPlanSugerido() {
		return PlanSugerido;
	}

	public void setCursados(AvanceCarrera cursados) {
		Cursados = cursados;
	}

	public void setPlanSugerido(Pensum planSugerido) {
		PlanSugerido = planSugerido;
	}
	// ************************************************************************
	// M�todos
	// ************************************************************************
	
	/*
	 * Compuesta de dos funciones, dise�arPlan y agregarPlanCsv. 
	 */
	public  void realizarPlan(){

	}
	/*
	 * Establecer un plan que cumpla todos los requisitos necesarios por medio de las funciones de cumplimiento.
	 * Retorna el Array List.
	 */
	public ArrayList<Curso> diseniarPlan(){
		return null;
	}
	/*
	 * Verifica que una materia cumpla con los requisitos.
	 */
	public Curso escogerCurso(String Materia) {
		return null;
		
	}
	
	/*
	 * Verifica que un conjunto de Materias cumpla con los requisitos.
	 */
	public boolean validarConjuntoMaterias(ArrayList<Curso> Materias) {
		return false;
		
	}
	
	/*
	 * Llama al setter de Plan sugerido y agregarPlanCsv, agregando as� el plan sugerido al csv.
	 */
	public void escogerPlanSugerido() {
		
	}
	
	/*
	 * Escribe sobre un csv establecido la informacion que se quiera suministrar.
	 */
	public void agregarPlanCsv(){
		
	}
	/*
	 * Verifica que un curso que se vaya a repetir este anteriormente reprobado.
	 */
	public boolean cumpleRepetirReprob(){
		return false;
	}
	
	/*
	 * Verifica que la materia cumpla con los requisitos (prerrequisitos y correquisitos). 
	 */
	public boolean cumpleRequisitos() {
		return CumpleRequisitos;
	}
	/*
	 * Verifica que el plan no exceda con los creditos que tiene disponibles el estudiante.
	 */
	public boolean cumpleMaxCreditos() {
		return CumpleCreditos;
	}
}
