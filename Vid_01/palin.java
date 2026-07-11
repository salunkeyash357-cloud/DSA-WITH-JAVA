package Vid_01;

public class palin {


    public static void main(String[] args) {
        System.out.println(check("nitin"));

        
    }
    public static boolean check(String str){
        int i=0,j=str.length()-1;
        while (i<j) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}