package introducao_poo_02.tv;

public class TV {
    String brand;
    int volume;

    public void increaseVolume(int up) {
        this.volume += up;
    }
    public String toString () {
        return brand + ", Volume: " + volume;
    }
}
