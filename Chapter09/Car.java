package practice;

public class Car {
  // 燃費（Km/L）
  private double fuelCost;
  // 残量（L）
  private double fuelAmount;

  // コンストラクタを作成
  public Car(double fuelCost, double fuelAmount){
     this.fuelCost = fuelCost;
     this.fuelAmount = fuelAmount;
  }
  // moveメソッド
  public void move(int distance){
    // ・"xx km 走ります"を出力
    System.out.println( distance + "km 走ります");
    // ・残量を計算
    this.fuelAmount -= (distance / fuelCost);
  }

  // fuelAmountを取得するメソッド
  public double getFuelAmount(){
    return this.FuelAmount;
  }
}