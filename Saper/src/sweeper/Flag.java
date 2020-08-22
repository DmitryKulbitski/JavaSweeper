package sweeper;

public class Flag {

    private Matrix flagMap;

    void start (){
        flagMap = new Matrix(Box.CLOSED);
        for(Coord around : Ranges.getCoordsAround(new Coord(4, 4)))
            flagMap.set(around,Box.OPENED);
    }

    Box get(Coord coord){
        return flagMap.get(coord);
    }

    void setOpenedToBox(Coord coord) {
        //this.openedToBox = openedToBox;
        flagMap.set(coord, Box.OPENED);
    }



    void toggleFlagedToBox(Coord coord) {

        switch (flagMap.get(coord)){

            case    FLAGED: setClosedToBox(coord) ; break;
            case    CLOSED: setFlagedToBox(coord) ; break;

        }

    }

    void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }

    void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }
}
