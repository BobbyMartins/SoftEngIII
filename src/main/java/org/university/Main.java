package org.university;

import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Course course = new Course("Data Science", DateTime.now(), DateTime.now());
        System.out.println(course);
    }
}