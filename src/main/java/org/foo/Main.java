package org.foo;

import java.io.IOException;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");

        StringReader sr = new StringReader("Hello, World! \uD83D\uDE01");
        // StringReader sr = new StringReader("Hello, č World!");
        // StringReader sr = new StringReader("Hello, \u10FF World!");
        MyLexer tokenizer = new MyLexer(sr);
        tokenizer.yylex();
        tokenizer.yylex();
        tokenizer.yylex();
        tokenizer.yylex();
        tokenizer.yylex();
    }
}