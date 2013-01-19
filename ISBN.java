package main;

import java.io.*;
import java.net.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


class ISBN { 
	String isbnUrl = "http://api.douban.com/book/subject/";
	JSONObject jsonobj;
	Books book;
    /*
     * according to the ISBN number,get the json string by ISBN's API
     */
	public String fetchBookInfoByXML(String isbnNo) throws IOException  {    
	    String requestUrl = isbnUrl + isbnNo+"?alt=json";    
	    URL url = new URL(requestUrl);    
	    URLConnection conn = url.openConnection();    
	    InputStream is = conn.getInputStream();    
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");    
	    BufferedReader br = new BufferedReader(isr);    
	    StringBuilder sb = new StringBuilder();    
	        
	    String line = null;    
	    while ((line = br.readLine()) != null) {    
	        sb.append(line);    
	    }    
	        
	    br.close();    
	    return sb.toString();    
	}
	// translate the json string to json
	public JSONObject stringToJson(String str) throws JSONException
	{
		jsonobj = new JSONObject(str);
		return jsonobj;
	}
	//setting the book's information and return the object
	public Books setBookData() throws JSONException
	{
		JSONObject mesge = jsonobj.getJSONObject("summary");
		book = new Books();
		book.setSummary(mesge.getString("$t"));//setting the information
		JSONArray bookMessage = jsonobj.getJSONArray("db:attribute");
		JSONObject info;
		//setting the ISBN10
		info=bookMessage.getJSONObject(0);
		book.setIsbn10(info.getString("$t"));
		//setting the ISBN13
		info=bookMessage.getJSONObject(1);
		book.setIsbn13(info.getString("$t"));
		//setting the book's name 
		info=bookMessage.getJSONObject(2);
		book.setTitle(info.getString("$t"));
		//setting pages
		info=bookMessage.getJSONObject(3);
		book.setPage(info.getString("$t"));
		//setting author's name
		info=bookMessage.getJSONObject(4);
		book.setAuthor(info.getString("$t"));
		//setting the price
		info=bookMessage.getJSONObject(5);
		book.setPrice(info.getString("$t"));
		//setting the publishing company
		info=bookMessage.getJSONObject(6);
		book.setPublisher(info.getString("$t"));
		//setting the Paperback
		info=bookMessage.getJSONObject(7);
		book.setBinding(info.getString("$t"));
		//setting the publication date
		info=bookMessage.getJSONObject(8);
		book.setPubdate(info.getString("$t"));
		return book;
	}
	
	
	
	
	
	
	
	
	
	
	
}
