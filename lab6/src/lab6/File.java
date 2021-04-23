package lab6;

public class File extends FileSystem{

	
	private 
		int size;
		
	public
	
	File(String name,int size) {
		this.name = name;
		this.size = size;
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
		
}
