public class Printer {

    private int toner;
    private int numberOfSheets;

    public Printer( int numberOfSheets, int toner){
        this.numberOfSheets=numberOfSheets;
        this.toner=toner;
    }

    public int getNumberOfSheets(){
        return this.numberOfSheets;
    }
    public int getToner(){
        return this.toner;
    }

    public int print (int numberOfPagesToPrint, int numberOfCopiesToPrint){
        int totalPagesToPrint=numberOfPagesToPrint*numberOfCopiesToPrint;
        if (numberOfSheets>=totalPagesToPrint){
            numberOfSheets-=totalPagesToPrint;
            toner-=totalPagesToPrint;
            return (numberOfSheets);
        }else{
            throw new RuntimeException("Not enough paper");
        }

    }
}
