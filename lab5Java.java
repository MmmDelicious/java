package lab5Java;

import java.io.*;
import java.util.*;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class lab5Java {
	
	//Функция создаёт файл
	public static void createFile(String filename) {
		try {
			File file = new File(filename + ".txt");

			if (!file.exists()) {
				file.createNewFile();
			}

		} catch (IOException e) {
			System.out.print("Error" + e);
		}

	}

	//Вспомогательная функция рандома
	public static int rnd(int min, int max) {
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}
	//Функция достаёт из строки число через регулярое выражение
	public static int takeMark(String s) {
		Pattern pat = Pattern.compile("\\d+");
		
		Matcher matcher = pat.matcher(s);
		Integer num = 0;
		matcher.find();
		s = matcher.group();
		
		num = Integer.valueOf(s);
		return num;
	}

	//Функция записыает в файл случайные фамилии и оценки из массива
	public static void fillfile(String filename) {

		int rand = rnd(10, 30);

		String[] surnames = new String[] { "Александров", "Баранов", "Овечкин", "Исаев", "Романов", "Шаломенцев",
				"Северов", "Ткаченко", "Мухина", "Степнова", "Кустова", "Маринина", "Андреева", "Митрохина" };
		int[] marks = new int[rand];

		for (int i = 0; i < rand; i++) {
			marks[i] = rnd(60, 100);
		}

		try (PrintWriter writer = new PrintWriter(filename + ".txt")) {

			for (int i = 0; i < rand; i++) {

				Random random = new Random();
				int dataSurnames = random.nextInt(surnames.length);
				writer.print(surnames[dataSurnames] + " ");
				int dataMark = random.nextInt(marks.length);
				writer.print(marks[dataMark] + " ");
				writer.println();

			}

		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}

	}
	//Фукция считает средний балл егэ
	public static int averageMark(String filename) {
		int average = 0;
		int it = 0;
		try {

			FileReader fr = new FileReader(filename + ".txt");
			// создаем BufferedReader с существующего FileReader для построчного считывания
			BufferedReader reader = new BufferedReader(fr);
			// считаем сначала первую строку
			String line = reader.readLine();

			while (line != null) {
				average += takeMark(line);
				it++;
				line = reader.readLine();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return average / it;

	}
	//Функция заполняет создаёт а потом заполняет выходной файл
	public static void output(String input, String output) {
		int average = averageMark(input);
		createFile(output);
		ArrayList<String> outputData = new ArrayList<String>();

		try {

			FileReader fr = new FileReader(input + ".txt");
			// создаем BufferedReader с существующего FileReader для построчного считывания
			BufferedReader reader = new BufferedReader(fr);
			// считаем сначала первую строку
			String line = reader.readLine();

			while (line != null) {

				if (takeMark(line) > average) {
					outputData.add(line);
				}
			
				line = reader.readLine();

			}
			Collections.sort(outputData);

			try (PrintWriter writer = new PrintWriter(output + ".txt")) {

				for (int i = 0; i < outputData.size(); i++) {

					writer.println(outputData.get(i));

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String input = "input";
		String output = "output";

		createFile(input);

		fillfile(input);
		System.out.println("Средний балл " + averageMark(input));

		output(input, output);
	}
}
