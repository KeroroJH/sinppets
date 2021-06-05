package snippets.s03_is_parseable;

import java.util.ArrayList;

public class Is_parseAble {
	
	private String[] array;
	private boolean able = false;
	private int count;
	private ArrayList<Integer> parseAlbeIndexList;
	
	
	public Is_parseAble(String[] array) {
		this.array = array;
		this.count = array.length;
		this.parseAlbeIndexList = new ArrayList<>();
	}
	
	public boolean parseAble() {
		for(int i=0; i < count; i++) {
			try {
				Integer.parseInt(array[i]);
				parseAlbeIndexList.add(i);
				able = true;
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				continue;
			}
		}
		return able; 
	}

	public ArrayList<Integer> getParseAlbeIndexList() {
		return parseAlbeIndexList;
	}
	

}
