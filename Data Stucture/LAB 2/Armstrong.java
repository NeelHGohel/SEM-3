public class Armstrong {
    public static void main(String[] args) {
		int rem,sum=0,n1=1,n2=1000;
		for(int i = n1 ; i<=n2 ; i++){
            int temp  = i;
			rem = temp%10;
			sum = sum + (rem*rem*rem);
			temp = temp/10;
		
		if(sum==i){
			System.out.println(i);
		}
		else{
			continue;
		}
    }
    }
}
