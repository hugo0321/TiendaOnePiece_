/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerRegistroCLiente;

import DAOClientes.DAOclientes;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo
 */
public class ClientesController implements DAOclientes{
    
    private static ClientesController instancia;
    private String clientes[][];
    private int nCliente;
    
    public static ClientesController getInstance(){
        if(instancia == null)
            instancia = new ClientesController();
        return instancia;
    }
    
    private ClientesController(){
        this.clientes=new String [7][100];
        this.nCliente=0;
    }
  
    @Override
    public boolean AgregarCliente(String cliente,String ccliente, String tcliente,String scliente,String vcliente,String ecliente, String zcliente){
        clientes[0][nCliente]=cliente;
        clientes[1][nCliente]=ccliente;
        clientes[2][nCliente]=tcliente;
        clientes[3][nCliente]=scliente;
        clientes[4][nCliente]=vcliente;
        clientes[5][nCliente]=ecliente;
        clientes[6][nCliente]=zcliente;
           // cliente ccliente tcliente scliente vcliente ecliente
  
        nCliente ++;
        return true;
    }
    @Override
    public boolean AgregarCliente(String[] cliente){
         clientes[0][nCliente]=cliente[0];
        clientes[1][nCliente]=cliente[1];
        clientes[2][nCliente]=cliente[2];
        clientes[3][nCliente]=cliente[3];
        clientes[4][nCliente]=cliente[4];
        clientes[5][nCliente]=cliente[5];
        clientes[6][nCliente]=cliente[6];
           // cliente ccliente tcliente scliente vcliente ecliente
  
        nCliente ++;
        return true;
    }

   
    @Override
    public DefaultTableModel MostrarClientes() {
      DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Segundo Apellido");
        modelo.addColumn("Primer Nombre");
        modelo.addColumn("Segundo Nombre");
        modelo.addColumn("Tipo de identificación");
        modelo.addColumn("Número de identificación");
        modelo.addColumn("Compras Mensuales");
    // filas para mostrar los clientes
        
        for(int i=0;i<100;i++){
            String[] cliente=new String[7];
            for(int j=0;j<7;j++){
            
                if(clientes[j][i] != null)
                    cliente[j]=clientes[j][i];
            }
            modelo.addRow(cliente);
        }
        return modelo;
    
    
    }

    @Override
    public void ActualizarCliente(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void EliminarCliente(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}