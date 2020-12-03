package isf.elements;

import java.io.File;

public abstract class AbstractFileSystemElement implements FileSystemElement{
	private File file;
	
	
	public AbstractFileSystemElement(File file) {
		setFile(file);
	}
	
	@Override
	public String getName() {
		return file.getName();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
