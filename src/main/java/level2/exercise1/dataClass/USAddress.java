package level2.exercise1.dataClass;

import level2.exercise1.interfaces.Address;

public class USAddress implements Address {
    private String address;

    public USAddress(String address){
        this.address = address;
    }

    @Override
    public String getAddressData() {
        return address;
    }

    @Override
    public void address() {
        System.out.println("The address is " + address);
    }
}
