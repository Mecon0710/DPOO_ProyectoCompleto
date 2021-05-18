package programa;


import java.util.HashMap;
import java.util.ArrayList;

public class Pensum {

	private int Creditos;
	private int CreditosEP;
	private int CreditosLE;
	private int CreditosCBU;
	private int CreditosTotales;
	
	
	private ArrayList<Curso> Electivos;
	private ArrayList<Curso> ElectivasReguladas;
	private ArrayList<Curso> CursosObligatorios;
	
	private HashMap <Integer, ArrayList<Curso>> PlanSugerido;
	
	
	/**
	 * Constructor de la clase, inicializa los atributos con los valores de los
	 * parámetros creando listas y mapas vacíos.
	 * @param materia 
	 
	 * @param Creditos
	 * @param CreditosEP
	 * @param CreditosLE
	 * @param CreditosCBU
	 * @param CreditosTotales
	 * @param PlanSugerido
	 * @param ElectivasReguladas
	 
	 */
	
	public Pensum(int creditos, int creditosEP, int creditosLE, int creditosCBU, int creditosTotales)
	{
		Creditos = creditos;
		CreditosEP = creditosEP;
		CreditosLE = creditosLE;
		CreditosCBU = creditosCBU;
		CreditosTotales = creditosTotales;
		PlanSugerido = new HashMap<>();
		Electivos = new ArrayList<>();
		ElectivasReguladas = new ArrayList<>();
		CursosObligatorios = new ArrayList<>();
		
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

	public int getCreditosEP() {
		return CreditosEP;
	}

	public void setCreditosEP(int creditosEP) {
		CreditosEP = creditosEP;
	}

	public int getCreditosLE() {
		return CreditosLE;
	}

	public void setCreditosLE(int creditosLE) {
		CreditosLE = creditosLE;
	}

	public int getCreditosCBU() {
		return CreditosCBU;
	}

	public void setCreditosCBU(int creditosCBU) {
		CreditosCBU = creditosCBU;
	}

	public int getCreditosTotales() {
		return CreditosTotales;
	}

	public void setCreditosTotales(int creditosTotales) {
		CreditosTotales = creditosTotales;
	}

	public HashMap<Integer, ArrayList<Curso>> getPlanSugerido() {
		return PlanSugerido;
	}

	public void setPlanSugerido(HashMap<Integer, ArrayList<Curso>> planSugerido) {
		PlanSugerido = planSugerido;
	}

	
	public ArrayList<Curso> getElectivasReguladas() {
		return ElectivasReguladas;
	}


	public void setElectivasReguladas(ArrayList<Curso> electivasReguladas) {
		ElectivasReguladas = electivasReguladas;
	}


	public ArrayList<Curso> getElectivos() {
		return Electivos;
	}


	public void setElectivos(ArrayList<Curso> electivos) {
		Electivos = electivos;
	}


	public ArrayList<Curso> getCursosObligatorios() {
		return CursosObligatorios;
	}


	public void setCursosObligatorios(ArrayList<Curso> cursosObligatorios) {
		CursosObligatorios = cursosObligatorios;
	}	
	

}

