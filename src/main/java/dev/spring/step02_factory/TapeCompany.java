package dev.spring.step02_factory;

// Tape와 TapeReader를 만들어주는 공장(Factory)
public class TapeCompany {

    public static TapeReader createTapeReader() {
        return new TapeReader();
    }

    public static Tape createTape(String str, Boolean isWorked) {
        return new Tape(str, isWorked);
    }
}
