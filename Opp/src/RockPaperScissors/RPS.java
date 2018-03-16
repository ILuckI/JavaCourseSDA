package RockPaperScissors;

public enum RPS {
    ROCK(0), PAPER(1), SCISSORS(2);

    private final int value;
    RPS(int value){this.value=value;}
    public int getValue() {
        return value;
    }

    // public static RPS

  //  public static RPS getname(String value){
  //      for (RPS name : RPS.values()){
   //         if (name.getValue().equals(value))
    //            return name;
    //    }
  //      return PAPER;
 //   }

}
