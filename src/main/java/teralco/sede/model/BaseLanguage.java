package teralco.sede.model;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public class BaseLanguage {

	@NotEmpty
	private String idioma;

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String pIdioma) {
		this.idioma = pIdioma;
	}

}
