package Wzorce.WzorceProjektowe.Day4.Singleton.After;

public class Civil {
    // jak nie dopuścić do tworzenia więcej niz 1 obiektu ?
    // dajemy konstruktor private i nie możemy uruchomić konstruktora bezparametrowego
    private int MAX_UNITS = 100;
    private static Civil game = new Civil();

    public void runGame() {
        System.out.println("Game loaded");
    }

    private Civil() {
    }

    public static Civil getGame() {
        return game;
    }
}

