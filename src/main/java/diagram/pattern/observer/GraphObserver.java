package diagram.pattern.observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGeneration generation) {
        System.out.println("GraphObserver:");
        int count = generation.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
        try{
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
