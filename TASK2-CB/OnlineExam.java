import java.util.Scanner;
import java.util.HashMap;

class OnlineExam{
    HashMap<String,Integer> d = new HashMap <String,Integer>();
    Scanner input = new Scanner(System.in);
    
    public void login()
    {
    	System.out.println("\n********** Welcome to ONLINE EXAM SYSTEM **********\n");
        System.out.println("Enter User-Id: ");
        String userID = input.nextLine();
        System.out.println("Enter Password: ");
        int password = input.nextInt();
        d.put("Mahi",105);
        
        if (d.containsKey(userID) && d.get(userID) == password)
        {
            System.out.println("Log-In Successful!");
            main();
        }
        else{
            System.out.println("Invalid!! Please Check...");
            login();
        }
    }
    
    public void main()
    {
        System.out.println("\n1.Update\n2.Start test\n3.Logout");
        System.out.println("Enter your choice: ");
        int op=input.nextInt();
        switch(op){
            case 1 : 
            	d = update();
            	main();
            	break;
            case 2 : 
            	solve();
            	main();
            	break;
            case 3 : 
            	System.exit(0);
            	break;
            default: 
            	System.out.println("Invalid Choice!");
        }
    }
    
    public HashMap<String,Integer> update()
    {
        System.out.println("\n----- Update -----");
        System.out.println("Enter Username: ");
        
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();
        
        if (d.containsKey(id))
        {
            System.out.println("Enter New Password: ");
            int newpd = input.nextInt();
            d.replace(id,newpd);
            System.out.println("Profile Update Success!");
        }
        else
        {
            System.out.println("User does not exist...");
            System.out.println("Profile Update Failed!");
        }
        return d;
    }
    
    public void solve(){
        long start = System.currentTimeMillis();
        long terminate = start + 60 * 1000;
        int score = 0;
        int c = 0, w = 0;
        char ans;
        System.out.println("\n\n***** Starting The Test *****");
        System.out.println("You have 1 Minute to answer each question. Select the options wisely... ");
        System.out.println("Each question gives +5 marks for a correct answer and -1 mark for a wrong answer.");
        System.out.println("All the very best!!");
        
        while(System.currentTimeMillis() < terminate)
        {
            System.out.println("\nQ1. Which of the following below live on the heap in Java?");
            System.out.println("a.Class\nb.Instance Variable\nc.Object\nd.Method");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'c')
            {
                c += 1;
            }
            else
                w -= 1;
            
            System.out.println("\nQ2.Which of these interface handle sequences?");
            System.out.println("a.Comparator\nb.List\nc.Collection\nd.Set");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'b'){
                c += 1;
            }
            else
                w -= 1;
            
            System.out.println("\nQ3.What is TRUE about the finalize() method?");
            System.out.println("a.It may be called zero or one times.\nb.It may be called zero or more times.\nc.It will be called exactly once.\nd.It may be called one or more times.");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'a')
            {
                c += 1;
            }
            else
                w -= 1;
            
            System.out.println("\nQ4.Which of the following interface must contain a unique element?");
            System.out.println("a.Set\nb.Collection\nc.List\nd.Array");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'a')
            {
                c += 1;
            }
            else
                w -= 1;
            
            System.out.println("\nQ5.Which of the following does not compile?");
            System.out.println("a.int num = 999;\nb.int num = 9_9_9;\nc.int num = _9_99\nd.None of the above;they all compile");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'c') 
            {
                c += 1;
            }
            else
                w -= 1;
            break;
        }
        
        System.out.println("Test Completed!");
        score = ((c * 5) + w);
        System.out.println("Number of correct answers: " + c);
        System.out.println("Congratulations!! Your score is " + score + ".");
    }
    
    public static void main(String args[]){
    	OnlineExam e = new OnlineExam();
        e.login();
    }
}