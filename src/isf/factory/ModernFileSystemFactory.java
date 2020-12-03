package isf.factory;

import java.io.File;

import isf.elements.Directory;
import isf.elements.FileSystemElement;
import isf.elements.GenericFile;
import isf.elements.PdfFile;
import isf.elements.TxtFile;
import isf.stringtable.StringTable;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;

public class ModernFileSystemFactory implements FileSystemElementFactory {

	@Override
	public TreeItem<FileSystemElement> createFileSystemElement(File file) {
		if (file.isDirectory()) {
			TreeItem<FileSystemElement> element = new TreeItem<FileSystemElement>(new Directory(file),
					new ImageView(StringTable.ICON_STYLE_FOLDER_CLOSED_24));
			element.expandedProperty().addListener(e -> {
				if (element.isExpanded()) {
					element.setGraphic(new ImageView(StringTable.ICON_STYLE_FOLDER_OPEN_24));
				} else {
					element.setGraphic(new ImageView(StringTable.ICON_STYLE_FOLDER_CLOSED_24));
				}
			});

			return element;

		} else {

			switch (getFileExtension(file)) {
			case "pdf":
				return new TreeItem<FileSystemElement>(new PdfFile(file), new ImageView(StringTable.ICON_STYLE_PDF_24));
			case "txt":
				return new TreeItem<FileSystemElement>(new TxtFile(file), new ImageView(StringTable.ICON_STYLE_TXT_24));
			default:
				return new TreeItem<FileSystemElement>(new GenericFile(file),
						new ImageView(StringTable.ICON_STYLE_FILE_24));
			}
		}
	}

}
