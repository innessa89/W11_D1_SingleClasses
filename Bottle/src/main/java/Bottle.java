public class Bottle {

    private int volume;

    public Bottle( int volume){
        this.volume=volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(int drinkAmount){
        if (volume>=drinkAmount) {
            volume -= drinkAmount;
            return volume;
        } else{
            throw new RuntimeException("Not enough to drink");
        }
    }

    public void empty(){
        this.volume=0;
    }

    public void fill(int fillAmount){
        volume+=fillAmount;
    }
}
