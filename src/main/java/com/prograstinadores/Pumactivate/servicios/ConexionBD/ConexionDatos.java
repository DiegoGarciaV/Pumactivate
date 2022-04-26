package com.prograstinadores.Pumactivate.servicios.ConexionBD;

import java.util.Map;
import java.util.List;

public interface ConexionDatos {

    public boolean abrirConexionBD();

    public boolean cerrarConexionBD();

    public String getBDNombre();

    public void setBDparams(Map<String,String> BDpametros);
    
    public Map<String,String> getBDparams();
   
    public int insertarDatos(String tabla,Map<String,String> valores);

    public boolean login(String tabla, String uField, String pField, String username, String password);

    public List<Map<String,String>> consultaQuery(String sqlq);

    public List<Map<String,String>> ejecProc(String proc, List<Object> params);

    public int eliminaDatos(String tabla, String criterio);
}
