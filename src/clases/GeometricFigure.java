package clases;

public abstract class GeometricFigure {
	
	protected String type;
	
	protected GeometricFigure(String type) {
		this.type = type;
	}
	
	public abstract void printFigure();
	
	public abstract int area();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "GeometricFigure [type=" + type + "]";
	}
	
	

}
