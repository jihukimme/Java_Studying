package javaProject;


class Car {

    int gasolineGauge;    
    
    public Car() {
    	this.gasolineGauge =0;
    }
    
    public Car(int gasolineGauge) {
    	this.gasolineGauge = gasolineGauge;
    }
    
}



class HybridCar extends Car {  

    double electricGauge;    
    
    public HybridCar(double electricGauge) {
    	this.electricGauge = electricGauge;
    }
    
    public HybridCar(int gasolineGauge, double electricGauge) {
    	super(gasolineGauge);
    	this.electricGauge = electricGauge;
    }
}



class HybridWaterCar extends HybridCar {   
	
    double waterGauge;    
  
    public HybridWaterCar(double electricGauge, double waterGauge) {
    	super(electricGauge);
    	this.waterGauge = waterGauge;
    }
    
    public HybridWaterCar(int gasolineGauge, double electricGauge, double waterGauge) {
    	super(gasolineGauge, electricGauge);
    	this.waterGauge = waterGauge;
    }
  
    
    public void showCurrentGauge() {
    	System.out.println("잔여 가솔린: " + gasolineGauge);
    	System.out.println("잔여 전기량: " + electricGauge);
    	System.out.println("잔여 워터량: " + waterGauge);
    }

}




class ClassBaicConstructor {

    public static void main(String[] args) {

       HybridWaterCar hwCar1 = new HybridWaterCar(4.2, 2);

       hwCar1.showCurrentGauge();

    	

       HybridWaterCar hwCar2 = new HybridWaterCar(9, 5.1, 7);

       hwCar2.showCurrentGauge();

    }

}