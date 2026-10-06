package com.attendance;

import com.attendance.config.DatabaseConfig;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        try (Connection connection = DatabaseConfig.getConnection()) {

            System.out.println("Database connection successful!");

        } catch (Exception e) {

            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}