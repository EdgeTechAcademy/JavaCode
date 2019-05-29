public class Book {
	private String ISBN;
	private String title;
	private String author;
	private int pages;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book{" +
				"ISBN='" + ISBN + '\'' +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", pages=" + pages +
				'}';
	}

	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		//	generate the ISBM
	}

	//	checkOut method
	//	add book review method
	//
}
