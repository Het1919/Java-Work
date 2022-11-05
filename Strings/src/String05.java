
public class String05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String s1="Telusko";
        String s2="iNeuron";
        String s3="Telusko"+"iNeuron"; // Inside SCP Heap.
        
        String s4=s1+s2; // Inside Actual HeapArea.
        String s5=s1+"iNeuron";
        
        System.out.println(s3==s4);
  
	}

}
