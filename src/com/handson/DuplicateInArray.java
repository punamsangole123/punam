package com.handson;

public class DuplicateInArray {
public static void main(String[] args) {
	int a[] = {40,70,30,20,70,20};

	
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1; j <=a.length-1;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
				
			}
		}
	}
	
}
}
