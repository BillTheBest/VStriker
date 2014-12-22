package vStrikerEntities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_TYPE database table.
 * 
 */
@Entity
@Table(name="API_TYPE")
@NamedQuery(name="ApiType.findAll", query="SELECT a FROM ApiType a")
public class ApiType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="API_TYPE_ID")
	private int apiTypeId;

	@Column(name="API_TYPE_DESCRIPTION")
	private String apiTypeDescription;

	@Column(name="API_TYPE_NAME")
	private String apiTypeName;

	@Column(name="API_TYPE_URL")
	private String apiTypeUrl;

	//bi-directional one-to-one association to CrudOperationType
	@OneToOne
	@JoinColumn(name="API_TYPE_ID", referencedColumnName="API_TYPE_ID")
	private CrudOperationType crudOperationType;

	public ApiType() {
	}

	public int getApiTypeId() {
		return this.apiTypeId;
	}

	public void setApiTypeId(int apiTypeId) {
		this.apiTypeId = apiTypeId;
	}

	public String getApiTypeDescription() {
		return this.apiTypeDescription;
	}

	public void setApiTypeDescription(String apiTypeDescription) {
		this.apiTypeDescription = apiTypeDescription;
	}

	public String getApiTypeName() {
		return this.apiTypeName;
	}

	public void setApiTypeName(String apiTypeName) {
		this.apiTypeName = apiTypeName;
	}

	public String getApiTypeUrl() {
		return this.apiTypeUrl;
	}

	public void setApiTypeUrl(String apiTypeUrl) {
		this.apiTypeUrl = apiTypeUrl;
	}

	public CrudOperationType getCrudOperationType() {
		return this.crudOperationType;
	}

	public void setCrudOperationType(CrudOperationType crudOperationType) {
		this.crudOperationType = crudOperationType;
	}

}