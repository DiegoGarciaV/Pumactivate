package com.prograstinadores.Pumactivate.dto;

import java.util.Map;

public interface Modelo {

    public boolean setValorAtributo(String atributo,Object valor);
    
    public boolean setValorAtributo(String atributo,String valor);

    public boolean setAtributos(Map<String,Object> atributos);

    public boolean setAtributosS(Map<String,String> atributos);

    public String toString();

    public Map<String,Object> toHMap();

    public Map<String,String> toHMapS();

    
}
