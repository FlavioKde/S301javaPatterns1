package level2.exercise1.dataClass;

import level2.exercise1.interfaces.Address;

public class SpanishAddress implements Address {
    private String address;

    public SpanishAddress(String address){
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
