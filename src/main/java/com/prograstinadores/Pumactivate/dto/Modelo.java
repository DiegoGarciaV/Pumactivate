package com.prograstinadores.Pumactivate.dto;

import java.util.HashMap;

public interface Modelo {

    public boolean setValorAtributo(String atributo,Object valor);
    
    public boolean setValorAtributo(String atributo,String valor);

    public boolean setAtributos(HashMap<String,Object> atributos);

    public boolean setAtributosS(HashMap<String,String> atributos);

    public String toString();

    public HashMap<String,Object> toHMap();

    public HashMap<String,String> toHMapS();

    
}
