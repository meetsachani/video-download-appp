package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface E {

    /* loaded from: classes.dex */
    public static class a implements E {
        public SparseArray<r> a = new SparseArray<>();
        public int b = 0;

        /* renamed from: androidx.recyclerview.widget.E$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0038a implements c {
            public SparseIntArray a = new SparseIntArray(1);
            public SparseIntArray b = new SparseIntArray(1);
            public final r c;

            public C0038a(r rVar) {
                this.c = rVar;
            }

            @Override // androidx.recyclerview.widget.E.c
            public void e() {
                a.this.d(this.c);
            }

            @Override // androidx.recyclerview.widget.E.c
            public int f(int i) {
                int indexOfKey = this.b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.c.c);
            }

            @Override // androidx.recyclerview.widget.E.c
            public int g(int i) {
                int indexOfKey = this.a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.a.valueAt(indexOfKey);
                }
                int c = a.this.c(this.c);
                this.a.put(i, c);
                this.b.put(c, i);
                return c;
            }
        }

        @Override // androidx.recyclerview.widget.E
        public r a(int i) {
            r rVar = this.a.get(i);
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.E
        public c b(r rVar) {
            return new C0038a(rVar);
        }

        public int c(r rVar) {
            int i = this.b;
            this.b = i + 1;
            this.a.put(i, rVar);
            return i;
        }

        public void d(r rVar) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                if (this.a.valueAt(size) == rVar) {
                    this.a.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements E {
        public SparseArray<List<r>> a = new SparseArray<>();

        /* loaded from: classes.dex */
        public class a implements c {
            public final r a;

            public a(r rVar) {
                this.a = rVar;
            }

            @Override // androidx.recyclerview.widget.E.c
            public void e() {
                b.this.c(this.a);
            }

            @Override // androidx.recyclerview.widget.E.c
            public int f(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.E.c
            public int g(int i) {
                List<r> list = b.this.a.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    b.this.a.put(i, list);
                }
                if (!list.contains(this.a)) {
                    list.add(this.a);
                }
                return i;
            }
        }

        @Override // androidx.recyclerview.widget.E
        public r a(int i) {
            List<r> list = this.a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.E
        public c b(r rVar) {
            return new a(rVar);
        }

        public void c(r rVar) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                List<r> valueAt = this.a.valueAt(size);
                if (valueAt.remove(rVar) && valueAt.isEmpty()) {
                    this.a.removeAt(size);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void e();

        int f(int i);

        int g(int i);
    }

    r a(int i);

    c b(r rVar);
}
