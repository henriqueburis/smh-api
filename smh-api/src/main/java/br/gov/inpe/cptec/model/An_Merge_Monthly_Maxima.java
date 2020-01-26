package br.gov.inpe.cptec.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class An_Merge_Monthly_Maxima {

	@Id
	private BigInteger fid;
	@Column(name = "geocodigo")
	private String geocodigo;
	@Column(name = "valor_merge_maxima")
	private BigDecimal valor_merge_maxima;
	@Column(name = "valor_maxima")
	private BigDecimal valor_maxima;
	@Column(name = "mes")
	private String mes;
	@Column(name = "nome1")
	private String nome1;
	@Column(name = "uf")
	private String uf;
	@Column(name = "ano")
	private double ano;

	public BigInteger getFid() {
		return fid;
	}

	public void setFid(BigInteger fid) {
		this.fid = fid;
	}

	public String getGeocodigo() {
		return geocodigo;
	}

	public void setGeocodigo(String geocodigo) {
		this.geocodigo = geocodigo;
	}

	public BigDecimal getValor_merge_maxima() {
		return valor_merge_maxima;
	}

	public void setValor_merge_maxima(BigDecimal valor_merge_maxima) {
		this.valor_merge_maxima = valor_merge_maxima;
	}

	public BigDecimal getValor_maxima() {
		return valor_maxima;
	}

	public void setValor_maxima(BigDecimal valor_maxima) {
		this.valor_maxima = valor_maxima;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getAno() {
		return ano;
	}

	public void setAno(double ano) {
		this.ano = ano;
	}

}
