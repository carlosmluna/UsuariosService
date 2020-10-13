package com.mx.lbg.bimbo.usuariosservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mx.lbg.bimbo.usuariosservice.model.UsuarioEntity;


@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
	List<UsuarioEntity> findAll();
	UsuarioEntity findByUsuario( String usuario );
	boolean existsByUsuario(String usuario);
}
