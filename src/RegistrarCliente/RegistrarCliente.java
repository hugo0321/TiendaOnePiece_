/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RegistrarCliente;

import ControllerRegistroCLiente.ClientesController;
import DAOClientes.DAOclientes;
import InterfazOnePiece.Interfaz;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class RegistrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCliente
     */
    private static RegistrarCliente registrarCliente;
    /**
     * Creates new form AgregarPokemon
     */
    private RegistrarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public static RegistrarCliente getInstance(){
        if(registrarCliente == null)
            registrarCliente=new RegistrarCliente();
        return registrarCliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipodocumento = new javax.swing.ButtonGroup();
        NumeroCompras = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelApellido2 = new javax.swing.JPanel();
        txtApellido2 = new javax.swing.JTextField();
        jPanelApellido = new javax.swing.JPanel();
        txtApellido1 = new javax.swing.JTextField();
        JpanelNumeroDocumento = new javax.swing.JPanel();
        txtdocumento = new javax.swing.JTextField();
        jPanelNombre2 = new javax.swing.JPanel();
        txtNombCliente2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtNombCliente = new javax.swing.JTextField();
        JpanelTipoDocumento = new javax.swing.JPanel();
        rbtnCC = new javax.swing.JRadioButton();
        rbtnOtro = new javax.swing.JRadioButton();
        txtTipoDocumento = new javax.swing.JTextField();
        jPanelPromedioCompras = new javax.swing.JPanel();
        rbtnUno = new javax.swing.JRadioButton();
        rbtn11 = new javax.swing.JRadioButton();
        rbtn21 = new javax.swing.JRadioButton();
        rbtn31 = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro One Piece v1.1");

        jPanel2.setBackground(new java.awt.Color(23, 192, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel1.setText("Registro de Cliente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanelApellido2.setBackground(new java.awt.Color(223, 230, 233));
        jPanelApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido 2:"));
        jPanelApellido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelApellido2MouseExited(evt);
            }
        });
        jPanelApellido2.setLayout(new java.awt.GridLayout(1, 0));

        txtApellido2.setText("ESCRIBA AQUÍ");
        txtApellido2.setBorder(null);
        txtApellido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellido2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtApellido2MouseExited(evt);
            }
        });
        txtApellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido2KeyTyped(evt);
            }
        });
        jPanelApellido2.add(txtApellido2);

        jPanel2.add(jPanelApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 102, 48));

        jPanelApellido.setBackground(new java.awt.Color(223, 230, 233));
        jPanelApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));
        jPanelApellido.setLayout(new java.awt.GridLayout(1, 0));

        txtApellido1.setText("ESCRIBA AQUÍ");
        txtApellido1.setBorder(null);
        txtApellido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellido1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtApellido1MouseExited(evt);
            }
        });
        txtApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido1KeyTyped(evt);
            }
        });
        jPanelApellido.add(txtApellido1);

        jPanel2.add(jPanelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 102, 48));

        JpanelNumeroDocumento.setBackground(new java.awt.Color(223, 230, 233));
        JpanelNumeroDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Número Documento"));
        JpanelNumeroDocumento.setLayout(new java.awt.GridLayout(1, 0));

        txtdocumento.setText("Solo números");
        txtdocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdocumentoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtdocumentoMouseExited(evt);
            }
        });
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });
        txtdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdocumentoKeyTyped(evt);
            }
        });
        JpanelNumeroDocumento.add(txtdocumento);

        jPanel2.add(JpanelNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, 50));

        jPanelNombre2.setBackground(new java.awt.Color(223, 230, 233));
        jPanelNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre 2 :"));
        jPanelNombre2.setLayout(new java.awt.GridLayout(1, 0));

        txtNombCliente2.setText("ESCRIBA AQUÍ");
        txtNombCliente2.setBorder(null);
        txtNombCliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombCliente2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNombCliente2MouseExited(evt);
            }
        });
        txtNombCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombCliente2ActionPerformed(evt);
            }
        });
        txtNombCliente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombCliente2KeyTyped(evt);
            }
        });
        jPanelNombre2.add(txtNombCliente2);

        jPanel2.add(jPanelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 102, 48));

        jPanel1.setBackground(new java.awt.Color(223, 230, 233));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre :"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        txtNombCliente.setText("ESCRIBA AQUÍ");
        txtNombCliente.setBorder(null);
        txtNombCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombClienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNombClienteMouseExited(evt);
            }
        });
        txtNombCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombClienteActionPerformed(evt);
            }
        });
        txtNombCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombCliente);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 102, 48));

        JpanelTipoDocumento.setBackground(new java.awt.Color(223, 230, 233));
        JpanelTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Documento de Identidad"));
        JpanelTipoDocumento.setLayout(new java.awt.GridLayout(1, 0));

        tipodocumento.add(rbtnCC);
        rbtnCC.setText("CC");
        JpanelTipoDocumento.add(rbtnCC);

        tipodocumento.add(rbtnOtro);
        rbtnOtro.setText("Otro");
        rbtnOtro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnOtroStateChanged(evt);
            }
        });
        JpanelTipoDocumento.add(rbtnOtro);

        txtTipoDocumento.setText("CUÁL");
        txtTipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTipoDocumentoMouseClicked(evt);
            }
        });
        txtTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDocumentoActionPerformed(evt);
            }
        });
        txtTipoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoDocumentoKeyTyped(evt);
            }
        });
        JpanelTipoDocumento.add(txtTipoDocumento);

        jPanel2.add(JpanelTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 222, 50));

        jPanelPromedioCompras.setBackground(new java.awt.Color(223, 230, 233));
        jPanelPromedioCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Número Compras Mensuales"));

        rbtnUno.setBackground(new java.awt.Color(223, 230, 233));
        NumeroCompras.add(rbtnUno);
        rbtnUno.setText("1 a 10 ");
        rbtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnUnoActionPerformed(evt);
            }
        });

        rbtn11.setBackground(new java.awt.Color(223, 230, 233));
        NumeroCompras.add(rbtn11);
        rbtn11.setText("11 a 20");
        rbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn11ActionPerformed(evt);
            }
        });

        rbtn21.setBackground(new java.awt.Color(223, 230, 233));
        NumeroCompras.add(rbtn21);
        rbtn21.setText("21 a 30");

        rbtn31.setBackground(new java.awt.Color(223, 230, 233));
        NumeroCompras.add(rbtn31);
        rbtn31.setText("31 o más");

        javax.swing.GroupLayout jPanelPromedioComprasLayout = new javax.swing.GroupLayout(jPanelPromedioCompras);
        jPanelPromedioCompras.setLayout(jPanelPromedioComprasLayout);
        jPanelPromedioComprasLayout.setHorizontalGroup(
            jPanelPromedioComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPromedioComprasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelPromedioComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelPromedioComprasLayout.setVerticalGroup(
            jPanelPromedioComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPromedioComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelPromedioCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 140));

        btnRegistrar.setBackground(new java.awt.Color(223, 230, 233));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar Cliente");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        btnEditar.setBackground(new java.awt.Color(223, 230, 233));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setText("Mirar clientes");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 117, -1));

        btnRegresar.setBackground(new java.awt.Color(223, 230, 233));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar al menú");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RegistrarCliente/desktop-1536x864.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-530, -210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombClienteActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtNombCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombCliente2ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
         Interfaz interfaz = Interfaz.getInstance();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        //jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
         DAOclientes clientCont = ClientesController.getInstance();
        if(txtNombCliente.getText().equals("")||txtNombCliente.getText().equals("OBLIGATORIO")||txtNombCliente.getText().equals("ESCRIBA AQUÍ")||
                txtApellido2.getText().equals("")||txtApellido2.getText().equals("OBLIGATORIO")||txtApellido2.getText().equals("ESCRIBA AQUÍ")||
                        txtApellido1.getText().equals("")||txtApellido1.getText().equals("OBLIGATORIO")||txtApellido1.getText().equals("ESCRIBA AQUÍ")||
                                txtdocumento.getText().equals("")||txtdocumento.getText().equals("OBLIGATORIO")||txtdocumento.getText().equals("Sólo números")||(rbtnCC.isSelected()==false&&rbtnOtro.isSelected()==false))
                                        {
                                            
           jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtNombCliente.setForeground(new java.awt.Color(255, 0, 51));
            //txtNombCliente.setText("OBLIGATORIO");
            
            //txtNombCliente2.setText("");
            
            JpanelNumeroDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número Documento : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtdocumento.setForeground(new java.awt.Color(255, 0, 51));
            //txtdocumento.setText("OBLIGATORIO");
            
            jPanelApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtApellido2.setForeground(new java.awt.Color(255, 0, 51));
            //txtApellido2.setText("OBLIGATORIO");
            
            jPanelApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Apellido : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
            txtApellido1.setForeground(new java.awt.Color(255, 0, 51));
            //txtApellido1.setText("OBLIGATORIO");
           
             JpanelTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Documento de Identidad : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));    
                
           
             
           JOptionPane.showMessageDialog(null,"Rellene las casillas en rojo");  
        }else{
         
        String nombCliente= txtNombCliente.getText().toUpperCase();
        String nombCliente2= txtNombCliente2.getText().toUpperCase();
        String ApeCliente=txtApellido2.getText().toUpperCase();
        String ApeCliente2=txtApellido1.getText().toUpperCase();
        


         String TI="";
        if (rbtnCC.isSelected()){
          
            TI=" Cédula de Ciudadanía";
        }else{
            if(rbtnOtro.isSelected()){
               
            TI=txtTipoDocumento.getText();
        }
                
            
        }
        String numident=txtdocumento.getText();
        String NCM="";
        if(rbtnUno.isSelected()){
            NCM="1 a 10 compras";
        }else{
            if(rbtn11.isSelected()){
                NCM="11 a 20 compras";
            }else{
                if(rbtn21.isSelected()){
                    NCM="21 a 30 compras";
                }else{
                    if(rbtn31.isSelected()){
                        NCM="31 o más compras";
                    }
                }
            }
        }
            
      clientCont.AgregarCliente(ApeCliente2, ApeCliente,nombCliente,nombCliente2 , TI,numident, NCM);
      NumeroCompras.clearSelection();
      tipodocumento.clearSelection();
      JOptionPane.showMessageDialog(null,"Se ha registrado el cliente");
      NuevoRegistro();
        }   
         
         
                
    }//GEN-LAST:event_btnRegistrarActionPerformed
 private void NuevoRegistro(){
     txtNombCliente.setText("");
        txtNombCliente2.setText("");
        txtApellido2.setText("");
        txtApellido1.setText("");
        txtdocumento.setText("");
        txtTipoDocumento.setText("CUÁL");
        rbtnCC.setSelected(false);
        rbtnOtro.setSelected(false);
        rbtnUno.setSelected(false);
        rbtn11.setSelected(false);
        rbtn21.setSelected(false);
        rbtn31.setSelected(false);
        //tipodocumento.setSelected((ButtonModel) rbtnCC, true);
        NumeroCompras.clearSelection();
        
 }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     MirarClientes mirarclientes= MirarClientes.getInstance();
        mirarclientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombClienteMouseClicked
        // TODO add your handling code here:
        txtNombCliente.setText("");
    }//GEN-LAST:event_txtNombClienteMouseClicked

    private void txtNombCliente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombCliente2MouseClicked
        // TODO add your handling code here:
        txtNombCliente2.setText("");
    }//GEN-LAST:event_txtNombCliente2MouseClicked

    private void txtApellido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellido1MouseClicked
        // TODO add your handling code here:
        txtApellido1.setText("");
    }//GEN-LAST:event_txtApellido1MouseClicked

    private void txtApellido2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellido2MouseClicked
        // TODO add your handling code here:
        txtApellido2.setText("");
    }//GEN-LAST:event_txtApellido2MouseClicked

    private void txtdocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdocumentoMouseClicked
        // TODO add your handling code here:
        txtdocumento.setText("");
    }//GEN-LAST:event_txtdocumentoMouseClicked

    private void txtdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocumentoKeyTyped
        // TODO add your handling code here:
          if(!Character.isDigit(evt.getKeyChar())) evt.consume();
    }//GEN-LAST:event_txtdocumentoKeyTyped

    private void txtNombClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombClienteKeyTyped
       int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    
            
     if (!(mayusculas )&&!(minusculas))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtNombClienteKeyTyped

    private void txtTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDocumentoActionPerformed

    private void txtTipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoDocumentoMouseClicked
         txtTipoDocumento.setText("");
    }//GEN-LAST:event_txtTipoDocumentoMouseClicked

    private void txtNombCliente2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombCliente2KeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
     boolean minusculas = key >= 97 && key <= 122;     
     if (!(mayusculas )&&!(minusculas))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtNombCliente2KeyTyped

    private void txtApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido1KeyTyped
        // TODO add your handling code here:
              int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
     boolean minusculas = key >= 97 && key <= 122;     
     if (!(mayusculas )&&!(minusculas))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtApellido1KeyTyped
