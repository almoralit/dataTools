package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired // Una notación que le indica a Spring que ya existe una instancia
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        /* El metodo <save> regresa toda la misma información insertada en la base, pero
        * adicionando el id generado en la BD
        */
        return usuarioRepository.save(usuario); 
    }

    /**
     * El tipo <Optional> se usa para que no falle en caso que no se envíe el parametro <id>
     * en la consulta
     */
    public Optional<UsuarioModel> obtenerPorId(Integer id){
        return usuarioRepository.findById(id);
    }

    public boolean eliminarUsuario(Integer id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
