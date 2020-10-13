package com.mx.lbg.bimbo.usuariosservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
	// Declaro los atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id_usuario;
	private String usuario;
	private String password;
	private int    administrador;
	private String creado_por;
	private String modificado_por;
	private String descripcion;
	// private Date   fecha_alta;
	// private Date   fecha_moficica;
	
	
	// Metodos Contructores de la clase
	public UsuarioEntity() { }
	
	public UsuarioEntity(int id_usuario, String usuario, String password, int administrador, String creado_por, 
			String modificado_por, String descripcion) { //, Date fecha_alta, Date fecha_moficica) {
		this.id_usuario     = id_usuario;
		this.usuario 	    = usuario;
		this.password       = password;
		this.administrador  = administrador;
		this.creado_por     = creado_por;
		this.modificado_por = modificado_por;
		this.descripcion    = descripcion;
		/* this.fecha_alta     = fecha_alta;
		this.fecha_moficica = fecha_moficica; */
	}
	

	// Metodos Getter y Setters de los atributos
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAdministrador() {
		return administrador;
	}
	public void setAdministrador(int administrador) {
		this.administrador = administrador;
	}
	public String getCreado_por() {
		return creado_por;
	}
	public void setCreado_por(String creado_por) {
		this.creado_por = creado_por;
	}
	public String getModificado_por() {
		return modificado_por;
	}
	public void setModificado_por(String modificado_por) {
		this.modificado_por = modificado_por;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/* public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public Date getFecha_moficica() {
		return fecha_moficica;
	}
	public void setFecha_moficica(Date fecha_moficica) {
		this.fecha_moficica = fecha_moficica;
	} */
	

	@Override
	public String toString() {
		return "UsuarioEntity [id_usuario=" + id_usuario + ", usuario=" + usuario + ", password=" + password
				+ ", administrador=" + administrador + ", creado_por=" + creado_por + ", modificado_por="
				+ modificado_por + ", descripcion=" + descripcion + "]"; // + ", fecha_alta=" + fecha_alta + ", fecha_moficica=" + fecha_moficica + "]"; */
	}
}
