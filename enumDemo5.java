enum Month{
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OT,NOV,DEC;
}
class enumDemo5
{
	public static void main(String...x){
       Month[] m=Month.values();
	   for(Month constant : m){
        System.out.println(constant+" order at="+constant.ordinal());
	   }
   System.out.println(Month.valueOf("SEP"));
	}
}