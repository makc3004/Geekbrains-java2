package ru.geekbrains;

public class Main{

    static final int size = 10_000_000;
    static final int h = size / 2;

    float[] arr = new float[size];

    public static void main(String[] args) {

       System.out.println("Start");

testMethod(new float[size]);
method2();
    }
    //запуск перевого метода
    public static void testMethod(float[] arr) {
        System.out.println("M1");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            System.out.println(arr[i] + " ");

        }
        long s = System.currentTimeMillis();
        System.out.println(s);
        System.out.println(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));


        }
        long a = System.currentTimeMillis();
        System.out.println(a);
        System.out.println(System.currentTimeMillis() - a);
    }



// задаем второй метод
        public static void method2(){
            System.out.println("M2");
            float[] arr = new float[size];
            float[] a1 = new float[h];
            float[] a2 = new float[h];
        Thread M1 = new Thread(new Runnable() {
            //1-й Thread - разбивка
            @Override
            public void run() {

                System.arraycopy(arr, 0, a1, 0, h);
                System.arraycopy(arr, h, a2, 0, h);
                }
        });
        M1.start();
            Thread M2 = new Thread(new Runnable() {
                //2-й Thread - присвоение 1-ой половине и рассчет
                @Override
                public void run() {
                    for (int i = 0; i < h; i++) {
                        arr[i] = 1;}
                    for (int i = 0; i < h; i++) {
                        a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                    }

            });
            M2.start();
            Thread M3 = new Thread(new Runnable() {
                //3-й Thread - присвоение 2-ой половине и рассчет
                @Override
                public void run() {
                    for (int i = 0; i < h; i++) {
                        arr[i] = 1;}
                        for (int i = 0; i < h; i++) {
                            a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                }
            });
            M3.start();

            Thread M4 = new Thread(new Runnable() {
                //4-й Thread - склеивание

                @Override
                public void run() {

                    System.arraycopy(a1, 0, arr, 0, h);
                    System.arraycopy(a2, 0, arr, h, h);
                }
            });
            M4.start();
            try {
                M1.join();
                M2.join();
                M3.join();
                M4.join();
                long b = System.currentTimeMillis();
                System.out.println(b);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
}



