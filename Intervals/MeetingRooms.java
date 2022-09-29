import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRooms {

    public static void main(String[] args) {
        Interval interval = new Interval(1, 2);
        Interval interval2 = new Interval(2, 3);
        Interval interval3 = new Interval(4, 8);

        List<Interval> list = new ArrayList<>();
        list.add(interval);
        list.add(interval2);
        list.add(interval3);

        System.out.println(canAttendMeetings(list));
    }

    public static boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> a.start - b.start);

        for (int i = 0; i + 1 < intervals.size(); i++) {
            if (intervals.get(i).end > intervals.get(i + 1).start) {
                return false;
            }
        }
        return true;
    }

}

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}