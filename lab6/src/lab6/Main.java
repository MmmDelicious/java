package lab6;

public class Main {
	 public static void main(String[] args) {
	 
		Folder folder = new Folder("folder");
		File file = new File("file",4);
		File file1 = new File("file",4);
		File file2 = new File("file2",234);
		File file3 = new File("file3",44);
	
		Folder folder2 = new Folder("folder2");
		Folder folder3 = new Folder("folder3");
		Folder folder4 = new Folder("folder2");
		
		
		//Заполнение корневой папки
		folder.create(file);
		folder.create(file2);
		folder.create(file3);
		
		folder.create(folder2);
		folder.create(folder3);
		//Проверка на уникальность
		//folder.create(file1);
		//folder.create(folder4);
		
		//Проверка копирования
		//folder.copy(folder2, "file3");
		//folder.copy(folder2, "folder3");
		
		//Проверка уникальности
		//folder.copy(folder2, "file3");
		//folder.copy(folder2, "folder3");
		
		
		//Проверка переноса
		//folder.cut(folder2, "file3");
		//folder.cut(folder2, "folder3");
		
		
		//Проверка удаления
		//folder2.delete("file3");
		//folder2.delete("folder3");
		
		
		
		folder.openFolder();
		folder2.openFolder();
		
		
	
		
	 }
}
