package models;

public enum Level {
    BENG(100),
    BSC(90),
    BA(60),
    BFA(40);

    private int lifePoints;

    Level(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }
}
