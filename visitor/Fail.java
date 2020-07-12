package visitor;

public class Fail extends Action{
    @Override
    public void getManResults(Man man) {
        System.out.println("男人给的是失败");
    }

    @Override
    public void getWomanResults(Woman man) {
        System.out.println("女人给的是失败");
    }
}
