class RecentCounter {
Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.remove();
        }
        
        return requests.size();
    }
}