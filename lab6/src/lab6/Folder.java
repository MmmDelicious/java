package lab6;

import java.util.*;

public class Folder extends FileSystem implements Cloneable{
	
	private 
		
	 	ArrayList<FileSystem> fs;
	public
		
	Folder(String name) {
		this.name = name;
		this.fs = new ArrayList<FileSystem>();
		
	}
	Folder() {
		this.name = "unnamedFolder";
		this.fs = new ArrayList<FileSystem>();
		
	}	
	ArrayList<FileSystem> getFileSystem(){
		return this.fs;
	}
	
	
	
	
	
	
	
	
	boolean uniqueCheck(Folder to,String unique) {
		for(int i = 0; i<to.getFileSystem().size();i++) 
			if(to.fs.get(i).name == unique) {
				return false;
			} 
		return true;
	}
	
	void openFolder() {
		System.out.println("Содержимое папки-----" + this.name + "------------");
		for(int i = 0; i<this.getFileSystem().size();i++) {
			this.getFileSystem().get(i).toString();
			System.out.println(this.getFileSystem().get(i));
		}
	}
	
	
	void create(Folder folder) {
		if(uniqueCheck(this,folder.name)) {
			this.fs.add(folder);
		} else {
			System.out.println("Папка с именем " + folder.name + " уже существует в " + this.name);
		}
	
	
	}
	
	void create(File file) {
		if(uniqueCheck(this,file.name)) {
			this.fs.add(file);
		} else {
			System.out.println("Файл с именем " + file.name + " уже существует в " + this.name);
		}
	}
	
	void copy(Folder to,String cname) {
		if(uniqueCheck(to,cname)) {
		for(int i = 0; i<this.getFileSystem().size();i++) {
			if(this.getFileSystem().get(i).name == cname) {
				to.fs.add(getFileSystem().get(i));
				
			}
		}
		} else {
			System.out.println("Имя " + cname + " уже существует в " + this.name);
		}
	}
	
	
	void cut(Folder to,String cname) {
		if(uniqueCheck(to,cname)) {
		for(int i = 0; i<this.getFileSystem().size();i++) {
			if(this.getFileSystem().get(i).name == cname) {
				to.fs.add(getFileSystem().get(i));
				this.fs.remove(i);
			}
		}
	} else {
		System.out.println("Имя " + cname + " уже существует в " + this.name);
	}
	}
	
	
	
	
	void delete(String cname) {
		for(int i = 0; i<this.getFileSystem().size();i++) {
			if(this.getFileSystem().get(i).name == cname) {
				this.fs.remove(i);
			}
		}
	}
	
	
	
	public String toString() {
		return "Папка " + this.name;
	}
	
	
	
	public boolean equals(Folder folder) {
		if(this.fs.equals(folder.fs)&& this.name == folder.name) {
			return true;
		}
		return false;
	}
	
	
	
	public Folder clone() throws CloneNotSupportedException {
		
		
		return (Folder) super.clone();
		
	}
	
	
	
	
}
