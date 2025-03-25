enum GameType {
    HORROR, RELAXED;
}
abstract class Game {
    protected GameType gameType;

    public Game(GameType gameType) {
        this.gameType = gameType;
    }

    // Factory method to be implemented by subclasses
    abstract Room makeRoom();

    // Game logic that works with Room objects
    public void play() {
        System.out.println("Starting " + gameType + " game...");
        Room room = makeRoom();
        room.describe();

        if (room.challenge()) {
            System.out.println("You passed the challenge! You continue your adventure...");
        } else {
            System.out.println("You failed the challenge! Try again in another room...");
        }
    }
}