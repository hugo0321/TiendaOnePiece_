/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazOnePiece;

import RegistrarCliente.MirarClientes;
import RegistrarCliente.RegistrarCliente;

/**
 *
 * @author Hugo
 */
public class Interfaz extends javax.swing.JFrame {
 private static Interfaz interfaz;
    /**
     * Creates new form MenuPrincipal
     */
    private Interfaz() {
        initComponents();
    }

    public static Interfaz getInstance(){
        if(interfaz==null)
            interfaz=new Interfaz();
        return interfaz;
    }
    /**
     * Creates new form Interfaz
     */
    //public Interfaz() {
     //   initComponents();
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(199, 236, 238));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 2, 0));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(199, 236, 238));
        jTextField1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("BIENVENIDOS A LA TIENDA");
        jTextField1.setToolTipText("");
        jPanel1.add(jTextField1);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(199, 236, 238));
        jTextField2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jTextField2.setText("Encuentra lo mejor de tu anime favorito en nuestro menú superior");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(199, 236, 238));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/2026245.jpg"))); // NOI18N
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu1.setText("Menú");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/shopping-bag.png"))); // NOI18N
        jMenu3.setText("Productos disponibles");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/blusa.png"))); // NOI18N
        jMenuItem3.setText("Blusas");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/camiseta.png"))); // NOI18N
        jMenuItem4.setText("Camisas");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/gorra.png"))); // NOI18N
        jMenuItem5.setText("Gorras");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/zapatillas.png"))); // NOI18N
        jMenuItem6.setText("Zapatos");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/accesorio.png"))); // NOI18N
        jMenuItem7.setText("Accesorios");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/figura-de-accion.png"))); // NOI18N
        jMenuItem8.setText("figuras");
        jMenu3.add(jMenuItem8);

        jMenu1.add(jMenu3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/cart.png"))); // NOI18N
        jMenuItem1.setText("Registrar cliente");
        jMenuItem1.setActionCommand("Realizar compra");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem16.setText("Lista de Clientes");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/2931188_door_enter_exit_leave_out_icon.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mi Perfil");

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/seleccione.png"))); // NOI18N
        jMenuItem14.setText("Iniciar Sesión");
        jMenu2.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/usuario.png"))); // NOI18N
        jMenuItem15.setText("Crear Cuenta");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/boton.png"))); // NOI18N
        jMenuItem13.setText("Cerrar Sesión");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ayuda");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/libro-de-instrucciones.png"))); // NOI18N
        jMenuItem9.setText("Guía de usuario");
        jMenu4.add(jMenuItem9);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/buscar.png"))); // NOI18N
        jMenuItem11.setText("Términos y Condiciones");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/apreton-de-manos.png"))); // NOI18N
        jMenuItem12.setText("Quejas y Devoluciones");
        jMenu4.add(jMenuItem12);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/auriculares.png"))); // NOI18N
        jMenuItem10.setText("Contactos");
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         RegistrarCliente registrarcliente = RegistrarCliente.getInstance();
       registrarcliente.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
         MirarClientes mirarclientes= MirarClientes.getInstance();
        mirarclientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    /**
     * @param args the command line arguments
     */
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
