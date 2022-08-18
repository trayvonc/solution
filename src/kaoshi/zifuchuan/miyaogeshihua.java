package kaoshi.zifuchuan;

public class miyaogeshihua {
    static public String licenseKeyFormatting(String s, int k) {
        StringBuffer sb=new StringBuffer();
        int count=0;
        int i;
        for(i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='-'){
                count++;
                sb.append(s.charAt(i));
            }

            if(count==2){
                sb.append("-");
                count=0;
            }
        }
        if(!sb.toString().isEmpty()&&sb.charAt(sb.length()-1)=='-') sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        String s=licenseKeyFormatting("---",3);
        System.out.println(s);
    }
}
