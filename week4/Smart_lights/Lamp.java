package week4.Smart_lights;

public class Lamp {
    private boolean lamp;

    public void zetAan(){
        this.lamp = true;
    }

    public void zetUit(){
        this.lamp = false;
    }

    public String getLamp(){
        if (this.lamp){
            return "aan";
        }
        else {return "uit";}
    }
}
