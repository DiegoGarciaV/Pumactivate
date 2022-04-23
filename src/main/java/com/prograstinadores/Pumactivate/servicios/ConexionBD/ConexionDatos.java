package com.prograstinadores.Pumactivate.servicios.ConexionBD;

import java.util.HashMap;
import java.util.LinkedList;

public interface ConexionDatos {

    public boolean abrirConexionBD();

    public boolean cerrarConexionBD();

    public String getBDNombre();

    public void setBDparams(HashMap<String,String> BDpametros);
    
    public HashMap<String,String> getBDparams();
   
    public int insertarDatos(String tabla,HashMap<String,String> valores);

    public LinkedList<HashMap<String,String>> consultaQuery(String sqlq);

    public LinkedList<HashMap<String,String>> ejecProc(String proc, LinkedList<Object> params);

    public int eliminaDatos(String tabla, String criterio);
}
