package org.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.java.object.Book;

public class Main {
	public static void main(String[] args) {
		
		
		System.out.println("Inserisci quanti libri vuoi inserire");
		Scanner in = new Scanner(System.in);
		int n_books = in.nextInt();
		Book[] books = new Book[n_books];
		for(int i=0; i<books.length; i++) {
			try {
				System.out.println("Inserisci titolo");
				String title = in.next();
				System.out.println("Inserisci numero pagine");
				int pages = in.nextInt();
				System.out.println("Inserisci autore");
				String author = in.next();
				System.out.println("Inserisci editore");
				String editor = in.next();
				books[i]  = new Book(title,pages,author,editor);
				System.out.println("-------------------");
					
			}
			catch(Exception e) {
				System.err.println(
					"Errore nella creazione del libro" 
					+ "\n" 
					+ e.getMessage());
			}
		}
		printBooksToFile(books);
		viewFile();
		
	}
	public static void printBooksToFile(Book[] books) {
		try {
			FileWriter myFile = new FileWriter("C:/progetti_java/tmp/file.txt");
			for(int j=0; j<books.length; j++) {
			myFile.write(books[j].getFullInfoBook() + "\n");
			}
			myFile.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public static void viewFile() {
		try {
			System.out.println("----------Lettura File----------");
			File myFile = new File("C:/progetti_java/tmp/file.txt");
			Scanner reader = new Scanner(myFile);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data + "\n");
				}
				
				reader.close();
		}catch(Exception e) {
				System.err.println(
					"Errore nella lettura del file" 
					+ "\n" 
					+ e.getMessage());
			}
		
		
	}
}
