public class Bellyray extends Herbivore {

    public int size;

    public Bellyray(int size) {
        if(size >= 700 && size <= 900) {
            this.size = size;
        }
    }

}
