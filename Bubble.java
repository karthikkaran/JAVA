import java.util.Scanner;
import java.lang.System;

class Bubble{
static void bub(int[] arr)
{
int n = arr.length;
int temp = 0;
for(int i=0;i<n;i++) for(int j=1;j<(n-i);j++)
if(arr[j-1]>arr[j])
{
temp = arr[j-1];
arr[j-1] = arr[j];
arr[j] = temp;
}
}

public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
int a[] = new int[n];
//System.out.print(n);
for(int i=1;i<args.length;i++) a[i-1] = Integer.parseInt(args[i]);
bub(a);
for(int i=0;i<n;i++) System.out.println(a[i]);
}
}

