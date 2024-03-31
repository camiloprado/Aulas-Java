import java.util.ArrayList;
import java.util.List;

public class shoppinCart {
    private int id;
    private float totalPrice;
    private List<carItem> carItens;

    public shoppinCart(){
        this.carItens = new ArrayList<carItem>();
    }

    public shoppinCart(int id, float totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.carItens = new ArrayList<carItem>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<carItem> getCarItens() {
        return carItens;
    }

    public void setCarItens(List<carItem> carItens) {
        this.carItens = carItens;
    }

    public void addCarItem(int id, int quantity, Product product){
        this.carItens.add(new carItem(id,quantity,product));
    }

    public String itemCarrinho() {
        return "Carrinho =" + carItens;
    }
}


