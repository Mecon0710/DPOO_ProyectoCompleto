package programa;

public class CBU extends Curso {

	private String TipoCBU;
	
	/**
	 * Constructor de la clase, inicializa los atributos con los valores de los
	 * parámetros creando listas y mapas vacíos.
	 *
	 * @param TipoCBU
	 * 
	 */
	
	public CBU(int ciclo, int nivel, String codigo, int duracion, int semestreSugerido, int cantidadCreditos,
			String tipo, String nombre, boolean notaAR, boolean notaNumerica, boolean obligatorio, String tipoCBU)
	{
		super(ciclo ,nivel ,codigo ,duracion, semestreSugerido, cantidadCreditos, tipo, nombre, notaAR, notaNumerica, obligatorio);
		TipoCBU = tipoCBU;
	}

	// ************************************************************************
	// Getters y Setters
	// ************************************************************************
	
	
	public String getTipoCBU() {
		return TipoCBU;
	}

	public void setTipoCBU(String tipoCBU) {
		TipoCBU = tipoCBU;
	}
		
}
