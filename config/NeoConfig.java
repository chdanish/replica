/*package so.pickme.replica.config;
  
 import javax.annotation.PostConstruct;

import org.neo4j.graphdb.GraphDatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.core.GraphDatabase;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.data.neo4j.rest.SpringCypherRestGraphDatabase;
 
  
  @EnableNeo4jRepositories(basePackages = "so.pickme.repository")
  @EnableTransactionManagement(mode = AdviceMode.PROXY)
  @Configuration
  public class NeoConfig extends Neo4jConfiguration  {
  	private final Logger log = LoggerFactory.getLogger(NeoConfig.class);
     public NeoConfig() {
         setBasePackage("so.pickme.replica.domain");
     }
     
	@Autowired
	GraphDatabase graphDatabase;
  
    @Autowired
    private PlatformTransactionManager transactionManager;

    @Bean(destroyMethod = "shutdown")
    public GraphDatabaseService graphDatabaseService() {
    	        return new SpringCypherRestGraphDatabase("http://localhost:7474/db/data","neo4j", "neo4j2319");
    	 }
    	
    @Bean
    @PostConstruct
    public Neo4jTemplate neo4jTemplate() {
 	   return new Neo4jTemplate(graphDatabase, transactionManager);
    }

  	
  
  } */
  
 /* neoconfig for SDN less than 4*/