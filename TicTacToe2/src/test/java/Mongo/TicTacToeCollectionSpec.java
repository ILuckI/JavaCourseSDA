package Mongo;

import com.mongodb.MongoException;
import org.jongo.MongoCollection;
import org.junit.Before;
import org.junit.Test;

import java.net.UnknownHostException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TicTacToeCollectionSpec {
    TicTacToeCollection collection;
    MongoCollection fakeMongoCollection;
    TicTacToeBean bean;

    @Before
    public void before() throws UnknownHostException {
        collection = spy(new TicTacToeCollection());
        bean = new TicTacToeBean(2, 1, 2, 'O');
        fakeMongoCollection = mock(MongoCollection.class);
    }

    @Test
    public void whenInstantiatedThenMongoHasDbNameTicTacToe() {
        assertEquals("tic-tac-toe", collection.getMongoCollection().getDBCollection().getDB().getName());
    }

    @Test
    public void whenInstantiatedThenMongoCollectionHasNameGame() {
        assertEquals("game", collection.getMongoCollection().getName());
    }

    @Test
    public void whenSaveMoveThenInvokeMongoCollectionSave() {
        doReturn(fakeMongoCollection).when(collection).getMongoCollection();
        collection.saveMove(bean);
        verify(fakeMongoCollection, times(1)).save(bean);
    }

    @Test
    public void whenSaveMoveThenReturnTrue() {
        doReturn(fakeMongoCollection).when(collection).getMongoCollection();
        assertTrue(collection.saveMove(bean));

    }
    @Test
    public void givenExceptionWhenSaveMoveThenReturnFalse(){
        doThrow(new MongoException("blaaa")).when(fakeMongoCollection).save(any(TicTacToeBean.class));
        doReturn(fakeMongoCollection).when(collection).getMongoCollection();
        assertFalse(collection.saveMove(bean));
    }
    @Test
    public void whenDropThenInvokeMongoCollectionDrop(){
        doReturn(fakeMongoCollection).when(collection).getMongoCollection();
        collection.drop();
        verify(fakeMongoCollection, times(1)).drop();

    }
    @Test
    public void whenDropThenReturnTrue(){
        doReturn(fakeMongoCollection).when(collection).getMongoCollection();
        assertTrue(collection.drop());
    }
    @Test
    public void givenExceptionWhenDropThenReturnFalse(){
        doThrow(new MongoException("blaaa")).when(fakeMongoCollection).drop();
        doReturn(fakeMongoCollection).when(collection).getMongoCollection();
        assertFalse(collection.drop());
    }
}
