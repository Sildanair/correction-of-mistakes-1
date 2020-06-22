public class q4 {
    public static void main(String[] args){
        long[] a = new long[10];
        for (int i = 0; i<a.length; i++){
            a[i] = Math.round(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("Минимальное значение = "+ min(a));
        System.out.println("Максимальное значение = "+max(a));
        System.out.println("Среднее значение = "+ average(a));
    }
    public static long min(long[] array){
        long min = 32767;
        for (int i = 0; i<array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static long max(long[] array){
        long max = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    public static long average(long[] array){
        long sum = 0;
        for (int i = 0; i<array.length; i++){
            sum+=array[i];
        }
        return Math.round(sum/array.length);
    }
}
