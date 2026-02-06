package o;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Deprecated
/* renamed from: o.Tl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4331Tl {
    public final Map<String, Long> a;
    public final Map<Integer, Long> b;
    public final Map<List<Pair<String, Integer>>, C4134Rl> c;
    public final Random d;

    public C4331Tl() {
        this(new Random());
    }

    public static <T> void b(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) TD2.o(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    public static int d(C4134Rl c4134Rl, C4134Rl c4134Rl2) {
        int compare = Integer.compare(c4134Rl.c, c4134Rl2.c);
        if (compare != 0) {
            return compare;
        }
        return c4134Rl.b.compareTo(c4134Rl2.b);
    }

    public static int f(List<C4134Rl> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).c));
        }
        return hashSet.size();
    }

    public static <T> void h(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public final List<C4134Rl> c(List<C4134Rl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.a);
        h(elapsedRealtime, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C4134Rl c4134Rl = list.get(i);
            if (!this.a.containsKey(c4134Rl.b) && !this.b.containsKey(Integer.valueOf(c4134Rl.c))) {
                arrayList.add(c4134Rl);
            }
        }
        return arrayList;
    }

    public void e(C4134Rl c4134Rl, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        b(c4134Rl.b, elapsedRealtime, this.a);
        int i = c4134Rl.c;
        if (i != Integer.MIN_VALUE) {
            b(Integer.valueOf(i), elapsedRealtime, this.b);
        }
    }

    public int g(List<C4134Rl> list) {
        HashSet hashSet = new HashSet();
        List<C4134Rl> c = c(list);
        for (int i = 0; i < c.size(); i++) {
            hashSet.add(Integer.valueOf(c.get(i).c));
        }
        return hashSet.size();
    }

    public void i() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    @InterfaceC11300zs1
    public C4134Rl j(List<C4134Rl> list) {
        List<C4134Rl> c = c(list);
        if (c.size() < 2) {
            return (C4134Rl) C5098aU0.v(c, null);
        }
        Collections.sort(c, new Comparator() { // from class: o.Sl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = C4331Tl.d((C4134Rl) obj, (C4134Rl) obj2);
                return d;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = c.get(0).c;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C4134Rl c4134Rl = c.get(i2);
            if (i != c4134Rl.c) {
                if (arrayList.size() == 1) {
                    return c.get(0);
                }
            } else {
                arrayList.add(new Pair(c4134Rl.b, Integer.valueOf(c4134Rl.d)));
                i2++;
            }
        }
        C4134Rl c4134Rl2 = this.c.get(arrayList);
        if (c4134Rl2 == null) {
            C4134Rl k = k(c.subList(0, arrayList.size()));
            this.c.put(arrayList, k);
            return k;
        }
        return c4134Rl2;
    }

    public final C4134Rl k(List<C4134Rl> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).d;
        }
        int nextInt = this.d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            C4134Rl c4134Rl = list.get(i4);
            i3 += c4134Rl.d;
            if (nextInt < i3) {
                return c4134Rl;
            }
        }
        return (C4134Rl) C5098aU0.w(list);
    }

    @InterfaceC5056aJ2
    public C4331Tl(Random random) {
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
