package com.everis.springbootjparelaciones.model;
// Generated 17/09/2019 04:11:00 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", catalog = "cintegracion")
public class Log implements java.io.Serializable {

	private String id;
	private Date fecha;
	private String logger;
	private String nivel;
	private String mensaje;
	private String excepcion;

	public Log() {
	}

	public Log(String id, Date fecha) {
		this.id = id;
		this.fecha = fecha;
	}

	public Log(String id, Date fecha, String logger, String nivel, String mensaje, String excepcion) {
		this.id = id;
		this.fecha = fecha;
		this.logger = logger;
		this.nivel = nivel;
		this.mensaje = mensaje;
		this.excepcion = excepcion;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false, length = 100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "logger", length = 100)
	public String getLogger() {
		return this.logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	@Column(name = "nivel", length = 100)
	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Column(name = "mensaje", length = 65535)
	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Column(name = "excepcion", length = 65535)
	public String getExcepcion() {
		return this.excepcion;
	}

	public void setExcepcion(String excepcion) {
		this.excepcion = excepcion;
	}

}