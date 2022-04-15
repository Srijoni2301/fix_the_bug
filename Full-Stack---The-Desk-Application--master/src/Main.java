

	import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	public class Main {
		private ArrayList<Integer> expenses;
	    public static void main(String[] args) {
	        /*System.out.println("Hello World!");*/
	        System.out.println("\n**************************************\n");
	        System.out.println("\tWelcome to TheDesk \n");
	        System.out.println("**************************************");
	        
	        Main m=new Main();
	        m.run();
	        
	    }
	    public void  run() {
	    	optionsSelection();
	    }
	    private static void printval() {
	    	String[] arr = {"1. I wish to review my expenditure",
	                "2. I wish to add my expenditure",
	                "3. I wish to delete my expenditure",
	                "4. I wish to sort the expenditures",
	                "5. I wish to search for a particular expenditure",
	                "6. Close the application"
	        };
	        //bug...
	        //int[] arr1 = {1,2,3,4,5,6};
	        //int  slen = arr1.length;
	        for(int i=0; i<arr.length;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	    }
	    private  void optionsSelection() {
	        printval();
	        //ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        //bug
	        expenses = new ArrayList<Integer>();
	        expenses.add(1000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(32000);
	        expenses.add(110);
	        //expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options = 0;
	        //bug there is no need for if and for
	        //for(int j=1;j<=slen;j++){
	            //if(options==j){
	        while(options!=6) {
	        		options =  sc.nextInt();
	                switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        printval();
	                        //optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Your value is updated\n");
	                        //expenses.addAll(arrlist);
	                        System.out.println(expenses+"\n");
	                        printval();
	                        //optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        printval();
	                        //optionsSelection();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        printval();
	                        //optionsSelection();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        printval();
	                        //optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	               // }
	            //}
	        }

	    }
	    private  void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private  void searchExpenses(ArrayList<Integer> arrayList) {
	       
	        System.out.println("Enter the expense you need to search:\t");
	        Scanner sc = new Scanner(System.in);
	        int se=sc.nextInt();
	        if (arrayList.contains(se)) {
	        	System.out.println("The Value  "+se+" is present:\t");
	        	return;
	        }
	        System.out.println("The Value  "+se+" is not present:\t");
	        //Complete the method
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	        
	        Collections.sort(arrayList);  
	        System.out.print("Your Shorted Expenses is ");
	        System.out.println(arrayList);
	       //Complete the method. The expenses should be sorted in ascending order.
	        
	    }
	}


