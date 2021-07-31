public class Application {

    private DatabaseFactory _databaseFactory;
    private Database _database;

    Application(DatabaseFactory databaseFactory){
        _databaseFactory = databaseFactory;
        _database = _databaseFactory.openConnection();
    }

    public void insert_amount(double amount){
        Database db = _databaseFactory.openConnection();
        db.insert(amount * 2);
    }

}
