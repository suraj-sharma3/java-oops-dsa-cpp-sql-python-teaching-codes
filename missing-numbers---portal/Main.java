/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {
        int cnt1[] = new int[10001];
        int cnt2[] = new int[10001];

        for(int i = 0; i < n; i++){
            cnt1[arr[i]]++;
        }
        for(int i = 0; i < m; i++){
            cnt2[brr[i]]++;
        }
        for(int i = 1; i < 10000; i++){
            if(cnt1[i] == 0 && cnt2[i] > 0){
                System.out.print(i + " ");
            }
            else if(cnt1[i] > 0 && cnt2[i] > 0 && cnt1[i] != cnt2[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {
        TreeMap<Integer, Integer> cnt1 = new TreeMap<>();
        TreeMap<Integer, Integer> cnt2 = new TreeMap<>();

        for(int i = 0; i < n; i++){
            if(cnt1.containsKey(arr[i])){
                cnt1.put(arr[i], cnt1.get(arr[i]) + 1);
            }
            else{
                cnt1.put(arr[i], 1);
            }
        }

        for(int i = 0; i < m; i++){
            if(cnt2.containsKey(brr[i])){
                cnt2.put(brr[i], cnt2.get(brr[i]) + 1);
            }
            else{
                cnt2.put(brr[i], 1);
            }
        }

        for(Integer i : cnt2.keySet()){
            if(cnt1.containsKey(i) == false){
                System.out.print(i + " ");
            }
            else if(cnt1.containsKey(i) && cnt1.get(i) != cnt2.get(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }       
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
    }
}