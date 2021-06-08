package lab7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	
	public Reader() {
		
	}
	
	public ArrayList<String> createList(String fileName) {
		ArrayList<String> list = new ArrayList<String>();
		try{
			// ��������� ������ �� ����� fileName
			FileReader fr = new FileReader(fileName);
			Scanner scan = new Scanner(fr);
			// ������ ���������� ��� �������� ������� ������
			String temporary = scan.next() ;
			while (scan.hasNext()) {
				list.add(temporary);
				temporary = scan.next();
			}
			list.add(temporary);
			scan.close();
		} catch (FileNotFoundException e) {
			// ������� ������, ���� �� ������� ������� ����
			System.err.println(e);
		}
		return list;
	}
	
	public void printList(ArrayList<String> list) {
		System.out.println(" �����:");
		for(int i = 0; i < list.size(); i++) {
			System.out.print("   " + list.get(i));
			System.out.print(((i+1) % 15 == 0) ? "\n" : "");
		}
		System.out.println();
	}
}
