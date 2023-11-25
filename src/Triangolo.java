public class Triangolo implements Forma {
    @Override
    public void calcolaArea(int b, int a) {
        int area = (b * a) / 2;
        System.out.println(area);
    }
}
