package com.prograstinadores.Pumactivate.controladores;

import java.util.List;
import java.util.Map;

import com.prograstinadores.Pumactivate.dto.Usuario;
import com.prograstinadores.Pumactivate.servicios.ConexionBD.DataUsuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    DataUsuarios dataUsuarios;

    @RequestMapping("")
    public String loginPage()
    {
        return "login.jsp";
    }

    @PostMapping("/log")
    public ResponseEntity<Usuario> loginData(@RequestBody Map<String,Object> filtros)
    {
        
        String usuario,password;
        usuario = (String)filtros.get("username");
        password = (String)filtros.get("password");

        StringBuilder filtro = new StringBuilder(" username = '");
        filtro.append(usuario).append("' ")
        .append(" AND ")
        .append(" password = '")
        .append(password).append("';");
        List<Usuario> usuariosLogin = dataUsuarios.getUsuariosFiltro(filtro.toString());

        if(usuariosLogin.size() == 1)
            return new ResponseEntity<Usuario>(usuariosLogin.get(0),HttpStatus.OK);
        else
            return new ResponseEntity<Usuario>(new Usuario(),HttpStatus.OK);
    }

    @PostMapping("/validate")
    public String login(@RequestBody Map<String,Object> filtros)
    {
        
        String usuario,password;
        usuario = (String)filtros.get("username");
        password = (String)filtros.get("password");
        if(dataUsuarios.validarUsuario(usuario,password))
            return "index.jsp";
        else
            return "logFailed.jsp";
    }
    
}
