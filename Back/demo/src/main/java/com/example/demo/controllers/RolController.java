package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.RolModel;
import com.example.demo.services.RolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    RolService rolService;

    @GetMapping()
    public ArrayList<RolModel> obtenerRoles(){
        return rolService.obtenerRoles();
    }

    @PostMapping()
    public RolModel guardarRol(@RequestBody RolModel rol){
        return rolService.guardarUsuario(rol);
    }

    @DeleteMapping(path = "/{id}")
    public String elminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.rolService.eliminarRol(id);
        if( ok ){
            return "Rol eliminado";
        }else{
            return "Error eliminando el rol";
        }
    }
}
