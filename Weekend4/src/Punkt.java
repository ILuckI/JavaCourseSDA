public class Punkt {
    int x;              // pole - poza funkcja w klasie
    private int y;      // private - prywatna zmienna tylko dla klasy. zaczyna i konczy sie w klasie

    public Punkt(){ // konstruktor
        x = 1;
        y = 1;
    }

    public void wyswietlWspolrzedne() {
        System.out.printf("[x:%d, y:%d] \n", x, y);
    }

    public int ustawtX(int xWyjsciowe) {
                return x;
    }
    public Punkt ustawX(Punkt ustawX){
        x = ustawX.x;
        return ustawX;
    }
    public int ustawStaryX(int x){
        int oldX = x;
        this.x = x;
        return oldX;
    }


    public int pobierzX() {
        return x;
    }

    public int ustawtY(int yWyjsciowe) {
        return y;
    }
    public Punkt ustawY(Punkt ustawY){
        y = ustawY.y;
        return ustawY;
    }
    public int ustawStaryY(int ustawy){
        int oldY = y;
        y = ustawy;
        return oldY;
    }

    public int pobierzY() {
        return y;
    }

    public Punkt ustawXy(Punkt wejscie) {
        x = wejscie.x;
        y = wejscie.y;
        return wejscie;
    }

    public Punkt pobierzXy() {
        Punkt temp = new Punkt();
        temp.x = x;
        temp.y = y;
        return temp;
    }
    public Punkt ustawXY(Punkt ustawXY){
        Punkt oldPunkt = new Punkt();
        oldPunkt.x = x;
        oldPunkt.y = y;
        x = ustawXY.x;
        y = ustawXY.y;
        return oldPunkt;
    }
}
