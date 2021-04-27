package lab6;

import java.util.ArrayList;
import java.util.Comparator;

public class FileSystem implements Comparator<FileSystem>{

	protected String name;
	
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}

	

	@Override
	public int compare(FileSystem arg0, FileSystem arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}
		
}
