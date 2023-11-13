/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author My Pc
 */
public class SearchArray
{
public int arraySearch(long ar[],long id)
{
    int index;
    for(index=0;index<ar.length;index++)
        if(ar[index]==id)
            break;
    return index;
}
}
