package lab2;

public class book { 
	
	String title,author;
	int year,page;
	
	book(String title, String author, int year, int page){
		this.title=title;
		this.author=author;
		this.year=year;
		this.page=page;
		
	
	}
	void display () {
		System.out.println("Title: "+title+" Author: "+author+" Year published: "+year+" Page: "+page);
	}
	void changepage (int newpage) {
		this.page=newpage;
	}
	void changeauthor (String newauthor) {
		this.author=newauthor;
	}

}
