public class Elevator {
    public static Integer[] elev(Integer floor){
        Integer elevator1 = 1;
        Integer elevator2 = 3;
        Integer elevator3 = 5;

        Integer[] elev = new Integer[3];

        Integer max_floor = 9;
        Integer min_floor = 1;

        Integer dist1 = Math.abs(floor - elevator2);
        Integer dist2 = Math.abs(floor - elevator3);

        if(dist1 > dist2){
            elevator3 = floor;
        }
        else{
            elevator2 = floor;
        }

        elev[0] = elevator1;
        elev[1] = elevator2;
        elev[2] = elevator3;

        return elev;
    }
}
