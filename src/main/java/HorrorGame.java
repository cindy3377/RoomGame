class HorrorGame extends Game {
    public HorrorGame() {
        super(GameType.HORROR);
    }

    @Override
    Room makeRoom() {
        return new ScaryRoom();
    }
}