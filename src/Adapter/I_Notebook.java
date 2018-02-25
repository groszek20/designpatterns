package Adapter;

import java.util.List;

public interface I_Notebook {
void createNote(String title, String record);
String getNote(String title);
List removeNote(String title);
String notesCatalog();
}
