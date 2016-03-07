package it.tsoru.coreaas.knowledge;

import it.tsoru.coreaas.Conference;
import it.tsoru.coreaas.Rank;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.CSVReader;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public class Knowledge {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Knowledge.class);

	private static final String[] RANKS = { "A", "B", "C" };

	private static Knowledge instance;
	
	private HashMap<Long, Conference> kb = new HashMap<>();
	private HashMap<String, TreeSet<Conference>> indexByAbbrev = new HashMap<>();

	protected Knowledge() {
		super();

	}

	public static Knowledge getInstance() {
		if (instance == null)
			instance = new Knowledge();
		return instance;
	}

	public void build() {

		for (String rank : RANKS) {

			CSVReader reader;
			try {
				
				reader = new CSVReader(new FileReader(new File("data/" + rank
						+ ".csv")));
				Iterator<String[]> it = reader.iterator();
				
				while (it.hasNext()) {
					
					String[] line = it.next();
					
					Rank r = Rank.asRank(line[4]);
					if(r == null)
						continue;
					
					Long id = Long.parseLong(line[0].trim());
					String abbrev = line[2].trim();
					Conference conf = new Conference(id, line[1].trim(), abbrev, r);
					LOGGER.info(conf.toString());
					kb.put(id, conf);
					
					TreeSet<Conference> arr;
					if(indexByAbbrev.containsKey(abbrev))
						arr = indexByAbbrev.get(abbrev);
					else {
						arr = new TreeSet<>();
						indexByAbbrev.put(abbrev, arr);
					}
					arr.add(conf);
					
				}

				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public TreeSet<Conference> search(String abbrev) {
		return indexByAbbrev.get(abbrev);
	}

}
