public class Array {
    public static void main(String[] args) {
        String[] friendNames={"ashu","Vivan","kunal","Rahul","Mudit"};
        friendNames[3]= "Rini";
System.out.println(friendNames[3]);
        System.out.println(friendNames.length);
        for(int i=0;i< friendNames.length;i++) {
            System.out.println(i);
        }
    }
}
