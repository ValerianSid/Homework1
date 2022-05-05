public class HomeworkStrings {
    public static void main(String[] args){
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
    }
}
