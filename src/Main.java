public class Main {

    public static void main(String[] args) {

        String senderPhone = "9965555555555";
        boolean isResult = senderPhone.matches("(\\+*)\\d{12}");
        System.out.println(isResult);
    }
}
