package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l {
    public static final int c = -1;
    public SparseIntArray a = new SparseIntArray();
    public HashMap<Integer, HashSet<WeakReference<a>>> b = new HashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2, int i3);
    }

    public void a(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }

    public void b() {
        this.b.clear();
    }

    public void c(int i, int i2) {
        int i3 = this.a.get(i, -1);
        if (i3 != i2) {
            this.a.put(i, i2);
            HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
            if (hashSet != null) {
                Iterator<WeakReference<a>> it = hashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    a aVar = it.next().get();
                    if (aVar != null) {
                        aVar.a(i, i2, i3);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<WeakReference<a>> it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        WeakReference<a> next = it2.next();
                        if (next.get() == null) {
                            arrayList.add(next);
                        }
                    }
                    hashSet.removeAll(arrayList);
                }
            }
        }
    }

    public int d(int i) {
        return this.a.get(i, -1);
    }

    public void e(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<a>> it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            a aVar2 = next.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void f(a aVar) {
        for (Integer num : this.b.keySet()) {
            e(num.intValue(), aVar);
        }
    }
}
