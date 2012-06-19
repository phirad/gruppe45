package game.cube;

import game.Game;
import game.Level;
import game.Player;

public class MenuCubeMulti extends Cube {
	public MenuCubeMulti() {
		super(Cube.IS_WALKABLE, Cube.IS_COLLECTABLE, Cube.IS_NOT_DESTROYABLE);
	}

	@Override
	public void change(Player player, Level level) {
		//Game.connect();
		level.setthemeSelection((byte) 2);
	}
}