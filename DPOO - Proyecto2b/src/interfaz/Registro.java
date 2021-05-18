import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.*;

public class Registro extends JFrame{

    public JPanel panel;
    public JTabbedPane panelPestania;

    public JButton aIngreso, aRegistroC, aRegistroE;
    public JRadioButton RBestudiante, RBcoordinador;

    public Registro(){
        //Inicializacion de la ventana
        setSize(700,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Curso - Registro");
        getContentPane().setBackground(Color.YELLOW);
        setLocationRelativeTo(null);
        setLayout(null);
        //Contenido
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        colocarPanel();
        colocarLabels();
        colocarOpciones();
    }

    public void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,10,663,341);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
    }

    public void colocarLabels(){
        JLabel etiqueta = new JLabel("¡¡Bienvenido!!", SwingConstants.CENTER);
        etiqueta.setBounds(145,10,360,30);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setOpaque(false);
        etiqueta.setFont(new Font("Verdana",0,30));
        panel.add(etiqueta);

        JTextArea texto = new JTextArea("Estimado usuario, seleccione e ingrese los datos según sea su estado en la aplicación:\n\nIngresar                 -  Usuario ya registrado\nNuevo Estudiante    -  Estudiante no registrado\nNuevo Coordinador  -  Coordinador no registrado");
        texto.setBounds(15,50,620,100);
        texto.setFont(new Font("Verdana",0,14));
        texto.setEditable(false);
        panel.add(texto);
    }

    //---------------------------------------------------------------------

    public JPanel panelRegistroE(){
        JPanel registro = new JPanel();
        registro.setLayout(null);
        registro.setBounds(10,10,663,526);
        this.getContentPane().add(registro);
        registro.setBackground(Color.WHITE);

        JLabel Tusuario = new JLabel("Nombre");
        Tusuario.setBounds(15,15,100,20);
        Tusuario.setFont(new Font("Verdana",Font.BOLD,16));
        registro.add(Tusuario);
        JTextField nombre = new JTextField();
        nombre.setBounds(100,15,150,20);
        nombre.setBackground(Color.LIGHT_GRAY);
        registro.add(nombre);

        JLabel Tcodigo = new JLabel("Codigo");
        Tcodigo.setBounds(275,15,100,20);
        Tcodigo.setFont(new Font("Verdana",Font.BOLD,16));
        registro.add(Tcodigo);
        JTextField codigo = new JTextField();
        codigo.setBounds(350,15,150,20);
        codigo.setBackground(Color.LIGHT_GRAY);
        registro.add(codigo);

        JLabel Tcarrera = new JLabel("Carrera");
        Tcarrera.setBounds(15,45,100,20);
        Tcarrera.setFont(new Font("Verdana",Font.BOLD,16));
        registro.add(Tcarrera);
        JTextField carrera = new JTextField();
        carrera.setBounds(100,45,150,20);
        carrera.setBackground(Color.LIGHT_GRAY);
        registro.add(carrera);

        //Boton Aceptar Registro Estudiante
        aRegistroE = new JButton("Aceptar");
        aRegistroE.setBounds(351,45,80,20);
        registro.add(aRegistroE);

        ActionListener oRegistroE = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                VEstudiante nuevaVentana = new VEstudiante();
                nuevaVentana.setVisible(true);
            }
        };
        aRegistroE.addActionListener(oRegistroE);

        return registro;
    }

    public JPanel panelRegistroC(){
        JPanel registro = new JPanel();
        registro.setLayout(null);
        registro.setBounds(10,10,663,526);
        this.getContentPane().add(registro);
        registro.setBackground(Color.WHITE);

        JLabel Tusuario = new JLabel("Nombre Coordinador");
        Tusuario.setBounds(15,15,185,20);
        Tusuario.setFont(new Font("Verdana",Font.BOLD,16));
        registro.add(Tusuario);
        JTextField nombre = new JTextField();
        nombre.setBounds(210,15,150,20);
        nombre.setBackground(Color.LIGHT_GRAY);
        registro.add(nombre);

        JLabel Tcarrera = new JLabel("Archivo Estudiantes");
        Tcarrera.setBounds(15,45,180,20);
        Tcarrera.setFont(new Font("Verdana",Font.BOLD,16));
        registro.add(Tcarrera);
        JTextField carrera = new JTextField();
        carrera.setBounds(210,45,150,20);
        carrera.setBackground(Color.LIGHT_GRAY);
        registro.add(carrera);


        //Boton Aceptar Registro Coordinador
        JButton aRegistroC = new JButton("Aceptar");
        aRegistroC.setBounds(400,30,80,20);
        registro.add(aRegistroC);

        ActionListener oRegistroC = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                VCoordinador nuevaVentana = new VCoordinador();
                nuevaVentana.setVisible(true);
            }
        };
        aRegistroC.addActionListener(oRegistroC);

        return registro;
    }

    public JPanel panelIngresar(){
        JPanel ingresar = new JPanel();
        ingresar.setLayout(null);
        ingresar.setBounds(10,10,663,526);
        this.getContentPane().add(ingresar);
        ingresar.setBackground(Color.WHITE);

        JLabel Tusuario = new JLabel("Usuario");
        Tusuario.setBounds(25,15,100,20);
        Tusuario.setFont(new Font("Verdana",Font.BOLD,16));
        ingresar.add(Tusuario);
        JTextField nombre = new JTextField();
        nombre.setBounds(110,15,160,20);
        nombre.setBackground(Color.LIGHT_GRAY);
        ingresar.add(nombre);

        //JRadio
        ButtonGroup grupoRadioB = new ButtonGroup();

        RBcoordinador = new JRadioButton("Coordinador");
        RBcoordinador.setBounds(35,45,110,20);
        RBcoordinador.setFont(new Font("Verdana",Font.BOLD,11));
        RBcoordinador.setOpaque(true);
        RBcoordinador.setBackground(Color.WHITE);
        RBcoordinador.setActionCommand("C");
        ingresar.add(RBcoordinador);

        RBestudiante = new JRadioButton("Estudiante");
        RBestudiante.setBounds(160,45,110,20);
        RBestudiante.setFont(new Font("Verdana",Font.BOLD,11));
        RBestudiante.setOpaque(true);
        RBestudiante.setBackground(Color.WHITE);
        RBestudiante.setActionCommand("E");
        ingresar.add(RBestudiante);

        grupoRadioB.add(RBcoordinador);
        grupoRadioB.add(RBestudiante);
        grupoRadioB.getSelection();

        //Boton Aceptar Ingreso
        aIngreso = new JButton("Aceptar");
        aIngreso.setBounds(361,30,80,20);
        ingresar.add(aIngreso);

        ActionListener oIngreso = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                ButtonModel selection = grupoRadioB.getSelection();
                if(selection.getActionCommand() == RBestudiante.getActionCommand()){
                VEstudiante nuevaVentana = new VEstudiante();
                nuevaVentana.setVisible(true);
                }
                else if(selection.getActionCommand() == RBcoordinador.getActionCommand()){
                VCoordinador nuevaVentana = new VCoordinador();
                nuevaVentana.setVisible(true);
                }
            }
        };
        aIngreso.addActionListener(oIngreso);

        return ingresar;
    }

    public void colocarOpciones(){
        panelPestania = new JTabbedPane();
        panelPestania.setBounds(70,180,520,110);
        panelPestania.setFont(new Font("Verdana",0,14));

        JPanel p1 = panelRegistroE();
        JPanel p2 = panelRegistroC();
        JPanel p3 = panelIngresar();

        panelPestania.add("Ingresar", p3);
        panelPestania.add("Registrar - Estudiante", p1);
        panelPestania.add("Registrar - Coordinador", p2);

        panel.add(panelPestania);
    }
}
