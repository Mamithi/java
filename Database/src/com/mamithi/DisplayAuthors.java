package com.mamithi;

import java.sql.*;

public class DisplayAuthors {
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/books";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            System.out.println("Connecting to the database");

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection(
                    DATABASE_URL, "root", "root");


            statement = connection.createStatement();

            resultSet = statement.executeQuery(
                    "SELECT id, firstname, lastname FROM authors");

            // Process query results
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Authors Table Books Database:\n");

            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-8\t", metaData.getColumnName(i));
                System.out.println();
            }
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8\t", resultSet.getObject(i));
                    System.out.println();
                }
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
