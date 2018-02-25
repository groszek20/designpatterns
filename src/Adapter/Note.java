package Adapter;

public class Note {

	private String title;
	private String record;
	private String recipient;
	
	public Note(String title, String record, String recipient) {
		this.title = title;
		this.record = record;
	}

	public String getTitle() {
		return title;
	}

	public String getRecord() {
		return record;
	}

}
