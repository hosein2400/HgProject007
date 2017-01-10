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
    
    public static String helper(long x, String string){ 
    String result;
    String result1;
    String result2;
    int m = (int) ((numSize(x))%3);
    switch(m){
        case 0: m = 3 ;
        break;
        case 1: m = 1 ;
        break;
        case 2: m = 2 ;
        break;
    }
    result = String.valueOf(x);
    result2 = result.substring(0,m);
    result1 = result.substring(m,numSize(x)); // right side sort
    Long a2 = Long.parseLong(result2);
    Long a1 = Long.parseLong(result1);
    
    result2 = tTabdil(a2) + string ;
    if (a1 == 0){
    result = result2;
    }else{
    result1 = tTabdil(a1);
    result = result2 +" و "+ result1;
    }
    return result;
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
        String result = "" ,result1 ,result2 ; //for final return //for first digit // for second digit
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
    String result , result1 ,result2;
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
          case 4 : 
          case 5: 
          case 6: 
              result = helper(x, " هزار ");
            break;
          case 7: 
          case 8: 
          case 9: 
              result = helper(x, " میلیون ");
            break;
          case 10: 
          case 11: 
          case 12: 
              result = helper(x, " میلیارد ");
            break;
          case 13: 
          case 14: 
          case 15: 
              result = helper(x, " بیلیون ");
            break;
          case 16: 
          case 17: 
          case 18: 
              result = helper(x, " بیلیارد ");
            break;
      }
        return result;
    }
}
