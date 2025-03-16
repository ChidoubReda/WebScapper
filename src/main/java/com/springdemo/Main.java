package com.springdemo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";
        String csvFile = "books.csv";

        try (FileWriter fileWriter = new FileWriter(csvFile);
             PrintWriter printWriter = new PrintWriter(fileWriter))  {

            printWriter.println("Title,Price");
            Document document = Jsoup.connect(url).get();
            // Add your code to process the document
            Elements books = document.select(".product_pod");

            for(Element bk:books){
                String title = bk.select("h3 > a").text();
                String price = bk.select(".price_color").text();
                printWriter.println("\"" + title + "\",\"" + price + "\"");
            }
            System.out.println("Data successfully written to " + csvFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}