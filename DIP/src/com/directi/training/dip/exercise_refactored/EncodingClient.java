package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingClient {
    public static void main(String[] args) throws IOException
    {
        IEncoder encodingModule = new FileEncoder();
        encodingModule.encode();
    }
}
