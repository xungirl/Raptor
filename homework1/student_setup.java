package com.company.java;


public class helloworld//这里我命名的文件是helloworld,这个随意
{
    public static void main(String[] args) {
        int h=1;
        int g = 1;
        for (; g <= 8; g++) {
            for (int i = 1; i <= 8; i++)
            {
                int j = 0;
                while (j < i - 1)
                {
                    System.out.print(" ");
                    j++;

                }
                System.out.println("Student No."+h+"hi here");

                h++;

            }

        }

    }
}


