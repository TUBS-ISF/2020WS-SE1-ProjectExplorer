package isf.elements;

import java.io.File;

public class Directory extends AbstractFileSystemElement {

	public Directory(File file) {
		super(file);
	}

	@Override
	public void onAction() {
		System.out.println("Directory Action");
	}
}
