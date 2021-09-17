
package defaultpackage;

/**
 *
 * @author Alahnouf Alghayhab for Coding Dojo Delegation Assignment
 */

/*This class the declare k jobs of employee to who is write code 
and designing apps as kotlin developer*/

public class KotlinDeveloper implements DelegationDemonstration.WhoCanCode {
    
    @Override
    public void writeCode() {
        System.out.println("I'm writing Kotlin Code");
    }
    
    

}

class UXDesignerk implements DelegationDemonstration.WhoCanDesign {
    @Override
    public void design() {
        System.out.println("I'm designing UX");
    }

}
