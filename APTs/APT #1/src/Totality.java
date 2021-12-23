public class Totality {
    public int sum(int[] a, String stype){
        int acc=0;
        if (stype.equals("even")){
            for (int k=0; k<a.length; k+=2){
                acc+=a[k];
            }
        }
        if (stype.equals("odd")){
            for (int k=1; k<a.length; k+=2){
                acc+=a[k];
            }
        }
        if (stype.equals("all")){
            for (int k=0; k<a.length; k++){
                acc+=a[k];
            }
        }
        return acc;}

}