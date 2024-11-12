import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*입력값

        저장할 자료구조명을 입력합니다. (List / Set / Map)
        내가 좋아하는 요리 제목을 먼저 입력합니다.
        이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
        입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.

        출력값

        입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
        이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.*/

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listRecipe = new ArrayList<String>();
        Set<String> setRecipe = new HashSet<>();
        Map<Integer, String> mapRecipe = new HashMap<>();

        String str = new String(); // 레시피 입력 받을
        Integer key = 1;  //map의 key값으로

        // 저장할 자료구조명 입력
        String col_Type = sc.nextLine();
        // 음식 이름 입력 받기
        String foodTitle = sc.nextLine();

        // 레시피 입력 받기
        while(true) {
            str = sc.nextLine();

            if (str.equals("끝")) break;  //끝 입력시 반복문 빠져나감

            switch (col_Type) {
                case "List":
                    listRecipe.add(str);
                    break;
                case "Set":
                    setRecipe.add(str);
                    break;
                case "Map":
                    mapRecipe.put(key, str);
                    key++;
                default:
            }
        }

        System.out.println("[ " + col_Type + "으로 저장된 " + foodTitle + " ]");

        switch(col_Type) {
            case "List":
                for (int i=0; i<listRecipe.size();i++ ){
                    System.out.println(i+1+ ". " + listRecipe.get(i));
                }
                break;
            case "Set":
                int i = 1;
                for (String setrecipe: setRecipe){
                    System.out.println(i++ +". " + setrecipe);
                }
                break;
            case "Map":
                for (Integer k: mapRecipe.keySet()) {
                    System.out.println(k + ". " + mapRecipe.get(k));
                }
                break;
            default:
        }
    }
}