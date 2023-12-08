// Implementation Of HashTable

public class HashTable{ // creating a HashTable class (has 3 data members)
    private HashNode buckets[]; // creating an array of HashNodes named 'buckets'
    private int numOfBuckets; // capacity of the HashTable
    private int size; // number of key value pairs (number of HashNodes) in the HashTable
    
    public HashTable(){ // a constructor of the HashTable class
        this.numOfBuckets = 10; // giving a default capacity to our HashTable
    }
    
    public HashTable(Integer capacity){ // another constructor for making various HashTable objects with different capacities
        this.numOfBuckets = capacity; // capacity provided is stored in numOfBuckets variable
        this.buckets = new HashNode[numOfBuckets]; // the length of buckets array is equal to the numOfBuckets (capacity provided)
        this.size = 0; // the size of the HashTable is always zero initially (when there are no HashNodes inserted in it)
    }
    
    private class HashNode{ // creating a HashNode class (has 3 data members)
        private Integer key; // creating key variable
        private String value; // creating value variable
        private HashNode next; // creating the next variable which stores the reference of the next HashNode
        
        public HashNode(Integer key, String value){ // constructor of the HashNode class
            this.key = key; // the value for key that is passed to the constructor is stored in the key variable of the HashNode
            this.value = value;  // the value for 'value' that is passed to the constructor is stored in the 'value' variable of the HashNode
        }
    }
    
    public int size(){ // function or method to check the size of the HashTable
        return size; // returns the value of the size variable of the HashTable
    }
    
    public boolean isEmpty(){ // function or method to check if the HashTable is empty or not
        return size == 0; // we'll return true, if size == 0 which means that the HashTable is empty
                        // we'll return false, if size != 0 which means that the HashTable is not empty
    }
    
    // put, get & remove are the main methods of a HashTable
    // put, get & remove all these methods have time complexity of O(1)
    
    private int getBucketIndex(Integer key){ // Hash Function (Modular Hash Function)
    // this function will take the key from our key-value pair, & it will calculate an index where we should 
    // insert the HashNode containing our key-value pair
        return key % numOfBuckets; // divides the key by the capacity of the buckets array & returns the remainder
                                    // as the bucketIndex (index where we can store our new HashNode (key-value) pair)
                                    // we can also use buckets.length instead of numOfBuckets
    }
    
    
    public void put(Integer key, String value){ // function or method to put or insert a key-value pair in the HashTable 
        if(key == null || value == null){ // edge case : if entered key or value is null
            throw new IllegalArgumentException("key or value is null!!!");
        }
        
        int bucketIndex = getBucketIndex(key);
        // calculating the index where we can insert our key value pair using the modular hash function getBucketIndex
        HashNode head = buckets[bucketIndex]; // storing the node that is at the bucketIndex in head
        while(head != null){ // traversing through the linked list at the bucketIndex
            if(head.key.equals(key)){ // checking if the key of any node in the linked list at bucketIndex is equal to
                                    // the key that is in our key - value pair that we want to insert
                head.value = value; // if the key is already present, we'll just update the value at that key
                                    // with the value from our key - value pair & we'll not make a new HashNode
                return; // after updating the value at that key, we'll go out of the put function
            }
            head = head.next; // moving head forward in the linked list at the bucketIndex
        }
        // outside the while loop, head is at the last HashNode in our linked list at bucketIndex
        // when we come outside of the while loop, we know for sure that the key in our key - value pair is not
        // present in the linked list at the bucketIndex (our key is unique)
        // therefore we'll create a HashNode & insert the key - value pair in the linked list at the bucketIndex
        
        size++; // increasing the size of our HashTable
        head = buckets[bucketIndex]; // we'll make the first node at the bucketIndex our head node again 
        HashNode node = new HashNode(key, value); // creating a new HashNode for our new key-value pair
        // if we want to insert our new HashNode at the start of the linked list that is at the bucketIndex
        node.next = head; // the next of our new HashNode points to the existing head node of the linked list
        buckets[bucketIndex] = node; // our node is inserted at the bucketIndex in our buckets array (our HashTable)
        
    }
    
