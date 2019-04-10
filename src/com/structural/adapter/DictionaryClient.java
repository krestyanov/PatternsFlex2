package com.structural.adapter;

public class DictionaryClient {
    public static void main(String[] args) {
        Dictionary dictionary = new Adapter();

        dictionary.monday();
        dictionary.tuesday();
        dictionary.wednesday();
        dictionary.thursday();
        dictionary.friday();
    }
}
