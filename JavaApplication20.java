package javaapplication20;

class BS{
    BS(int[] Array){
        int[] FinalArray = {};
        for (int j = 0;j <= Array.length-1;j++){
            if(Array[j] <= Array[j-1] || Array[j] <= Array[j-2] || Array[j] <= Array[j-3] || Array[j] <= Array[j-4]){
                FinalArray[0] = Array[j];
                System.out.println(FinalArray);
                break;
            }
//            else if(Array[j] <= Array[j-1] || Array[j] <= Array[j-2] || Array[j] <= Array[j-3] || Array[j] <= Array[j-4]){
//                
//            }
        }
    }
}

public class JavaApplication20 {

    public static void main(String[] args) {
        int InitialArray[] = {5, 4, 3, 2, 1};
	System.out.print("Initial Array : ");
	for (int i = 0;i <= InitialArray.length-1;i++){
            System.out.print(InitialArray[i]);
            System.out.print(" ");
	}
        BS obj = new BS(InitialArray);
    }
}