public void camposObligatorios(){
    if((txtNombCliente.getText().equals(""))|| (txtNombCliente.getText().equals("OBLIGATORIO"))){
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
     txtNombCliente.setForeground(new java.awt.Color(255, 0, 51));
     txtNombCliente.setText("OBLIGATORIO");
    }else{
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0)));
     txtNombCliente.setForeground(new java.awt.Color(0, 0, 0));
     txtNombCliente.getText();
    }

    
}
    private void txtApellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido2KeyTyped
              int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
     boolean minusculas = key >= 97 && key <= 122;     
     if (!(mayusculas )&&!(minusculas))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtApellido2KeyTyped

    private void txtTipoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoDocumentoKeyTyped
              int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;    
     if (!(mayusculas )&&!(minusculas))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtTipoDocumentoKeyTyped

    private void txtNombClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombClienteMouseExited
//     camposObligatorios();
           
       
    }//GEN-LAST:event_txtNombClienteMouseExited

    private void txtNombCliente2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombCliente2MouseExited

        //if((txtNombCliente2.getText().equals(""))|| (txtNombCliente2.getText().equals("OPCIONAL"))){
        //jPanelNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo  : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
  
    // txtNombCliente2.setText("");
   // }else{
       // jPanelNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0)));
     //txtNombCliente2.setForeground(new java.awt.Color(0, 0, 0));
    // txtNombCliente2.getText();
   // }
    }//GEN-LAST:event_txtNombCliente2MouseExited

    private void txtApellido1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellido1MouseExited
