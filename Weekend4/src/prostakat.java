public class prostakat {
    Punkt a = new Punkt();
    Punkt b = new Punkt();
    Punkt c = new Punkt();
    Punkt d = new Punkt();


    public Punkt pobierzA(){
        return a;
    }
    public Punkt pobierzB(){
        return b;
    }
    public Punkt pobierzC(){
        return c;
    }
    public Punkt pobierzD(){
        return d;
    }
    public void wyswietlWsp(){
        a.wyswietlWspolrzedne();
        b.wyswietlWspolrzedne();
        c.wyswietlWspolrzedne();
        d.wyswietlWspolrzedne();
    }
}
