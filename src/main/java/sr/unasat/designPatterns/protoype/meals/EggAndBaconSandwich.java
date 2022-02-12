package sr.unasat.designPatterns.protoype.meals;

import sr.unasat.designPatterns.protoype.Meal;

public class EggAndBaconSandwich extends Meal {

    public EggAndBaconSandwich() {
        mealName = "Egg and bacon sandwich";
    }

    @Override
    public double price() {
        return meal().getPrice();
    }

    @Override
    public long id() {
        return meal().getId();
    }

}
