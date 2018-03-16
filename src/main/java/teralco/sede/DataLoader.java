package teralco.sede;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import teralco.sede.model.Language;
import teralco.sede.repository.LanguageRepository;

@Component
public class DataLoader implements ApplicationRunner {

	private LanguageRepository languageRepository;

	@Autowired
	public DataLoader(LanguageRepository pLanguageRepository) {
		this.languageRepository = pLanguageRepository;
	}

	@Override
	public void run(ApplicationArguments args) {
		this.languageRepository.save(new Language("es"));
		this.languageRepository.save(new Language("en"));
		this.languageRepository.save(new Language("va"));
	}
}
