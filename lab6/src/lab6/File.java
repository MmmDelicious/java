package lab6;

public class File extends FileSystem{

	
	private 
		int size;
		String filename;
	public
		File(String filename,int size) {
		this.filename = filename;
		this.size = size;
	}
	
		File(){
			this.filename = "unnamedFile";
			this.size = 1;
		}
		
		
		String getFilename() {
			return filename;
		}
		
		int getSize() {
			return size;
		}
		
	
		
		
		 @Override
		    public String toString() {
		        return "ָלÿ פאיכא = " + this.filename + " נאחלונ פאיכא = " + this.size;
		    }

	
		
		
		
		
		
		
		
}
