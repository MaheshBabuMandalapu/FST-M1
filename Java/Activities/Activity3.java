public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double es =31557600;
        double ms=0.2408467;
        double vs= 0.61519726;
        double mas=1.8808158;
        double js=11.862615;
        double ss=29.447498;
        double us=84.016846;
        double ns=164.79132;
        System.out.println("Age of mercury : "+ seconds/es/ms);
        System.out.println("Age of venus : "+ seconds/es/vs);
        System.out.println("Age of mars : "+ seconds/es/mas);
        System.out.println("Age of jupiter : "+ seconds/es/js);
        System.out.println("Age of satrun : "+ seconds/es/ss);
        System.out.println("Age of uranus : "+ seconds/es/us);
        System.out.println("Age of neptune : "+ seconds/es/ns);
    }

}
