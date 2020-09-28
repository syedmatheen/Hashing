import java.util.HashMap;

public class hashMap {
	public static void main(String[] args) {
		int arr[] = { 0, 4, 5, 10, 5, 4, 10 };
		createHashMap(arr);
	}

	private static void createHashMap(int[] arr) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			Integer value = hashmap.get(arr[i]);

			if (hashmap.get(arr[i]) == null) {
				hashmap.put(arr[i], 1);
			} else {
				hashmap.put(arr[i], ++value); 
			}
		}
		System.out.println(hashmap); 
	}
}
