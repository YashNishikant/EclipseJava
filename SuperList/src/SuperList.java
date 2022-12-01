
public class SuperList<E> {

    ListNode<E> root, end;
    int size;

    public SuperList(){
        root = null;
        end = null;
        size = 0;
    }

    public void add(E value){

        ListNode<E> temp = new ListNode<E>(value);

        if(size == 0 || root == null){
            root = temp;
            end = root;
        }
        else{

            end.setNext(temp);
            temp.setPrev(end);
            end = temp;
        }

        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size > 0)
            return false;
        else
            return true;
    }

    public void clear(){
        root = null;
        end = null;
        size = 0;
    }

    public void push(E value){
        add(value);
    }

    public String toString(){
        String res = "";
        ListNode<E> indexNode = root;
        res += "[";
        res += indexNode.getValue() + ", ";
        for(int i = 0; i < size-1; i++){
            if(i < size-2)
                res += indexNode.getNext().getValue() + ", ";
            else
                res += indexNode.getNext().getValue();
            indexNode = indexNode.getNext();
        }
        res += "]";
        return res;
    }

    public void add(int index, E value){

        ListNode<E> temp = new ListNode<E>(value);

        if(size < index){
            return;
        }
        if(size == 0){
            root = temp;
            end = root;
            return;
        }
        if(index == 0){
            //?
            return;
        }
        if(index == size-1){
            end.setNext(temp);
            temp.setPrev(end);
            end = temp;
            return;
        }

        ListNode<E> indexNode = root;
        for(int i = 0; i < index; i++){
            indexNode = indexNode.getNext();
        }
        indexNode.setNext(temp);
        temp.setPrev(indexNode);
        indexNode = temp;

        size++;
    }

    public class ListNode<E>{

        ListNode<E> next;
        ListNode<E> prev;
        E value;
        public ListNode(E value) {
            this.value = value;
            next = null;
            prev = null;
        }

        public E getValue(){
            return value;
        }

        public ListNode<E> getNext(){
            return next;
        }

        public ListNode<E> getPrev() {
            return prev;
        }

        public void setPrev(ListNode<E> prev) {
            this.prev = prev;
        }

        public void setNext(ListNode<E> next) {
            this.next = next;
        }

    }

}
