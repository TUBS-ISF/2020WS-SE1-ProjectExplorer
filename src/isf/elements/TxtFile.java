package isf.elements;

import java.io.File;

public class TxtFile extends AbstractFileSystemElement {

	public TxtFile(File file) {
		super(file);
	}

	@Override
	public void onAction() {
		System.out.println("TXT Action");	
	}

}
