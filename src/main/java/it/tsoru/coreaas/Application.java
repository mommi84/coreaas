package it.tsoru.coreaas;

import it.tsoru.coreaas.knowledge.Knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	
    	Knowledge.getInstance().build();
    	
        SpringApplication.run(Application.class, args);
    }
}