package spoonful; 

public class Spoonful {

    private static final int TSP_IN_A_TBSP = 3;

    private int tbsp;
    private int tsp;

    public Spoonful( int tbsp, int tsp ) {
	this.tbsp = tbsp;
	this.tsp = tsp;
    } 

    public int getTBSP() {
	return this.tbsp;
    } 

    public int getTSP() {
	return this.tsp;
    } 

    public void setTBSP( int tbsp ) {
	this.tbsp = tbsp;
    } 

    public void setTSP( int tsp ) {
	this.tsp = tsp;
    } 

    public Spoonful add( Spoonful otherSpoonful ) {
	int tb = this.tbsp + otherSpoonful.tbsp;
	int ts = this.tsp + otherSpoonful.tsp;
	Spoonful sum = new Spoonful( tb + ts/TSP_IN_A_TBSP,
				 ts % TSP_IN_A_TBSP );
        return sum;
    } 

    @Override
    public String toString() {
	return this.tbsp + " tbsp, " + this.tsp + " tsp ";
    } 

    public static void main( String[] args ) {
	Spoonful spoon1 = new Spoonful( 2, 1 );
	Spoonful spoon2 = new Spoonful( 1, 2 );
	Spoonful totalSpoonful = spoon1.add( spoon2 );
	System.out.println( spoon1 + "+ " + spoon2 + " = " + totalSpoonful );
    } 

    
}
