/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerRegistroCLiente;

import DAOClientes.DAOclientes;

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
        this.clientes=new String [6][100];
        this.nCliente=0;
    }
  
    @Override
    public void AgregarCliente(String cliente,String ccliente, String tcliente,String scliente,String vcliente,String ecliente){
        clientes[0][nCliente]=cliente;
        clientes[1][nCliente]=ccliente;
        clientes[2][nCliente]=tcliente;
        clientes[3][nCliente]=scliente;
        clientes[4][nCliente]=vcliente;
        clientes[5][nCliente]=ecliente;
           // cliente ccliente tcliente scliente vcliente ecliente
  
        nCliente ++;
    }

   
    @Override
    public void MostrarClientes() {
       for(int i=0;i<nCliente;i++){
            System.out.println("pokemon "+(i+1)+": "+clientes[i]);
    }
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