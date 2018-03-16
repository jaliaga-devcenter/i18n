package teralco.sede.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class PostLanguage extends BaseLanguage {

	@NotNull
	private String texto;

	@NotNull
	private String tema;

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String pTexto) {
		this.texto = pTexto;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String pTema) {
		this.tema = pTema;
	}
}
