package Adapter;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Soundbank;

public class Notebook implements I_Notebook {

	private List<Note> notesList = new ArrayList<>();

	@Override
	public void createNote(String title, String record) {
		notesList.add(new Note(title, record, null));
	}

	@Override
	public String getNote(String title) {
		for (Note note : notesList) {
			if(title.equals(note.getTitle())) {
				return note.getRecord();
			}
		}
		return null;
	}

	@Override
	public List removeNote(String title) {
		int indexCounter=0;
		for (Note note : notesList) {
			indexCounter++;
			if (title.equals(note.getTitle())) {
				notesList.remove(indexCounter-1);
				return notesList;
			}
		}
		return null;
	}

	@Override
	public String notesCatalog() {
		StringBuffer catalog = new StringBuffer();
		for (Note note : notesList) {
			catalog.append("-" + note.getTitle() +"\n");
		}
		return catalog.toString();
	}

}
