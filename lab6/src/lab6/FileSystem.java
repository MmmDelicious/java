package lab6;

import java.util.ArrayList;

public class FileSystem {

	private
		File file;
		Folder folder;
		
	public
	
		FileSystem() {
		this.file = null;
		this.folder = null;
	}
		
	void create(String name,String obj) {
		if(obj.equals("����")) {
			File file = new File(name,(int) (Math.random()));
			this.folder.fs.add(file);
		}
		
		else if(obj == "�����") {
			Folder folder = new Folder(name);
			this.folder.fs.add(folder);
			
		}
		else System.out.println("��� ������ �������");
	}
		
		
}
