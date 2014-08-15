package ScopedProxy;

public class DoPlayGame {
	private FootBall football;
	private BasketBall basketball;
	public FootBall getFootball() {
		return football;
	}
	public void setFootball(FootBall football) {
		this.football = football;
	}
	public BasketBall getBasketball() {
		return basketball;
	}
	public void setBasketball(BasketBall basketball) {
		this.basketball = basketball;
	}
	public void doGame() {
		this.football.Play();
		this.basketball.Play();
	}
	
}