//      if((txtApellido1.getText().equals(""))|| (txtApellido1.getText().equals("OBLIGATORIO"))){
   //     jPanelApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
   //  txtApellido1.setForeground(new java.awt.Color(255, 0, 51));
    // txtApellido1.setText("OBLIGATORIO");
   // }else{
    //    jPanelApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0)));
    // txtApellido1.setForeground(new java.awt.Color(0, 0, 0));
   //  txtApellido1.getText();
   // }
    }//GEN-LAST:event_txtApellido1MouseExited

    private void jPanelApellido2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelApellido2MouseExited

    }//GEN-LAST:event_jPanelApellido2MouseExited

    private void txtApellido2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellido2MouseExited
//        if((txtApellido2.getText().equals(""))|| (txtApellido2.getText().equals("OBLIGATORIO"))){
   //     jPanelApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Apellido : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
   //  txtApellido2.setForeground(new java.awt.Color(255, 0, 51));
  //   txtApellido2.setText("OBLIGATORIO");
  //  }else{
  //      jPanelApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Apellido : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0)));
   //  txtApellido2.setForeground(new java.awt.Color(0, 0, 0));
   //  txtApellido2.getText();
   // }
    }//GEN-LAST:event_txtApellido2MouseExited

    private void txtdocumentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdocumentoMouseExited
        // TODO add your handling code here:
     //   if((txtdocumento.getText().equals(""))|| (txtdocumento.getText().equals("OBLIGATORIO"))){
    //    JpanelNumeroDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número Documento : **", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51)));
    // txtdocumento.setForeground(new java.awt.Color(255, 0, 51));
    // txtdocumento.setText("OBLIGATORIO");
   // }else{
   //     JpanelNumeroDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número Documento : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0)));
    // txtdocumento.setForeground(new java.awt.Color(0, 0, 0));
    // txtdocumento.getText();
    //}
    }//GEN-LAST:event_txtdocumentoMouseExited

    private void rbtnOtroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnOtroStateChanged
    if(rbtnOtro.isSelected()==false){
            txtTipoDocumento.setEnabled(false);
        } else{
            txtTipoDocumento.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnOtroStateChanged

    private void rbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn11ActionPerformed

    private void rbtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnUnoActionPerformed

    /**
     *
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelNumeroDocumento;
    private javax.swing.JPanel JpanelTipoDocumento;
    private javax.swing.ButtonGroup NumeroCompras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelApellido;
    private javax.swing.JPanel jPanelApellido2;
    private javax.swing.JPanel jPanelNombre2;
    private javax.swing.JPanel jPanelPromedioCompras;
    private javax.swing.JRadioButton rbtn11;
    private javax.swing.JRadioButton rbtn21;
    private javax.swing.JRadioButton rbtn31;
    private javax.swing.JRadioButton rbtnCC;
    private javax.swing.JRadioButton rbtnOtro;
    private javax.swing.JRadioButton rbtnUno;
    private javax.swing.ButtonGroup tipodocumento;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtNombCliente;
    private javax.swing.JTextField txtNombCliente2;
    private javax.swing.JTextField txtTipoDocumento;
    private javax.swing.JTextField txtdocumento;
    // End of variables declaration//GEN-END:variables
}
