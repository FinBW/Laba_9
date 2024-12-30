package org.example;

@Table(title = "Gold")
public class GoldAntilopa {

    public enum givedmoney {
        LOW, MEDIUM, HIGH;
        public String givedmoney() {
            return this.toString();
        }
    }

    @Column
    private String name;

    @Column
    private double age;

    @Column
    private int maxRunDistance;

   // @Column
    private givedmoney givedmoney;

    public GoldAntilopa(String name, double age, int maxRunDistance, givedmoney givedmoney) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.givedmoney = givedmoney;
    }


}
