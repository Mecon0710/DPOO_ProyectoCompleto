package programa;

import java.util.ArrayList;
import java.util.HashMap;

public class ReporteNotas {

	private int Creditos;
	private int SemestrePorCreditos;
	
	private float PromedioAcumulativo;
	
	private HashMap<Integer, ArrayList<Curso>> CursosPorSemestre;
	private HashMap<Integer, Float> PromedioPorSemestre;
	
	public ReporteNotas(int creditos, int semestrePorCreditos, float promedioAcumulativo) {
		super();
		Creditos = creditos;
		SemestrePorCreditos = semestrePorCreditos;
		PromedioAcumulativo = promedioAcumulativo;
		PromedioPorSemestre = new HashMap<Integer, Float>();
		CursosPorSemestre = new HashMap<Integer, ArrayList<Curso>> ();
	}

	// ************************************************************************
	// Getters y Setters
	// ************************************************************************

	public int getCreditos() {
		return Creditos;
	}


	public void setCreditos(int creditos) {
		Creditos = creditos;
	}


	public int getSemestrePorCreditos() {
		return SemestrePorCreditos;
	}
	
	/*
	 * Segun los creditos actuales se retorna en cual semestre deberia estar el estudiante segun esta tabla:
	 * 0 - 18: 1
	 * 19 - 33: 2
	 * 34 - 49: 3
	 * 50 - 67: 4
	 * 68 - 86: 5
	 * 87 - 103: 6
	 * 104 - 121: 7
	 * 122 - 136: 8
	 * 
	 */

	public void setSemestrePorCreditos(int semestrePorCreditos) {
		SemestrePorCreditos = semestrePorCreditos;
	}


	public float getPromedioAcumulativo() {
		return PromedioAcumulativo;
	}
	/*
	 * formula: ( creditos materiaA* (nota materiaA) + creditos materia B* (nota materiaB)  )  /  (Número total de créditos con notas)  
	 */

	public void setPromedioAcumulativo(float promedioAcumulativo) {
		PromedioAcumulativo = promedioAcumulativo;
	}


	public HashMap<Integer, ArrayList<Curso>> getCursosPorSemestre() {
		return CursosPorSemestre;
	}


	public void setCursosPorSemestre(HashMap<Integer, ArrayList<Curso>> cursosPorSemestre) {
		CursosPorSemestre = cursosPorSemestre;
	}


	public HashMap<Integer, Float> getPromedioPorSemestre() {
		return PromedioPorSemestre;
	}


	public void setPromedioPorSemestre(HashMap<Integer, Float> promedioPorSemestre) {
		PromedioPorSemestre = promedioPorSemestre;
	}
	
	
	// ************************************************************************
	// Métodos
	// ************************************************************************
	
	public String toStringRN() {
		
		return "Cursos por semestre: " + CursosPorSemestre + ", Promedio por semestre: " + PromedioPorSemestre +
				", Promedio acumulativo: " + PromedioAcumulativo + ", Creditos: " + Creditos 
				+ ",Semestre segun creditos: " + SemestrePorCreditos;
		
	}
}
