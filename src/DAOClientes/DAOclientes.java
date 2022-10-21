/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOClientes;

/**
 *
 * @author Hugo
 */
public interface DAOclientes {
    
    public void AgregarCliente(String cliente,String ccliente, String tcliente,String scliente,String vcliente,String ecliente);
    public void MostrarClientes();
    public void ActualizarCliente(int codigo);
    public void EliminarCliente(int codigo);

}