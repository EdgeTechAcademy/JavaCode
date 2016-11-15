/**
 * Created by Edge Tech Academy on 11/11/2016.
 */
public interface IWarpDrive {

    double LIGHT_SPEED = 299_792.458;
    double MAX_WARP = 9.99;

    void setWarpFactor(double warpFactor);
    void engage();

    default double getTimeDilationFactor(int currentSpeed)
    {
        return 1/getLorentzFactor(currentSpeed);
    }

    default double getLorentzFactor(int currentSpeed)
    {
        double velocityLightRatio = Math.pow(currentSpeed,2)/Math.pow(LIGHT_SPEED,2);
        if (velocityLightRatio > 1)
            velocityLightRatio = 0;

        return Math.sqrt(1 - velocityLightRatio);
    }
}
