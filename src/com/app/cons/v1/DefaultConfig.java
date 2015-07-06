package com.app.cons.v1;

/**
 * Created by AR001AF on 11/19/2014.
 */
public class DefaultConfig {

    double[] FAJR_ANGLE =     {16, 18, 15, 18, 18.5, 19.5, 17.7}; //0
    double[] MAGHRIB_OFFSET = {0 , 1 , 1 , 1 , 1   , 1   , 0   }; //1
    double[] MAGHRIB_ANGLE =  {4 , 0 , 0 , 0 , 0   , 0   , 4.5 }; //2
    double[] ISHA_OFFSET =    {0 , 0 , 0 , 0 , 1   , 0   , 0   }; //3
    double[] ISHA_ANGLE =     {14, 18, 15, 17, 90  , 17.5, 14  }; //4
    String[] CALCULATIONS={"JAFARI","KARACHI","ISNA","MWL","MAKKAH","EGYPT","TEHRAN"};

    private int calculationSelector = 2; //DEFAULT ISNA

    public DefaultConfig(String calculation, String juristic){
        calculationSelector = selectCalculation(calculation);
    }

    public double getFajrAngle(){
        return FAJR_ANGLE[calculationSelector];
    }

    public double getMaghribAngle(){
        return MAGHRIB_ANGLE[calculationSelector];
    }

    public double getMaghribOffset(){
        return MAGHRIB_OFFSET[calculationSelector];
    }

    public double getIshaAngle(){
        return ISHA_ANGLE[calculationSelector];
    }

    public double getIshaOffset(){
        return ISHA_OFFSET[calculationSelector];
    }

    public void setCalculationMethod(String calculation){
        calculationSelector = selectCalculation(calculation);
    }

    public String getCalculationMethod(){
        return CALCULATIONS[calculationSelector];
    }

    private int selectCalculation(String calculation){
        for (int i = 0 ; i <= CALCULATIONS.length -1; i++){
            if(CALCULATIONS[i].equals(calculation)){
                return i;
            }
        }
        return calculationSelector;
    }
}
