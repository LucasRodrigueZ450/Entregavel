public class Contagem {
    public static int Contagem(int[] numbers, int N) {
        int count = 0;
        for (int num : numbers) {
            if (num >= numbers[0] && num <= N) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println(Contagem(numbers, 7)); 
    }
}

