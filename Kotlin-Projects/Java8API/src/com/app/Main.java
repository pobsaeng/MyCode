package com.app;

import com.app.java8.bean.Person;
import com.app.model.Averager;
import com.app.model.DatabaseQuery;
import com.app.model.Book;
import com.app.model.Item;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public void printBook(Book book) {
        System.out.println(book);
    }

    public void outside() {
    }

    public static void main(String[] args) {
        DatabaseQuery db = new DatabaseQuery();
        List<Book> bookList = db.getBooks("select * from book");

        //lambda expression
//        bookList.forEach(System.out::println);

        //method reference
        //bookList.forEach(new Main()::printBook);


        System.out.println("---------------------------------------------");
        /*
         * The JDK contains many terminal operations (such as average, sum, min, max, and count)
         * that return one value by combining the contents of a stream.
         */
        //average
        double bookAvg = bookList
                .stream()
                .filter(p -> p.getAuthors().startsWith(""))
                .mapToInt(Book::getPrice)
                .average()
                .getAsDouble();
        //System.out.println(bookAvg);

        //sum
        Integer bookSum = bookList
                .stream()
                .mapToInt(Book::getPrice)
                .sum();
        //System.out.println(bookSum);

        //reduce
        Integer booSumReduce = bookList
                .stream()
                .map(Book::getPrice)
                .reduce(0, (a, b) -> a + b);
        //System.out.println(booSumReduce);

//        Stream<Book> bookGroupby = bookList
//                .stream()
//                .map(Book:: new);

        Map<Integer, List<Book>> item = bookList
                .stream()
                .map(Book::new).collect(Collectors.groupingBy(Book::getPrice));



        int maxPrice = bookList.stream()
                .map(Book::getPrice)
                .max(Comparator.comparing(b->b.doubleValue())).get();
        System.out.println(maxPrice);

        //.map(Book::new Book(book.getId(), book.getTitle(), ..))
//        List<Book> listBook = bookList.stream().map(Book::new).collect(Collectors.toList());

//        List<Book> listBook = bookStream.collect(Collectors.toList()); //convert to List

//        listBook.forEach(System.out::println);

    }
}

