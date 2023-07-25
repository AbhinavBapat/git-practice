package com.qa;

public class TestBooks {
    public static void main(String[] args) {

        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title1",arr,12);
        Book b2 = new Book("titel2", arr, 13);
        Book b3 = new Book("title3",arr,14);
        Book[] bookArray = new Book[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for(int x=0; x < bookArray.length; x++){
            System.out.println(bookArray[x]);
        }
    }
}
