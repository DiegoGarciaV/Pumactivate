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
@RequestMapping("api/usuarios")
public class ApiUsuarios {

    @Autowired
    DataUsuarios dataUsuarios;

    @PostMapping("filtro")
    public ResponseEntity<List<Usuario>> getUsuariosFiltro(@RequestBody List<Map<String,Object>> filtros)
    {
        return new ResponseEntity<List<Usuario>>(dataUsuarios.getUsuarios(), HttpStatus.OK);
    }

    
}
