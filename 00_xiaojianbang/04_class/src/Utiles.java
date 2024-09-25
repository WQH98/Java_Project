public class Utiles {

    public static void main(String[] args) {
        double[] arr = new double[] {10.0, 11.0, 12.2, 2, 30.2, 20.0, 33.0, 39.8, 9.0, 8};
        double max = get_max(arr);
        System.out.println(max);

        int index = find("Hello World", 'W');
        System.out.println(index);

        Circle circle = new Circle(10);
        System.out.println(circle.get_area());
        System.out.println(circle.get_perimeter());
    }

    static double get_max(double[] a) {
        double max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    static int find(String str, char a) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a) {
                return i;
            }
        }
        return -1;
    }
}
