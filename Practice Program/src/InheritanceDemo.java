public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();
        parent.grandparentMethod();

    }
}
class Parent extends  GrandParent{
    void  parentMethod(){
        System.out.println("Parent Method");
    }
}
class GrandParent{
    void  grandparentMethod() {
        System.out.println(" Grand Parent Method");
    }

}