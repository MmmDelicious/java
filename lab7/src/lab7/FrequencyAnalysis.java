
/*

������: ��������� ������. ��� ������ ������ ����� �������� ��������� ��������� ������ �
		������� ������� ������ ����� �������� � ���������; ��������� ������� ����� ����������� 
		� ���� ������� ������ (��). ��������� ����������� ����� ����� �������� ���������� 
		���������� ������ �� ����� ��������� ��������� ������ ��������������� ���� � ��. 
		��� ����� �� ���������� ������� (�� ����� ����). ����� ����� (����� �������), 
		��� �������� ��������� ���������� ����� ��� � ������ ������� ����������. 
		������ ����� ��������� �� ����� � ����������� � ���� ������ �����. 
		�� ����������� � ������� ���������� ���������.

�����: ������� ��
������: ��-21(�)
�������: 11
����: 03.06.2021
�������: ��������� �� ����������������

*/


package lab7;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyAnalysis {

	public static void printFrequencyDistances(TreeMap<Double, Integer> frequencyDistances) {
		System.out.println("  ��������� ���������� �����: ");
		for(Map.Entry<Double, Integer> it : frequencyDistances.entrySet()){
			System.out.println("	1 � " + it.getValue() + " ������� = " + String.format("%.4f", it.getKey()) + "\n");
		}
	}
	
	public static void main(String[] args) {
		
		//�������� ������� 1 ������
		FrequencyTable frequencyTable1 = new FrequencyTable();
		frequencyTable1.fillRussian("text1.txt");
		System.out.println(frequencyTable1.toString());
		
		//�������� ������� 2 ������
		FrequencyTable frequencyTable2 = new FrequencyTable();
		frequencyTable2.fillRussian("text2.txt");
		System.out.println(frequencyTable2.toString());
		
		//�������� ������� 3 ������
		FrequencyTable frequencyTable3 = new FrequencyTable();
		frequencyTable3.fillRussian("text3.txt");
		System.out.println(frequencyTable3.toString());
		
		//�������� ������� 4 ������
		FrequencyTable frequencyTable4 = new FrequencyTable();
		frequencyTable4.fillRussian("text4.txt");
		System.out.println(frequencyTable4.toString());
		
		TreeMap<Double, Integer> frequencyDistances = new TreeMap<Double, Integer>();
		frequencyDistances.put(frequencyTable1.frequencyDistance(frequencyTable2), 2);
		frequencyDistances.put(frequencyTable1.frequencyDistance(frequencyTable3), 3);
		frequencyDistances.put(frequencyTable1.frequencyDistance(frequencyTable4), 4);
		
		printFrequencyDistances(frequencyDistances);
		
		System.out.println("   �����: " + frequencyDistances.get(frequencyDistances.firstKey()) 
								  + " ����� ����� ����������� ��������� ���������� � ������ �������");
	}
}
