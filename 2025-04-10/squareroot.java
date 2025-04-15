public class squareroot {
    public static void main(String[] args) {
        double n = 27;
        double l=0;
        double r=n;
        double m=0;
        double e=0.00000000001;


        while(n!=(m*m*m)){
            m=(l+r)/2;
            if(m*m*m==n || (m*m*m>n-e && m*m*m<n+e)){
                break;
            }
            
            if(m*m*m>n){
                r=m;
            }
            else{
                l=m;
            }
        }
        
        System.out.println(m);
    }
}
