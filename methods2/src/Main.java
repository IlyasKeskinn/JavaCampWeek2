public class Main {

    public static void main(String[] args) {

        int result = addition(5,1);
        System.out.println(result);
        int result2 = addition2(5,1,12,5,8,6,254);
        System.out.println(result2);




    }

    public static void add(){
        System.out.println("Added");
    }
    public static void delete(){
        System.out.println("Deleted");
    }
    public static void update(){
        System.out.println("Updated");
    }

    public static int addition(int number1, int number2){
        return number1 + number2;
    }
    public static int addition2(int... numbers){
        int sum =0;
        for (int number: numbers){
            sum += number;
        }
        return sum;
    }
}
