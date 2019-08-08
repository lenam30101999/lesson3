public class Unit2 {
    public static void main(String[] args){
        System.out.println("Le Vu Nam");
        //Bai 2:
        double dt2 = dientich2(7,5,6);
        System.out.println("S= " + dt2);

        //Bai 3:
        double dt3 = dientich3(3);
        System.out.println("S= " + Math.ceil(dt3*1000)/1000);

        //Bai 4:
        double dt4 = dientich4(5,6,7);
        System.out.println("S= " + Math.ceil(dt4*1000)/1000);

        //Bai 5:
        double gt5 = giatri1(1234,4321);
        System.out.println("(x+y)/(x-y)= " + Math.ceil(gt5*1000)/1000);

        //Bai 6:
        double gt6 = giatri2(3);
        System.out.println(Math.ceil(gt6*1000)/1000);

        //Bai 7:
        double gt7 = giatri3(6);
        System.out.println(Math.ceil(gt7*1000)/1000);

        //Bai 8:
        chuyen(543200);

    }
    public static double dientich2(double l, double n, double c){
        return (l+n)*c/2;
    }
    public static double dientich3(double r){
        return Math.pow(r,2)*Math.PI;
    }
    public static double dientich4(double a, double b, double c){
        double p = ( a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static double giatri1(double x, double y){
        return (x+y)/(x-y);
    }
    public static double giatri2(double x){
        return Math.sqrt(x + Math.sqrt(x + Math.sqrt(x)));
    }
    public static double giatri3(double x){
        return Math.pow(x,3) + Math.log( Math.pow(x,4) + 2)/Math.log(2.0) - Math.cbrt(x - 4);
    }
    public static void chuyen(int se){
        int h , m, n;
        n=se;
        h = se / 3600;
        se = se - h * 3600;
        m = se / 60;
        se = se - m * 60;
        System.out.println(n + " giay la " + h + " gio "+ m + " phut "+ se + " giay");
    }
}
