package game.cube;

public class CubeExit extends Cube {

	public CubeExit() {
		super(Cube.IS_WALKABLE, Cube.IS_COLLECTABLE, Cube.IS_NOT_DESTROYABLE);
	}

	@Override
	public void change() {
		System.exit(1);
	}

}