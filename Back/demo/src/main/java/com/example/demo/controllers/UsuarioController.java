package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

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
@RequestMapping("/usuarios") // Va a indicar la dirección del servidor en la que se va a activar la clase
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    // Cuando llega una petición tipo GET se ejecuta esta función
    @GetMapping()
    // Retorna todos los usuarios de tipo ArrayList
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    // Cuando llega una petición tipo POST se ejecuta esta función
    @PostMapping()
    // El parámetro RequestBody es la información dentro del cuerpo de la solicitud HTTP
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Integer id){
        return this.usuarioService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String elminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if( ok ){
            return "Usuario eliminado";
        }else{
            return "Erro eliminando el usuario";
        }
    }
}
