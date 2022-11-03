
class Test{

    void testing(){


        throw new Error();
    }

}

public class Main {
    public static void main(String[] args) {
        Test test=new Test();

        try{
            test.testing();
            System.out.println("In try");
        }
        catch (Exception e){
            System.out.println("IN catch");
        }
        finally {
            System.out.println("In finally");
        }
    }
}
