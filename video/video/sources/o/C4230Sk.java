package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Sk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4230Sk {
    public final Map<Integer, Integer> a = new HashMap();

    public Integer a(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    public int[] b() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C8881px1.c(arrayList);
    }

    public void c(int i) {
        Integer num = this.a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
