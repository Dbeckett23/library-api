package com.dustinbeckett.libraryapi.library;

import java.util.ArrayList;

public class Book {

    private String tile;
    private String author;

    private ArrayList<Page> pages;


    private class Page {
        // NOTE: If we never need to add any other functionality to
        // a page the it can just be a String
        private String pageText;
    }
}
