package com.company.april11;

public interface Parser<T> {
    ParsedObject parse(T source);
}
