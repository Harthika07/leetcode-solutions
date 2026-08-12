// Last updated: 12/08/2026, 11:26:40
var deleteDuplicates = function(head) {
    let current = head;

    while (current && current.next) {
        if (current.val === current.next.val) {
            current.next = current.next.next; // skip duplicate
        } else {
            current = current.next;
        }
    }

    return head;
};