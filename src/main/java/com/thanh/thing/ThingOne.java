package com.thanh.thing;

public class ThingOne {
    private final ThingTwo thingTwo;
    private final ThingThree thingThree;

    public ThingOne(ThingTwo thingTwo, ThingTwo thingTwo2, ThingThree thingThree) {
        this.thingTwo = thingTwo2;
        this.thingThree = thingThree;
    }

    public ThingTwo getThingTwo() {
        return thingTwo;
    }

    public ThingThree getThingThree() {
        return thingThree;
    }
}
