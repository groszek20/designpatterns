package Adapter;

import java.util.List;

public class NotebookAdapter implements I_Notebook, I_Notebook2 {

	Notebook2 notebook = new Notebook2();
	
	@Override
	public void createNote(String title, String record) {
		notebook.createNote(title, record, null);
		
	}

	@Override
	public String getNote(String title) {
		return notebook.getNote(title);
	}

	@Override
	public List removeNote(String title) {
		return notebook.removeNote(title);
	}

	@Override
	public String notesCatalog() {
		return notebook.notesCatalog();
	}

	@Override
	public void createNote(String title, String record, String recipient) {
		notebook.createNote(title, record, recipient);
	}

}
