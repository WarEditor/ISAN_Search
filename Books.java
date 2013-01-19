package main;

public class Books {
  private String summary;
  private String author;
  private String title;
  private String page;
  private String isbn10;
  private String isbn13;
  private String price;
  private String publisher;
  private String binding;
  private String pubdate;
  /**
   * To get the books information
   * The large data
   * Large amount of data need some space for branch display
   * @return String
   */
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
/**
 * Get the name of the authors
 * @return String
 */
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
/**
 * Get the name of the book
 * @return String
 */
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
/**
 * To get the book's ISBN10 codes
 * @return String
 */
public String getIsbn10() {
	return isbn10;
}
public void setIsbn10(String isbn10) {
	this.isbn10 = isbn10;
}
/**
 * To get the book's ISBN13 codes
 * @return String
 */
public String getIsbn13() {
	return isbn13;
}
public void setIsbn13(String isbn13) {
	this.isbn13 = isbn13;
}
/**
 * To get the book's price
 * @return String
 */
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
/**
 * To get the book's publishing company
 * @return String
 */
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
/**
 * To get the book's binding mode
 * @return String
 */
public String getBinding() {
	return binding;
}
public void setBinding(String binding) {
	this.binding = binding;
}
/**
 * To get the book's publication date
 * @return String
 */
public String getPubdate() {
	return pubdate;
}
public void setPubdate(String pubdate) {
	this.pubdate = pubdate;
}
public void setPage(String page) {
	this.page = page;
}
/**
 * To get the book's numbers of pages
 * @return String
 */
public String getPage() {
	return page;
}
  
}
