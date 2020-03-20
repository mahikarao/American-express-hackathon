import java.util.*;
public class Main
{   
    //Method to extract integer stock price from a sequence of integers separated with " " but given as string;
    static int[] input_array(String input){
		String [] tokens=input.split(" ");
        int [] int_tokens=new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            int_tokens[i]=Integer.parseInt(tokens[i]);}
        return int_tokens;
    }
    //perform comparison function on stock prices-- right operating array;
    static int lucky_days(int [] int_tokens){
        int num_days=int_tokens.length;
        int count=0;
        for(int m=0;m<num_days;m++){
            int max=int_tokens[m];
            boolean isLucky=true;
		
            for(int n=m+1;n<num_days;n++){
                if(int_tokens[n]>max){
                    isLucky=false;
                }
                else{
                    continue;
                }
            }
            if(isLucky==true){
                count+=1;
            }
        }
        return count;
    }
    
    public static final Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) {
		int T=sc.nextInt();
		int [] test_res=new int[T]; 
		//An array to store the result of each test case, all at once;
		
		for(int j=0;j<T;j++){
		    int days=sc.nextInt();
		    sc.nextLine(); //nextInt cant implicitly process nextLine command.This prevents compiler from skipping line 45;
		    String input=sc.nextLine();
		    
		    //calling the two defined functions;
		    int []int_tokens=input_array(input);
		    test_res[j]=lucky_days(int_tokens);
		    
		}
		//Used to print the final result of all given test cases at once;
		for(int num_lucky : test_res){
		    System.out.println(num_lucky);
		}
	}
}

