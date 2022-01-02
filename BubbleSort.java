// Jain Aarush
// April 20th, 2020
// Sorting Algorithms
// ICS3U Mrs.Strelkovska

public class BubbleSort {

	public static void main(String[] args) {

		int list1[] = new int[1000];
		int random;
		long start = 0L, end = 0L;
		int microseconds = 0;
		
		for (int i = 0; i < list1.length; i++) {
			random = (int)(Math.random() * 500) + 1;
			list1[i] = random;

		}
		start = System.nanoTime();
		int j, key, temp;
		for (int i = 1; i < list1.length; i++) {

			key = list1[i];
			j = i - 1;
			while (j >= 0 && key < list1[j]) {


				temp = list1[j];
				list1[j] = list1[j + 1];
				list1[j + 1] = temp;
				j--;


			}


		}
		end = System.nanoTime();
		microseconds = (int)((end - start) / 1000);
		for (int i = 0; i < 100; i++) {

			
			System.out.println(list1[i]);
			
		}
		System.out.println();
		System.out.println(microseconds + "\n");




		int list2[] = new int[1000];
	
		for (int a = 0; a < list2.length; a++) {

			random = (int)(Math.random() * 500) + 1;
		
			list2[a] = random;
		}

		start = System.nanoTime();
		int y, z, smallv, smalli, temp1 = 0;
		for (y = 0; y < list2.length; y++) {


			smallv = list2[y];
			smalli = y;
			for (z = y; z < list2.length; z++) {

				if (list2[z] < smallv) {


					smallv = list2[z];
					smalli = z;


				}


			}
			
			if (smallv < list2[y]) {

				temp1 = list2[y];
				list2[y] = list2[smalli];
				list2[smalli] = temp1;

		


			}






		}
		end = System.nanoTime();
		microseconds = (int)((end - start) / 1000);
		for (int x = 0; x < 100; x++) {

			System.out.println(list2[x]);


		}
		System.out.println();
		System.out.println(microseconds);



	}




}
