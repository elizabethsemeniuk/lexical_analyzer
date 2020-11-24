package com.company;

import java.io.*;

public class Main {

        public static void main(String[] args) throws Exception {
            Lexema lex = new Lexema("code.txt");
            FileWriter fw = new FileWriter("result.txt");
            //fw.write("Counter Type Lexema\n");
            System.out.println("Counter Type Lexema");
            //
            int cnt = 1;
            while (!lex.failed) {
                lex.Read();
                System.out.printf("%s %s %s\n", cnt, lex.type, lex.lex);
                if (lex.type != C_Sharp.Type.Type_trash) {
                    fw.write(lex.type.toString());
                    fw.write(" - ");
                    fw.write(lex.lex.toString());
                    fw.write("\n");
                    cnt++;
                }
            }
            fw.close();
            if (lex.Error.isEmpty()) {
                System.out.println("Accepted");
            } else {
                System.out.println(lex.Error);
            }

        }
    }
