public class Eagle extends Bird  implements Fly{

    private boolean flying;
    private int altitude;
    private int altitudeMinForLanding = 1;

    public Eagle(final String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setAltitudeMinForLanding(int altitudeMinForLanding) {
        this.altitudeMinForLanding = altitudeMinForLanding;
    }

    public int getAltitudeMinForLanding() {
        return altitudeMinForLanding;
    }

    public int getAltitude() {
        return altitude;
    }

    private boolean isFlying() {
        if (this.altitude>0)
        return true;
        else return false;
    }



    private boolean canLand() {

        if (this.altitude <= altitudeMinForLanding && this.altitude>0)
           return true;
        return false;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        if (this.altitude == 0) {

            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());

        } else
            System.out.printf("%s has already taken off  in the sky.%n", this.getName());

    }

    @Override
    public void descend(final int meters) {
        // TODO Auto-generated method stub
        int descent = this.altitude - meters;
        if (descent>0)

        {
            if (isFlying())
            {   this.altitude -= meters;
                System.out.printf("%s flies downward, altitude : %d%n", this.getName(),this.altitude);
            }
            else
                System.out.printf("%s seems to be on land%n", this.getName());
        }
        else{
            System.out.printf("Be careful %s will crash on land the altitude is %d%n", this.getName(),this.altitude);
            System.out.printf("====> The right movement to do  is %d%n" ,  this.altitudeMinForLanding-this.altitude );

        }
    }

    @Override
    public void ascend(final int meters) {
        // TODO Auto-generated method stub
        
        if (this.flying )
        {   this.altitude += meters;
           System.out.printf("%s flies upward, altitude : %d%n", this.getName(),this.altitude);
        }
        else
            System.out.printf("%s seems to be on land%n", this.getName());

        // Eye Cherry flies upward, altitude : 120


        }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        if (this.altitude == 0)
            System.out.printf("%s is already on the floor%n", this.getName());
        else if (canLand())
           System.out.printf("%s land on the ground%n", this.getName());
        else
            System.out.printf("%s is too high, it can't lands.%n",this.getName());

    }

    @Override
    public void glide() {
        // TODO Auto-generated method stub
        if (isFlying())
        System.out.printf("%s glides into the airs%n", this.getName());
        else
            System.out.printf("%s is not in the airs%n", this.getName());

    }

}




