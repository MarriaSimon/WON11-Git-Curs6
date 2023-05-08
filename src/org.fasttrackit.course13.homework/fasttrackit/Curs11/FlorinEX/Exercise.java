package org.fasttrackit.course13.homework.fasttrackit.Curs11.FlorinEX;

public class Exercise {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int c = ++a / 6 + b++ % 3;
        //  System.out.println(c);

        //  for (int i = 0; i<=5;++i){
        //     System.out.println(i);
            /*
            avem initiatorul
            avem conditia, si dupa aceea se face incrementarea
            ++i sau i++ avem la final si nu mai conteaza pt ca se face verificarea conditiei i<=5
             */

        for (int i = 0; i < 5; i = i++) {
            System.out.println(i);
            //asignarea (i = i) se face inainte de ++, de asta se creaza un loop infinit de 0
        }
    }
}
