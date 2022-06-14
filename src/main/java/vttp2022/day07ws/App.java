package vttp2022.day07ws;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.net.*;

public class App {
    public static void main(String[] args) throws IOException {

        //
        String str;
        //
        String dataFile = ("./books.txt");
        // file reader
        Reader r = new FileReader(dataFile);
        System.out.println(r);
        BufferedReader br = new BufferedReader(r);

        System.out.println(br);

        List<String> list = new ArrayList<String>();

        while ((str = br.readLine()) != null) {
            list.add(str);
            // r.close();
        }

        //
        String[] stringArr = list.toArray(new String[0]);

        System.out.println(Arrays.toString(stringArr));

        // split the string by line break

        // the store the strings in to an array

        // do search function using lambda
        
        boolean stop = false;
        
        while (!stop) {
            Scanner scanner = new Scanner(System.in);
    
            String input = scanner.nextLine();

            String[] terms = input.split(" ");
            String cmd = terms[0];
            switch (cmd) {
                case "search":
                    System.out.println("hi");
                    for(int i = 0; i < stringArr.length; i++){
                        if(stringArr[i].contains(terms[1])){
                           // If student was found, print his details and return from this function.
                           System.out.println(stringArr[i]);
                        }
                     }
                    break;

                case "end":
                    stop = true;
                    scanner.close();
                    break;

                default:
                    scanner.close();
                    break;

            }

        }
    }
}
