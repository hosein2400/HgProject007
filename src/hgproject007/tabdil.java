/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hgproject007;

/**
 *
 * @author HgH
 */
public class tabdil {
    public static int numSize(long x){ //take a long number and return size of X
        String str = String.valueOf(x);
        int a = str.length();
        
    return a;
    }
    
    public static String digit01(long x){
        String result = null;
        int a = (int) x;
        switch(a){
                case(0):result = "صفر";
                break;
                case(1):result = "یک";
                break;
                case(2):result = "دو";
                break;
                case(3):result = "سه";
                break;
                case(4):result = "چهار";
                break;
                case(5):result = "پنج";
                break;
                case(6):result = "شش";
                break;
                case(7):result = "هفت";
                break;
                case(8):result = "هشت";
                break;
                case(9):result = "نه";
                break;
        }
    return result;
    }
    
    public static String digit02(long x){
        String result = null; //for final return
        String result1 = null; //for first digit
        String result2 = null; // for second digit
        int test = 0 ;
            if(x<10){result = digit01(x);}
            if(x<20){
                    int a = (int) x;
                    switch(a){
                    case(10):result = "ده";
                    break;
                    case(11):result = "یازده";
                    break;
                    case(12):result = "دوازده";
                    break;
                    case(13):result = "سیزده";
                    break;
                    case(14):result = "چهارده";
                    break;
                    case(15):result = "پانزده";
                    break;
                    case(16):result = "شانزده";
                    break;
                    case(17):result = "هفده";
                    break;
                    case(18):result = "هجده";
                    break;
                    case(19):result = "نوزده";
                    break;
                    }
            }else{
                result = String.valueOf(x);
                result2 = result.substring(0,1);
                result1 = result.substring(1); // right side sort
                 test = Integer.parseInt(result1);
                result1 = digit01(Long.parseLong(result1));
                
                switch(result2){
                        case"2": result2 = "بیست";
                        break;
                        case"3": result2 = "سی";
                        break;
                        case"4": result2 = "چهل";
                        break;
                        case"5": result2 = "پنجاه";
                        break;
                        case"6": result2 = "شصت";
                        break;
                        case"7": result2 = "هفتاد";
                        break;
                        case"8": result2 = "هشتاد";
                        break;
                        case"9": result2 = "نود";
                        break;
                        
                }
                            
    if(test == 0) {
        result = result2;
    
    }else{
        result = result2 + " و "+ result1;
    }   
            }
    if (result.equals("صفر") ){
    return "";
    }else{        
    return result;
    }    
        
    }
    public static String digit03(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,1);
    result1 = result.substring(1,3); // right side sort
    long test;
    test = Long.parseLong(result1);
                switch(result2){
                    case("1"): result2 = "صد";
                    break;
                    case("2"): result2 = "دویست";
                    break;
                    case("3"): result2 = "سیصد";
                    break;
                    case("4"): result2 = "چهارصد";
                    break;
                    case("5"): result2 = "پانصد";
                    break;
                    case("6"): result2 = "ششصد";
                    break;
                    case("7"): result2 = "هفتصد";
                    break;
                    case("8"): result2 = "هشتصد";
                    break;
                    case("9"): result2 = "نهصد";
                    break;
                }
    
    if (!(test == 0)){
        result1 = digit02(test);
        result = result2 + " و " + result1;
    }else{
        result1 = "";
        result = result2 ;
    
    
    }
    
    
    return result;
    }
    public static String digit04(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,1); // if x = 1001 then result2 = 1
    result1 = result.substring(1,4); // right side sort -- and result1 = 001
    Long a2 = Long.parseLong(result2); // a2 = 1
    Long a1 = Long.parseLong(result1); // a1 = ?
    
    result2 = digit01(a2) + " هزار ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit05(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,2);
    result1 = result.substring(2,5); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit02(a2) + " هزار ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit06(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,3);
    result1 = result.substring(3,6); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit03(a2) + " هزار ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
    public static String digit07(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,1);
    result1 = result.substring(1,7); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit01(a2) + " میلیون ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
    public static String digit08(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,2);
    result1 = result.substring(2,8); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit02(a2) + " میلیون ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
    public static String digit09(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,3);
    result1 = result.substring(3,9); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit03(a2) + " میلیون ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
    public static String digit10(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,1);
    result1 = result.substring(1,10); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit01(a2) + " میلیارد ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
    public static String digit11(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,2);
    result1 = result.substring(2,11); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit02(a2) + " میلیارد ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
    public static String digit12(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,3);
    result1 = result.substring(3,12); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit03(a2) + " میلیارد ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit13(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,1);
    result1 = result.substring(1,13); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit01(a2) + " بیلیون ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit14(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,2);
    result1 = result.substring(2,14); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit02(a2) + " بیلیون ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit15(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,3);
    result1 = result.substring(3,15); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit03(a2) + " بیلیون ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit16(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,1);
    result1 = result.substring(1,16); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit01(a2) + " بیلیارد ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit17(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,2);
    result1 = result.substring(2,17); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit02(a2) + " بیلیارد ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    public static String digit18(long x){
    String result = null;
    String result1 = null;
    String result2 = null;
    result = String.valueOf(x);
    result2 = result.substring(0,3);
    result1 = result.substring(3,18); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = digit03(a2) + " بیلیارد ";
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
    }
    
       public static String tTabdil(long x){
        String result = "";
        int numSize = tabdil.numSize(x);
      switch(numSize){
          case 1: result = tabdil.digit01(x);
            break;
          case 2: result = tabdil.digit02(x);
            break;
          case 3: result = tabdil.digit03(x);
            break;
          case 4: result = tabdil.digit04(x);
            break;
          case 5: result = tabdil.digit05(x);
            break;
          case 6: result = tabdil.digit06(x);
            break;
          case 7: result = tabdil.digit07(x);
            break;
          case 8: result = tabdil.digit08(x);
            break;
          case 9: result = tabdil.digit09(x);
            break;
          case 10: result = tabdil.digit10(x);
            break;
          case 11: result = tabdil.digit11(x);
            break;
          case 12: result = tabdil.digit12(x);
            break;
          case 13: result = tabdil.digit13(x);
            break;
          case 14: result = tabdil.digit14(x);
            break;
          case 15: result = tabdil.digit15(x);
            break;
          case 16: result = tabdil.digit16(x);
            break;
          case 17: result = tabdil.digit17(x);
            break;
          case 18: result = tabdil.digit18(x);
            break;
      }
        return result;
    }
}
