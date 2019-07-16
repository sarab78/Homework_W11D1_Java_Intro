public class WaterBottle {
    private int volume = 100;


    public int getVolume() {
        return this.volume;
    }

   public int drinkWater(){
       return this.volume -= 10;
   }

   public int emptyBottle(){
        this.volume = 0;
        return this.volume;
   }

   public int fillBottle(){
        return this.volume;
   }
}