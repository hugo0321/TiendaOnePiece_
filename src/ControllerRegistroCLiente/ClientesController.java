/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerRegistroCLiente;

import DAOClientes.DAOclientes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;



import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
    public boolean ActualizarCliente(String[] cliente) {
        int clientee=0;
        for(int i=0;i<nCliente;i++){
            for(int j=0;j<7;j++)
            if(clientes[j][i].equals(cliente[j])){
                clientee=i;
                 //System. out. println("LA FILA "+clientee);
                break;
            }
        }
        clientes[0][clientee]=cliente[0];
        clientes[1][clientee]=cliente[1];
        clientes[2][clientee]=cliente[2];
        clientes[3][clientee]=cliente[3];
        clientes[4][clientee]=cliente[4];
        clientes[5][clientee]=cliente[5];
         clientes[6][clientee]=cliente[6];
         
        return true;
    }
    

    
    @Override
    public void EliminarCliente(int codigo) {
         if( nCliente>=1)
       {
            
            int seleccion = JOptionPane.showConfirmDialog(null,"seguro desea eliminar el cliente número: "+clientes[1][codigo]+" de la lista.", "confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(seleccion==0)
            {
                for (int i=codigo;i<100;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                
                        if(clientes[j][i] !=null)
                        {
                            clientes[j][i]=clientes[j][codigo+1];   
                        }
                    }
                    codigo++;
                }
                nCliente--;
                JOptionPane.showMessageDialog(null,"eliminado exitoso");
            }
        }
       
       else
       {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");   
       }
    }
    @Override
    public boolean GuardarArchivo() {
       FileWriter fw;
        String datos="";
        boolean gDatos=false;  
        for(int i=0;i<nCliente;i++){
            for(int j=0;j<7;j++){
                if(clientes[j][i] != null)
                    datos+=clientes[j][i]+"     -     ";
            }
            datos+="\n";
        }     
        try{
            JFileChooser guardar = new JFileChooser();
            guardar.showSaveDialog(null);
            guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            //String archivo = ""+guardar.getSelectedFile();
            String ruta = ""+guardar.getCurrentDirectory();
            String nombre = guardar.getSelectedFile().getName();
            fw=new FileWriter(ruta+"\\"+nombre+".txt");
            fw.write(datos);         
            fw.close();
            gDatos=true;
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ClientesController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
        return gDatos;
    }
    
    //////////////////////////////////
    
    @Override
    
    public boolean SubirArchivo(String root) {
        FileReader fr;
        BufferedReader lector;
        boolean sDatos=false;
        int cDatUsu = 0;
        String datos = "";
        
        try{
            fr = new FileReader(root);
            if (fr.ready()){
                lector = new BufferedReader(fr);
                String cadena;
                while ((cadena =lector.readLine()) != null){
                    datos = datos + cadena + "/";
                    cDatUsu++;
                }
            }else{
                System.out.println("El archivo no esta listo...");
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
        String [] datUsu = new String[cDatUsu];
        String [] sepUsu = datos.split("/");
        for (int i = 0; i < datUsu.length; i++){
            datUsu[i] = sepUsu[i];
            String [] usuIden = datUsu[i].split("-");
            for(int j = nCliente;j < 100;j++){
                for(int k = 0;k < 7;k++){
                    clientes[k][j] = usuIden[k];
                }
                nCliente++;
                
                break;
            }
            sDatos = true;
        }
        return false;
    }
}
    
