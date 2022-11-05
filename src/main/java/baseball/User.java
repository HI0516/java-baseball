package baseball;

import camp.nextstep.edu.missionutils.Console;

public class User {
    public String readNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        try{
            Validator.checkStart(input);
        }
        catch(IllegalArgumentException e){
            System.exit(0);
        }

        return input;
    }
}
