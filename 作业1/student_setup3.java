package com.company.java;
public class helloworld//helloworld只是文件名，这个随意
{
    public static void main(String[] args) {
        int h = 1;
        int g = 1;

        for (; g <= 8; g++) {//最外层循环，控制输出多少组

            for (int i = 1; i <= 16; i++)
            {
                if (i <= 8)//菱形输出算法，需要借助if else进行分支
                {

                    int j = 0;
                    while (j < i - 1)
                    {
                        System.out.print(" ");//输出空格使得边界为三角形
                        j++;

                    }
                    System.out.println("Student No."+h+"hi here");
                    h++;
                }
                else
                {
                    int j = 0;
                    while (16 - i > j)
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

    }

//皮一下，用java输出python(doge)
