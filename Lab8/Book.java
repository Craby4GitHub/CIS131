package Lab8;

public class Book extends Publication {

	private String ISBN;
	private String libraryOfCongressNum;
	private String author;
	private int numPages;
	private int copyrightYear;
	private int edition;

	public Book(String titleInput, 
			    String publisherInput, 
			    String publicationDateInput, 
			    String subjectInput,
			    String ISBNInput, 
			    String libraryOfCongressNumInput, 
			    String authorInput, 
			    int numPagesInput,
			    int copyrightYearInput, 
			    int editionInput) {
		super(titleInput, publisherInput, publicationDateInput, subjectInput);
		setISBN(ISBNInput);
		setNumPages(numPagesInput);
		setCopyrightYear(copyrightYearInput);
		setEdition(editionInput);
		setLibraryOfCongressNum(libraryOfCongressNumInput);
		setAuthor(authorInput);
	}

	public String getISBN() {
		return ISBN;
	}

	public String getLibraryOfCongressNum() {
		return libraryOfCongressNum;
	}

	public String getAuthor() {
		return author;
	}

	public int getNumPages() {
		return numPages;
	}

	public int getCopyrightYear() {
		return copyrightYear;
	}

	public int getEdition() {
		return edition;
	}

	public void setISBN(String input) {
		ISBN = input;
	}

	public void setNumPages(int input) {
		numPages = input;
	}

	public void setCopyrightYear(int input) {
		copyrightYear = input;
	}

	public void setEdition(int input) {
		edition = input;
	}

	public void setLibraryOfCongressNum(String input) {
		libraryOfCongressNum = input;
	}

	public void setAuthor(String input) {
		author = input;
	}

	public String toString() {
		// Include the base class toString to display base class variables.
		StringBuffer strBuf = new StringBuffer(super.toString());
		strBuf.append("\nISBN                      : ");
		strBuf.append(ISBN);
		strBuf.append("\nLibrary Of Congress Number: ");
		strBuf.append(libraryOfCongressNum);
		strBuf.append("\nAuthor                    : ");
		strBuf.append(author);
		strBuf.append("\nNumber of pages           : ");
		strBuf.append(numPages);
		strBuf.append("\nCopyright Year            : ");
		strBuf.append(copyrightYear);
		strBuf.append("\nEdition                   : ");
		strBuf.append(edition);
		strBuf.append("\n");

		return strBuf.toString();

	}
}
