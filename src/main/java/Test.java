import java.util.HashMap;

public class Test implements Database{

    private double _amount = 0;

    private static final Test _testSingleton = new Test();

    private Test(){}

    public static Test getInstance() {
         return _testSingleton;
    }

    public static void main(String[] arg){

        double expected_amount = 25;

        //Arrange test
        TestDBFactory testDBFactory = new TestDBFactory();
        Application application = new Application(testDBFactory);

        //Act
        application.insert_amount(expected_amount);

        //spoofing amount value
        double actual_amount = Test.getInstance().getAmount();

        System.out.println("test result > we expected to see " + expected_amount + " but we saw " + actual_amount);
    }

    public void tear_down(){
        _amount = 0;
    }

    public double getAmount(){
        return _amount;
    }

    @Override
    public void insert(double amount) {
        _amount = amount;
    }
}
