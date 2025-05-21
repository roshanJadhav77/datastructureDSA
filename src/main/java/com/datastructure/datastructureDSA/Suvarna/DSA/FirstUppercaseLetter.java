package com.datastructure.datastructureDSA.Suvarna.DSA;

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        String name ="suvarnaJadhav";
        char ans = funUp(name);
        if(ans == 0){
            System.out.println("upper case not found");
        }
        System.out.println("first upper letter is " + ans);
    }
    static char funUp(String naam){
      for(int i=0; i<naam.length(); i++){
          if(Character.isUpperCase(naam.charAt(i))){
              return naam.charAt(i);
          }

        }

        return 0;

    }
}
