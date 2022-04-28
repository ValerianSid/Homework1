public class Main {
    public static void main(String[] args) {

        /*
        // Задание 1 заполнить массив размером 10 числами от 1 до 10
        int[] arr = new int [10];
        int count = 0;
        int number = 1;
        while (count < 10) {
            arr[count] = number;
            System.out.println(arr[count]);
            count = count + 1;
            number = number + 1;
        } */
        /*
        // Задание 2 заполнить массив размером 10 числами от 10 до 1
        int[] arr = new int [10];
        int count = 0;
        int number = 10;
        while (count < 10) {
            arr[count] = number;
            System.out.println(arr[count]);
            count = count + 1;
            number = number - 1;
        }
        */
/*
        // Задание 3 заполнить массив размером 10 чётными числами, которые лежат в промежутке от 1 до 20
        int[] arr = new int [10];
        int count = 0;
        int number = 1;
        while (count < 10) {
            if (number % 2 == 0) {
                arr[count] = number;
            }
            else {
                number = number + 1;
                arr[count] = number;
            }
            System.out.println(arr[count]);
            count = count + 1;
            number = number + 1;
        }
        */
/*
        // Задание 4 заполнить массив размером 10 чётными числами, которые лежат в промежутке от 20 до 1
        int[] arr = new int [10];
        int count = 0;
        int number = 20;
        while (count < 10) {
            if (number % 2 == 0) {
                arr[count] = number;
            }
            else {

                number = number - 1;
                arr[count] = number;
            }
            System.out.println(arr[count]);
            count = count + 1;
            number = number - 1;
        }
*/
        /*
        // Задание 5 заполнить массив размером 20 числами, которые лежат в промежутке от 1 до 20. Нечётные числа заменить на число 1
        int[] arr = new int [20];
        int count = 0;
        int number = 1;
        while (count < 20) {
            if (number % 2 == 0) {
                arr[count] = number;
            }
            else {
                arr[count] = 1;
            }
            System.out.println(arr[count]);
            count = count + 1;
            number = number + 1;
        }
        */
        /*
        // Задание 6 Дан массив {83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22}, нули в конец
        int[] arr = new int[] {83, 17, 0, 0, 31, 0, 2, 7, 93, 0, 61, 0, 22};
        int length = arr.length;
        int count = 0;
        int countreplace;
        int replace;
        int countprint = 0;
        while (count < length){
            if (arr[count] == 0){
                countreplace = count + 1;
                while (arr[count] == 0 && countreplace < length){
                    replace = arr[countreplace];
                    arr[countreplace] = arr[count];
                    arr[count] = replace;
                    countreplace = countreplace + 1;
                }
            }
            count = count + 1;
        }
        while (countprint < length){
            System.out.println(arr[countprint]);
            countprint = countprint + 1;
        }
*/
/*
 //Тут можно было бы просто разделить числа на четный и нечетный массив, а потом по очереди брать из одного
 //            и второго и складывать в результирующий. Всё равно "+"
        // Задание 7а Массив {12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13} чередовать четные и нечетные
        int[] arr = new int[]{12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13};
        int length = arr.length;
        int[] chetnyi = new int[length];
        int[] nechetnyi = new int[length];
        int count = 0;
        int chet = 0;
        int nechet = 0;
        int replace = 0;
        int i;
            while(count < length) {
                if (arr[count] % 2 == 0) {
                    chetnyi[chet] = arr[count];
                    chet = chet + 1;
                } else {
                    nechetnyi[nechet] = arr[count];
                    nechet = nechet + 1;
                }
                count = count + 1;
            }
            if (chet < nechet) {
                for (count = 0; count < chet; count++) {
                    arr[replace] = chetnyi[count];
                    replace = replace + 2;
                }
                replace = 1;
                for (count = 0; count < chet; count++){
                    arr[replace] = nechetnyi[count];
                    replace = replace + 2;
                }
                for (i = chet; i < nechet; i++){
                    arr[replace - 1] = nechetnyi[i];
                    replace = replace + 1;
                }
            }
            else {
                for (count = 0; count < nechet; count++) {
                    arr[replace] = nechetnyi[count];
                    replace = replace + 2;
                }
                replace = 1;
                for (count = 0; count < nechet; count++){
                    arr[replace] = chetnyi[count];
                    replace = replace + 2;
                }
                for (i = nechet; i < chet; i++){
                    arr[replace - 1] = chetnyi[i];
                    replace = replace + 1;
                }
            }
        for (count = 0; count < length; count++){
            System.out.print(arr[count] + " ");
        }
*/
        // Задание понято не верно, хотя как вы поняли - решили верно. Я предполагал, что в вашем решении
        //         * числа будут идти в следующем порядке: чет/нечет/чет/нечет/чет/нечет/нечет/нечет.
        // Задание 7б Массив {12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13} чередовать четные и нечетные
        int[] arr = new int[]{12, 83, 17, 31, 2, 7, 93, 76, 61, 22, 45, 98, 53, 16, 13};
        int length = arr.length;
        int count = 0;
        int replace;
        int i;
        int n = 1;

                    while (count < length - 1) {
                        n = 1;
                        while (arr[count] % 2 == 0 && arr[count + 1] % 2 == 0 && count + 1 + n < length) {
                            if (arr[count + 1 + n] % 2 != 0){
                                replace = arr[count + 1];
                                arr[count + 1] = arr[count + 1 + n];
                                arr[count + 1 + n] = replace;
                            }
                            else{
                                replace = arr[count + 1];
                                arr[count + 1] = arr[count + 1 + n];
                                arr[count + 1 + n] = replace;
                            }
                            n = n + 1;
                        }
                        n = 1;
                        while (arr[count] % 2 != 0 && arr[count + 1] % 2 != 0 && count + 1 + n < length) {
                            if (arr[count + n] % 2 == 0){
                                replace = arr[count + 1];
                            arr[count + 1] = arr[count + 1 + n];
                            arr[count + 1 + n] = replace;
                            }
                            else{
                                replace = arr[count + 1];
                                arr[count + 1] = arr[count + 1 + n];
                                arr[count + 1 + n] = replace;
                            }
                            n = n + 1;

                        }
                        count = count + 1;
                    }
               for (i = 0; i < length; i++){
                   System.out.print(arr[i] + " ");
               }


    }
}
