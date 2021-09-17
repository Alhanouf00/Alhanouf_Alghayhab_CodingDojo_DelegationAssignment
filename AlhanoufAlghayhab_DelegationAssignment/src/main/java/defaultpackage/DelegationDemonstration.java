
package defaultpackage;

/**
 *
 * @author Alahnouf Alghayhab for Coding Dojo Delegation Assignment

 */


/*This class the declare all interfaces of jobs of employee to who is write code 
and designing apps*/

public class DelegationDemonstration {

interface WhoCanCode {
    void writeCode();
}
interface WhoCanDesign {
    void design();
}

class UXDesigner implements WhoCanDesign {
    @Override
    public void design() {
        System.out.println("I'm designing UX");
    }
}





}


class Employee implements DelegationDemonstration.WhoCanCode, DelegationDemonstration.WhoCanDesign {
    DelegationDemonstration.WhoCanCode developer;
    DelegationDemonstration.WhoCanDesign designer;
    public Employee(DelegationDemonstration.WhoCanCode developer, DelegationDemonstration.WhoCanDesign designer){
        this.developer = developer;
        this.designer = designer;
    }
    @Override
    public void writeCode() {
        developer.writeCode();
    }
    @Override
    public void design() {
        designer.design();
    }
}

