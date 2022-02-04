import java.util.ArrayList;

public class UsedCarLot
{
    private ArrayList<Car> inventory;

    public UsedCarLot()
    {
        inventory = new ArrayList<>();
    }

    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    public void addCar(Car carToAdd)
    {
        inventory.add(carToAdd);
    }

    public void swap(int idx1, int idx2)
    {
        if(idx1 < 0 || idx1 >= inventory.size() || idx2 < 0 || idx2 >= inventory.size()) {
            return;
        }
        Car swap = inventory.get(idx1);
        inventory.set(idx1, inventory.get(idx2));
        inventory.set(idx2, swap);
    }

    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    public Car sellCarShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        return sold;
    }

    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        ArrayList<Car> tempList = new ArrayList<>();
        if(indexOfCarToMove<destinationIndex)
        {
            for(int i = indexOfCarToMove;i <= destinationIndex; i++)
            {
                tempList.add(inventory.get(i));
            }
            inventory.set(destinationIndex,tempList.get(0));
            for(int i = 1; i<tempList.size();i++)
            {
                inventory.set(indexOfCarToMove-1+i,tempList.get(i));
            }
        }
        if(indexOfCarToMove>destinationIndex)
        {
            for(int i = destinationIndex;i <= indexOfCarToMove; i++)
            {
                tempList.add(inventory.get(i));
            }
            inventory.set(destinationIndex,tempList.get(tempList.size()-1));
            for(int i = 0; i<tempList.size()-1;i++)
            {
                inventory.set(destinationIndex+i+1,tempList.get(i));
            }
        }
    }

}