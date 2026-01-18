package lab2;

public class MyBookList {

	public static void main(String[] args) {
		 // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, Atomic Habits, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
        

        // 2.) Display the details of each book using the displayDetails method. Below is the sample output
        //     Title: Rich Dad Poor Dad, Author: Robert Kiyosaki, Year: 1997, Current Page: 0
        //     Title: The Power of Habit, Author: Charles Duhigg, Year: 2012, Current Page: 0
        //     Title: Atomic Habits, Author: James Clear, Year: 2018, Current Page: 0
        //     Title: Java Programming, Author: John Doe, Year: 2020, Current Page: 0

		book b1=new book("Rich Dad Poor Dad","Robert Kiyosaki", 1997, 0);
		book b2=new book("The Power of Habit"," Charles Duhigg", 2012, 0);
		book b3=new book("Atomic Habits"," Atomic Habits", 2018, 0);
		book b4=new book("Java Programming"," John Doe", 2020, 0);
		
		b1.display();
		b2.display();
		b3.display();
		b4.display();
		
		System.out.println();
		
		 // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
		
		b1.changepage(50);
		b3.changepage(100);
		
		System.out.println();
		
		b1.display();
		b3.display();
		
		System.out.println();
		
		 // 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.
		
		System.out.println("After changing my favorite book's page: ");
		b2.changepage(69);
		b2.display();
		
		System.out.println();
		
		// 5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.

		
		b4.changeauthor("Jane Smith");
		b4.display();
		
		System.out.println();
		
		// 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of the books published after 2010.

		book[] collection= {b1,b2,b3,b4};
		 for (book b:collection) {
			 if (b.year>2010) {
				 System.out.println(b.title);

			 }
			 
		 }
		
		
		



	}
	

}
