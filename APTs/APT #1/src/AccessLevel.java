public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        int key = minPermission;
        StringBuilder acc = new StringBuilder("");

        for (int num:rights) {
            if (key>num) {
                acc.append("D");
            }
            if (key<=num){
                acc.append("A");
            }
        }
        return acc.toString();}
}
