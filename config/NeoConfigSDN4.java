package so.pickme.replica.config;
  

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Configuration
@EnableNeo4jRepositories(basePackages={"so.pickme.repository"})
public class NeoConfigSDN4 extends Neo4jConfiguration {

	@Override
	public SessionFactory getSessionFactory() {
		return new SessionFactory(getConfiguration(), "so.pickme.replica.domain");
	}

	@Bean
	public org.neo4j.ogm.config.Configuration getConfiguration() {
		org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
		config.driverConfiguration().setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver").setURI("http://neo4j:neo4j2319@neo4j-pickme.rhcloud.com");
		return config;
	}

}
  
 /* neoconfig for SDN more than 4*/