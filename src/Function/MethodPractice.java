package Function;

import java.util.Calendar;

public class MethodPractice {
    //うるう年判定
    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }

    //合計値
    public static int getSum(int num1){
        int sum = 0;

        if(num1 > 0){
            for(var i = 0; i < num1; i++){
                sum += (i + 1);
            }
        }

        return sum;
    }

    //素数プログラム
    public static boolean isPrim(int num){
        //2以下だったら素数じゃない。
        if(2 > num) {
            return false;
        }

        for(var i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        //素数
        return true;
    }

    //階乗プログラム
    public static long factorial(int num){
        long sum = 1;

        for(var i = 0; i < num; i++){
            sum *= (i +1);
        }

        return sum;
    }

    //配列の最大値
    public static int findMax(int[] array){
        var tmp = 0;
        for(var i = 0; i < array.length; i++){
            if(array[i] > tmp){
                tmp = array[i];
            }
        }

        return tmp;
    }

    //回文処理
    public static boolean isPalindrome(String str){
        //文字列が1文字以下なら
        if(str.length() <= 1){
            return false;
        }

        //回文判定
        for(var i = 0; i < ((str.length() - 1) - i); i++){
            //比較中
            if(str.charAt(i) == str.charAt((str.length() - 1) - i)){
            }else{
                return false;//回文じゃなければ終了
            }
        }

        //比較が終ったとき
        return true;
    }

    //年月日から年齢取得

    public static int getAge(int year,int month,int date){
        //カレンダークラスのインスタンス生成
        Calendar cl = Calendar.getInstance();

        //現在の年月日を取得
        var nowYear = cl.get(Calendar.YEAR);
        var nowMonth = cl.get(Calendar.MONTH) + 1;
        var nowDate = cl.get(Calendar.DATE);

        //差を計算
        var diff_year = nowYear - year;
        var diff_month = nowMonth - month;
        var diff_date = nowDate - date;
        var age = diff_year;

        //誕生日を超えているか、超えていないかを判定
        if(diff_month < 0){
            age = diff_year - 1;
        }else if(diff_date < 0){
            age = diff_year - 1;
        }

        //年齢を返す
        return age;
    }

    //配列のソート
    public static int[] sortArray(int [] array){

        for(var i = (array.length - 1); i > 0; i--){
            for(var j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    var tmp = 0;
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }



    //二分探索
    public static int getIndex(int [] array , int target,int low,int upper){
        //再起処理を用いて実装してください
        int mid = (low + upper) / 2;

        //範囲外だったら例外を返す。
        if (low < 0 || upper >= array.length || low > upper) {
            throw new IllegalArgumentException("Invalid index range");
        }

        if (array[mid] == target) {
            System.out.println("値が見つかりました!");
            return mid;
        } else if(array[mid] > target) {//左側に値がある時の処理
            return getIndex(array,target,low,mid - 1);
        } else { //右側の時の処理
            return getIndex(array,target,mid + 1,upper);
        }

    }
}
