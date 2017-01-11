/**
 * Created by root on 11.01.2017.
 */
public class BeerSong {
    public void beersong(){
        int beerNum = 99;
        String word = "бутылок (бутылки)";


        while(beerNum>0){
            if (beerNum%10==1){word = "бутылка"; if (beerNum == 11){word = "бутылок";}}
            System.out.println(beerNum+" "+ word+" "+"пива на столе");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum--;
            word = "бутылок (бутылки)";

        }
        System.out.println("Нет бутылок пива на столе");
    }
}
