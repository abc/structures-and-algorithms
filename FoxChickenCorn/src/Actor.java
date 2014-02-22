
public class Actor {
	
	// What side is the actor currently on?
	// TODO: This should be private and have a getter to prevent the IllegalStateException in switchSide().
	String side = "left";
	
	// change the side to the given string
	private void changeSide (String newSide) {
		switch (newSide)
		{
		case "left":
			this.side = "left";
			break;
		case "right":
			this.side = "right";
			break;
		default:
			// don't let this set anything except left or right.
			// TODO: See if there's some sort of enum class or something.
			throw new IllegalArgumentException("side must be left or right");
		}
	}
	
	// invert the actor's side
	public void switchSide ()
	{
		switch (this.side)
		{
		case "left":
			this.changeSide("right");
			break;
		case "right":
			this.changeSide("left");
			break;
		default:
			// If their side is currently not left or right, something very bad happened.
			throw new IllegalStateException("side is not left or right");
		}
	}
	
}
