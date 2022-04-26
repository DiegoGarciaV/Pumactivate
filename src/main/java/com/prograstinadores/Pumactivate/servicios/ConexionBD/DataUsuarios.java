package com.prograstinadores.Pumactivate.servicios.ConexionBD;

import java.util.List;

import com.prograstinadores.Pumactivate.dto.Usuario;

public interface DataUsuarios {

    public boolean validarUsuario(String usuario, String password);

    public List<Usuario> getUsuarios();

    public Usuario getUsuarioId(int idProducto);

    public List<Usuario> getUsuariosFiltro(String filtro);
    
}
