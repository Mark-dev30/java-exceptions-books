package org.java.object;

public class Book {
	private String title;
	private int pages;
	private String author;
	private String editor;
	public Book(String title,int pages,String author, String editor) throws Exception {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setEditor(editor);
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		if(title.length() == 0 || title.length() > 50) {
			throw new Exception("Il titolo deve contenere almeno un carattere");
			
		}
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) throws Exception {
		
		
		if (pages == 0) {
			
			throw new Exception("Devi insere almeno una pagina");
			
		}
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws Exception {
		
		if(author.length() == 0 || author.length() > 50) {
			
			throw new Exception("Autore deve contenere almeno un carattere");
			
		}
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public String getFullInfoBook() {
		
		return getTitle() + "-" + getPages() + "-" + getAuthor() + "-" + getEditor() ;
	}
	@Override
	public String toString() {
		
		return "Titolo: " + title
				+"\nNumero Pagine: " + pages
				+"\nAutore: " + author
				+"\nEditore: " + editor;
	}
	
}
