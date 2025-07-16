package assignment;

public class CountmathingRule {
        public static void main(String[] args) {
            String[][] items = {
                {"phone","blue","pixel"},
                {"computer","silver","phone"},
                {"phone","gold","iphone"}
            };

            String ruleKey = "type";
            String ruleValue = "phone";
            System.out.println(countMatches(items, ruleKey, ruleValue));

        }

        static int countMatches(String[][]itmes,String ruleKey,String ruleValue)

        {
                int counter=0;
                int index=Integer.MIN_VALUE;
                switch (ruleKey) {
                    case "type":
                        index=0;
                        break;
                    case "color":
                        index=1;
                        break;
                    case "name":
                        index=2;
                    default:
                        break;
                }

                for(int i=0; i<itmes.length;i++)
                {
                    if(itmes[i][index].equals(ruleValue)){
                        counter++;
                    }
                }
            return counter;
        }
}
