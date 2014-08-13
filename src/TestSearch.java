

/******************************************************/
/*** Purpose: Test class to illustrate Search class ***/
/***                                                ***/
/*** Author: Borja De La Viuda                      ***/
/*** 				                                ***/
/******************************************************/



public class TestSearch
{
	
   public static void main(String[] args) 
   {
	   
	   int[] test1 = {18,69,201,331,492,17,67,209,372,498};
	   int[] test2 = {20,832,1452,1937,2615,87,851,1350,1990,2631};
	   
       Search S = new Search(100, 151);
      
       /** Read in data **/
       S.readFileIn("data1.txt");
       
       S.readIntoHash("data1.txt");
       
       System.out.println("\n======Total number of collisions when entering into hash array with data set 1========");
       System.out.println(S.getCollisions());
       
       Search S2 = new Search(1000, 1499);
       
       S2.readFileIn("data2.txt");
       
       S2.readIntoHash("data2.txt");
       
       System.out.println("\n======Total number of collisions when entering into hash array with data set 2========");
       System.out.println(S2.getCollisions());
       
       S.displayData(10, "Test 1 Array");
       S.displayHash(10);
       

       System.out.println("\n\n======Test 1========");
       S.testSearches(test1);
       System.out.println("\n======Totals & Averages for Test 1========");
       S.getTotals();

       
       System.out.println("\n\n======Test 2========");
       S2.testSearches(test2);
       System.out.println("\n======Totals & Averages for Test 2========");
       S2.getTotals();
 

   }
   
}