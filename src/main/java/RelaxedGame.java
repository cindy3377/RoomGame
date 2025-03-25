class RelaxedGame extends Game {
    public RelaxedGame() {
        super(GameType.RELAXED);
    }

    @Override
    Room makeRoom() {
        return new LovelyRoom();
    }
}