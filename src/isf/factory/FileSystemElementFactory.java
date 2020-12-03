package isf.factory;

import java.io.File;

import isf.elements.FileSystemElement;
import javafx.scene.control.TreeItem;

public interface FileSystemElementFactory {
	
	public TreeItem<FileSystemElement> createFileSystemElement(File file);
	
	
	/**
	 * This method returns the file extension from a java.io File.
	 */
	public default String getFileExtension(File file) {
		return file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf(".") + 1);
	}
}
