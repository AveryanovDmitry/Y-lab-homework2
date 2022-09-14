public class Task3 {
    /**
     * Task3
     * Реализовать функцию нечеткого поиска
      */
    public static void fuzzySearch(String target, String area){
        boolean answer = false;

        if(target != null && area != null){
            for (int i = 0, j = 0; i < target.length(); i++){
                while (j < area.length() && target.charAt(i) != area.charAt(j)) {
                    j++;
                }
                if (j < area.length() && target.charAt(i) == area.charAt(j)) {
                    j++;
                }
                if (i == target.length()-1) {
                    answer = true;
                }
                if (j == area.length()) {
                    break;
                }
            }
            System.out.println(answer);
        } else {
            System.out.println("входящие данные равны null");
        }
    }

    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
        fuzzySearch(null, "cartwheel"); // false
        fuzzySearch("lw", null); // false
        fuzzySearch(null, null); // false
    }
}
