
public class BubbleSort{
	static void bubbleSort(int a[]) {
		int n=a.length;
		int temp=0,i,j;
		for(i=0;i<n;i++) {
			for(j=1;j<(n-i);j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {		
		int a[]= {8,2,5,3,4,7,1};
		System.out.println("Array before sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		bubbleSort(a);
		System.out.println("Array after sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
