public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        if(isTeen(a) || isTeen(b) || isTeen(c)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen (int d){
        if(d>=13 && d<=19) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        isTeen(20);
        hasTeen(20, 13, 12);
    }
}