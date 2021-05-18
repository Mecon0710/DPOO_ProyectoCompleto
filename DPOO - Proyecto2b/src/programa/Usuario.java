package programa;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public abstract class Usuario 
{
	protected HashMap<Estudiante,HashMap<String,HashMap<Curso, Float>>> InfoBanner; // Estudiante,semestre,curso,nota
	
	public Usuario() {
		InfoBanner = new HashMap<Estudiante, HashMap<String, HashMap<Curso, Float>>>();
	}

	/*
	 * Se carga la informaci�n desde banner y aqu� suponemos que se va a leer un csv. La informaci�n le�da se pone en InfoBanner.
	 */
	public HashMap<Estudiante, HashMap<String, HashMap<Curso, Float>>> cargarInfoBanner
	(String rutaArchivo, String estudiante)throws FileNotFoundException, IOException{
		   BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
		   String linea = br.readLine();
		   linea = br.readLine();
		   while (linea != null)
		   {
			   String[] partes = linea.split(",");
			   String nombreEstudiante = partes[0];
			   String codigoEstudiante = partes[1];
			   String correoEstudiante = partes[2];
			   int semestre = Integer.parseInt(partes[3]);
			   String nombreCurso = partes[4];
			   
			   //InfoBanner.put(nombreEstudiante,semestre);
			   linea = br.readLine();
		   }	
		return InfoBanner;	
	}
	
	
	/*
	 * Edici�n por parte del coordinador si quiere complementar alguna informacion proveniente de Banner.
	 */
	public HashMap<Estudiante,HashMap<String,HashMap<Curso, Float>>> setInfoBanner
	(HashMap<Estudiante,HashMap<String,HashMap<Curso, Float>>> infoBanner){
		return InfoBanner = infoBanner;
	}
	

}
