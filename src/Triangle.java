public class Triangle {
    private double a;
    private double b;

    public Triangle (double a1, double b1){
        set_a(a1);
        set_b(b1);
    }
    
    public double get_a(){
        return a;
    }
    public final void set_a(double a2){
        a = Math.abs(a2);
    }
    public double get_b(){
        return b;
    }
    public final void set_b(double b2){
        b = Math.abs(b2);
    }
    
    private double get_c(){
        return Math.sqrt(a*a+b*b);
    }
    
    private double get_area(){
        return a*b/2;
    }
    
    private double get_theta(){
        return Math.atan2(b, a)*180/Math.PI;
    }
    
    private double get_alpha(){
        return Math.atan2(a, b)*180/Math.PI;
    }
    
    public void showInfo(){
        //System.out.println("Triangle");
        System.out.format("a = %f\n", a);
        System.out.format("b = %f\n", b);
        System.out.format("c = %f\n", get_c());
        System.out.format("S = %f\n", get_area());
        System.out.format("Theta = %f\n", get_theta());
        System.out.format("Alpha = %f\n", get_alpha());
    }


}
