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
        this.setResizable(false);
       
       this.setTitle("Facturación One Piece v1.1") ;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturación One Piece v1.1");
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 230, 233));
        jLabel1.setText("Facturación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 230, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 230, 233));
        jLabel2.setText("Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        cboProducto.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        jPanel1.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 124, 28));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(223, 230, 233));
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        jPanel1.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 73, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("$0 COP");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        lblImporte.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblImporte.setForeground(new java.awt.Color(255, 255, 255));
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("$0 COP");
        jPanel1.add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 186));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, 42));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("SUBTOTAL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubtotal.setText("$0 COP");
        jPanel1.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 83, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("IVA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 94, -1));

        lblIva.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblIva.setForeground(new java.awt.Color(255, 255, 255));
        lblIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIva.setText("$0 COP");
        jPanel1.add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 83, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 94, -1));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("$0 COP");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 83, -1));

        btnQuitar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnQuitar.setText("Nueva Venta");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Regresar al Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VentasArtículos/one-piece-artwork_1280x720_xtrafondos.com.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, -300, 1850, 1330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
       btnAgregar.setBackground(new java.awt.Color(204, 255, 204));
       btnAgregar.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
      btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
       btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnAgregarMouseExited
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
