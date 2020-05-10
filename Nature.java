public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        /*
        Pingou dives(plonger) into the water.
Pingou swims downward, depths : 3
Pingou swims upward, depths : 2
Pingou swims downward, depths : 6
Pingou swims upward, depths : 1
Pingou swims upward, depths : 0
Pingou gets out of the water.
  
        */

        Eagle eyeCherry = new Eagle("eyeCherry");
     
        eyeCherry.takeOff();
        eyeCherry.ascend(120);
        eyeCherry.ascend(30);
        
        eyeCherry.glide();
        
        eyeCherry.descend(140);
        eyeCherry.land();
        eyeCherry.descend(9);
        eyeCherry.land();
    

        // TODO : uncomment the following code in order to test it
        // methods implementees dans Fly 
        // takeOff() , ascend(int) , glide (), descend(int) , land()
  /*$ Eye Cherry takes off in the sky.
$ Eye Cherry flies upward, altitude : 120
$ Eye Cherry flies upward, altitude : 150
$ It glides into the air.
$ Eye Cherry flies downward, altitude : 10
$ Eye Cherry is too high, it can't lands.
$ Eye Cherry flies downward, altitude : 1
$ Eye Cherry lands on the ground.
*/    

    // another eagle

        Eagle otherOne = new Eagle("Eagle");
        otherOne.land();
        otherOne.takeOff();
        otherOne.ascend(300);
        otherOne.glide();
        otherOne.descend(220);
        otherOne.descend(199);
        otherOne.land();
        otherOne.descend(79);
        otherOne.land();


    }
}
