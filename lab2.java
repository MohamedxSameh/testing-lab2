public class Main {
//
// i- Check even and odd numbers
//
  static String ckeck(int a) {
    	if ( a % 2 == 0)
    		return "Even";
    	else
    		return "Odd";
  }

//
// ii- Finding the maximum and minimum value in an array
//
  static String max_and_min(int [] array)
  {
	  int max = array[0] , min = array[0];
	  for (int i=0 ; i<array.length ; i++)
	  {
		  if(array[i]>max)
			  max = array[i];
		  if(array[i]<min)
			  min = array[i];
	  }
	  String a = min+" "+max;
	  return a;
  }

  public static void main(String[] args) 
  {
	  String a = check(6);
	  System.out.println(a);

	  int [] array = {1,2,3,4,5};
	  String b = max_and_min(array);
	  System.out.println(b);
  }
}
