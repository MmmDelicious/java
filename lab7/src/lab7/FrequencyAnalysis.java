
/*

Задача: Частотный анализ. Для любого текста можно провести частотный буквенный анализ –
		подсчет частоты каждой буквы алфавита в процентах; результат анализа можно представить 
		в виде таблицы частот (ТЧ). Частотным расстоянием между двумя текстами называется 
		квадратный корень из суммы квадратов разностей частот соответствующих букв в ТЧ. 
		Дан набор из нескольких текстов (не менее двух). Найти текст (кроме первого), 
		для которого частотное расстояние между ним и первым текстом минимально. 
		Каждый текст прочитать из файла и представить в виде списка строк. 
		ТЧ представить с помощью подходящей коллекции.

Автор: Дектерёв Ян
Группа: ПИ-21(э)
Вариант: 11
Дата: 03.06.2021
Предмет: Практикум по программированию

*/


package lab7;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyAnalysis {

	public static void printFrequencyDistances(TreeMap<Double, Integer> frequencyDistances) {
		System.out.println("  Частотное расстояние между: ");
		for(Map.Entry<Double, Integer> it : frequencyDistances.entrySet()){
			System.out.println("	1 и " + it.getValue() + " текстом = " + String.format("%.4f", it.getKey()) + "\n");
		}
	}
	
	public static void main(String[] args) {
		
		//создание таблицы 1 частот
		FrequencyTable frequencyTable1 = new FrequencyTable();
		frequencyTable1.fillRussian("text1.txt");
		System.out.println(frequencyTable1.toString());
		
		//создание таблицы 2 частот
		FrequencyTable frequencyTable2 = new FrequencyTable();
		frequencyTable2.fillRussian("text2.txt");
		System.out.println(frequencyTable2.toString());
		
		//создание таблицы 3 частот
		FrequencyTable frequencyTable3 = new FrequencyTable();
		frequencyTable3.fillRussian("text3.txt");
		System.out.println(frequencyTable3.toString());
		
		//создание таблицы 4 частот
		FrequencyTable frequencyTable4 = new FrequencyTable();
		frequencyTable4.fillRussian("text4.txt");
		System.out.println(frequencyTable4.toString());
		
		TreeMap<Double, Integer> frequencyDistances = new TreeMap<Double, Integer>();
		frequencyDistances.put(frequencyTable1.frequencyDistance(frequencyTable2), 2);
		frequencyDistances.put(frequencyTable1.frequencyDistance(frequencyTable3), 3);
		frequencyDistances.put(frequencyTable1.frequencyDistance(frequencyTable4), 4);
		
		printFrequencyDistances(frequencyDistances);
		
		System.out.println("   ОТВЕТ: " + frequencyDistances.get(frequencyDistances.firstKey()) 
								  + " текст имеет минимальное частотное расстояние с первым текстом");
	}
}
