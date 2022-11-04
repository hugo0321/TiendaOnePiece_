/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazOnePiece;

import RegistrarCliente.MirarClientes;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class InicioSesion extends javax.swing.JFrame {

    private static InicioSesion iniciosesion;

    /**
     * Creates new form InicioSesion
     */
    private InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
     public static InicioSesion getInstance(){
        if(iniciosesion==null)
            iniciosesion=new InicioSesion();
        return iniciosesion;
    }
    
String contraseña="ONEPIECE";
 String usuario="ADMIN";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblRestablecerContraseña = new javax.swing.JLabel();
        lblicono = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tienda One Piece v1.1");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAyuda.setBackground(new java.awt.Color(204, 204, 204));
        btnAyuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAyudaMouseExited(evt);
            }
        });
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, -1));

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnIngresarKeyReleased(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 160, 70));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 150, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setText("Clic Aquí");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 160, 30));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblContraseña.setText("Contraseña :");
        jPanel2.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblUsuario.setText("Usuario :");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        lblRestablecerContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRestablecerContraseñaMouseClicked(evt);
            }
        });
        jPanel2.add(lblRestablecerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 130, 140));

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/inicio sesion1.png"))); // NOI18N
        lblicono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbliconoMouseClicked(evt);
            }
        });
        jPanel2.add(lblicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -20, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Nueva Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazOnePiece/fondo-azul-207702.jpg"))); // NOI18N
        jPanel2.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2790, 1620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       
       
       String Pass= new String(jPasswordField1.getPassword());
       if(txtUsuario.getText().equals(usuario)&& Pass.equals(contraseña)){
           Interfaz interfaz= Interfaz.getInstance();
        interfaz.setVisible(true);
        this.dispose();
       }else{
           JOptionPane.showMessageDialog(null,"Usuario/contraseña incorrectos"+"\n"+"Presione ESPACIO para continuar");
       }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
          
          txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
       jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed
    
    }//GEN-LAST:event_btnIngresarKeyPressed

    private void btnIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyReleased

    }//GEN-LAST:event_btnIngresarKeyReleased

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "Usuario: ADMIN"+"\n"+"Contraseña: ONEPIECE"+"\n"+"si no recuerda la contraseña de clic en la calavarea para reiniciarla");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseExited
        btnAyuda.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_btnAyudaMouseExited

    private void btnAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseEntered
      btnAyuda.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnAyudaMouseEntered

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     
       
       String Pass= new String(jPasswordField1.getPassword());
       if(txtUsuario.getText().equals(usuario)&& Pass.equals(contraseña)){
           Interfaz interfaz= Interfaz.getInstance();
        interfaz.setVisible(true);
        this.dispose();
       }else{
           JOptionPane.showMessageDialog(null,"Usuario/contraseña incorrectos"+"\n"+"Presione ESPACIO para continuar");
       }
}
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String contra= JOptionPane.showInputDialog("Introduzca la antigüa contraseña");
        cambiarContraseña(contra);
    }//GEN-LAST:event_jButton1ActionPerformed
//public String contraseñaOlvidada(String contra, String Usuario){
    
//}
    private void lbliconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliconoMouseClicked
        
    }//GEN-LAST:event_lbliconoMouseClicked

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        
        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
         btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
      btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
         btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void lblRestablecerContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestablecerContraseñaMouseClicked
        // TODO add your handling code here:
        String Usuario= JOptionPane.showInputDialog("Introduzca el usuario de la cuenta principal");
        if(Usuario.equals(usuario)){
            String contra= JOptionPane.showInputDialog("Introduzca la contraseña");
            if(contra.equals("onepiece")){
                JOptionPane.showMessageDialog(null,"la contraseña se ha reestablecido con éxito"+"\n"+"Presione ESPACIO para continuar");
                
                contraseña="onepiece";
               // contraseñaOlvidada(contra,Usuario);
            }else{
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta"+"\n"+"Presione ESPACIO para continuar");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Usuario incorrecto"+"\n"+"Presione ESPACIO para continuar");
        }
    }//GEN-LAST:event_lblRestablecerContraseñaMouseClicked
public String cambiarContraseña(String contra){
 
    if(contra.equals(contraseña)){
        
        String entradaUsuario= JOptionPane.showInputDialog("Introduzca la nueva contraseña :");
        contraseña=entradaUsuario;
        JOptionPane.showMessageDialog(null,"La nueva contraseña es: "+contraseña+"\n"+"Presione ESPACIO para continuar");
    }else{
        JOptionPane.showMessageDialog(null,"La contraseña que escribió no coincide con la antigüa"+"\n"+"Presione ESPACIO para continuar");
    }
    return contraseña;
}
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblRestablecerContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblicono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
