package lab7;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyTable {

	private TreeMap<Character, Double> table;
	
	public FrequencyTable() {
		this.table = new TreeMap<Character, Double>();
	} 
	
	
	private int addWordToTable(String word) {
		int lettersCount = 0;
		String newWord = word.toLowerCase();
		for(int i = 0; i < newWord.length(); i++) {
			char temp = newWord.charAt(i);
			if(this.table.containsKey(temp)) {
				this.table.put(temp, this.table.get(temp) + 1);
				lettersCount++;
			}
		}
		return lettersCount;
	}
	
	private void addListToTable(ArrayList<String> list) {
		int letterCount = 0;
		for(int i = 0; i < list.size(); i++) {
			letterCount += addWordToTable(list.get(i));
		}
		
		for(Map.Entry<Character, Double> it : this.table.entrySet()){
			this.table.put(it.getKey(), this.table.get(it.getKey()) / letterCount * 100);
		}
	}
	
	public void fillRussianLetters() {
		for(char ch = 'а'; ch <= 'я'; ch++) {
			this.table.put(ch, 0.0);
		}
	}
	
	public void fillRussian(String path) {
		Reader reader = new Reader();
		fillRussianLetters();
		ArrayList<String> list = reader.createList(path);
		reader.printList(list);
		addListToTable(list);
	}
	
	public double frequencyDistance(FrequencyTable frequencyTable) {
		double result = 0.0;
		for(Map.Entry<Character, Double> it : this.table.entrySet()){;
			result += Math.pow(it.getValue() - frequencyTable.table.get(it.getKey()), 2);
		}
		result = Math.sqrt(result);
		return result;
	}
	
	
	
	public String toString() {
		String result = "\n  Таблица частот: \n";
		int counter = 1;
		for(Map.Entry<Character, Double> it : this.table.entrySet()){
			result += "   " + it.getKey() + " = " + String.format("%.2f", it.getValue()) + "%";
			result += (counter++ % 10 == 0) ? "\n" : "";
		}
		result += "\n";
		return result;
	}
}
