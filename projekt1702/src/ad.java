public class ad {

    public static void SoE(int num) {
        System.out.println("Number: " + num);

        if(num == 0)
            return;
        else
            SoE(++num);
    }

    public static void main(String[] args) {
        ad.SoE(1);
    }
}