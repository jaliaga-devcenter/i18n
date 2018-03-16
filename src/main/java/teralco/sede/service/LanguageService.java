package teralco.sede.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import teralco.sede.model.Language;
import teralco.sede.repository.LanguageRepository;

public class LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageService(LanguageRepository pLanguageRepository) {
		this.languageRepository = pLanguageRepository;
	}

	public Iterable<Language> list() {
		return this.languageRepository.findAll();
	}

	public Optional<Language> get(Long id) {
		return this.languageRepository.findById(id);
	}

	// save
	public Language save(Language pLanguage) {
		return this.languageRepository.save(pLanguage);
	}
}
