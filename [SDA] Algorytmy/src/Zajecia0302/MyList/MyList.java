package Zajecia0302.MyList;

public class MyList {
    private int counter = 0;
    private Element head;
    private Element tail;

    public int getCounter() {
        return counter;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public Element findForward(int value) {
        Element currentElement = head;                      //
        if (currentElement.getData() == value)
            return currentElement;
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
            if (currentElement.getData() == value)
                return currentElement;
        }
        return null;
    }

    public Element findBackwards(int value) {
        Element currentElement = tail;
        if (currentElement.getData() == value)
            return currentElement;
        while (currentElement.getPrev() != null) {
            currentElement = currentElement.getPrev();
            if (currentElement.getData() == value)
                return currentElement;
        }
        return null;
    }

    private void setFirstElement(Element newElement) {
        head = newElement;                      // set head and tail for new first element.
        tail = newElement;
        newElement.setNext(null);               // set null for nex and prev for first element!
        newElement.setPrev(null);
        counter++;                              // counter set on 1 (++)
    }

    public void addAtBeginnig(int value) {
        Element newElement = new Element();             // build new Element and set Data.(int value)
        newElement.setData(value);

        if (counter > 0) {
            newElement.setNext(head);
            head = newElement;
            newElement.setPrev(null);                   // set prev to null because newElement is a first element!
            newElement.getNext().setPrev(newElement);   // get.next of newElement and set his prev to newElement
            counter++;
        } else
            setFirstElement(newElement);
    }

    public void addAtEnding(int value) {
        Element newElement = new Element();             // build new Element and set Data.
        newElement.setData(value);

        if (counter > 0) {
            newElement.setPrev(tail);
            tail = newElement;
            newElement.setNext(null);                   // set next to null because newElement is a last element!
            newElement.getPrev().setNext(newElement);   // get.prev of newElement and set his next to newElement
            counter++;
        } else
            setFirstElement(newElement);

    }

    public void addElementAfterElement(int newValue, int valueAfter) throws Exception {
        Element elementAfter = findForward(valueAfter);
        if (elementAfter == null) {
            throw new Exception("Nie ma wartosci!");
        }
        if (elementAfter == tail) {
            addAtEnding(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue);                   // set data to this element
            newElement.setNext(elementAfter.getNext());
            newElement.setPrev(elementAfter);               // set this element prev to element 1
            elementAfter.setNext(newElement);               // set next of 1 element to this element (1 this 2)
            newElement.getNext().setPrev(newElement);       // set prev of 2 element to this element  (1 this 2)
            counter++;
        }

    }

    public void addElementBeforeElement(int newValue, int valueBefore) throws Exception {
        Element elementBefore = findForward(valueBefore);
        if (elementBefore == null) {
            throw new Exception("Nie ma wartosci!");
        }
        if (elementBefore == head) {
            addAtBeginnig(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue);                   // set data to this element
            newElement.setPrev(elementBefore.getPrev());
            newElement.setNext(elementBefore);               // set this element next to element 2
            elementBefore.setPrev(newElement);               // set perv of 2 element to this element (1 this 2)
            newElement.getPrev().setNext(newElement);       // set next of 1 element to this element  (1 this 2)
            counter++;
        }
    }

    public void deleteElement(int value) throws Exception {
        Element elementToDelete = findForward(value);
        if (elementToDelete == null) {                       // if is no element to delete, throw exception
            throw new Exception("Nie ma takiego elementu");
        }
        if (elementToDelete != head && elementToDelete != tail) {
            Element elementBeforeElementToDelete = elementToDelete.getPrev();
            elementBeforeElementToDelete.setNext(elementToDelete.getNext());

            Element elementAfterElementToDelete = elementToDelete.getNext();
            elementAfterElementToDelete.setPrev(elementToDelete.getPrev());

        }

        if (elementToDelete == head) {                       // if element to delete is a head, set next element on head
            head = head.getNext();
            head.setPrev(null);
        }
        if (elementToDelete == tail) {                        // if element to delete is a tail, set prev element on tail
            tail = tail.getPrev();
            tail.setNext(null);
        }

        counter--;
    }

    // DEBUG
    public void printAll() {
        Element currentElement = head;

        while (true) {
            System.out.print("| " + currentElement.getData() + " | ");
            if (currentElement.getNext() != null)
                currentElement = currentElement.getNext();
            else
                break;
        }

    }

}