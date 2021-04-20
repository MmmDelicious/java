package lab6;

import java.util.*;

public class Folder extends FileSystem {
	
	private 
		String folderName;
	 	ArrayList<FileSystem> fs;
	public
		
		Folder(String folderName) {
			this.setFolderName(folderName);
			this.fs = new ArrayList<FileSystem>();
	}
	
	
		Folder() {
			this.setFolderName("unnamedFolder");
			this.fs = new ArrayList<FileSystem>();
	}
		
		
		public String getFolderName() {
			return folderName;
		}
		
		
		public void setFolderName(String folderName) {
			this.folderName = folderName;
		}

		public String toString() {
			return "Папка " + this.folderName;
			
		}
	
}
