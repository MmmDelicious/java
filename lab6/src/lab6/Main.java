package lab6;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	 public static void main(String[] args) throws CloneNotSupportedException {
	 
		Folder folder = new Folder("folder");
		File file = new File("file",4);
		File file1 = new File("afile",4);
		File file2 = new File("efile2",234);
		File file3 = new File("cfile3",44);
	
		Folder folder2 = new Folder("dfolder2");
		Folder folder3 = new Folder("bfolder3");
		Folder folder4 = new Folder("folder3");
		
		
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
		
		//Проверка equals 
		//System.out.println(file.equals(file1));
		//System.out.println(file.equals(file2));
		//System.out.println(folder3.equals(folder4));
		//System.out.println(folder.equals(folder4));
		//Проверка compare 
		//Collections.sort(folder.getFileSystem(), new FileSystem());
		//folder.openFolder();
		//folder2.openFolder();
		
		//Проверка clone
		//File newFile = new File("abobaFile",4);
		//File newFile1 = newFile.clone();
		//Folder newFolder = new Folder("abobaFolder");
		//Folder newFolder1 = newFolder.clone();
		
	
	
		
		
	 }
}
