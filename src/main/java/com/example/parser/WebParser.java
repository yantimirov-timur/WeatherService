package com.example.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebParser {
    public Node parse() throws IOException {
        String blogUrl = "https://yandex.ru/pogoda/details";
        Document doc = Jsoup.connect(blogUrl).get();
        Elements weather = doc.select("span.temp__value.temp__value_with-unit");

        return weather.get(0).childNodes().get(0);
    }
}
