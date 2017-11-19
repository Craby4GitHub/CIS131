package Lab8;

public class Magazine extends Publication {

	private String freq;
	private String editor;

	public Magazine(String titleInput, String publisherInput, String publicationDateInput, String subjectInput, String freqInput, String editorInput) {
		super(titleInput, publisherInput, publicationDateInput, subjectInput);
		setFreq(freqInput);
		setEditor(editorInput);
	}

	public String getFreq() {
		return freq;
	}

	public String getEditor() {
		return editor;
	}

	public void setFreq(String input) {
		freq = input;
	}

	public void setEditor(String input) {
		editor = input;
	}

	
	
	public String toString() {
		// Include the base class toString to display base class variables.
		StringBuffer strBuf = new StringBuffer(super.toString());
		strBuf.append("\nPublication frequency: ");
		strBuf.append(freq);
		strBuf.append("\nEditor               : ");
		strBuf.append(editor);
		strBuf.append("\n");
		
		return strBuf.toString();

	}
}
