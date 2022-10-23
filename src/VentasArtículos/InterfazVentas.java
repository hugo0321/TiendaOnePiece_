/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentasArtículos;

import InterfazOnePiece.InicioSesion;
import InterfazOnePiece.Interfaz;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo
 */
public class InterfazVentas extends javax.swing.JFrame {
    private static InterfazVentas interfazventas;
    String productos[]={"Blusa","Camisa","Gorra","Zapato","Accesorio","Figura"};
    double precios[]={30000,25500,15000,100000,10000,80000};
    double precio=0;
    int cantidad=0;
   DefaultTableModel modelo=new DefaultTableModel (); 
   ArrayList<ventas> listaVentas= new ArrayList<ventas>();
    /**
     * Creates new form InterfazVentas
     */
    private InterfazVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
       
       this.setTitle("Ventas One Piece") ;
       DefaultComboBoxModel comboModel= new DefaultComboBoxModel(productos);
       cboProducto.setModel(comboModel);
       modelo.addColumn("Descripción");
       modelo.addColumn("Precio Unidad");
       modelo.addColumn("Cantidad");
       modelo.addColumn("Importe");
       ActualizarTabla();
       CalcularPrecio();
    }
     public static InterfazVentas getInstance(){
        if(interfazventas==null)
            interfazventas=new InterfazVentas();
        return interfazventas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        lblImporte = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Facturación");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Cantidad");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Importe");

        cboProducto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        lblImporte.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("$0 COP");

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("$0 COP");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("IVA");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("TOTAL");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("SUBTOTAL");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubtotal.setText("$0 COP");

        lblIva.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIva.setText("$0 COP");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("$0 COP");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnQuitar.setText("Nueva Venta");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Regresar al Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(165, 165, 165)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(jLabel3)))))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecio)
                                .addComponent(lblImporte)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnQuitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(lblIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(cboProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblImporte))
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblSubtotal))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIva)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitar)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        // TODO add your handling code here:
        CalcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        // TODO add your handling code here:
        CalcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       ventas venta=new ventas();
       venta.setId(cboProducto.getSelectedIndex());
       venta.setDescripcion(cboProducto.getSelectedItem().toString());
       venta.setPrecio(precio);
       venta.setCantidad(cantidad);
       venta.setImporte(precio*cantidad);
       if(!buscarVenta(venta)){
           listaVentas.add(venta);
       }
      
       ActualizarTabla();
       borrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Interfaz interfaz= Interfaz.getInstance();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
       modelo.setRowCount(0);
         resetVars();   
      lblSubtotal.setText(laMoneda(0));
       lblIva.setText(laMoneda(0));
       lblTotal.setText(laMoneda(0));
         JOptionPane.showMessageDialog(null,"Ya puede continuar");
   
    }//GEN-LAST:event_btnQuitarActionPerformed
   private void resetVars(){
       listaVentas.clear();
   }
    public boolean buscarVenta(ventas nueva){
       for(ventas v: listaVentas){
           if(v.getId()==nueva.getId()){
               int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
               v.setCantidad(nuevaCantidad);
               v.setImporte(v.getPrecio()*nuevaCantidad);
               return true;
           }
       }
       return false;
   }
    public void borrarVenta(){
       precio=0;
       cantidad=1;

       cboProducto.setSelectedIndex(0);
       spnCantidad.setValue(1);
       CalcularPrecio();
   }
    public void CalcularPrecio(){
       precio=precios[cboProducto.getSelectedIndex()];
       cantidad=Integer.parseInt(spnCantidad.getValue().toString());
       lblPrecio.setText(laMoneda(precio));
       lblImporte.setText(laMoneda(precio*cantidad));
   }
   public String laMoneda(double precio){
       return "$ "+Math.round(precio)+" COP";
   }
   public void ActualizarTabla(){
       while (modelo.getRowCount () >0) {
    modelo. removeRow (0) ;
       }
       double subtotal=0;
       for(ventas v: listaVentas){
           Object x[]=new Object[4];
           x[0]=v.getDescripcion();
           x[1]=laMoneda(v.getPrecio());
           x[2]=v.getCantidad();
           x[3]=laMoneda(v.getImporte());
           subtotal+=v.getImporte();
           modelo.addRow(x);
           
       }
       double iva=subtotal*0.19;
       double total=subtotal+iva;
       lblSubtotal.setText(laMoneda(subtotal));
       lblIva.setText(laMoneda(iva));
       lblTotal.setText(laMoneda(total));
    tblProductos.setModel(modelo);
   }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
