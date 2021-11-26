/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo11_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Start {
      /* текст из файла */
      String text;
      Scanner scanner = new Scanner(System.in);
      /**
       * метод начала работы
       */
        public void Run()
        {   
            // читаем файл и получем из него текст кода
            Reader reader = new Reader();
            text = reader.textCode("java.txt"); 
            System.out.println("Выберите действие: \n" +
                "1 - Вывести таблицу лексем\n" +
                "2 - Вывести таблицу идентификаторов\n" +
                "3 - Вывести ДСР\n" +
                "4 - Вывести триады\n");
        int num = scanner.nextInt();
        switch (num) {
        case 1: ParserLexeme lexeme = new ParserLexeme(text);
                lexeme.readLexeme();
            break;
        case 2: ParserIdentif identif = new ParserIdentif(text);
                identif.getIdentif();
            break;
        case 3: ParserDSR dsr = new ParserDSR(text);
                dsr.getDSR();
            break;
        case 4: ParserTriads triads = new ParserTriads(text);
                triads.getTriads();
            break;
        default:
            break;
        }
            // создаем класс и получаем объектный код 
            Compiller result = new Compiller();
            result.compileObjectCode();
        }
}
