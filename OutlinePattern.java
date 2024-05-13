package com.practice.programs;

public class OutlinePattern {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0; i<n; i++){
            for(int j=0; j < 2*n-1; j++){
                if(i+j == n-1){
                    System.out.print(" *");
                }
                else if(i == n-1){
                    System.out.print(" *");
                }
                else if(j == (n-1) +i){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
