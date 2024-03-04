package derece.oop;

public class ödev {
    private String[] isim;
    private final int[] time;

    public String[] getName(){
        return isim;
    }
    public int[] getTime(){
        return time;
    }

    public ödev(String[] isim, int[] time){
        this.time = time;
        this.isim = isim;

    }



    public int getBirinci(){
        int sabit = time[0];
        for (int sayi : time){
            if (sabit< sayi)
                sabit= sayi;
        }
        for (int zaman : time){
            if (zaman< sabit)
                sabit = zaman;
        }
        return sabit;
    }

    public int getİkinci(){
        int sabit2 = time[0];
        for (int sayi : time){
            if (sabit2< sayi)
                sabit2= sayi;
        }
        for (int zaman2 : time){
            if (zaman2>getBirinci() && zaman2< sabit2 )
                sabit2= zaman2;
        }
        return sabit2;
    }

    public int getÜçüncü(){
        int sabit3 = time[0];
        for (int sayi : time){
            if (sabit3< sayi)
                sabit3= sayi;
        }

        for (int zaman3 : time){
            if (zaman3> getİkinci() && zaman3< sabit3)
                sabit3= zaman3;
        }
        return sabit3;
    }

    public int getAsınıfı(){
        int A = 0;
        for (int a : time){
            if (a<=299 && a>200)
                A++;
        }
        return A;
    }

    public int getBsınıfı(){
        int B = 0;
        for (int b : time){
            if (b<=399 && b>300)
                B++;
        }
        return B;
    }

    public int getCsınıfı(){
        int C = 0;
        for (int c : time){
            if ( c>400)
                C++;
        }
        return C;
    }

    public String getArama1(){
        int a =0;
        while (getBirinci()!= time[a]){
            a++;
        }
        return isim[a];
    }

    public String getArama2(){
        int a =0;
        while (getİkinci()!= time[a]){
            a++;
        }
        return isim[a];
    }

    public String getArama3(){
        int a =0;
        while (getÜçüncü()!= time[a]){
            a++;
        }
        return isim[a];
    }


    public void Sıralama(){
        System.out.println("Birinci: " +getArama1()+"-->" +getBirinci());
        System.out.println("İkinci: " +getArama2()+"-->"  + getİkinci());
        System.out.println("Üçümcü: " +getArama3()+"-->"  + getÜçüncü());
        System.out.println("A sınıfındaki kişi sayısı: " + getAsınıfı());
        System.out.println("B sınıfındaki kişi sayısı: " + getBsınıfı());
        System.out.println("C sınıfındaki kişi sayısı: " + getCsınıfı());
    }

}
