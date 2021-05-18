import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.*;

public class VLogIn extends JFrame{

    public JPanel panel;
    public JButton BComenzar;
    public JButton BSalir;

    public VLogIn(){
        //Crear Ventana
        setSize(700,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Curso - LogIn");
        getContentPane().setBackground(Color.YELLOW);
        setLocationRelativeTo(null);
        setLayout(null);
        //Rellenar
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        colocarPanel();
        colocarLabels();
        colocarBotones();
    }

    //---------------------------------------------------------------------

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,10,663,341);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
    }

    private void colocarLabels(){
        JLabel etiqueta = new JLabel("¡Hola! Selecciona una Opción", SwingConstants.CENTER);
        etiqueta.setBounds(108,115,450,30);
        etiqueta.setOpaque(false);
        etiqueta.setFont(new Font("Verdana",0,30));
        panel.add(etiqueta);

        ImageIcon imagenLogo = new ImageIcon("data/imagenes/uniandesLogoA.jpg");
        JLabel etiquetaImg = new JLabel();
        etiquetaImg.setBounds(445,10,208,65);
        etiquetaImg.setIcon(new ImageIcon(imagenLogo.getImage().getScaledInstance(etiquetaImg.getWidth(),etiquetaImg.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiquetaImg);

        ImageIcon imagenLinea = new ImageIcon("data/imagenes/lineaF.jpg");
        JLabel etiquetaILinea = new JLabel();
        etiquetaILinea.setBounds(10,80,490,2);
        etiquetaILinea.setIcon(new ImageIcon(imagenLinea.getImage().getScaledInstance(etiquetaILinea.getWidth(),etiquetaILinea.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiquetaILinea);

        JLabel etiquetaING = new JLabel();
        etiquetaING.setText("DPOO - Proyecto Curso");
        etiquetaING.setFont(new Font("Verdana",Font.BOLD,11));
        etiquetaING.setBounds(505,72,200,16);
        panel.add(etiquetaING);
        }

    private void colocarBotones(){
        BComenzar = new JButton("Comenzar");
        BComenzar.setBounds(177,180,300,50);
        BComenzar.setEnabled(true); //Encendido del botón
        BComenzar.setMnemonic('a'); //Click desde teclado Alt + 'a'
        BComenzar.setFont(new Font("Verdana",0,24));
        BComenzar.setBackground(Color.YELLOW);

        BSalir = new JButton("Salir del Programa");
        BSalir.setBounds(177,250,300,50);
        BSalir.setBackground(Color.YELLOW);
        BComenzar.setEnabled(true); //Encendido del botón
        BComenzar.setMnemonic('x'); //Click desde teclado Alt + 'x'
        BSalir.setFont(new Font("Verdana",0,24));

        panel.add(BComenzar);
        panel.add(BSalir);

        
        ActionListener oyenteC = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Registro nuevaVentana = new Registro();
                nuevaVentana.setVisible(true);
            }
        };
        BComenzar.addActionListener(oyenteC);

        ActionListener oyenteS = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        };
        BSalir.addActionListener(oyenteS);
    }


    public static void main(String[] args) {
        VLogIn ventana = new VLogIn();
        ventana.setVisible(true);
    }
}