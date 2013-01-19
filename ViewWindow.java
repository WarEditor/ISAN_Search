package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class ViewWindow {
	


	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("ISAN's books searching");
		f.setLocation(300, 300);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(new GridLayout(10,2));
		//building the input books ISBN code item
		final TextField id = new TextField("Input the ISBN:",10);
		f.add(id);
		Button butt = new Button("Search");
		f.add(butt);
		
		//
		final TextField bookName = new TextField("The book's name",10);
		f.add(new Label("The book's name:",Label.CENTER));
		f.add(bookName);
		//
		final TextField authorName = new TextField("authorName",10);
		f.add(new Label("authorName:",Label.CENTER));
		f.add(authorName);
		//
		final TextField bookIsbn10 = new TextField("ISBN10 codes",10);
		f.add(new Label("ISBN10 codes:",Label.CENTER));
		f.add(bookIsbn10);
		//
		final TextField bookIsbn13 = new TextField("ISBN13 codes",10);
		f.add(new Label("ISBN13 codes:",Label.CENTER));
		f.add(bookIsbn13);
		//
		final TextField bookPage = new TextField("Pages",10);
		f.add(new Label("Pages:",Label.CENTER));
		f.add(bookPage);
		//
		final TextField bookPrice = new TextField("Price",10);
		f.add(new Label("Price:",Label.CENTER));
		f.add(bookPrice);
		//
		final TextField bookBinding = new TextField("Binding style",10);
		f.add(new Label("Binding style:",Label.CENTER));
		f.add(bookBinding);
		//
		final TextField publisher = new TextField("Publishing company",10);
		f.add(new Label("Publishing company:",Label.CENTER));
		f.add(publisher);
		//
		final TextField pubdate = new TextField("Publication date",10);
		f.add(new Label("publication date:",Label.CENTER));
		f.add(pubdate);
		// 
		final TextField bookDetail = new TextField("Content Summary",10);
		f.add(new Label("Content Summary:",Label.CENTER));
		f.add(bookDetail);
		//setting listening button
		butt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Books book;
				ISBN isbnTest = new ISBN();
				String isbn = id.getText();//get the ISBN codes
				String bookjson;
				try {
					bookjson = isbnTest.fetchBookInfoByXML(isbn);
					JSONObject jsonobj=isbnTest.stringToJson(bookjson);				    
				    book = (Books)isbnTest.setBookData();
				    bookName.setText(book.getTitle());
				    authorName.setText(book.getAuthor());
				    bookIsbn10.setText(book.getIsbn10());
				    bookIsbn13.setText(book.getIsbn13());
				    bookBinding.setText(book.getBinding());
				    bookDetail.setText(book.getSummary());
				    bookPage.setText(book.getPage());
				    bookPrice.setText(book.getPrice());
				    publisher.setText(book.getPublisher());
				    pubdate.setText(book.getPubdate());
				    
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    
			}
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent args) {
			   System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
