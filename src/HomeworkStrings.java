public class HomeworkStrings {
    static int compareresult;
    // Здесь два варианта. Первый через compareto. Второй с переводом слов в char[] и сравнением по символам
    public static void main(String[] args){

        /*
        String[] arr = {"Lada", "Toyota", "Bentley", "Mercedes", "BMW", "Wolkswagen", "Brabus", "Shkoda", "Scania", "Volvo", "Chevrolet", "Jaguar", "Nissan", "Mitsubishi", "Mazda", "MAZ", "KAMAZ", "TATRA", "Fiat"};
        int i;
        int compareresult;
        String replace;
        int countreplace;
        for (i = 0; i < arr.length - 1; i++) {
            for(countreplace = i + 1; countreplace < arr.length; countreplace++){
                compareresult = arr[i].compareToIgnoreCase(arr[countreplace]);
                if (compareresult > 0){
                    replace = arr[countreplace];
                    arr[countreplace] = arr[i];
                    arr[i] = replace;
                }
            }
        }
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        */
        // char[] first = arr[0].toCharArray();
        //        char[] second = arr[2].toCharArray();
        // first[i] = Character.toUpperCase(first[i]);

        // В целом решение не плохое, но немного не доработанное. Почитайте комментарии, если что-то не понятно, подойдите ко мне на занятии, я поясню
        String[] arr = {"Lada", "Toyota", "Bentley", "Mercedes", "BMW", "Wolkswagen", "Brabus", "Shkoda", "Scania", "Volvo", "Chevrolet", "Jaguar", "Nissan", "Mitsubishi", "Mazda", "MAZ", "KAMAZ", "TATRA", "Fiat"};
        int i;
        int countreplace;
        char[] firstword;
        char[] secondword;
        String replace;
        for (i = 0; i < arr.length; i ++){
            for (countreplace = i + 1; countreplace < arr.length; countreplace++){
                // Вот тут можно сделать String firstStr = arr[i].toLowerCase(); String secondStr = arr[countreplace].toLowerCase();
                firstword = arr[i].toCharArray();
                secondword = arr[countreplace].toCharArray();
                compare(firstword, secondword);
                if (compareresult > 0){
                    replace = arr[countreplace];
                    arr[countreplace] = arr[i];
                    arr[i] = replace;
                }
            }

        }
        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // Тут было бы более семантически верно возвращать тип boolean
    static int compare(char[] firstword, char[] secondword){ // Радует, что используете методы, а не пишете всё в одном методе main. За это однозначно +
        for (int z = 0; z < firstword.length && z < secondword.length; z++){
            firstword[z] = Character.toLowerCase(firstword[z]); // Вместо того, чтобы приводить каждый символ в нижний регистр, можно ведь перед вызовом этого метода перевести в нижний регистр сразу строки
            secondword[z] = Character.toLowerCase(secondword[z]);
            if (firstword[z] > secondword[z]){
                compareresult = 1;
                break;
            } else if (firstword[z] < secondword[z]){
                compareresult = 0;
                break;
            }
            // Char - это, по сути, числа. И если уж хотите возвращать int, то вместо вашей конструкции if/else можно делать return firstword[z] - secondword[z];
        }
        return compareresult; // Ваша переменная compareresult - глобальная. По сути её не обязательно возвращать, а достаточно просто присвоить ей значение.
                                // Тогда Ваш метод compare будет иметь следующую сигнатуру: static void compare(char[] firstword, char[] secondword)
    }
}
