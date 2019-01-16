public class main
{
    public static void main(String[] args) {
        Adapter adapter= new AdapterImple();

        System.out.println(adapter.roundOf(200f));
        System.out.println(adapter.nexAfterOf(300f));

    }
}
