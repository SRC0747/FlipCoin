public class FlipCoin {
        int isCoin=1;
        int count1=0;
        int count2=0;
        int randomCheck = (int) Math.floor(Math.random())%2;
        void count()
        {
            for (int i=1; i<=100; i++) {
                if (isCoin == randomCheck) {
                    System.out.println("Head occurs.");
                    count1++;
                }
                else {
                    System.out.println("Tail occurs.");
                    count2++;
                }
            }
            System.out.println("Head Percentage of Occurring:"+count1);
            System.out.println("Tail Percentage of Occurring:"+count2);
        }
}
class Percentage
{
    public static void main(String args[])
    {
        FlipCoin ob =new FlipCoin();
        ob.count();
    }
}
