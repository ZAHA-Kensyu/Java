import java.util.Scanner;
import Function.*;
import java.util.Calendar;
public class Main {
    public static void main (String[]args){
        boolean state = true;

        while(state) {
            System.out.println("どの演習項目を実行しますか? 1 うるう年 2 合計値 3素数判定 4 階乗 5 配列最大値を返す 6 回文 7 年齢取得 8 Sort処理 9 二分探索 0で終了");
            System.out.println("");
            var num = Input();

            switch (num) {
                case 1 ->LeapYearFunc();
                case 2 -> SumFunc();
                case 3 -> PrimFunc();
                case 4 -> FactorialFunc();
                case 5 -> FindMaxFunc();
                case 6 -> KaibunFunc();
                case 7 -> AgeFunc();
                case 8 -> SortFunc();
                case 9 -> GetIndexFunc();
                default -> state = false;
            }
        }

        //System.out.println("演習結果表示 プログラムを終了します。");
    }

    private static void GetIndexFunc(){
        int []array = {1,2,3,4,5};
        var target = 4;

        //ソート中

        //探す値を入力してくだい。
        System.out.println("探す値 "+target);
        System.out.print("arrayの配列 ");
        //結果を表示
        for(var i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("見つかった要素番号 = "+ (MethodPractice.getIndex(array,target,0,array.length -1) + 1));
    }

    //ソート処理
    private static void SortFunc(){
        //配列作成
        int []array ={100,8,5,3,6};

        array = MethodPractice.sortArray(array);

        for(var i = 0; i < array.length; i++){
            System.out.print(" array ["+ array[i]+"]");
        }

        System.out.println("");
    }


    private static void AgeFunc(){
        while(true) {


            System.out.println("年を入力してください。");
            var year = Input();
            System.out.println("月を入力してください。");
            var month = Input();
            System.out.println("日を入力してください。");
            var date = Input();

            System.out.println("年齢は " + MethodPractice.getAge(year, month, date));

            System.out.println("終了しますか? 0 0以外入力で続ける。");
            var num = Input();
            if(num == 0){
                break;
            }
            System.out.println("");
        }
    }
    private static void KaibunFunc(){
        while(true) {
            System.out.println("");
            System.out.println("回文判定を行います。");
            System.out.println("文字列を入力してください。");
            var sc = new Scanner(System.in);
            var str = sc.nextLine();


            if (MethodPractice.isPalindrome(str)) {
                System.out.println("回文です");
            } else {
                System.out.println("回文じゃないです。");
            }

            //終了するか判定
            System.out.println("終了しますか? 0で終了 0以外の数値を入力で続ける");
            var num = Input();
            if(num == 0){
                break;
            }
        }
    }



    private static void FindMaxFunc(){
        //配列を作成
        while(true) {
            System.out.println("いくつの配列を作成しますか? 0で終了");
            var num = Input();

            if(num == 0){
                break;
            }
            //動的配列作成
            int[] array = new int[num];

            System.out.println("配列の数 " + array.length);
            for (var i = 0; i < array.length; i++) {
                System.out.println((i + 1) + "つめに代入する値を入力してください -1で終了");
                var i_num = Input();
                if(i_num == -1){
                    return;
                }

                array[i] = i_num;

            }

            System.out.print("array配列 ");
            System.out.println("");

            for (var i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
            System.out.println("配列の最大値は" + MethodPractice.findMax(array) + "です。");
            System.out.println("");
        }
    }

    private static void FactorialFunc(){
        while(true) {

            System.out.println("");
            System.out.println("1 ~ 20までの階乗の処理です　数値を入力してください 0で終了");
            var num = Input();
            if(num == 0){
                break;
            }
            System.out.println(num + "の階乗は" + MethodPractice.factorial(num) + "です。");
        }
    }

    private static int Input(){
        //入力受付
        var sc = new Scanner(System.in);
        var s = sc.nextLine();
        var num = Integer.parseInt(s);
        return num;
    }

    private static void SumFunc(){
        while(true) {
            System.out.println("");
            System.out.println("入力された値の合計処理です　数値を入力してください 0で終了");
            var num = Input();
            if(num== 0){
                break;
            }

            //合計値
            System.out.println("getSumの戻り値 " + MethodPractice.getSum(num));
        }
    }

    private static void LeapYearFunc(){
        while(true) {
            System.out.println("");
            System.out.println("うるう年の処理です　数値を入力してください 0で終了");
            var num = Input();

            if(num== 0){
                break;
            }
            //うるう年呼び出し
            if (MethodPractice.isLeapYear(num)) {
                System.out.println(num + "はうるう年です。");
            } else {
                System.out.println(num + "はうるう年じゃないです。");
            }
        }
    }

    private static void PrimFunc(){
        while(true) {
            System.out.println("");
            System.out.println("素数の処理です　数値を入力してください 0で終了");
            //入力受付
            var num = Input();

            if(num== 0){
                break;
            }

            if (MethodPractice.isPrim(num)) {
                System.out.println(num + "は素数です。");
            } else {
                System.out.println(num + "は素数ではないです。");
            }
        }
        System.out.println("素数判定終了します。");
    }
}