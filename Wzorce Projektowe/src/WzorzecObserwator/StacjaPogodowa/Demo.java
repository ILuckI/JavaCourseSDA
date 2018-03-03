package WzorzecObserwator.StacjaPogodowa;

import WzorzecObserwator.StacjaPogodowa.Wyswietlacze.WarunkiBiezace;

public class Demo {
    public static void main(String[] args) {

        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawOdczyty(-3.0f, 34.5f,1024.0f);
        wb.wyswietlElement();

        dp.ustawOdczyty(-2.0f, 40.0f, 997.0f);
        wb.wyswietlElement();


    }
}
