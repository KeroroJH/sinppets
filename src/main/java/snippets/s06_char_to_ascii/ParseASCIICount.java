package snippets.s06_char_to_ascii;

public class ParseASCIICount {
	
	private String txts;
	private int totalCount;
	private int countLowerCases;
	private int countUpperCases;
	private int countNumberCases;
	
	public ParseASCIICount(String txts) {
		
		this.txts = txts;
		this.totalCount = txts.length();
	}
	
	public void doParse() {
		for(int i = 0; i < totalCount; i++) {
			int ascNum = txts.charAt(i);
				if(97 <= ascNum && ascNum <= 122)
					countLowerCases++;
				if(65 <= ascNum && ascNum <= 90)
					countUpperCases++;
				if(48 <= ascNum && ascNum <= 57)
					countNumberCases++;
		}		
	}

	public String getTxts() {
		return txts;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getCountLowerCases() {
		return countLowerCases;
	}

	public int getCountUpperCases() {
		return countUpperCases;
	}

	public int getCountNumberCases() {
		return countNumberCases;
	}

	@Override
	public String toString() {
		return "ParseASCIICount [txts=" + txts + ", totalCount=" + totalCount + ", countLowerCases=" + countLowerCases
				+ ", countUpperCases=" + countUpperCases + ", countNumberCases=" + countNumberCases + "]";
	}
	
	
}
