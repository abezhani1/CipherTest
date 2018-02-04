package com.abezhani;

import java.util.ArrayList;

public class Main
{
    //private final static FileOutput outFile = new FileOutput("CipherOutput.txt");
    //private final static FileInput inFile = new FileInput("CipherSample.txt");

    public static void main(String[] args)
    {
        //char alphabet;
        //char cipher;
        FileInput indata = new FileInput("CipherInput.txt");
        FileOutput outFile = new FileOutput("CipherOutput.txt");
        String line;
        while ((line = indata.fileReadLine()) != null)
        {
            char letters[] = line.toCharArray();

            for(int i = 0; i < letters.length; i++)
            {
                letters[i] = (char)((int)letters[i] + 6);
            }
            outFile.fileWrite(new String(letters));
        }
        indata.fileClose();
        outFile.fileClose();

        indata = new FileInput("CipherOutput.txt");
        while ((line = indata.fileReadLine()) != null)
        {
            char letters[] = line.toCharArray();

            for(int i = 0; i < letters.length; i++)
            {
                letters[i] = (char)((int)letters[i] - 6);
            }
            System.out.println(new String(letters));
        }
        indata.fileClose();

    }
}
