package org.perscholas;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
        char[] message = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };
        String reverseWords = new String(message).toString();
        System.out.println(reverseWords);
        String[] split = reverseWords.split(" ");

        String result;
        if (split.length > 4) {
            result = split[0] + " " + split[2] + " " + split[2];
        } else {
            result = split[2] + " " + split[1] + " " + split[0];
        }

        System.out.println(result);


    }
    }
