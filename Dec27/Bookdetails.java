package dec17practice;

public class Bookdetails {
	// Adding attributes
		private String name;
		private String author;
		private String isbn;

		// create constructor
		Bookdetails(String name, String author, String isbn) {
			this.name = name;
			this.author = author;
			this.isbn = isbn;
		}

		@Override
		public String toString() {
			return "Book [name=" + name + ", author=" + author + ", isbn=" + isbn + "]";
		}

		public static void main(String[] args) {
			Bookdetails[] Books = new Bookdetails[] { new Bookdetails("Lessons Life Taught Me Unknowingly", "Anupam Kher", "05432189"),
					new Bookdetails("Dr. Bibek Debroy", "Making of New India", "08765432"),
					new Bookdetails("“Vasdev Mohi", "Cheque book", "07685432") };
			for (Bookdetails i : Books) {
				System.out.println(i);
			}
		}
}


