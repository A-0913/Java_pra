public class Main {
    public static void main(String[] args) {

        int i1 = 123;
        // 暗黙的にキャストされる(自動的に型変換される)
        // データサイズが小さい型から大きい型は暗黙的にキャストされるため、明示的にキャストする必要がない
        double d1 = i1;
        System.out.println(d1);

        double d2 = 12.345;
        // 明示的にキャストしないとコンパイルエラー
        // データサイズが大きい型から小さい型への代入は明示的にキャストする必要がある
        int i2 = (int) d2;
        System.out.println(i2);

        int i3 = 1;
        int i4 = 2;
        // キャストしないと期待の結果にならない
        double d3 = (double) i3 / i4;
        System.out.println(d3);

        int i5 = 128;
        // 明示的にキャストしないとコンパイルエラー
        // データサイズが大きい型から小さい型への代入は明示的にキャストする必要がある
        byte b1 = (byte) i5;
        System.out.println(b1);
    }
}

// プリミティブ型の型キャストには、２つの内容が定義されている。
// 1.値の範囲拡大のためのプリミテイブ型変換
// 2.値の範囲縮小のためのプリミテイブ型変換

// プリミティブ型の型キャスト構文
// 処理結果の型 変数名 = (処理結果の型)変換前の変数