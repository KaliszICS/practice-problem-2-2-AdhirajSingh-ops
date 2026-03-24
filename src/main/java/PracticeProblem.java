public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int[] compareSearch(int[] array, int number) {
		int sequentialcount = 0;
		int binarycount = 0;

		for(int i = 0; i < array.length; i++) {
			sequentialcount++;
			if(array[i] == number) {
				break;
			}
		}
			int low = 0;
			int high = array.length - 1;
			while(low <= high) {
				binarycount++;
				int mid = low + (high - low) / 2;
				if (array[mid] == number) {
					break;
				} else if (array[mid] < number) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
		}
	
		 return  new int[] {sequentialcount, binarycount};
		
	}

public static int[] compareStringSearch(String[] array, String word) {
    int[] results = new int[2]; 
    
    int seqLoops = 0;
    for (int i = 0; i < array.length; i++) {
        seqLoops++; 
        if (array[i].equals(word)) {
            break; 
        }
    }
    results[0] = seqLoops; 

    int binLoops = 0;
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
        binLoops++; 
        int mid = (low + high) / 2;
        
        int check = word.compareTo(array[mid]);

        if (check == 0) {
            break; 
        } else if (check < 0) {
            high = mid - 1; 
        } else {
            low = mid + 1;  
        }
    }
    results[1] = binLoops; 
    return results;
	}
}



