public class Armstrong {
    public static void main(String[] args) {
        
        int ans=0, rem;
        for(int i=1; i<=1000; i++)
        {
            ans=0;
            if(i<=9){
                System.out.println(i);
            }

            else
            {
                int temp = i;
                while(temp!=0)
                {
                    rem = temp % 10;
                    ans += rem*rem*rem;
                    temp = temp/10; 
                }
                // System.out.println(ans);
                if(i == ans)
                {
                    System.out.println(i);
                }
            }
        }
    }
}