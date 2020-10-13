package com.mx.lbg.bimbo.usuariosservice.service;

import java.util.List;

import com.mx.lbg.bimbo.usuariosservice.exception.CustomException;
import com.mx.lbg.bimbo.usuariosservice.model.UsuarioEntity;
import com.mx.lbg.bimbo.usuariosservice.repository.IUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	IUsuarioRepository usuarioRepository;
	
	
	
	@Override
	// Consulta los usuarios de la base de datos
	public List<UsuarioEntity> consultaUsuarios() {
		try {
			List<UsuarioEntity> usuariosEntity = usuarioRepository.findAll();
			return usuariosEntity;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error");
		}
	}

	@Override
	// Consulta los usuarios de la base de datos
	public UsuarioEntity consultaUsuario(String usuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioRepository.findByUsuario(usuario);
			return usuarioEntity;
		} catch(CustomException e) {
			throw e; 
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error");
		}
	}

	@Override
	// Insertar los usuarios de la base de datos
	public UsuarioEntity insertarUsuario(UsuarioEntity usuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioRepository.save(usuario);
			return usuarioEntity;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-insertar");
		}
	}

	@Override
	// Actualizar los usuarios de la base de datos
	public UsuarioEntity actualizarUsuario(UsuarioEntity usuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioRepository.save(usuario);
			return usuarioEntity;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-actualizar");
		}
	}

	@Override
	// Eliminar los usuarios de la base de datos
	public UsuarioEntity eliminarUsuario(UsuarioEntity usuario) {
		try {
			usuarioRepository.delete(usuario);
			return usuario;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-eliminar");
		} 
	}

	@Override
	public boolean existeUsuarioID(String usuario) {
		try {
			boolean existe = usuarioRepository.existsByUsuario(usuario);
			return existe;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-eliminar");
		} 
	}

}
