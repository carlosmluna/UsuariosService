package com.mx.lbg.bimbo.usuariosservice.service;

import java.util.List;

import com.mx.lbg.bimbo.usuariosservice.model.UsuarioEntity;

public interface IUsuarioService {
	
	List<UsuarioEntity> consultaUsuarios();						// Consulta los usuarios de la base de datos
	UsuarioEntity consultaUsuario(String usuario);				// Consulta un registro usuarios de la base de datos
	UsuarioEntity insertarUsuario(UsuarioEntity usuario);		// Insertar los usuarios de la base de datos
	UsuarioEntity actualizarUsuario(UsuarioEntity usuario);		// Actualizar los usuarios de la base de datos
	UsuarioEntity eliminarUsuario(UsuarioEntity usuario);		// Eliminar los usuarios de la base de datos
	boolean existeUsuarioID(String usuario);					// Valida existencia Usuario
	
}
