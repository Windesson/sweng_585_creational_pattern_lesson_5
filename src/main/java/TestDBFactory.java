public class TestDBFactory implements DatabaseFactory{

    @Override
    public Database openConnection() {
        return Test.getInstance();
    }
}
