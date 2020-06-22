public class q5{
    public static void main(String[] args){
        boolean status = true;
        System.out.print(2+" ");
        for(int i = 3; i<100;i++){
            for (int j = 2;j*j<=i;j++){
                if (i % j == 0){
                    status = false;
                    break;
                }
            }
            if (status == true){
                System.out.print(i + " ");
            }
            status = true;
        }
    }
}
