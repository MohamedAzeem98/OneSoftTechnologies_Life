package lmsRevision;

public class Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"cardiff","munich","sicily","wales"};
		for(int i=0;i<arr.length;i++) {
			char let=arr[i].charAt(arr[i].length()/2);
			if(let=='a'|| let=='e'|| let=='i'|| let=='o'|| let=='u') {
				System.out.println(arr[i]);
			}
		}
		
	}

}
