import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {

        List<Dummy> listObjs = new ArrayList<>();

        Dust d1 = new Dust();
        d1.setN1("MaGic");
        d1.setN2("222");

        Dust d2 = new Dust();
        d2.setN1("MaGic");
        d2.setN2("789");

        Dummy dum1= new Dummy();
        dum1.setV1(11);
        dum1.setV2(true);
        dum1.setV3(d1);

        Dummy dum2= new Dummy();
        dum2.setV1(100);
        dum2.setV2(true);
        dum2.setV3(d2);

        listObjs.add(dum1);
        listObjs.add(dum2);



//<v1<100, v2=true, v3.n1==”MaGic” (case insensitive)
//  List<String> of type v3.n2

       // System.out.println(""+ listObjs);

       List<String> dummies=listObjs.stream()
               .filter(d->d.getV1()<100 && d.getV2()==true && d.getV3().getN1().equals("MaGic"))
                       .map(re->re.getV3().getN2()).collect(Collectors.toList());


        System.out.println(""+dummies);



    }
}

class Dummy
{
    Integer v1;
    Boolean v2;
    Dust v3;

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Boolean getV2() {
        return v2;
    }

    public void setV2(Boolean v2) {
        this.v2 = v2;
    }

    public Dust getV3() {
        return v3;
    }

    public void setV3(Dust v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
}

class Dust{

        String n1;
        String n2;

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Dust{" +
                "n1='" + n1 + '\'' +
                ", n2='" + n2 + '\'' +
                '}';
    }
}
