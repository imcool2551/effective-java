package chapter2.item3.field;

// 코드 3-1 public static final 필드 방식의 싱글턴 (23쪽)
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public void leaveTheBuilding() {}
}
