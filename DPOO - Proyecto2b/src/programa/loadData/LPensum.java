import java.io.BufferedReader;
import java.io.FileReader;

public class pensum {
    
    public static Lpensum(){
        BufferReader br = new BufferedReader(new FileReader("data/Pensum.csv"));
        String curso    = br.readLine();
        curso           = bl.readLine();
        while(curso != null){
            String[] partes         = curso.trim().split(",");

            String Codigo            = partes[0];
            String Nombre            = partes[1];
            int Creditos             = partes[2];
            boolean Obligatorio      = partes[3];
            String SemestreSugerido  = partes[4];
            String Nivel             = partes[5];
            String Tipo              = partes[6];
            String Duracion          = partes[7];
            String Ciclo             = partes[8];
            boolean NotaNumerica     = partes[9];
            boolean NotaAR           = partes[10];
            String PreRequisitos     = partes[11];
            String Correquisitos     = partes[12];
            String Restricciones     = partes[13];
            String SeccionesE        = partes[14];
            String Alternativas      = partes[15];

            Curso nuevo = new Curso();
        }
    }
}