class ListNode<T> {
    T value;
    ListNode<T> next;

    ListNode(T x) {
        value = x;
    }

    ListNode(T x, ListNode<T> nextNode) {
        value = x;
        next = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode<?> listNode = (ListNode<?>) o;

        if (next == null) return true;

        if (!value.equals(listNode.value)) return false;
        return next.equals(listNode.next);
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        if (next == null) return result;
        result = 31 * result + next.hashCode();
        return result;
    }
}