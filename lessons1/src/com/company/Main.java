package com.company;

public class Main {

    public static void main(String[] args) {

     /*   String postadress = "str. Vilna, 26b/2, 76000, Vol Mux Grech  ";
        String postadress1 = "str. Vilna, 26b/2, 7600, Vol Mux Grech  ";
        String postadress2 = "str. Vilna, 26b/2, 7600, Vol Mux Grech  ";
        String postadress3 = "str. Vilna, 26b/2, 7600, Vol Mux Grech  ";
        String postadress4 = "str. Vilna, 26b/2, 7600, Vol Mux Grech  ";
        String postadress5 = "str. Vilna, 26b/2, 7600, Vol Mux Grech  ";
        printResult(postadress);
        printResult(postadress1);
        printResult(postadress2);
        printResult(postadress3);
        printResult(postadress4);
        printResult(postadress5);*/

        String[] addrArr = new String[]{ "str. Vilna, 26b/2, 76000, Vol Mux Grech  ",  "str. Vilna, 26b/2, 76000, Vol Mux Grech  ",  "str. Vilna, 26b/2, 76000, Vol Mux Grech  "};
        for(int i = 0; i < addrArr.length; i++) {
            printResult(addrArr[i]);
        }

    }

    public static boolean checkAdress(String adress) {
        String regex ="^str*((\\s+)|(\\.)|(\\s+\\.))(\\s+)*[A-Za-z]{3,}((\\s+)|(,)|(\\s+,))(\\s+)*"
                +  "\\d{1,3}([A-Za-z])*(/)*(\\d)*([A-Za-z])*((\\s+)|(,)|(\\s+,))(\\s+)*\\d{5}(\\s+)*((\\s+)|(,)|(\\s+,))(\\s+)"
                + "[A-Za-z]{3,}\\s+[A-Za-z]{3,}\\s+[A-Za-z]{3,}((\\s+)|(,)|(\\s+,))*$";
        return adress.matches(regex);
    }

    public static void printResult(String postadress) {
        boolean isCorrectpostAdress = checkAdress(postadress);
        if(isCorrectpostAdress){
            System.out.println("Ваша адреса вірна");
        }else{
            System.out.println("Ви помилились у адресі");
        }
    }
}