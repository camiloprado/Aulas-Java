package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main0 {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(new Namorados("Carla"));
        cartoes.add(new Natal("Roberto"));
        cartoes.add(new Aniversario("Amanda"));

        for(CartaoWeb item: cartoes){
            item.showMessage();
        }
    }
}