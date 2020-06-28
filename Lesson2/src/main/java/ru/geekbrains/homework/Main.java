package ru.geekbrains.homework;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        fill();
        ret();
    }



        public static void ret() {

           // String str = "10, 3, 1, 2,2, 3, 2, 2,5, 6, 7, 1,300, 3, 1, 0";
            String[][] str = {{"10 3 1 2"}, {",2 3 2 2"},{"5 6 7 1"},{"300 3 1 0"}};

            try {
                Integer i2 = Integer.valueOf(String.valueOf(str));
                System.out.println(i2);
            }catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }


        }
    public static void fill() {

        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        int[][] arr = {{
                10, 3, 1, 2},
                {2, 3, 2, 2},
                {5, 6, 7, 1},
                {300, 3, 1, 0
                }};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                int w = (i+j)/2;
                System.out.println(w);

            }
                //System.out.print(arr[i][j] + " ");
            System.out.println(Arrays.toString(arr));
            System.out.println();

        }
    }
//        try {
//            i = Integer.parseInt(str2);
//            System.out.println(i);
//        } catch (NumberFormatException e) {
//            System.err.println("Неверный формат строки!");
//        }
//        }

    }


