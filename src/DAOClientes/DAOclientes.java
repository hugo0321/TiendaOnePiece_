/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOClientes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo
 */
public interface DAOclientes {
    
    public boolean AgregarCliente(String cliente,String ccliente, String tcliente,String scliente,String vcliente,String ecliente, String zcliente);
    public boolean AgregarCliente(String[] cliente);
    public DefaultTableModel MostrarClientes();
    public boolean ActualizarCliente(String [] cliente);
    public void EliminarCliente(int codigo);
    public boolean GuardarArchivo();
    public boolean SubirArchivo(String root);

}