public class AdapterImple implements Adapter{


    @Override
    public Float nexAfterOf(Float f) {
        System.out.println("nexAfter Start!");
        return (float) Math.nextAfter(f,2);
    }

    @Override
    public Float roundOf(Float f) {
        System.out.println("roundOf Start!");
        return (float) Math.round(f);

    }
}
