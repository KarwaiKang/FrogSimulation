public class FrogSimulation {
    int maxHops, goalDistance;

    public FrogSimulation(int maxHops, int goalDistance) {
        this.maxHops = maxHops;
        this.goalDistance = goalDistance;
    }

    public int hopDistance() {
        return 0;
    }

    public boolean simulate()
    {
        int position = 0;
        for (int count = 0; count < maxHops; count++)
        {
            position += hopDistance();
            if (position >= goalDistance)
            {
                return true;
            }
            else if (position < 0)
            {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num)
    {
        int countSuccess = 0;
        for (int count = 0; count < num; count++)
        {
            if(simulate())
            {
                countSuccess++;
            }
        }
        return (double)countSuccess / num;
    }
}
