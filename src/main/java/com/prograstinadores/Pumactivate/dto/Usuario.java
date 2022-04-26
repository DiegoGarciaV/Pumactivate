package com.prograstinadores.Pumactivate.dto;

import java.util.HashMap;
import java.util.Map;

public class Usuario implements Modelo{

    private long idUsuario;
    private String username;
    private String password;
    private String email;
    private int rol;

    public Usuario(){

        this.idUsuario  = 0;
        this.username   = "none";
        this.password   = "------";
        this.email      = "@host.com";
        this.rol        = 0;
        
    }

    public long getUserId(){
        return idUsuario;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }


    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }


    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }


    public void setRol(int rol){
        this.rol = rol;
    }
    public int getRol(){
        return this.rol;
    }


    @Override
    public boolean setValorAtributo(String atributo, Object valor) {
        
        switch(atributo)
        {
            case "idUsuario":
                idUsuario = (Long)valor;
                break;

            case "username":
                username = (String)valor;
                break;

            case "password":
                password = (String)valor;
                break;

            case "email":
                email = (String)valor;
                break;

            case "rol":
                rol = (Integer)valor;
                break;
            default:
                return false;
            
        }

        return true;
    }

    @Override
    public boolean setValorAtributo(String atributo, String valor) {
        
        switch(atributo)
        {
            case "idUsuario":
                idUsuario =Long.parseLong(valor);
                break;

            case "username":
                username = valor;
                break;

            case "password":
                password = valor;
                break;

            case "email":
                email = valor;
                break;

            case "rol":
                rol = Integer.parseInt(valor);
                break;
            default:
                return false;
            
        }

        return true;

    }

    @Override
    public boolean setAtributos(Map<String, Object> atributos) {
        boolean res = true;
        for(Map.Entry<String,Object> tupla : atributos.entrySet())
        {
            res = res && setValorAtributo(tupla.getKey(), tupla.getValue());
        }

        return res;
    }

    @Override
    public boolean setAtributosS(Map<String, String> atributos) {
        
        boolean res = true;
        for(Map.Entry<String,String> tupla : atributos.entrySet())
        {
            res = res && setValorAtributo(tupla.getKey(), tupla.getValue());
        }

        return res;
    }

    @Override
    public Map<String, Object> toHMap() {
        
        Map<String,Object> movimientoTo = new HashMap<>();

        movimientoTo.put("idUsuario",idUsuario);
        movimientoTo.put("username",username);
        movimientoTo.put("password",password);
        movimientoTo.put("email",email);
        movimientoTo.put("rol",rol);

        return movimientoTo;
    }

    @Override
    public Map<String, String> toHMapS() {
        
        Map<String,String> movimientoTo = new HashMap<>();

        movimientoTo.put("idUsuario",Long.toString(idUsuario));
        movimientoTo.put("username",username);
        movimientoTo.put("password",password);
        movimientoTo.put("email",email);
        movimientoTo.put("rol",Integer.toString(rol));

        return movimientoTo;
    }
    
}
