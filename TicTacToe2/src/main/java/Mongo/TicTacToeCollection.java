package Mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.net.UnknownHostException;

public class TicTacToeCollection {

    private MongoCollection mongoCollection;

    public MongoCollection getMongoCollection() {
        return mongoCollection;
    }

    public TicTacToeCollection() throws UnknownHostException {
        DB db = new MongoClient().getDB("tic-tac-toe");

        mongoCollection = new Jongo(db).getCollection("game");
    }

    public boolean saveMove(TicTacToeBean been) {
        try {
            getMongoCollection().save(been);
        } catch (MongoException e) {
            return false;
        }
        return true;
    }


    public boolean drop() {
        try {
            getMongoCollection().drop();
        } catch (MongoException e) {
            return false;
        }
        return true;
    }
}
