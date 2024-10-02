public class Main {
    public static void main(String[] args) {

        MyList arrayList = MyList.getList(MyList.ListType.Array);
        arrayList.add(5);
        System.out.println(arrayList.get(0));
        MyList linkedList = MyList.getList(MyList.ListType.LinkedList);
        linkedList.add(7);
        System.out.println(linkedList.get(0));
        MyList syncList = MyList.getList(MyList.ListType.SyncList);
        syncList.add(9);
        System.out.println(syncList.get(0));

        MyList loggedList = new LoggingDecorator(MyList.getList(MyList.ListType.Array));
        loggedList.add(5);


    }
}