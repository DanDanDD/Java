package com;

/**
 * @author: Dennis
 * @date: 2020/7/13 18:25
 */

public class Main {
    static int size = 12;
    static void print_table(String name, String course, String score) {
        String[] table = {name, course, score};
        for (int i = 0; i < 3; ++i) {
            System.out.print("|");
            int len = table[i].length();
            int left_space =    (size-len)/2   ;
            int right_space =   (size-len)/2+(size-len)%2    ;

            for (int j = 0; j <   left_space  ; ++j) {
                System.out.print(" ");
            }

            System.out.print(table[i]);

            for (int j = 0; j <   right_space  ; ++j) {
                System.out.print(" ");
            }
        }
        System.out.print("|\n");

        for (int i = 0; i < 3; ++i) {
            System.out.print("+");
            for (int j = 0; j < size; ++j) {
                System.out.print("-");
            }
        }
        System.out.print("+\n");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            System.out.print("+");
            for (int j = 0; j < size; ++j) {
                System.out.print("-");
            }
        }
        System.out.print("+\n");
        print_table("name", "course", "score");
        print_table("barty", "math", "100");
        print_table("islands", "English", "60");
        print_table("wudi", "Chinese", "99");
        print_table("islands", "Physics", "100");
    }
}