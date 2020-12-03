package isf.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import isf.elements.FileSystemElement;
import isf.factory.FileSystemElementFactory;
import isf.factory.ModernFileSystemFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class ExplorerController implements Initializable {
	@FXML
	TreeView<FileSystemElement> explorerTree;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		File file = new File("C:/TestWorkspace");

		explorerTree.setRoot(createTree(file, new ModernFileSystemFactory()));

		explorerTree.setOnMouseClicked(e -> {
			if (explorerTree.getSelectionModel().getSelectedItem() != null) {
				explorerTree.getSelectionModel().getSelectedItem().getValue().onAction();
			}
		});
	}

	@FXML
	public void mouseAction() {
		explorerTree.getRoot().setExpanded(true);
	}

	private TreeItem<FileSystemElement> createTree(File file, FileSystemElementFactory factory) {
		TreeItem<FileSystemElement> treeItem = factory.createFileSystemElement(file);
		if (file.isDirectory()) {
			for (File childFile : file.listFiles()) {
				treeItem.getChildren().add(createTree(childFile, factory));
			}
		}
		return treeItem;
	}

}
