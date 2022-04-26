package com.prograstinadores.Pumactivate.servicios.ConexionBD;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.prograstinadores.Pumactivate.dto.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataUsuariosImp implements DataUsuarios{

    @Autowired
    ConexionDatos conexionDatos;

    @Override
    public List<Usuario> getUsuarios() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Usuario getUsuarioId(int idUsuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Usuario> getUsuariosFiltro(String filtro) {
        
        return consultaUsuariosSQL("select * from users WHERE " + filtro);

    }


    private List<Usuario> consultaUsuariosSQL(String sql)
    {
        List<Usuario> usuarios = new LinkedList<>();
        List<Map<String,String>> usuariosBD;
        if(conexionDatos.abrirConexionBD())
        {
            usuariosBD = conexionDatos.consultaQuery(sql);
            conexionDatos.cerrarConexionBD();    
            
            for(Map<String,String> registro : usuariosBD)
            {
                Usuario usuario = new Usuario();
                usuario.setAtributosS(registro);
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    @Override
    public boolean validarUsuario(String usuario, String password) {
        
        if(conexionDatos.abrirConexionBD())
        {
            if(conexionDatos.login("users", "username", "password", usuario, password))
            {
                conexionDatos.cerrarConexionBD();   
                return true;
            }
                 
            conexionDatos.cerrarConexionBD();
            
        }
        return false;
    }
    
}
