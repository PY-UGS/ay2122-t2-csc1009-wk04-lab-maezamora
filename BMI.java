public class BMI {
    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        double BMI = (703*weight)/(height*height);
        return BMI;
    }

    public void printBMI(){
        System.out.println("BMI is " +getBMI());
        if(getBMI()<18.5){
            System.out.println("Underweight");
        }
        else if (18.5<=getBMI() && getBMI()<25.0){
            System.out.println("Normal");
        }
        else if (25.0<=getBMI() && getBMI()<30.0){
            System.out.println("Overweight");
        }
        else if (30.0<=getBMI()){
            System.out.println("Obese");
        }
    }
}
