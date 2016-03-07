package it.tsoru.coreaas;

import it.tsoru.coreaas.knowledge.Knowledge;

import java.util.TreeSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
@RestController
public class GreetingController {

//    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/ranking")
    public TreeSet<Conference> greeting(@RequestParam(value="abbrev") String abbrev) {
    	
    	return Knowledge.getInstance().search(abbrev);
    	
//        return new Conference(counter.incrementAndGet(),
//                            String.format(template, name));
    }
}