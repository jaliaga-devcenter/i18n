package teralco.sede.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long pId) {
		this.id = pId;
	}

	@Column(name = "fechaPub", unique = true)
	@Temporal(TemporalType.DATE)
	@NotNull(message = "Debe introducir la fecha de publicación.")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaPub;

	@Min(1)
	@NotNull(message = "Debe introducir el precio.")
	@Column
	private BigDecimal precio;

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "post_language", joinColumns = @JoinColumn(name = "post_id"))
	private Set<PostLanguage> language = new HashSet<>();

	public Set<PostLanguage> getLanguage() {
		return this.language;
	}

	public void setLanguage(Set<PostLanguage> pLanguage) {
		this.language = pLanguage;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal pPrecio) {
		this.precio = pPrecio;
	}

	public Date getFinishDate() {
		return this.fechaPub;
	}

	public void setFinishDate(Date finishDate) {
		this.fechaPub = finishDate;
	}

}
