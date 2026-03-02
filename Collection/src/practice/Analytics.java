//package practice;
//
//public class Analytics {
//
//	class Analytics implements IAnalytics {
//
//	    private IAnalyticsStore analyticsStore;
//	    private int K;
//
//	    private Queue<ActionEnum> buffer = new LinkedList<>();
//	    private Map<ActionEnum, Integer> freqMap = new HashMap<>();
//
//	    private int totalActions = 0;
//
//	    public Analytics(IAnalyticsStore analyticsStore, int K) {
//	        this.analyticsStore = analyticsStore;
//	        this.K = K;
//	    }
//
//	    @Override
//	    public void registerAction(ActionEnum action) {
//	        // total count
//	        totalActions++;
//
//	        // frequency update
//	        freqMap.put(action, freqMap.getOrDefault(action, 0) + 1);
//
//	        // add to buffer
//	        buffer.offer(action);
//
//	        // flush if size reaches K
//	        if (buffer.size() == K) {
//	            analyticsStore.storeActions(new LinkedList<>(buffer));
//	            buffer.clear();
//	        }
//	    }
//
//	    @Override
//	    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
//	        return buffer.size();
//	    }
//
//	    @Override
//	    public int getTotalNumberOfLoggedActions() {
//	        return totalActions;
//	    }
//
//	    @Override
//	    public List<ActionEnum> getMostFrequentlyUsedActions() {
//	        int maxFreq = 0;
//
//	        for (int val : freqMap.values()) {
//	            maxFreq = Math.max(maxFreq, val);
//	        }
//
//	        List<ActionEnum> result = new ArrayList<>();
//	        for (Map.Entry<ActionEnum, Integer> e : freqMap.entrySet()) {
//	            if (e.getValue() == maxFreq) {
//	                result.add(e.getKey());
//	            }
//	        }
//
//	        // alphabetical order
//	        result.sort(Comparator.comparing(Enum::name));
//	        return result;
//	    }
//	}
//
//
//}
