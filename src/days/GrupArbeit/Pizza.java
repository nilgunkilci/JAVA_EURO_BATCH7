package days.GrupArbeit;

public class Pizza {

    /*
Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping
            Add a constructor that can set all the fields
        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
// create 100 pizza objects: size - 'S',  cheese topping-2, pepperoni topping -3
    // create 100 Pizza Objects: size - 'M', cheese topping-3,  pepperoni topping -4
    //create 100 Pizza Objects: size - 'L', cheese topping-4,  pepperoni topping -5


    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;


    }
    public double calcCost(){
        double startingPrice= (size == 'S') ? 10 : ( size == 'M') ? 12 : 14 ;
        double totalPrice = startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        return totalPrice;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calcCost() +

                '}';
    }
}
