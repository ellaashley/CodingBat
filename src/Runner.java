public class Runner {
    public static void main(String[] args){
        System.out.println(makes10(4,5));
        System.out.println(doubleX("axxbb"));
        System.out.println(firstTwo("Hello"));
        int[] x = {1,2,6};
        System.out.println(firstLast6(x));
        System.out.println(love6(6,4));
        System.out.println(blackjack(19,21));
        System.out.println(bobThere("abcbob"));
        System.out.println(equalIsNot("This is not"));
        int[] y = {1,2,3,4};
        System.out.println(sum28(y));
    }
    public static boolean makes10(int a, int b){
        if(a==10||b==10||a+b==10){
            return true;
        }else{
            return false;
        }
    }
    public static boolean doubleX(String str) {
        int firstx = str.indexOf("x");
        if(firstx == -1 || firstx+1>=str.length()){
            return false;
        }
        if(str.substring(firstx,firstx+2).equals("xx")){
            return true;
        }
        return false;
    }
    public static String firstTwo(String str) {
        if(str.length()<=2){
            return str;
        }else{
            String str2 = str.substring(0,2);
            return str2;
        }
    }
    public static boolean firstLast6(int[] nums) {
        if(nums[0]==6 || nums[nums.length-1]==6){
            return true;
        }else{
            return false;
        }
    }
    public static boolean love6(int a, int b) {
        if(a==6 || b==6 || a+b==6 || a-b==Math.abs(6) || b-a==Math.abs(6)){
            return true;
        }else{
            return false;
        }
    }
    public static int blackjack(int a, int b) {
        int x = 21-a;
        int y = 21-b;
        if(x>y && b<=21 || a>21 && b<= 21){
            return b;
        }
        if(y>x && a<=21 || b>21 && a<=21){
            return a;
        }
        if(a>21 && b>21){
            return 0;
        }
        return b;
    }
    public static boolean bobThere(String str) {
        if(str.length()<3){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals("b") && i+3>str.length()){
                return false;
            }
            if(str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b")){
                return true;
            }
        }
        return false;
    }
    public static boolean equalIsNot(String str) {
        int numIs = 0;
        int numNot = 0;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1){
                if(str.substring(i,i+2).equals("is")){
                    numIs++;
                }
            }
            if(i<str.length()-2){
                if(str.substring(i,i+3).equals("not")){
                    numNot++;
                }
            }
        }
        if(numIs == numNot){
            return true;
        }else{
            return false;
        }
    }
    public static boolean sum28(int[] nums) {
        int numTwo = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                numTwo++;
            }
        }
        if(numTwo*2==8){
            return true;
        }else{
            return false;
        }
    }
}



