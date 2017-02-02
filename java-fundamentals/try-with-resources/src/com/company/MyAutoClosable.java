package com.company;

import java.io.IOException;

/**
 * Created by rdbv on 2/2/2017.
 */
public class MyAutoClosable implements AutoCloseable{
    public void saySomething() throws IOException {
//        System.out.println("Something");
        throw new IOException("Exception from saySomething");
    }
    @Override
    public void close() throws IOException {
//        System.out.println("close");
        throw new IOException("Exception from close");
    }
}
