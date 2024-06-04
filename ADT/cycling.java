package ADT;

import java.util.NoSuchElementException;

public interface cycling<E> {

    /**
    * @return true s'il reste des éléments dans l'itération. En
    * d'autres termes, renvoie true si un appel à next() 
    *    retournerait un élément plutôt qu'une exception
    */
    public boolean hasNext();
    
    /**
    * @modifies this
    * @throws NoSuchElementException si l'itération n'a plus 
    * d'élément
    * @return l’élément suivant de l'itération et modifie l’état de 
    * this en conséquence, sinon
    */
    public E next() throws NoSuchElementException;
    
}
