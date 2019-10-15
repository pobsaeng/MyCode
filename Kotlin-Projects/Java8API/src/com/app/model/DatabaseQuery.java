package com.app.model;

import com.app.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQuery {
    private Connection connect;

    public DatabaseQuery() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/kotlindb", "root", "Kraipob1234");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> getBooks(String sql) {
        try {
            ResultSet rs = connect.prepareStatement(sql).executeQuery();
            List<Book> lsBook = new ArrayList<>();
            while (rs.next()) {
                Book book = new Book(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                );
                lsBook.add(book);
            }
            rs.close();
            connect.close();

            return lsBook;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}