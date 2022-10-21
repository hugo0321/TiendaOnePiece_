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
    private String clientes[];
    private int nCliente;
    
    public static ClientesController getInstance(){
        if(instancia == null)
            instancia = new ClientesController();
        return instancia;
    }
    
    private ClientesController(){
        this.clientes=new String[100];
        this.nCliente=0;
    }
  
    @Override
    public void AgregarCliente(String cliente){
        clientes[nCliente]=cliente;
        nCliente++;
    }

   
    @Override
    public void MostrarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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