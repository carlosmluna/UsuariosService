package com.mx.lbg.bimbo.usuariosservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.lbg.bimbo.usuariosservice.model.dto.MensajeDTO;
import com.mx.lbg.bimbo.usuariosservice.model.UsuarioEntity;
import com.mx.lbg.bimbo.usuariosservice.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	IUsuarioService usuarioService;
	
	@GetMapping("/usuario-consultar")
    public ResponseEntity<List<UsuarioEntity>> consultaUsuarios() {
        List<UsuarioEntity> listUsuarios = usuarioService.consultaUsuarios();        
        if( listUsuarios.isEmpty() ) {
			return new ResponseEntity(new MensajeDTO("No existen Registros en la Base de datos"), HttpStatus.OK);
		}
        
        return new ResponseEntity(listUsuarios, HttpStatus.OK);
    }
	
	@GetMapping("/usuario-consultarPorId/{usuarioId}")
    public ResponseEntity<List<UsuarioEntity>> consultaUsuario( @PathVariable("usuarioId") String usuarioId ) {
		if( !usuarioService.existeUsuarioID(usuarioId) ) {
			UsuarioEntity usuario = new UsuarioEntity(); 
			return new ResponseEntity(usuario, HttpStatus.OK);			
		}
		
		UsuarioEntity usuarioEntity = usuarioService.consultaUsuario(usuarioId);
        return new ResponseEntity(usuarioEntity, HttpStatus.OK);
    }
	
	@PostMapping("/usuario-insertar")
	public ResponseEntity<List<UsuarioEntity>> insertarUsuario( @RequestBody UsuarioEntity usuario ) {
		UsuarioEntity usuarioEntity = usuarioService.insertarUsuario(usuario);
        return new ResponseEntity(usuarioEntity, HttpStatus.OK);
    }
	
	@PutMapping("/usuario-actualizar")
	public ResponseEntity<List<UsuarioEntity>> actualizarUsuario( @RequestBody UsuarioEntity usuario ) {		
		UsuarioEntity usuarioEntity = usuarioService.actualizarUsuario(usuario);
        return new ResponseEntity(usuarioEntity, HttpStatus.OK);
    }
	
	@DeleteMapping("/usuario-eliminar")
	public ResponseEntity<List<UsuarioEntity>> eliminarUsuario( @RequestBody UsuarioEntity usuario ) {		
		UsuarioEntity usuarioEntity = usuarioService.eliminarUsuario(usuario);
        return new ResponseEntity(usuarioEntity, HttpStatus.OK);
    } 
}
