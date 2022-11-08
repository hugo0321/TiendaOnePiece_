/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RegistrarCliente;

import ControllerRegistroCLiente.ClientesController;
import DAOClientes.DAOclientes;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class EditarCliente extends javax.swing.JFrame {
 private static EditarCliente editarcliente;

    /**
     * Creates new form EditarCliente
     */
    private EditarCliente() {
        initComponents();
        String productos[]={"1 a 10 compras","11 a 20 compras","21 a 30 compras","31 o más compras"};
        String identificacion[]={"CC","TI","Pasaporte","Registro civil"};
DefaultComboBoxModel comboModel= new DefaultComboBoxModel(productos);
DefaultComboBoxModel comboModel2= new DefaultComboBoxModel(identificacion);
cboidentificacion.setModel(comboModel2);
cboCompras.setModel(comboModel);

    }
public static EditarCliente getInstance(){
        if(editarcliente==null)
            editarcliente=new EditarCliente();
        return editarcliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboCompras = new javax.swing.JComboBox<>();
        lblTítulo = new javax.swing.JLabel();
        JpanelNumeroDocumento = new javax.swing.JPanel();
        txtdocumento = new javax.swing.JTextField();
        jpanel1 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        jpanelNombre2 = new javax.swing.JPanel();
        txtnombre2 = new javax.swing.JTextField();
        jpanelApellido = new javax.swing.JPanel();
        txtapellido = new javax.swing.JTextField();
        jpanelApellido2 = new javax.swing.JPanel();
        txtapellido3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cboidentificacion = new javax.swing.JComboBox<>();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboCompras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        lblTítulo.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        lblTítulo.setText("Escriba los nuevos datos del cliente");
        jPanel1.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        JpanelNumeroDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de docmento:"));
        JpanelNumeroDocumento.setLayout(new java.awt.GridLayout(1, 0));
        JpanelNumeroDocumento.add(txtdocumento);

        jPanel1.add(JpanelNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 230, -1));

        jpanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Nombre"));
        jpanel1.setLayout(new java.awt.GridLayout(1, 0));
        jpanel1.add(txtnombre);

        jPanel1.add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, -1));

        jpanelNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Nombre"));
        jpanelNombre2.setLayout(new java.awt.GridLayout(1, 0));

        txtnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre2ActionPerformed(evt);
            }
        });
        jpanelNombre2.add(txtnombre2);

        jPanel1.add(jpanelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 230, -1));

        jpanelApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Apellido"));
        jpanelApellido.setLayout(new java.awt.GridLayout(1, 0));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        jpanelApellido.add(txtapellido);

        jPanel1.add(jpanelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, -1));

        jpanelApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Apellido"));
        jpanelApellido2.setLayout(new java.awt.GridLayout(1, 0));
        jpanelApellido2.add(txtapellido3);

        jPanel1.add(jpanelApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 230, -1));

        jLabel1.setText("Número de compras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        cboidentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DAOclientes clientCont = ClientesController.getInstance();
        if(txtnombre.getText().equals("")||txtnombre.getText().equals("OBLIGATORIO")||txtnombre.getText().equals("ESCRIBA AQUÍ")||
                txtapellido.getText().equals("")||txtapellido.getText().equals("OBLIGATORIO")||txtapellido.getText().equals("ESCRIBA AQUÍ")||
                        txtapellido3.getText().equals("")||txtapellido3.getText().equals("OBLIGATORIO")||txtapellido3.getText().equals("ESCRIBA AQUÍ")||
                                txtdocumento.getText().equals("")||txtdocumento.getText().equals("OBLIGATORIO")||txtdocumento.getText().equals("Sólo números"))
                                        {
                                            
           jpanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtnombre.setForeground(new java.awt.Color(255, 0, 51));
            //txtNombCliente.setText("OBLIGATORIO");
            
            //txtNombCliente2.setText("");
            
            JpanelNumeroDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número Documento : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtdocumento.setForeground(new java.awt.Color(255, 0, 51));
            //txtdocumento.setText("OBLIGATORIO");
            
            jpanelApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtapellido.setForeground(new java.awt.Color(255, 0, 51));
            //txtApellido2.setText("OBLIGATORIO");
            
            jpanelApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Apellido : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtapellido3.setForeground(new java.awt.Color(255, 0, 51));
            //txtApellido1.setText("OBLIGATORIO");
           
             //JpanelTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Documento de Identidad : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));    
                
           
             
           JOptionPane.showMessageDialog(null,"Rellene las casillas en rojo");  
        }else{
         
        String nombCliente= txtnombre.getText().toUpperCase();
        String nombCliente2= txtnombre2.getText().toUpperCase();
        String ApeCliente=txtapellido3.getText().toUpperCase();
        String ApeCliente2=txtapellido.getText().toUpperCase();
        

//"CC","TI","Pasaporte","Registro civil"
         String TI="";
         String itemSeleccionado2 = (String)cboidentificacion.getSelectedItem();
         if("CC".equals(itemSeleccionado2)){
             TI="Cédula de ciudadanía";
         }
       if("TI".equals(itemSeleccionado2)){
           TI="Tarjeta de identidad";
       }
       if("Pasaporte".equals(itemSeleccionado2)){
           TI="Pasaporte";
       }
       if("Registro civil".equals(itemSeleccionado2)){
           TI="Registro civil";
       }
        String numident=txtdocumento.getText();
        String NCM="";
        String itemSeleccionado = (String)cboCompras.getSelectedItem();
        if("1 a 10 compras".equals(itemSeleccionado)){
            NCM="1 a 10 compras";
        }else{
            if("11 a 20 compras".equals(itemSeleccionado)){
                NCM="11 a 20 compras";
            }else{
                if("21 a 30 compras".equals(itemSeleccionado)){
                    NCM="21 a 30 compras";
                }else{
                    if("31 o más compras".equals(itemSeleccionado)){
                        NCM="31 o más compras";
                    }
                }
            }
        }
            
      String[] cliente={ApeCliente2, ApeCliente,nombCliente,nombCliente2 , TI,numident, NCM};
      
      clientCont.ActualizarCliente(cliente);
      JOptionPane.showMessageDialog(null,"Se han actualizado los datos de el cliente");
 
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         MirarClientes mirarclientes= MirarClientes.getInstance();
        mirarclientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelNumeroDocumento;
    private javax.swing.JComboBox<String> cboCompras;
    private javax.swing.JComboBox<String> cboidentificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JPanel jpanelApellido;
    private javax.swing.JPanel jpanelApellido2;
    private javax.swing.JPanel jpanelNombre2;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtapellido3;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre2;
    // End of variables declaration//GEN-END:variables
}
