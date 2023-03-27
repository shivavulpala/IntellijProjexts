package exceptionhandling.runtimeexceptions;

public class NeedforTryCatch {
    public static void main(String[] args) {
//        int[] arr=new int[4];
//        int i=arr[4];
//        System.out.println("Print this");

        try {
            int[] array = new int[6];
            int j = array[8];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("done");
        }
    }
}
