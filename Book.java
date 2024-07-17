package com.demo.library;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private int publicationYear;
    private String department;
    private boolean available;

    
    

	public Book(String title, String author, String iSBN, String genre, int publicationYear, String department) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.genre = genre;
		this.publicationYear = publicationYear;
		this.department = department;
		//this.available = available;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                ", publicationYear=" + publicationYear +
                ", department='" + department + '\'' +
                ", available=" + available +
                '}';
    }
}

