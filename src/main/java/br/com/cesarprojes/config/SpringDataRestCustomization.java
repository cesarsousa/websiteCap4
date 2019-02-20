package br.com.cesarprojes.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import br.com.cesarprojes.domain.Item;
import br.com.cesarprojes.repository.ClienteRepository;

@Component
public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Item.class, ClienteRepository.class);
	}

	
	
}
