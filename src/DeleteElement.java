public class DeleteElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 2, 2, 6, 7, 8};
        int x = 2;
        int sophantuthucte = a.length;

        for (int i = 0; i < sophantuthucte; i++) { // lay tung phan tu ra de xet//
            while (a[i] == x) {
                for (int j = i; j < sophantuthucte - 1; j++) {
                    a[j] = a[j + 1];
                }
                sophantuthucte--;
            }


        }
        System.out.println("Mang sau khi xoa phan tu:");
        for (int i = 0; i < sophantuthucte; i++) {
            System.out.printf("\n[%d] = %d", i, a[i]); // cho phep in ra cac ki tu dac biet nhu [], vi du \n la dau cach, i se nam trong ngoac []//
//            System.out.println("phan tu thu:" +i + "la:" +a[i]);
        }

    }
}
