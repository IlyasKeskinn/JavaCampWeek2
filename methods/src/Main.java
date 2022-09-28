public class Main {

    public static void main(String[] args) {

        sayiBulmaca();

    }


    public static void sayiBulmaca() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;
        for (int number : numbers) {
            if (number == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            sendMessagge("Sayı mevcuttur: " + aranacak);
        } else {
            sendMessagge("Sayı mevcut değildir: "  + aranacak);
        }

    }

    public static void sendMessagge(String messagge){
        System.out.println(messagge);
    }
}
