public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {

        int returnMe = 0;
        if(h > 0 && bounce > 0 && bounce < 1 && window < h){


            while(h > 0 && bounce > 0 && bounce < 1 && window < h){
                returnMe += 1;
                h = h * bounce;
                if (h >= window){
                    returnMe += 1;
                }
            }
        } else  {
            returnMe = -1;
        }

        return returnMe;
    }
}