import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import javax.swing.*;
import java.awt.*;

//Fuente empleada: .setFont(new Font("Verdana",0,16));

public class VCoordinador extends JFrame{

    public JPanel panel;
    public JTabbedPane panelPestania;
    public String estudiante;

    public VCoordinador(){
        //Inicializacion de la ventana
        setSize(700,585);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Curso - Coordinador");
        getContentPane().setBackground(Color.YELLOW);
        setLocationRelativeTo(null);
        setLayout(null);
        //Contenido
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        colocarPanel();
    
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
        etiquetaUser.setBounds(15,10,100,95);
        etiquetaUser.setIcon(new ImageIcon(imagenUser.getImage().getScaledInstance(etiquetaUser.getWidth(), etiquetaUser.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiquetaUser);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,115,642,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(), etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiquetaILinea);

        JLabel etiquetaC = new JLabel("Coordinador", SwingConstants.CENTER);
        etiquetaC.setBounds(145,15,120,30);
        etiquetaC.setFont(new Font("Verdana",Font.BOLD,16));
        panel.add(etiquetaC);
        JLabel etiquetaCoo = new JLabel("Alberto E. Pumarejo V.", SwingConstants.LEFT);
        etiquetaCoo.setBounds(310,15,220,30);
        etiquetaCoo.setFont(new Font("Verdana",0,16));
        panel.add(etiquetaCoo);

        JLabel etiquetaD = new JLabel("Departamento", SwingConstants.CENTER);
        etiquetaD.setBounds(150,60,130,30);
        etiquetaD.setFont(new Font("Verdana",Font.BOLD,16));
        panel.add(etiquetaD);
        JLabel etiquetaDep = new JLabel("Ingeniería Mecánica", SwingConstants.LEFT);
        etiquetaDep.setBounds(310,60,220,30);
        etiquetaDep.setFont(new Font("Verdana",0,16));
        panel.add(etiquetaDep);

    }

//---------------------------------------------------------------------
    public JScrollPane panelCargarInfoE(){
        
        JScrollPane panelS = new JScrollPane();
        panelS.setBounds(5,5,700,900);
        JPanel panelCIE = new JPanel();
        panelCIE.setLayout(null);
        panelCIE.setBackground(Color.WHITE);

        panelCIE.setPreferredSize(new Dimension(600,1900));
        panelS.setViewportView(panelCIE);

        JComboBox Estudiantes = new JComboBox();
        Estudiantes.setBounds(120,15,220,30);
        Estudiantes.addItem("Estudiantes Asignados");
        Estudiantes.addItem("Boris N. Reyes R.");
        Estudiantes.addItem("Melissa L. Contreras R.");
        Estudiantes.setFont(new Font("Verdana",0,16));
        panelCIE.add(Estudiantes);

        // Texto -------------------------------------------------------
        JLabel etiquetaE = new JLabel("Estudiante", SwingConstants.CENTER);
        etiquetaE.setBounds(10,15,100,30);
        etiquetaE.setFont(new Font("Verdana",Font.BOLD,16));
        panelCIE.add(etiquetaE);

        JLabel etiquetaC = new JLabel("Codigo", SwingConstants.CENTER);
        etiquetaC.setBounds(360,15,68,30);
        etiquetaC.setFont(new Font("Verdana",Font.BOLD,16));
        panelCIE.add(etiquetaC);
        JLabel etiquetaCR = new JLabel("202014743", SwingConstants.LEFT);
        etiquetaCR.setBounds(470,15,100,30);
        etiquetaCR.setFont(new Font("Verdana",0,16));
        panelCIE.add(etiquetaCR);

        JLabel etiquetaCa = new JLabel("Carrera", SwingConstants.LEFT);
        etiquetaCa.setBounds(14,65,80,30);
        etiquetaCa.setFont(new Font("Verdana",Font.BOLD,16));
        panelCIE.add(etiquetaCa);
        JLabel etiquetaCar = new JLabel("ING. Sistemas", SwingConstants.LEFT);
        etiquetaCar.setBounds(120,65,220,30);
        etiquetaCar.setFont(new Font("Verdana",0,16));
        panelCIE.add(etiquetaCar);

        JLabel etiquetaSe = new JLabel("Semestre", SwingConstants.LEFT);
        etiquetaSe.setBounds(365,65,90,30);
        etiquetaSe.setFont(new Font("Verdana",Font.BOLD,16));
        panelCIE.add(etiquetaSe);
        JLabel etiquetaSem = new JLabel("Tercero", SwingConstants.LEFT);
        etiquetaSem.setBounds(470,65,100,30);
        etiquetaSem.setFont(new Font("Verdana",0,16));
        panelCIE.add(etiquetaSem);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,100,590,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaILinea);

        //---------------------------------------------------------------------------------------------------------------------------------------------

        JLabel etiquetaICS = new JLabel();
        etiquetaICS.setBounds(10,120,440,2);
        etiquetaICS.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaICS);
        JLabel etiquetaCS = new JLabel();
        etiquetaCS.setText("Cursos Por Semestre");
        etiquetaCS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCS.setBounds(465,112,200,16);
        panelCIE.add(etiquetaCS);

