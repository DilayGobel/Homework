package derece.oop;

public class Main {
    public static void main(String[] args) {
        int[] timeArray={341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] isimlerArray={"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali","Emel", "Fırat","James","Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};

        ödev myödev = new ödev(isimlerArray,timeArray);
        myödev.Sıralama();
    }
}
