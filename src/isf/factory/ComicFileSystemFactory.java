package isf.factory;

import java.io.File;

import isf.elements.Directory;
import isf.elements.FileSystemElement;
import isf.elements.GenericFile;
import isf.stringtable.StringTable;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;

public class ComicFileSystemFactory implements FileSystemElementFactory {

	@Override
	public TreeItem<FileSystemElement> createFileSystemElement(File file) {
		if (file.isDirectory()) {
			return new TreeItem<FileSystemElement>(new Directory(file), new ImageView(StringTable.ICONS_STYLE_1_FOLDER_ICON));
		} else {

			return new TreeItem<FileSystemElement>(new GenericFile(file), new ImageView(StringTable.ICONS_STYLE_1_TXT_PNG));
		}
	}

}