        JTable cursosSemestre = new JTable(7,3);
        cursosSemestre.setBounds(10,140,590,110);
        cursosSemestre.setBackground(Color.lightGray);
        panelCIE.add(cursosSemestre);
    
        JLabel etiquetaIPS = new JLabel();
        etiquetaIPS.setBounds(10,268,420,2);
        etiquetaIPS.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaIPS);
        JLabel etiquetaPS = new JLabel();
        etiquetaPS.setText("Promedio Por Semestre");
        etiquetaPS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaPS.setBounds(445,260,200,16);
        panelCIE.add(etiquetaPS);

        JTable promedioSemestre = new JTable(7,2);
        promedioSemestre.setBounds(10,290,590,110);
        promedioSemestre.setBackground(Color.lightGray);
        panelCIE.add(promedioSemestre);

        JLabel etiquetaIPA = new JLabel();
        etiquetaIPA.setBounds(10,428,440,2);
        etiquetaIPA.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaIPA);
        JLabel etiquetaPA = new JLabel();
        etiquetaPA.setText("Informacion General");
        etiquetaPA.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaPA.setBounds(465,420,200,16);
        panelCIE.add(etiquetaPA);

        JLabel etiquetaPromedio = new JLabel("Promedio Acumulado");
        etiquetaPromedio.setBounds(20,450,140,20);
        panelCIE.add(etiquetaPromedio);
        JTextField textoPromedio = new JTextField("5.0");
        textoPromedio.setBounds(150,450,32,20);
        textoPromedio.setFont(new Font("Verdana",Font.BOLD,12));
        textoPromedio.setHorizontalAlignment(SwingConstants.CENTER);
        textoPromedio.setEditable(false);
        panelCIE.add(textoPromedio);

        JLabel etiquetaCreditos = new JLabel("Creditos Cursados");
        etiquetaCreditos.setBounds(220,450,140,20);
        panelCIE.add(etiquetaCreditos);
        JTextField textoCreditos = new JTextField("87");
        textoCreditos.setBounds(334,450,32,20);
        textoCreditos.setFont(new Font("Verdana",Font.BOLD,12));
        textoCreditos.setHorizontalAlignment(SwingConstants.CENTER);
        textoCreditos.setEditable(false);
        panelCIE.add(textoCreditos);

        JLabel etiquetaSemestre = new JLabel("Semestre Por Creditos");
        etiquetaSemestre.setBounds(398,450,160,20);
        panelCIE.add(etiquetaSemestre);
        JTextField textoSemestre = new JTextField("Tercero");
        textoSemestre.setBounds(538,450,60,20);
        textoSemestre.setFont(new Font("Verdana",Font.BOLD,12));
        textoSemestre.setHorizontalAlignment(SwingConstants.CENTER);
        textoSemestre.setEditable(false);
        panelCIE.add(textoSemestre);

        //-----------------------------------------------------------------------------------------------------

        JLabel etiquetaILinea1 = new JLabel();
        etiquetaILinea1.setBounds(10,490,520,2);
        etiquetaILinea1.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaILinea1);
        JLabel etiquetaCS1 = new JLabel();
        etiquetaCS1.setText("Cursados");
        etiquetaCS1.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCS1.setBounds(540,482,90,16);
        panelCIE.add(etiquetaCS1);
        JTable cursosSemestre1 = new JTable(7,3);
        cursosSemestre1.setBounds(10,510,590,110);
        cursosSemestre1.setBackground(Color.lightGray);
        panelCIE.add(cursosSemestre1);
        

        JLabel etiquetaLEP = new JLabel();
        etiquetaLEP.setBounds(10,640,500,2);
        etiquetaLEP.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaLEP);
        JLabel etiquetaEP = new JLabel();
        etiquetaEP.setText("En Proceso");
        etiquetaEP.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaEP.setBounds(520,632,90,16);
        panelCIE.add(etiquetaEP);
        JTable cursosEProceso = new JTable(7,3);
        cursosEProceso.setBounds(10,660,590,110);
        cursosEProceso.setBackground(Color.lightGray);
        panelCIE.add(cursosEProceso);

        JLabel etiquetaLTE = new JLabel();
        etiquetaLTE.setBounds(10,790,470,2);
        etiquetaLTE.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaLTE);
        JLabel etiquetaTE = new JLabel();
        etiquetaTE.setText("Cursados Tipo E");
        etiquetaTE.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaTE.setBounds(490,780,120,16);
        panelCIE.add(etiquetaTE);
        JTable cursosTipoE = new JTable(7,3);
        cursosTipoE.setBounds(10,810,590,110);
        cursosTipoE.setBackground(Color.lightGray);
        panelCIE.add(cursosTipoE);

        JLabel etiquetaLTEpsilon = new JLabel();
        etiquetaLTEpsilon.setBounds(10,940,430,2);
        etiquetaLTEpsilon.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaLTEpsilon);
        JLabel etiquetaTEpsilon = new JLabel();
        etiquetaTEpsilon.setText("Cursados Tipo Epsilon");
        etiquetaTEpsilon.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaTEpsilon.setBounds(460,930,170,16);
        panelCIE.add(etiquetaTEpsilon);
        JTable cursosTipoEpsilon = new JTable(7,3);
        cursosTipoEpsilon.setBounds(10,960,590,110);
        cursosTipoEpsilon.setBackground(Color.lightGray);
        panelCIE.add(cursosTipoEpsilon);

        JLabel etiquetaLHomologados = new JLabel();
        etiquetaLHomologados.setBounds(10,1090,430,2);
        etiquetaLHomologados.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaLHomologados);
        JLabel etiquetaHomologados = new JLabel();
        etiquetaHomologados.setText("Cursados Homologados");
        etiquetaHomologados.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaHomologados.setBounds(450,1080,160,16);
        panelCIE.add(etiquetaHomologados);
        JTable cursosHomologados = new JTable(7,3);
        cursosHomologados.setBounds(10,1110,590,110);
        cursosHomologados.setBackground(Color.lightGray);
        panelCIE.add(cursosHomologados);

        JLabel etiquetaLRequisitos = new JLabel();
        etiquetaLRequisitos.setBounds(10,1240,470,2);
        etiquetaLRequisitos.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaLRequisitos);
        JLabel etiquetaRequisitos = new JLabel();
        etiquetaRequisitos.setText("Requisitos Varios");
        etiquetaRequisitos.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitos.setBounds(490,1230,160,16);
        panelCIE.add(etiquetaRequisitos);
        
        JLabel etiquetaRequisitosC = new JLabel();
        etiquetaRequisitosC.setText("Requisitos Cumplidos");
        etiquetaRequisitosC.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitosC.setBounds(30,1260,180,16);
        panelCIE.add(etiquetaRequisitosC);
        JTable requisitosC = new JTable(7,1);
        requisitosC.setBounds(10,1290,177,110);
        requisitosC.setBackground(Color.lightGray);
        panelCIE.add(requisitosC);

        JLabel etiquetaRequisitosF = new JLabel();
        etiquetaRequisitosF.setText("Requisitos Faltantes");
        etiquetaRequisitosF.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitosF.setBounds(220,1260,180,16);
        panelCIE.add(etiquetaRequisitosF);
        JTable requisitosF = new JTable(7,1);
        requisitosF.setBounds(200,1290,170,110);
        requisitosF.setBackground(Color.lightGray);
        panelCIE.add(requisitosF);



        JLabel etiquetaRequisitoI = new JLabel();
        etiquetaRequisitoI.setText("R. Ingles");
        etiquetaRequisitoI.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitoI.setBounds(410,1260,180,16);
        panelCIE.add(etiquetaRequisitoI);
        JTextField tRequisitoI = new JTextField("SI");
        tRequisitoI.setBounds(550,1260,32,20);
        tRequisitoI.setFont(new Font("Verdana",Font.BOLD,12));
        tRequisitoI.setHorizontalAlignment(SwingConstants.CENTER);
        tRequisitoI.setEditable(false);
        panelCIE.add(tRequisitoI);

        JLabel etiquetaRequisitoS = new JLabel();
        etiquetaRequisitoS.setText("R. Segunda Lengua");
        etiquetaRequisitoS.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaRequisitoS.setBounds(410,1300,180,16);
        panelCIE.add(etiquetaRequisitoS);
        JTextField tRequisitoS = new JTextField("SI");
        tRequisitoS.setBounds(550,1300,32,20);
        tRequisitoS.setFont(new Font("Verdana",Font.BOLD,12));
        tRequisitoS.setHorizontalAlignment(SwingConstants.CENTER);
        tRequisitoS.setEditable(false);
        panelCIE.add(tRequisitoS);

        JLabel etiquetaCandidato = new JLabel();
        etiquetaCandidato.setText("Candidato a Grado");
        etiquetaCandidato.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCandidato.setBounds(410,1340,180,16);
        panelCIE.add(etiquetaCandidato);
        JTextField tCandidato = new JTextField("SI");
        tCandidato.setBounds(550,1340,32,20);
        tCandidato.setFont(new Font("Verdana",Font.BOLD,12));
        tCandidato.setHorizontalAlignment(SwingConstants.CENTER);
        tCandidato.setEditable(false);
        panelCIE.add(tCandidato);

        JLabel etiquetaPractica = new JLabel();
        etiquetaPractica.setText("Practica Profesional");
        etiquetaPractica.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaPractica.setBounds(410,1380,190,16);
        panelCIE.add(etiquetaPractica);
        JTextField tPractica = new JTextField("SI");
        tPractica.setBounds(550,1380,32,20);
        tPractica.setFont(new Font("Verdana",Font.BOLD,12));
        tPractica.setHorizontalAlignment(SwingConstants.CENTER);
        tPractica.setEditable(false);
        panelCIE.add(tPractica);


        JLabel etiquetaLCursos = new JLabel();
        etiquetaLCursos.setBounds(10,1420,440,2);
        etiquetaLCursos.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panelCIE.add(etiquetaLCursos);
        JLabel etiquetaCursos = new JLabel();
        etiquetaCursos.setText("Cursos Faltantes");
        etiquetaCursos.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaCursos.setBounds(470,1410,150,16);
        panelCIE.add(etiquetaCursos);
        JTable cursosFaltantes = new JTable(7,3);
        cursosFaltantes.setBounds(10,1440,590,110);
        cursosFaltantes.setBackground(Color.lightGray);
        panelCIE.add(cursosFaltantes);
        
        return panelS;
    }

    public void moduloOpciones(){
        panelPestania = new JTabbedPane();
        panelPestania.setBounds(15,130,633,382);
        panelPestania.setFont(new Font("Verdana",0,16));
        JScrollPane p1 = panelCargarInfoE();
        panelPestania.add("Revision Del Estudiante", p1);
        panel.add(panelPestania);
    }
}
