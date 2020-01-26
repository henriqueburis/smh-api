package br.gov.inpe.cptec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ViewLayer {

	@Id
	private int id;
	@Column(name = "layername")
	private String layername;
	@Column(name = "workspace")
	private String workspace;
	@Column(name = "uri")
	private String uri;
	@Column(name = "name")
	private String name;
	@Column(name = "source_type")
	private int source_type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLayername() {
		return layername;
	}

	public void setLayername(String layername) {
		this.layername = layername;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSource_type() {
		return source_type;
	}

	public void setSource_type(int source_type) {
		this.source_type = source_type;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 13 * hash + this.id;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ViewLayer other = (ViewLayer) obj;
		if (this.id != other.id) {
			return false;
		}
		return true;
	}

}
