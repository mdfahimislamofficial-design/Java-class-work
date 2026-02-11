public class Books {
	static class Book {
    	String title;
    	String author;
    	int yearPublished;
    	Book(String title, String author, int yearPublished) {
        	this.title = title;
        	this.author = author;
        	this.yearPublished = yearPublished;
    	}
    	void displayInfo() {
        	System.out.println("title: " + title);
        	System.out.println("author: " + author);
        	System.out.println("year published: " + yearPublished);
        	System.out.println();
    	}
	}
	public static void main(String[] args) {
    	Book book1 = new Book("The Alchemist", "Paulo Coelho", 1988);
    	Book book2 = new Book("Clean Code", "Robert C. Martin", 2008);
    	book1.displayInfo();
    	book2.displayInfo();
	}
}
