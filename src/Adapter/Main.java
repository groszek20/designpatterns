package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		NotebookAdapter notebook = new NotebookAdapter();
		notebook.createNote("notatka1", "tre�� notatki 1");
		notebook.createNote("notatka2", "tre�� notatki 2");
		notebook.createNote("notatka3", "tre�� notatki 3");
		
		System.out.println(notebook.notesCatalog());
		
		notebook.removeNote("notatka3");
		
		System.out.println(notebook.notesCatalog());
		
		notebook.createNote("notatka4", "dupa", "dupa dupa");
		
		System.out.println(notebook.notesCatalog());
		
	}

}
