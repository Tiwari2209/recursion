public class Recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + "");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
           System.out.println(n);
            return; 
        }
        printInc(n-1);
        System.out.println(n + " ");
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int sum1 = calcSum(n-1);
        int sn = n + sum1;
        return sn;
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        
        return isSorted(arr, i+1);
    }
    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);
    }
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n/2) * (optimizedPower(a, n/2));
        if(n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static int tillingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        return tillingProblem(n-1)+tillingProblem(n-2);
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static int friendPairing(int n){
        if(n==1||n==2){
            return n;
        }
        return friendPairing(n-1) + (n-1)*friendPairing(n-2);

    }
    public static void printBinString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinString(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){
        printBinString(3, 0, "");
    }    
}
