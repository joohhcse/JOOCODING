import java.util.HashMap;
import java.util.HashSet;

public class lv1_신고결과받기 {

	
	//let's retry
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
		HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
		
		for(String reportInfo : report) {
			String reporter = reportInfo.split(" ")[0];	//신고 한 사람
			String reported = reportInfo.split(" ")[1];	//신고 당한 사람
			boolean flag = false;
			
			if(reporterInfoMap.containsKey(reporter)) {
				if(reporterInfoMap.get(reporter).contains(reported)) {
					//이미 신고한 유저일 때
					flag = true;
				}
				else {
					reporterInfoMap.get(reporter).add(reported);
				}
			}
			else {
				reporterInfoMap.put(reporter, new HashSet<String>() {{
					add(reported);
				}});
			}
			
			if(flag) {
				continue;
			}
			else if(reportedCountInfoMap.containsKey(reported)) {
				reportedCountInfoMap.put(reported, reportedCountInfoMap.get(reported)+1);
			}
			else {
				reportedCountInfoMap.put(reported, 1);
			}
		}
		
		for(String reported : reportedCountInfoMap.keySet()) {
			int reportedCount = reportedCountInfoMap.get(reported);
			if(reportedCount >= k) {
				//메일 발송 대상
				for(int i=0 ; i<id_list.length; i++) {
					if(reporterInfoMap.get(id_list[i]) == null) {
						answer[i] = 0;
					}
					else if(reporterInfoMap.get(id_list[i]).contains(reported)) {
						answer[i]++;
					}
				}
			}
		}
					
        return answer;
	}
	
	public static void main(String[] args) {

	}

}
