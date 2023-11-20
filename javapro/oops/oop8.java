class TrafficLight {
     String color;
     int durationInSeconds;
    public TrafficLight(String initialColor, int initialDuration) {
        this.color = initialColor;
        this.durationInSeconds = initialDuration;
    }

   public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Traffic light color changed to " + color);
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public int getDuration() {
        return durationInSeconds;
    }

    public void setDuration(int newDuration) {
        durationInSeconds = newDuration;
        System.out.println("Traffic light duration set to " + durationInSeconds + " seconds");
    }
}

 class M3 {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 60);

        System.out.println("Initial State:");
        displayTrafficLightInfo(trafficLight);

        trafficLight.changeColor("green");
        displayTrafficLightInfo(trafficLight);

        System.out.println("Is it red? " + trafficLight.isRed());

        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.setDuration(45);
        displayTrafficLightInfo(trafficLight);
    }

    private static void displayTrafficLightInfo(TrafficLight trafficLight) {
        System.out.println("Current Color: " + trafficLight.color);
        System.out.println("Current Duration: " + trafficLight.getDuration() + " seconds");
        System.out.println();
    }
}
