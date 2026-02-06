package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class VE1 {
    public final Map<WE1, Integer> a;
    public final List<WE1> b;
    public int c;
    public int d;

    public VE1(Map<WE1, Integer> map) {
        this.a = map;
        this.b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.c += num.intValue();
        }
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public WE1 c() {
        int size;
        WE1 we1 = this.b.get(this.d);
        Integer num = this.a.get(we1);
        if (num.intValue() == 1) {
            this.a.remove(we1);
            this.b.remove(this.d);
        } else {
            this.a.put(we1, Integer.valueOf(num.intValue() - 1));
        }
        this.c--;
        if (this.b.isEmpty()) {
            size = 0;
        } else {
            size = (this.d + 1) % this.b.size();
        }
        this.d = size;
        return we1;
    }
}
