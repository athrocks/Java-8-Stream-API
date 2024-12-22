package L01_Lamda_Expression;

interface Addable{
    int addMethod(int a,int b);
}

public class S04_Parameter_To_Lambda {
    public static void main(String[] args) {

//        Addable add = (int a,int b) -> {
//            return a+b;
//        };

//        Addable add = (int a,int b) -> (a+b);
        Addable add = (a,b) -> (a+b);
        int result = add.addMethod(1,2);
        System.out.println("Addition of a & b returns: " + result);
    }
}
