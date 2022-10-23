
public class Books implements Comparable<Books> {

	private String authorFirst;
	private String title;
	private String authorLast;
	private int pages;

	public Books(String aF, String aS, String t, int p) {
		authorFirst = aF;
		title = t;
		authorLast = aS;
		pages = p;
	}

	public int compareTo(Books other) {
		if (this.getAuthorLast().compareTo(other.getAuthorLast()) != 0) {
			return this.getAuthorLast().compareTo(other.getAuthorLast());
		}

		if (this.getAuthorFirst().compareTo(other.getAuthorFirst()) != 0) {
			return this.getAuthorFirst().compareTo(other.getAuthorFirst());
		}
		if (this.getTitle().compareTo(other.getTitle()) != 0) {
			return this.getTitle().compareTo(other.getTitle());
		}
		return this.getPages() - other.getPages();
	}

	public int getPages() {
		return pages;
	}

	public String getAuthorFirst() {
		return authorFirst;
	}

	public String getAuthorLast() {
		return authorLast;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return title + " by " + authorFirst + " " + authorLast + " - " + pages + " pages";
	}

}
