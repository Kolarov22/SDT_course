public class NutritionFacts {
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // (per serving) optional
    private final int fat; // (g/serving) optional
    private final int sodium; // (mg/serving) optional
    private final int carbohydrate; // (g/serving) optional

    private NutritionFacts(int servingSize, int servings,
                           int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize= servingSize;
        this.servings= servings;
        this.calories= calories;
        this.fat= fat;
        this.sodium= sodium;
        this.carbohydrate= carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    static class Builder{
        private  int servingSize; // (mL) required
        private  int servings; // (per container) required
        private  int calories; // (per serving) optional
        private  int fat; // (g/serving) optional
        private  int sodium; // (mg/serving) optional
        private  int carbohydrate; // (g/serving) optional

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(servingSize,servings,calories,fat,sodium,carbohydrate);
        }


    }

    public static void main(String args[]){
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).fat(27).build();
        System.out.print(cocaCola);
    }
}
