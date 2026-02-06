package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.FE1;

/* loaded from: classes.dex */
public final class F30<T> {
    public final FE1.a<ArrayList<T>> a = new FE1.b(10);
    public final C9654t62<T, ArrayList<T>> b = new C9654t62<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public void a(T t, T t2) {
        if (this.b.containsKey(t) && this.b.containsKey(t2)) {
            ArrayList<T> arrayList = this.b.get(t);
            if (arrayList == null) {
                arrayList = f();
                this.b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> l = this.b.l(i);
            if (l != null) {
                k(l);
            }
        }
        this.b.clear();
    }

    public boolean d(T t) {
        return this.b.containsKey(t);
    }

    public final void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public final ArrayList<T> f() {
        ArrayList<T> a = this.a.a();
        if (a == null) {
            return new ArrayList<>();
        }
        return a;
    }

    public List g(T t) {
        return this.b.get(t);
    }

    public List<T> h(T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> l = this.b.l(i);
            if (l != null && l.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.g(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            e(this.b.g(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> l = this.b.l(i);
            if (l != null && l.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.b(arrayList);
    }

    public int l() {
        return this.b.size();
    }
}
