import java.awt.*;
import javax.swing.*;

public class VEstudiante extends JFrame{

    public JPanel panel;
    public JTabbedPane panelPestania;
    public String estudiante;

    public VEstudiante(){
        //Inicializacion de la ventana
        setSize(700,585);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Curso - Estudiante");
        getContentPane().setBackground(Color.YELLOW);
        setLocationRelativeTo(null);
        setLayout(null);
        //Contenido
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        colocarPanel();
        /** Modulo de Opciones disponibles, JTabbedPane compuesto por:
            * Cargar Pensum
            * Cargar Información
            * Revisar Estudiante
        */
        moduloAsignar();
        moduloOpciones();
    }

    public void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,10,663,526);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
    }

    //---------------------------------------------------------------------
    public void moduloAsignar(){

        //Imagenes----------------------------------------------------
        ImageIcon imagenUser = new ImageIcon("data/imagenes/user.png");
        JLabel etiquetaUser = new JLabel();
        etiquetaUser.setBounds(10,5,110,105);
        etiquetaUser.setIcon(new ImageIcon(imagenUser.getImage().getScaledInstance(etiquetaUser.getWidth(), etiquetaUser.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiquetaUser);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,115,642,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(), etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiquetaILinea);


        // Texto -------------------------------------------------------


        JLabel etiquetaE = new JLabel("Estudiante", SwingConstants.CENTER);
        etiquetaE.setBounds(150,15,100,30);
        etiquetaE.setFont(new Font("Verdana",Font.BOLD,16));
        panel.add(etiquetaE);
        JLabel Estudiantes = new JLabel("Boris N. Reyes R.");
        Estudiantes.setBounds(260,15,220,30);
        Estudiantes.setFont(new Font("Verdana",0,16));
        panel.add(Estudiantes);

        JLabel etiquetaC = new JLabel("Codigo", SwingConstants.CENTER);
        etiquetaC.setBounds(425,15,68,30);
        etiquetaC.setFont(new Font("Verdana",Font.BOLD,16));
        panel.add(etiquetaC);
        JLabel etiquetaCR = new JLabel("202014743", SwingConstants.LEFT);
        etiquetaCR.setBounds(540,15,100,30);
        etiquetaCR.setFont(new Font("Verdana",0,16));
        panel.add(etiquetaCR);

        JLabel etiquetaCa = new JLabel("Carrera", SwingConstants.LEFT);
        etiquetaCa.setBounds(154,65,80,30);
        etiquetaCa.setFont(new Font("Verdana",Font.BOLD,16));
        panel.add(etiquetaCa);
        JLabel etiquetaCar = new JLabel("ING. Sistemas", SwingConstants.LEFT);
        etiquetaCar.setBounds(260,65,220,30);
        etiquetaCar.setFont(new Font("Verdana",0,16));
        panel.add(etiquetaCar);


        JLabel etiquetaSe = new JLabel("Semestre", SwingConstants.LEFT);
        etiquetaSe.setBounds(430,65,90,30);
        etiquetaSe.setFont(new Font("Verdana",Font.BOLD,16));
        panel.add(etiquetaSe);
        JLabel etiquetaSem = new JLabel("Tercero", SwingConstants.LEFT);
        etiquetaSem.setBounds(540,65,100,30);
        etiquetaSem.setFont(new Font("Verdana",0,16));
        panel.add(etiquetaSem);

    }

// ---------------------------------------------------------------------

    public JScrollPane panelPlanearH(){
        JScrollPane panelS = new JScrollPane();
        panelS.setBounds(5,5,700,900);
        JPanel panelCP = new JPanel();
        panelCP.setLayout(null);

        panelCP.setPreferredSize(new Dimension(600,400));
        panelS.setViewportView(panelCP);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,20,490,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaILinea);
        JLabel etiquetaCS = new JLabel();
        etiquetaCS.setText("Cumplimiento");
        etiquetaCS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCS.setBounds(510,12,90,16);
        panelCP.add(etiquetaCS);

        JLabel etiquetaMCreditos = new JLabel("Max Creditos");
        etiquetaMCreditos.setBounds(20,30,100,20);
        panelCP.add(etiquetaMCreditos);
        JTextField textoMCreditos = new JTextField("100");
        textoMCreditos.setBounds(100,30,32,20);
        textoMCreditos.setFont(new Font("Verdana",Font.BOLD,12));
        textoMCreditos.setHorizontalAlignment(SwingConstants.CENTER);
        textoMCreditos.setEditable(false);
        panelCP.add(textoMCreditos);

        JLabel etiquetaCCreditos = new JLabel("Cumple Creditos");
        etiquetaCCreditos.setBounds(150,30,130,20);
        panelCP.add(etiquetaCCreditos);
        JTextField textoCCreditos = new JTextField("SI");
        textoCCreditos.setBounds(250,30,32,20);
        textoCCreditos.setFont(new Font("Verdana",Font.BOLD,12));
        textoCCreditos.setHorizontalAlignment(SwingConstants.CENTER);
        textoCCreditos.setEditable(false);
        panelCP.add(textoCCreditos);

        JLabel etiquetaCRequisitos = new JLabel("Cumple Requisitos");
        etiquetaCRequisitos.setBounds(290,30,130,20);
        panelCP.add(etiquetaCRequisitos);
        JTextField textoCRequisitos = new JTextField("SI");
        textoCRequisitos.setBounds(400,30,32,20);
        textoCRequisitos.setFont(new Font("Verdana",Font.BOLD,12));
        textoCRequisitos.setHorizontalAlignment(SwingConstants.CENTER);
        textoCRequisitos.setEditable(false);
        panelCP.add(textoCRequisitos);

        JLabel etiquetaSActual = new JLabel("Semestre Actual");
        etiquetaSActual.setBounds(440,30,130,20);
        panelCP.add(etiquetaSActual);
        JTextField etiqSActual = new JTextField("SI");
        etiqSActual.setBounds(540,30,32,20);
        etiqSActual.setFont(new Font("Verdana",Font.BOLD,12));
        etiqSActual.setHorizontalAlignment(SwingConstants.CENTER);
        etiqSActual.setEditable(false);
        panelCP.add(etiqSActual);

        JLabel etiquetaILinea2 = new JLabel();
        etiquetaILinea2.setBounds(10,70,470,2);
        etiquetaILinea2.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaILinea2);

        JLabel etiquetaRequisitosC = new JLabel();
        etiquetaRequisitosC.setText("Inscribir Curso");
        etiquetaRequisitosC.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitosC.setBounds(490,60,180,16);
        panelCP.add(etiquetaRequisitosC);
        
        JTable cursos1 = new JTable(7,3);
        cursos1.setBounds(10,90,590,110);
        cursos1.setBackground(Color.lightGray);
        panelCP.add(cursos1);
        return panelS;
    }





    public JScrollPane panelAvanceC(){
        JScrollPane panelS = new JScrollPane();
        panelS.setBounds(5,5,700,900);
        JPanel panelCP = new JPanel();
        panelCP.setLayout(null);

        panelCP.setPreferredSize(new Dimension(600,1100));
        panelS.setViewportView(panelCP);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,20,520,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaILinea);
        JLabel etiquetaCS = new JLabel();
        etiquetaCS.setText("Cursados");
        etiquetaCS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCS.setBounds(540,12,90,16);
        panelCP.add(etiquetaCS);
        JTable cursosSemestre = new JTable(7,3);
        cursosSemestre.setBounds(10,40,590,110);
        cursosSemestre.setBackground(Color.lightGray);
        panelCP.add(cursosSemestre);
        

        JLabel etiquetaLEP = new JLabel();
        etiquetaLEP.setBounds(10,170,500,2);
        etiquetaLEP.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaLEP);
        JLabel etiquetaEP = new JLabel();
        etiquetaEP.setText("En Proceso");
        etiquetaEP.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaEP.setBounds(520,162,90,16);
        panelCP.add(etiquetaEP);
        JTable cursosEProceso = new JTable(7,3);
        cursosEProceso.setBounds(10,190,590,110);
        cursosEProceso.setBackground(Color.lightGray);
        panelCP.add(cursosEProceso);

        JLabel etiquetaLTE = new JLabel();
        etiquetaLTE.setBounds(10,320,470,2);
        etiquetaLTE.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaLTE);
        JLabel etiquetaTE = new JLabel();
        etiquetaTE.setText("Cursados Tipo E");
        etiquetaTE.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaTE.setBounds(490,310,120,16);
        panelCP.add(etiquetaTE);
        JTable cursosTipoE = new JTable(7,3);
        cursosTipoE.setBounds(10,340,590,110);
        cursosTipoE.setBackground(Color.lightGray);
        panelCP.add(cursosTipoE);

        JLabel etiquetaLTEpsilon = new JLabel();
        etiquetaLTEpsilon.setBounds(10,470,430,2);
        etiquetaLTEpsilon.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaLTEpsilon);
        JLabel etiquetaTEpsilon = new JLabel();
        etiquetaTEpsilon.setText("Cursados Tipo Epsilon");
        etiquetaTEpsilon.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaTEpsilon.setBounds(460,460,170,16);
        panelCP.add(etiquetaTEpsilon);
        JTable cursosTipoEpsilon = new JTable(7,3);
        cursosTipoEpsilon.setBounds(10,490,590,110);
        cursosTipoEpsilon.setBackground(Color.lightGray);
        panelCP.add(cursosTipoEpsilon);

        JLabel etiquetaLHomologados = new JLabel();
        etiquetaLHomologados.setBounds(10,620,430,2);
        etiquetaLHomologados.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaLHomologados);
        JLabel etiquetaHomologados = new JLabel();
        etiquetaHomologados.setText("Cursados Homologados");
        etiquetaHomologados.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaHomologados.setBounds(450,610,160,16);
        panelCP.add(etiquetaHomologados);
        JTable cursosHomologados = new JTable(7,3);
        cursosHomologados.setBounds(10,640,590,110);
        cursosHomologados.setBackground(Color.lightGray);
        panelCP.add(cursosHomologados);

        JLabel etiquetaLRequisitos = new JLabel();
        etiquetaLRequisitos.setBounds(10,770,470,2);
        etiquetaLRequisitos.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaLRequisitos);
        JLabel etiquetaRequisitos = new JLabel();
        etiquetaRequisitos.setText("Requisitos Varios");
        etiquetaRequisitos.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitos.setBounds(490,760,160,16);
        panelCP.add(etiquetaRequisitos);
        
        JLabel etiquetaRequisitosC = new JLabel();
        etiquetaRequisitosC.setText("Requisitos Cumplidos");
        etiquetaRequisitosC.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitosC.setBounds(30,790,180,16);
        panelCP.add(etiquetaRequisitosC);
        JTable requisitosC = new JTable(7,1);
        requisitosC.setBounds(10,820,177,110);
        requisitosC.setBackground(Color.lightGray);
        panelCP.add(requisitosC);

        JLabel etiquetaRequisitosF = new JLabel();
        etiquetaRequisitosF.setText("Requisitos Faltantes");
        etiquetaRequisitosF.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitosF.setBounds(220,790,180,16);
        panelCP.add(etiquetaRequisitosF);
        JTable requisitosF = new JTable(7,1);
        requisitosF.setBounds(200,820,170,110);
        requisitosF.setBackground(Color.lightGray);
        panelCP.add(requisitosF);



        JLabel etiquetaRequisitoI = new JLabel();
        etiquetaRequisitoI.setText("R. Ingles");
        etiquetaRequisitoI.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitoI.setBounds(410,790,180,16);
        panelCP.add(etiquetaRequisitoI);
        JTextField tRequisitoI = new JTextField("SI");
        tRequisitoI.setBounds(550,790,32,20);
        tRequisitoI.setFont(new Font("Verdana",Font.BOLD,12));
        tRequisitoI.setHorizontalAlignment(SwingConstants.CENTER);
        tRequisitoI.setEditable(false);
        panelCP.add(tRequisitoI);

        JLabel etiquetaRequisitoS = new JLabel();
        etiquetaRequisitoS.setText("R. Segunda Lengua");
        etiquetaRequisitoS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitoS.setBounds(410,830,180,16);
        panelCP.add(etiquetaRequisitoS);
        JTextField tRequisitoS = new JTextField("SI");
        tRequisitoS.setBounds(550,830,32,20);
        tRequisitoS.setFont(new Font("Verdana",Font.BOLD,12));
        tRequisitoS.setHorizontalAlignment(SwingConstants.CENTER);
        tRequisitoS.setEditable(false);
        panelCP.add(tRequisitoS);

        JLabel etiquetaCandidato = new JLabel();
        etiquetaCandidato.setText("Candidato a Grado");
        etiquetaCandidato.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCandidato.setBounds(410,870,180,16);
        panelCP.add(etiquetaCandidato);
        JTextField tCandidato = new JTextField("SI");
        tCandidato.setBounds(550,870,32,20);
        tCandidato.setFont(new Font("Verdana",Font.BOLD,12));
        tCandidato.setHorizontalAlignment(SwingConstants.CENTER);
        tCandidato.setEditable(false);
        panelCP.add(tCandidato);

        JLabel etiquetaPractica = new JLabel();
        etiquetaPractica.setText("Practica Profesional");
        etiquetaPractica.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaPractica.setBounds(410,910,190,16);
        panelCP.add(etiquetaPractica);
        JTextField tPractica = new JTextField("SI");
        tPractica.setBounds(550,910,32,20);
        tPractica.setFont(new Font("Verdana",Font.BOLD,12));
        tPractica.setHorizontalAlignment(SwingConstants.CENTER);
        tPractica.setEditable(false);
        panelCP.add(tPractica);


        JLabel etiquetaLCursos = new JLabel();
        etiquetaLCursos.setBounds(10,950,440,2);
        etiquetaLCursos.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaLCursos);
        JLabel etiquetaCursos = new JLabel();
        etiquetaCursos.setText("Cursos Faltantes");
        etiquetaCursos.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCursos.setBounds(470,940,150,16);
        panelCP.add(etiquetaCursos);
        JTable cursosFaltantes = new JTable(7,3);
        cursosFaltantes.setBounds(10,970,590,110);
        cursosFaltantes.setBackground(Color.lightGray);
        panelCP.add(cursosFaltantes);


        return panelS;
    }



    public JScrollPane panelReporteN(){
        JScrollPane panelS = new JScrollPane();
        panelS.setBounds(5,5,700,600);
        JPanel panelCP = new JPanel();
        panelCP.setLayout(null);

        panelCP.setPreferredSize(new Dimension(600,400));
        panelS.setViewportView(panelCP);
        panelCP.setBackground(Color.WHITE);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,20,440,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaILinea);
        JLabel etiquetaCS = new JLabel();
        etiquetaCS.setText("Cursos Por Semestre");
        etiquetaCS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCS.setBounds(465,12,200,16);
        panelCP.add(etiquetaCS);

        JTable cursosSemestre = new JTable(7,3);
        cursosSemestre.setBounds(10,40,590,110);
        cursosSemestre.setBackground(Color.lightGray);
        panelCP.add(cursosSemestre);
    
        JLabel etiquetaIPS = new JLabel();
        etiquetaIPS.setBounds(10,168,420,2);
        etiquetaIPS.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaIPS);
        JLabel etiquetaPS = new JLabel();
        etiquetaPS.setText("Promedio Por Semestre");
        etiquetaPS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaPS.setBounds(445,160,200,16);
        panelCP.add(etiquetaPS);

        JTable promedioSemestre = new JTable(7,2);
        promedioSemestre.setBounds(10,190,590,110);
        promedioSemestre.setBackground(Color.lightGray);
        panelCP.add(promedioSemestre);

        JLabel etiquetaIPA = new JLabel();
        etiquetaIPA.setBounds(10,328,440,2);
        etiquetaIPA.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCP.add(etiquetaIPA);
        JLabel etiquetaPA = new JLabel();
        etiquetaPA.setText("Informacion General");
        etiquetaPA.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaPA.setBounds(465,320,200,16);
        panelCP.add(etiquetaPA);

        JLabel etiquetaPromedio = new JLabel("Promedio Acumulado");
        etiquetaPromedio.setBounds(20,350,140,20);
        panelCP.add(etiquetaPromedio);
        JTextField textoPromedio = new JTextField("5.0");
        textoPromedio.setBounds(150,350,32,20);
        textoPromedio.setFont(new Font("Verdana",Font.BOLD,12));
        textoPromedio.setHorizontalAlignment(SwingConstants.CENTER);
        textoPromedio.setEditable(false);
        panelCP.add(textoPromedio);

        JLabel etiquetaCreditos = new JLabel("Creditos Cursados");
        etiquetaCreditos.setBounds(220,350,140,20);
        panelCP.add(etiquetaCreditos);
        JTextField textoCreditos = new JTextField("87");
        textoCreditos.setBounds(334,350,32,20);
        textoCreditos.setFont(new Font("Verdana",Font.BOLD,12));
        textoCreditos.setHorizontalAlignment(SwingConstants.CENTER);
        textoCreditos.setEditable(false);
        panelCP.add(textoCreditos);

        JLabel etiquetaSemestre = new JLabel("Semestre Por Creditos");
        etiquetaSemestre.setBounds(398,350,160,20);
        panelCP.add(etiquetaSemestre);
        JTextField textoSemestre = new JTextField("Tercero");
        textoSemestre.setBounds(538,350,60,20);
        textoSemestre.setFont(new Font("Verdana",Font.BOLD,12));
        textoSemestre.setHorizontalAlignment(SwingConstants.CENTER);
        textoSemestre.setEditable(false);
        panelCP.add(textoSemestre);

        return panelS;
    }

    public void moduloOpciones(){
        panelPestania = new JTabbedPane();
        panelPestania.setBounds(15,130,633,382);
        panelPestania.setFont(new Font("Verdana",0,16));

        JScrollPane p2 = panelAvanceC();
        JScrollPane p3 = panelReporteN();
        JScrollPane p4 = panelPlanearH();
    
        panelPestania.add("Avance Carrera", p2);
        panelPestania.add("Planear Horario", p4);
        panelPestania.add("Reporte de Notas", p3);
        
        panel.add(panelPestania);
    }
}