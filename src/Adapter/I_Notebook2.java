package Adapter;

import java.util.List;

public interface I_Notebook2 {
	void createNote(String title, String record, String recipient);
	String getNote(String title);
	List removeNote(String title);
	String notesCatalog();
}
