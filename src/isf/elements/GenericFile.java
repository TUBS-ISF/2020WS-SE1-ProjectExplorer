package isf.elements;

import java.io.File;

public class GenericFile extends AbstractFileSystemElement {

	public GenericFile(File file) {
		super(file);
	}

	@Override
	public void onAction() {
		System.out.println("Generic File Action");
	}
}
