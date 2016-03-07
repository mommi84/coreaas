package it.tsoru.coreaas;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public enum Rank {
	
	A_STAR("A*", 1),
	A("A", 2),
	B("B", 3),
	C("C", 4);
	
	public final String str;
	public final int pos;
	
	Rank(String str, int pos) {
		this.str = str;
		this.pos = pos;
	}
	
	public boolean betterThan(Rank r) {
		return this.pos < r.pos;
	}

	public boolean worseThan(Rank r) {
		return this.pos > r.pos;
	}

	public boolean sameLevelOf(Rank r) {
		return this.pos == r.pos;
	}
	
	public static Rank asRank(String s) {
		for(Rank r : Rank.values())
			if(r.str.equals(s))
				return r;
		return null;
	}
	
	@Override
	public String toString() {
		return this.str;
	}
	
}
