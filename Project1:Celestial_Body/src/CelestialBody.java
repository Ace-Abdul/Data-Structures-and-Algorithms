

/**
 * Celestial Body class for NBody
 * @author ola
 *
 */
public class CelestialBody {

	private double myXPos;
	private double myYPos;
	private double myXVel;
	private double myYVel;
	private double myMass;
	private String myFileName;

	/**
	 * Create a Body from parameters	
	 * @param xp initial x position
	 * @param yp initial y position
	 * @param xv initial x velocity
	 * @param yv initial y velocity
	 * @param mass of object
	 * @param filename of image for object animation
	 */
	public CelestialBody(double xp, double yp, double xv,
			             double yv, double mass, String filename){
		// TODO: complete constructor
		myXPos = xp;
		myYPos = yp;
		myXVel = xv;
		myYVel = yv;
		myMass = mass;
		myFileName = filename;

	}

	/**
	 * Copy constructor: copy instance variables from one
	 * body to this body
	 * @param b used to initialize this body
	 */
	public CelestialBody(CelestialBody b){
		// TODO: complete constructor
		myXPos = b.getX();
		myYPos = b.getY();
		myXVel = b.getXVel();
		myYVel = b.getYVel();
		myMass = b.getMass();
		myFileName = b.getName();
	}

	public double getX() {
		// TODO: complete method
		return myXPos;
	}
	public double getY() {
		// TODO: complete method
		return myYPos;
	}
	public double getXVel() {
		// TODO: complete method
		return myXVel;
	}
	/**
	 * Return y-velocity of this Body.
	 * @return value of y-velocity.
	 */
	public double getYVel() {
		// TODO: complete method
		return myYVel;
	}
	
	public double getMass() {
		// TODO: complete method
		return myMass;
	}
	public String getName() {
		// TODO: complete method
		return myFileName;
	}

	/**
	 * Return the distance between this body and another
	 * @param b the other body to which distance is calculated
	 * @return distance between this body and b
	 */
	public double calcDistance(CelestialBody b) {
		// TODO: complete method
		double r = Math.sqrt((myXPos - b.getX()) *(myXPos - b.getX()) + (myYPos - b.getY()) * (myYPos - b.getY()));
		return r;
	}

	public double calcForceExertedBy(CelestialBody b) {
		// TODO: complete method
		double G = 6.67 * Math.pow(10,-11);
		return (G * this.getMass() * b.getMass()) / (this.calcDistance(b)* this.calcDistance(b));
	}

	public double calcForceExertedByX(CelestialBody b) {
		// TODO: complete method
		double Fx= this.calcForceExertedBy(b) * ((b.getX() - myXPos) / this.calcDistance(b));
		return Fx;
	}
	public double calcForceExertedByY(CelestialBody b) {
		// TODO: complete method
		double Fy= this.calcForceExertedBy(b) * ((b.getY() - myYPos) / this.calcDistance(b));
		return Fy;
	}

	public double calcNetForceExertedByX(CelestialBody[] bodies) {
		// TODO: complete method
		double sum = 0.0;

		for (CelestialBody b : bodies){
			if(! this.equals(b)) {
				sum += this.calcForceExertedByX(b);
			}
		}

		return sum;
	}

	public double calcNetForceExertedByY(CelestialBody[] bodies) {
		double sum = 0.0;

		for (CelestialBody b : bodies){
			if(! this.equals(b)) {
				sum += this.calcForceExertedByY(b);
			}
		}

		return sum;
	}

	public void update(double deltaT, 
			           double xforce, double yforce) {
		// TODO: complete method
		double accX = xforce / myMass;
		double accY = yforce / myMass;

		myXVel += accX * deltaT;
		myYVel += accY * deltaT;
		myXPos += myXVel * deltaT;
		myYPos += myYVel * deltaT;

	}

	/**
	 * Draws this planet's image at its current position
	 */
	public void draw() {
		StdDraw.picture(myXPos,myYPos,"images/"+myFileName);
	}
}
