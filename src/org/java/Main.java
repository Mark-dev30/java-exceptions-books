package org.java;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.java.object.Book;

public class Main {
	public static void main(String[] args) {
		
		
		System.out.println("Quanti libri vuoi inserire");
		Scanner in = new Scanner(System.in);
		int n_books = in.nextInt();
		Book[] books = new Book[n_books];
		in.nextLine();
		
		for(int i=0; i<books.length; i++) {
			
			
				
			System.out.println("Inserisci titolo");
			String title = in.nextLine();
			System.out.println("Inserisci numero pagine");
			int pages = in.nextInt();
			in.nextLine();
			System.out.println("Inserisci autore");
			String author = in.nextLine();
			System.out.println("Inserisci editore");
			String editor = in.nextLine();
			try {
				books[i]  = new Book(title,pages,author,editor);
				System.out.println("-------------------");
					
			}
			catch(Exception e) {
				i--;
				System.err.println(
					"Errore nella creazione del libro" 
					+ "\n" 
					+ e.getMessage());
			}
		}
		in.close();
		printBooksToFile(books);
		viewFile();
		
		
	}
	public static void printBooksToFile(Book[] books) {
		try {
			FileWriter myFile = new FileWriter("C:/progetti_java/tmp/file.txt");
			for(int j=0; j<books.length; j++) {
			myFile.write(books[j] + "\n");
			}
			myFile.close();
		} catch (Exception e) {
			
			System.err.println(
					"Errore nella scrittura del file" 
					+ "\n" 
					+ e.getMessage());
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
