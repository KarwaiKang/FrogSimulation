public class FrogSimulation {
    int maxHops, goalDistance, nextHopIndex;
    int[] testHops;

    public FrogSimulation(int goalDistance, int maxHops) {
        this.maxHops = maxHops;
        this.goalDistance = goalDistance;
    }

    public int hopDistance() {
        int hop;
        if (nextHopIndex != 0)
            hop = testHops[nextHopIndex % testHops.length];
        else
            hop = testHops[0];
        nextHopIndex++;
        return hop;
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