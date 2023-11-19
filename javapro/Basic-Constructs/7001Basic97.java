class ninty_seven{
	static void display(int[] arr){
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args){
		int  zero = 0;
		int[] arr = {0,1,1,1,0,0,1,0,0,1};
		System.out.print("Array before separation : ");
		display(arr);
		for(int i: arr){
			if(i==0) zero++;
		}
		for(int i=0; i<arr.length; i++){
			if(zero>0){
				arr[i] = 0;
				zero--;
			}
			else arr[i] = 1;
		}
		System.out.print("Array after separation : ");
		display(arr);
	}
}