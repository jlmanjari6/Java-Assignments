package linkedlists;


/**
 * @author Lakshmi Manjari Alapati
 */
public class Node<E>
{
   E data;
   Node<E> nextNode;
   
   public Node(E data)
   {
      this.data = data;
   }
   
   @Override
   public String toString()
   {
      return data.toString();
   }
}
