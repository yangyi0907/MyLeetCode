package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author YANGYI
 * @create 2021/11/3
 */
public class quick {
    public static void random(int[] a,int n, int bound) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int ran1 = r.nextInt(bound);
            a[i] = ran1;
        }
    }

    public static void main(String[] args) {
        int[] a=new int[1000000];
        random(a,a.length, 1000);
        int[] b=a.clone();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");

        }
        System.out.println();
        long startTime1 = System.currentTimeMillis();
        QSort1(a, 0, a.length - 1);
        //Arrays.sort(a);
        long endTime1 = System.currentTimeMillis();
        System.out.println("未优化时间：" + (endTime1 - startTime1) + "ms");

        long startTime2 = System.currentTimeMillis();
        QSort2(b, 0, b.length - 1);
        //Arrays.sort(b);
        long endTime2 = System.currentTimeMillis();
        System.out.println("优化时间：" + (endTime2 - startTime2) + "ms");
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=b[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        //System.out.println("排序后数组：" + Arrays.toString(b));
    }

    static void QSort2(int arr[], int low, int high) {
        int pivotPos;
        if (high - low  < 10) {
            InsertSort(arr, low, high);
            return;
        }
        if (low < high) {
            pivotPos = Partition(arr, low, high);
            QSort2(arr, low, pivotPos - 1);
            QSort2(arr, pivotPos + 1, high);
        }
    }

    static void QSort1(int arr[], int low, int high) {
        int pivotPos;
        if (low < high) {
            pivotPos = Partition(arr, low, high);
            QSort1(arr, low, pivotPos - 1);
            QSort1(arr, pivotPos + 1, high);
        }
    }

    static void InsertSort(int arr[], int m, int n) {
        for (int i = m+1; i <= n; i++) {
            while(i>0&&arr[i]>arr[i-1]){
                Swap(arr,i,i-1);
                i--;
            }
        }
    }

    static void Swap(int[] a, int i, int j) {
        int flag = a[i];
        a[i] = a[j];
        a[j] = flag;
    }

    static int Partition(int a[], int p, int r) {
        int x=a[r];
        int i=p-1;
        for (int j = p; j < r; j++) {
            if(a[j]<=x){
                i++;
                Swap(a,i,j);
            }
        }
        Swap(a,i+1,r);
        return i+1;
    }
}



