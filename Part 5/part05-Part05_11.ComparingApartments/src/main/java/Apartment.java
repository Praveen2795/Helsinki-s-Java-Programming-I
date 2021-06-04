
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares < compared.squares){
            return false;
        }else{
            return true;
        }
    }
    
    public int priceDifference(Apartment compared){
        int diff = (this.squares*this.princePerSquare) - (compared.squares*compared.princePerSquare);
        if (diff < 0){
            return -1*diff;
        } else{
            return diff;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.squares*this.princePerSquare > compared.squares*compared.princePerSquare){
            return true;
        } else {
            return false;
        }
    }
}
