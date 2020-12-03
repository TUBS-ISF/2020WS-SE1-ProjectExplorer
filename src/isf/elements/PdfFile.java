package isf.elements;

import java.io.File;

public class PdfFile extends AbstractFileSystemElement {

	public PdfFile(File file) {
		super(file);
	}

	@Override
	public void onAction() {
		System.out.println("PDF on Action");
		
	}

}
