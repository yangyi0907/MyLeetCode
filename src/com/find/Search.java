package com.find;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YANGYI
 * @create 2021/8/16
 */
public class Search {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5, 6, 7, 9, 10, 25};
        System.out.println(binarySearch1(arr, 0, arr.length - 1, 1));
        //System.out.println(binarySearch2(arr, 0, arr.length - 1, 7));
    }

    public static int seqSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch1(int[] arr, int left, int right, int value) {
        System.out.println("h");
        if (left > right) return -1;
        //int mid = (left + right) / 2;
        int mid = left + (right - left) * (value - arr[left]) / (arr[right] - arr[left]);
        if (arr[mid] > value) {
            return binarySearch1(arr, left, mid - 1, value);
        } else if (arr[mid] < value) {
            return binarySearch1(arr, mid + 1, right, value);
        } else {
            return mid;
        }
    }

    public static List binarySearch2(int[] arr, int left, int right, int value) {
        if (left > right) return new ArrayList<Integer>();
        int mid = (left + right) / 2;
        if (arr[mid] > value) {
            return binarySearch2(arr, left, mid - 1, value);
        } else if (arr[mid] < value) {
            return binarySearch2(arr, mid + 1, right, value);
        } else {
            ArrayList<Integer> resIndexlist = new ArrayList<>();
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != arr[mid]) {
                    break;
                }
                resIndexlist.add(temp);
                temp--;
            }
            resIndexlist.add(mid);
            temp = mid + 1;
            while (true) {
                if (temp > arr.length - 1 || arr[temp] != arr[mid]) {
                    break;
                }
                resIndexlist.add(temp);
                temp++;
            }
            return resIndexlist;
        }
    }

    public static List binarySearch3(int[] arr, int left, int right, int value) {
        if (left > right) return new ArrayList<Integer>();
        int mid = left + (right - left) * (value - arr[left]) / (arr[right] - arr[left]);
        if (arr[mid] > value) {
            return binarySearch3(arr, left, mid - 1, value);
        } else if (arr[mid] < value) {
            return binarySearch3(arr, mid + 1, right, value);
        } else {
            ArrayList<Integer> resIndexlist = new ArrayList<>();
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != arr[mid]) {
                    break;
                }
                resIndexlist.add(temp);
                temp--;
            }
            resIndexlist.add(mid);
            temp = mid + 1;
            while (true) {
                if (temp > arr.length - 1 || arr[temp] != arr[mid]) {
                    break;
                }
                resIndexlist.add(temp);
                temp++;
            }
            return resIndexlist;
        }
    }
}
