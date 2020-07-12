package visitor;

public class Pass extends Action {
    @Override
    public void getManResults(Man man) {
        System.out.println("男的给的评价通过");
    }

    @Override
    public void getWomanResults(Woman woman) {
        System.out.println("女人给的评价是通过");
    }
}
