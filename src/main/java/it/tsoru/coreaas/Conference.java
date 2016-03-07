package it.tsoru.coreaas;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public class Conference implements Comparable<Conference> {

    private long id;
    private String name;
    private String abbrev;
    private Rank rank;
    
	public Conference(long id, String name, String abbrev, Rank rank) {
		super();
		this.id = id;
		this.name = name;
		this.abbrev = abbrev;
		this.rank = rank;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAbbrev() {
		return abbrev;
	}
	public String getRank() {
		return rank.toString();
	}

	@Override
	public String toString() {
		return "Conference [id=" + id + ", name=" + name + ", abbrev=" + abbrev
				+ ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Conference o) {
		return Long.compare(this.getId(), o.getId());
	}
   
}