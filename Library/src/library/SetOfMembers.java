/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.util.ArrayList;



/**
 *
 * @author Kutoma
 */
public class SetOfMembers extends ArrayList<Member> {

    public void addMember(Member aMember) {
        super.add(aMember);
    }
    
    public void removeMember(Member aMember) {
        super.remove(aMember);
    }        
    
    public Member getMemberFromName(String name) {
        Member result = null;
        
        /* Iterates through each element in the array and checks name */
        for (Member tmp : this)
        {
            if (tmp.getMemberName() == name)
                result = tmp;
        }     
        
        return result;
    }
    
    public Member getMemberFromName(int id) {
        Member result = null;
        
        /* Iterates through each element in the array and checks ID */
        for (Member tmp : this)
        {
            if (tmp.getMemberNumber() == id)
                result = tmp;
        }
        
        return result;
    }
    

}
