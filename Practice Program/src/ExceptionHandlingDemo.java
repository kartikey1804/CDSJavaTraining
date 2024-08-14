public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        //to control over the errors
        //problem divide by zero
//        int a=100/0;
//        System.out.println(a);
        //solution on divide by zero
        //airtematic exception
        try {
            int b = 100 / 0;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e);
        }
        String name = "Kartikey Pandey";
//        int i= Integer.parseInt(name);
//        System.out.println(i);//datatype conversion error//number format error
        //problem statement 2
//        try {
//            int i = Integer.parseInt(name);
//            System.out.println(i);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        //problem Statement 3 Comparison in between null and empty string
        String fullname = null;
        String fname = "";
        if (fullname == fname) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");

        }
        //problem Statement 3--ArrayIndexOutOfBoundsException
        int[] array = {1, 3, 5, 7};
//        try {
//
//            System.out.println(array[4]);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        //problem Satement 4--NullPointerException.
        String collegename =null;
//        try {
//            System.out.println(collegename.length());
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        try {
            int i = Integer.parseInt(name);
            System.out.println(i);
            System.out.println(array[4]);
            System.out.println(collegename.length());
        }
        catch (NumberFormatException aarry)
        {
            System.out.println(aarry);
        }
        catch (NullPointerException nullc)
        {
            System.out.println(nullc);
        }
        catch (ArrayIndexOutOfBoundsException outofbound)
        {
            System.out.println(outofbound);
        }
        finally {
            System.out.println("");
        }
    }
}
