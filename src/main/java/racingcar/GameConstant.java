package racingcar;

public class GameConstant {
  public static final String COLON = " : ";
  public static final String DASH = "-";
  public static final Integer STARTPOSITION = 0;

  public static enum Output {
    INPUTCARNAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUTTRIAL("시도할 회수는 몇회인가요?"),
    RESULT("실행 결과"),
    WINNER("최종 우승자 : "),
    CHECKLENGTH("자동차 이름은 5자 이하만 가능합니다.");

    private String outputText;

    Output(String outputText) {
      this.outputText = outputText;
    }

    public String print() {
      return outputText;
    }
  }
}
