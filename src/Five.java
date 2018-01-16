public class Five {
    public static void main(String[] args) {
        //Вводим начальную точку
        field(0, 4, 5);
        System.out.println("/////////////////////////////");
        //Переходим
        field(0, 3, 5);
    }

    public static int[][] field(int name, int zs, int z) {
        int[][] array = new int[8][8];
        array[name][zs] = z;
        for (int[] anArray : array) {
            for (int j = 0; j < anArray.length; j++) {
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
}
