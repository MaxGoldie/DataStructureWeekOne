package week1;

public class MergeSort<T extends Comparable<T>> {

	T[] data;

	public MergeSort(T[] d) {
		data = d;
	}

	public T[] mergeSort() {
		mergeSort(0, data.length - 1);

		return data;
	}

	public void mergeSort(int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			merge(start, mid, end);
		}
	}

	public void merge(int start, int mid, int end) {
		int left = mid - start + 1;
		int right = end - mid;
		T leftarray[] = (T[]) new Comparable[left];
		T rightarray[] = (T[]) new Comparable[right];

		for (int i = 0; i < left; i++) {
			leftarray[i] = data[start + i];
		}

		for (int i = 0; i < right; i++) {
			rightarray[i] = data[mid + i + 1];
		}
		int i = 0, j = 0, k = start;
		while (i < left && j < right) {
			if (leftarray[i].compareTo(rightarray[j]) < 0) {
				data[k] = leftarray[i];
				i++;
			} else {
				data[k] = rightarray[j];
				j++;
			}
			k++;
		}
		while (i < left) {
			data[k] = leftarray[i];
			i++;
			k++;
		}
		while (j < right) {
			data[k] = rightarray[j];
			k++;
			j++;
		}
	}
}