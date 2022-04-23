package com.prograstinadores.Pumactivate.configuracion;

import java.util.HashMap;

import com.prograstinadores.Pumactivate.servicios.ConexionBD.ConexionDatos;
import com.prograstinadores.Pumactivate.servicios.ConexionBD.ConexionDatosImp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.prograstinadores.Pumactivate.configuration","com.prograstinadores.Pumactivate.service"})
public class Configuracion {
    
    @Bean
    public ConexionDatos conexionDatos() {

        ConexionDatos conexionDatos = new ConexionDatosImp();
        HashMap<String,String> BDparams = new HashMap<>();

        BDparams.put("driver", "com.mysql.cj.jdbc.Driver");
        BDparams.put("host", "localhost");
        BDparams.put("port", "3306");
        BDparams.put("username", "root");
        BDparams.put("password", "1234");
        BDparams.put("database", "paletas");
        conexionDatos.setBDparams(BDparams);
        return conexionDatos;
  }

}
