package br.gov.inpe.cptec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Municipios {

	@Id
	private int fid;
	@Column(name = "geocodigo")
	private String geocodigo;
	@Column(name = "nome1")
	private String nome1;
	@Column(name = "latitude")
	private double latitude;
	@Column(name = "longitude")
	private double longitude;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getGeocodigo() {
		return geocodigo;
	}

	public void setGeocodigo(String geocodigo) {
		this.geocodigo = geocodigo;
	}

	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
