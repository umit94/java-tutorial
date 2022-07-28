package exceptionsExample.citizen;

import exceptionsExample.exceptions.InvalidIdException;

import java.math.BigInteger;

public class Citizen {
    private static BigInteger minId=new BigInteger("10000000000");
    private BigInteger id;

    public Citizen(String id) throws InvalidIdException {
        if(new BigInteger(id).compareTo(minId)==-1)
            throw new InvalidIdException("Invalid Id Exception! Min id must be bigger than "+minId+".", id);

        this.id=new BigInteger(id);
    }
}
