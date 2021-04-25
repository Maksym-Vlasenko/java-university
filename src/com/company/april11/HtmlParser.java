package com.company.april11;

import javax.swing.text.Element;

public class HtmlParser implements Parser<Element> {
    @Override
    public ParsedObject parse(Element source) {
        return new ParsedObject();
    }
}