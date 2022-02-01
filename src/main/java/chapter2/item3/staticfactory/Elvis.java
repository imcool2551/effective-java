package chapter2.item3.staticfactory;

// 코드 3-2: 정적 팩터리 방식의 싱글턴
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {}
}
