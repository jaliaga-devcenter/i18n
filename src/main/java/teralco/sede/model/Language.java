package teralco.sede.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Language extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	@Column(unique = true, nullable = false)
	private String codigo;

	public Language(String pCodigo) {
		this.codigo = pCodigo;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String pCodigo) {
		this.codigo = pCodigo;
	}

}
