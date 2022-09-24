package Lab3;

/**
 * This class defines a 3D vector
 * 
 * @author EECS2030
 *
 */
public class Vector3D {

	private double xaxis;
	private double yaxis;
	private double zaxis;

	/**
	 * Creates the vector <code>(0.0, 0.0, 0.0)</code>. This is the default
	 * constructor.
	 */
	public Vector3D() {
		this.xaxis = 0.0;
		this.yaxis = 0.0;
		this.zaxis = 0.0;
	}

	/**
	 * Creates the vector <code>(x, y, z)</code>.
	 * 
	 * @param x is the x-component of the vector
	 * @param y is the y-component of the vector
	 * @param z is the z-component of the vector
	 */
	public Vector3D(double x, double y, double z) {
		this.xaxis = x;
		this.yaxis = y;
		this.zaxis = z;
	}

	/**
	 * Creates a vector with the same components as another vector. This is the copy
	 * constructor.
	 * 
	 * @param other is a vector used to copy the components from
	 */
	public Vector3D(Vector3D anotherVector) {
		this.xaxis = anotherVector.xaxis;
		this.yaxis = anotherVector.yaxis;
		this.zaxis = anotherVector.zaxis;
	}

	/**
	 * Returns the x component of the vector.
	 * 
	 * @return the x component of the vector.
	 */
	public double getX() {
		return this.xaxis;
	}

	/**
	 * Sets the x component of the vector.
	 * 
	 * @param x the new value of the x component.
	 */
	public void setX(double x) {
		this.xaxis = x;
	}

	/**
	 * Returns the y component of the vector.
	 * 
	 * @return the y component of the vector.
	 */
	public double getY() {
		return this.yaxis;
	}

	/**
	 * Sets the y component of the vector.
	 * 
	 * @param y the new value of the y component.
	 */
	public void setY(double y) {
		this.yaxis = y;
	}

	/**
	 * Returns the z component of the vector.
	 * 
	 * @return the z component of the vector.
	 */
	public double getZ() {
		return this.zaxis;
	}

	/**
	 * Sets the z component of the vector.
	 * 
	 * @param z the new value of the z component.
	 */
	public void setZ(double z) {
		this.zaxis = z;
	}

	/**
	 * Adds a vector to this vector and changes the components of this vector. To
	 * add, the counterpart components are added together.
	 * 
	 * @param other is the vector that is added to this vector.
	 * @return the current <code>Vector3D</code> object
	 */
	public Vector3D add(Vector3D other) {
		Vector3D current = new Vector3D(xaxis + other.xaxis, yaxis + other.yaxis, zaxis + other.zaxis);

		return current;
	}

	/**
	 * Subtracts a vector from this vector and changes the components of this
	 * vector. To subtract, the counterpart components are subtracted.
	 * 
	 * @param other is the vector that is subtracted from this vector.
	 * @return this <code>Vector3D</code> object
	 */
	public Vector3D subtract(Vector3D other) {
		Vector3D current = new Vector3D(xaxis - other.xaxis, yaxis - other.yaxis, zaxis - other.zaxis);

		return current;
	}

	/**
	 * Multiplies this vector by a scalar.
	 * 
	 * @param scalar is the scalar that is multiplied by this vector
	 * @return this vector after multiplication
	 */
	public Vector3D scalarMultiplication(double scalar) {
		Vector3D current = new Vector3D(xaxis * scalar, yaxis * scalar, zaxis * scalar);

		return current;
	}

	/**
	 * computes the DOT product of this vector and the given vector
	 * 
	 * @param other is the given vector, whose DOT product with this vector is given
	 * @return the DOT product of this and the other vector.
	 */
	public double dotProduct(Vector3D other) {
		double result = 0;

		result = xaxis * other.xaxis + yaxis * other.yaxis + zaxis * other.zaxis;

		return result;
	}

	/**
	 * Computes the magnitude of this vector.
	 * 
	 * @return the magnitude of this vector.
	 */
	public double magnitude() {
		double magnitude = Math.sqrt(this.xaxis * this.xaxis + this.yaxis * this.yaxis + this.zaxis * this.zaxis);

		return magnitude;
	}

	/**
	 * Returns a string representation of the vector as [x, y, z], where x, y and z
	 * are the components of the vector.
	 * 
	 * @return a string representation of the vector
	 */
	@Override
	public String toString() {
		return "[" + this.xaxis + ", " + this.yaxis + ", " + this.zaxis + "]";
	}

	/**
	 * Determines if the difference between the magnitude of this vector and the
	 * other vector is smaller than the given threshold.
	 * 
	 * @param other     the other vector that is compared with this vector
	 * @param threshold a positive double, which shows the accepted magnitude
	 *                  difference between the two vectors
	 * @return <code>true</code> if the difference between magnitude of the two
	 *         vectors is less than <code> threshold</code> and <code>false</code>
	 *         otherwise
	 */
	public boolean equalTo(Vector3D other, double threshold) {
		boolean isSmol = false;
		Vector3D thisVector = new Vector3D(this.xaxis, this.yaxis, this.zaxis);
		double diff = thisVector.magnitude() - other.magnitude();
		
		if(diff < 0) {
			diff = diff * -1;
		}
		
		if (diff < threshold) {
			isSmol = true;
		}
		
		return isSmol;
	}

}
























