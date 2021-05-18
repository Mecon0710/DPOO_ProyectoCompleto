package programa;

import java.util.ArrayList;
import java.util.HashMap;

public class Coordinador extends Usuario
{
	private String Departamento;
	
	private Estudiante Estudiante;
	private ArrayList<Estudiante> LosEstudiantes;
	private ReporteNotas ReporteE;
	private AvanceCarrera AvanceE;
	private Planeacion PlanE;	
	private Pensum PensumE;

	public Coordinador(String departamento, Estudiante estudiante, ReporteNotas reporteE, AvanceCarrera avanceE, Planeacion planE, Pensum pensumE) 
	{
		super();
		LosEstudiantes = new ArrayList<Estudiante>();
		Departamento = departamento;
		Estudiante = estudiante;
		ReporteE = reporteE;
		AvanceE = avanceE;
		PensumE = pensumE;
		PlanE = planE;
		
		
	}
	
	
	// ************************************************************************
	// Getters y Setters
	// ************************************************************************
	
	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
	public Estudiante getEstudiante() {
		return Estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.Estudiante = estudiante;
	}


	public ReporteNotas getReporteE() {
		return ReporteE;
	}


	public void setReporteE(ReporteNotas reporteE) {
		this.ReporteE = reporteE;
	}


	public AvanceCarrera getAvanceE() {
		return AvanceE;
	}


	public void setAvanceE(AvanceCarrera avanceE) {
		this.AvanceE = avanceE;
	}


	public Planeacion getPlanE() {
		return PlanE;
	}


	public void setPlanE(Planeacion planE) {
		this.PlanE = planE;
	}

	public Pensum getPensumE() {
		return PensumE;
	}


	public void setPensumE(Pensum pensumE) {
		this.PensumE = pensumE;
	}

	public ArrayList<Estudiante> getLosEstudiantes() {
		return LosEstudiantes;
	}


	public void setLosEstudiantes(ArrayList<Estudiante> losEstudiantes) {
		LosEstudiantes = losEstudiantes;
	}

	
	// ************************************************************************
	// M�todos
	// ************************************************************************
	


	/* 
	 * Llama al setter de Usuario que edita la informaci�n proveniente de Banner
	 */
	public HashMap<Estudiante,HashMap<String,HashMap<Curso, Float>>>  editarInfoBanner(){
		HashMap<Estudiante,HashMap<String,HashMap<Curso, Float>>> edicion = new HashMap<Estudiante,HashMap<String,HashMap<Curso, Float>>> ();
		return edicion;
	}
	
	/*
	 * Llama a la funci�n toStringAC de AvanceCarrera.
	 */
	public AvanceCarrera revisarAvance(String estudiante) {
		return AvanceE;
	}
	
	/*
	 * Llama a la funci�n realizarPlan de Planeaci�n. 
	 */
	public Planeacion hacerPlaneacion(String estudiante) {
		return PlanE;
	}
		
	
	
	
	
}