    public String get(Integer key){ // this function or method takes a key as a parameter & returns the value associated with that key
        if(key == null){ // edge case : if entered key is null
            throw new IllegalArgumentException("key is null!!!");
        }
        
        int bucketIndex = getBucketIndex(key);
        // calculating the index where our key might be present using the modular hash function getBucketIndex
        HashNode head = buckets[bucketIndex]; // storing the node that is at the bucketIndex in head
        while(head != null){ // traversing through the linked list of HashNodes at the bucketIndex
            if(head.key.equals(key)){ // checking if the key of any node in the linked list at bucketIndex is equal to
                                    // the key that is in our key - value pair that we want to insert
                return head.value; // if our key is present, we'll just return the value of that key
            }
            head = head.next; // moving head forward in the linked list of HashNodes at the bucketIndex
                              // if the key at a HashNode doesn't matches with our key then we move forward
        }
        return null;
    }
    
    public String remove(Integer key){ // this function or method takes a key as a parameter & removes the key-value pair 
                                // associated with that key & also returns the value associated with that key
        if(key == null){ // edge case : if entered key is null
            throw new IllegalArgumentException("key is null!!!");
        }
        int bucketIndex = getBucketIndex(key);
        // calculating the index where our key might be present using the modular hash function getBucketIndex
        HashNode head = buckets[bucketIndex]; // storing the node that is at the bucketIndex in head
        HashNode previous = null; // previous will be the node just before head, as head moves forward, previous 
                                    // will also move forward with it, previous will be used to delete the node
                                    // containing our key by doing prev.next = head.next once head reaches the node 
                                    //  that has our key & that's why has to be deleted by 'remove' method
        while(head != null){ // traversing through the linked list of HashNodes at the bucketIndex
            if(head.key.equals(key)){ // checking if the key of any node in the linked list at bucketIndex is equal to
                                    // the key that is in our key - value pair that we want to delete
                break; // once we find the node containing our key (i.e, head points to the node to be deleted)
                        // we'll break from the while loop once head points to the node to be deleted
            }
            previous = head; // we'll store current head in previous before moving head to the next node everytime 
                            // we move head, as we want to keep track of the node that comes just before the head
            head = head.next; // moving head forward in the linked list of HashNodes at the bucketIndex
                              // if the key at a HashNode doesn't matches with our key then we move forward
        }
        if(head == null){ // if outside the while loop, head is null that means that we've reached the end 
                            // of the linked list at bucketIndex & still haven't found our key
            return null; // if we don't find our key in the entire linked list at the bucketIndex, that means
                        // our key is not present in the HashTable
        }
        size--; // if head != null outside the while loop, that means that our key is present in the HashTable
                // so we'll decrease the size of the HashTable
        
        // if previous == null & we've reached till here, that means head != null & as previous == null
        // & head != null till now, that means our key is in the head node (the very first node) in the 
        // linked list at bucketIndex
        // checking if previous is null or not
        if(previous != null){ // if previous != null, that means our key is present in a node in the middle of the 
                                // linked list, so we'll remove the node containing our key 
                                // head will be at the node containing our key when we reach here
            previous.next = head.next; // we'll delete head (node containing our key) by removing the link 
                                        // between head & it's previous node & linking the node next to the head
                                        // to the previous node of head
                                        // the deleted node (head) will be collected by the garbage collector
        }
        else{ // if previous == null that means the first node of the linked list contains our key
            buckets[bucketIndex] = head.next; // only use this line to remove the first node of the linked list
                                                // to remove the first node(head node) of the linked list which
                                                // contains our key, we'll assign the second node (head.next) to
                                                // the bucketIndex in the buckets array. so, the linked list
                                                // will start from the second node & the first node containing 
                                                // our key will be removed 
        }
        
        return head.value; // 'remove' method removes the node containing our key & also returns the value 
                            // associated with our key (head is at the node containing our key outside the while loop)
    }
    
    // when we call the 'get' method, the key value pair remains in the HashTable i.e, it is not removed, just the value of the key
    // is returned but when we call the 'remove' method, the key value pair is removed from the HashTable & the value of the key
    // is returned
}