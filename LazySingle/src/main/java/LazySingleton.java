public class LazySingleton {

    public static void main(String[] args) {
        System.out.println("Hello Lazy !!! ");

        VisitorTicketTracker vtt = VisitorTicketTracker.getInstance();
        System.out.println(vtt);
        VisitorTicketTracker vtt2 = VisitorTicketTracker.getInstance();
        System.out.println(vtt2);

        System.out.println(vtt == vtt2);
    }
}
