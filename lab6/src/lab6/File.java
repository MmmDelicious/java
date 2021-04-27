package lab6;

public class File extends FileSystem implements Cloneable{

	
	private 
		int size;
		
	public
	
	File(String name,int size) {
		this.name = name;
		this.size = size;
	}
	File() {
		this.name = "unnamedFile";
		this.size = 0;
	}
	
	String getName() {
		return this.name;
	}
	
	int getSize() {
		return this.size;
	}
	
	void setSize(int size) {
		this.size = size;
	}
		
	@Override
	
	
	public String toString() {
		return "Файл " + this.name + " Размер = " + this.size;
		
	}
	
	@Override
	public File clone() throws CloneNotSupportedException {

		
		
		return (File ) super.clone();
		
	}
	
	
	public boolean equals(File file) {
		if(this.name == file.name && this.size == file.size) {
		return true;
		}
				return false;
		
	}
		
}
