package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Bw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2602Bw0 {
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 7;
    public static final long i = 5000;
    public final List<C8582oj1> a;
    public final List<C8582oj1> b;
    public final List<C8582oj1> c;
    public final long d;

    /* renamed from: o.Bw0$a */
    /* loaded from: classes.dex */
    public static class a {
        public final List<C8582oj1> a;
        public final List<C8582oj1> b;
        public final List<C8582oj1> c;
        public long d;

        public a(C8582oj1 c8582oj1) {
            this(c8582oj1, 7);
        }

        public a a(C8582oj1 c8582oj1) {
            return b(c8582oj1, 7);
        }

        public a b(C8582oj1 c8582oj1, int i) {
            boolean z;
            boolean z2 = false;
            if (c8582oj1 != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z2 = true;
            }
            C10907yF1.b(z2, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.a.add(c8582oj1);
            }
            if ((i & 2) != 0) {
                this.b.add(c8582oj1);
            }
            if ((i & 4) != 0) {
                this.c.add(c8582oj1);
            }
            return this;
        }

        public C2602Bw0 c() {
            return new C2602Bw0(this);
        }

        public a d() {
            this.d = 0L;
            return this;
        }

        public a e(int i) {
            if ((i & 1) != 0) {
                this.a.clear();
            }
            if ((i & 2) != 0) {
                this.b.clear();
            }
            if ((i & 4) != 0) {
                this.c.clear();
            }
            return this;
        }

        public a f(long j, TimeUnit timeUnit) {
            boolean z;
            if (j >= 1) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "autoCancelDuration must be at least 1");
            this.d = timeUnit.toMillis(j);
            return this;
        }

        public a(C8582oj1 c8582oj1, int i) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = 5000L;
            b(c8582oj1, i);
        }

        public a(C2602Bw0 c2602Bw0) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.c = arrayList3;
            this.d = 5000L;
            arrayList.addAll(c2602Bw0.c());
            arrayList2.addAll(c2602Bw0.b());
            arrayList3.addAll(c2602Bw0.d());
            this.d = c2602Bw0.a();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Bw0$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public C2602Bw0(a aVar) {
        this.a = Collections.unmodifiableList(aVar.a);
        this.b = Collections.unmodifiableList(aVar.b);
        this.c = Collections.unmodifiableList(aVar.c);
        this.d = aVar.d;
    }

    public long a() {
        return this.d;
    }

    public List<C8582oj1> b() {
        return this.b;
    }

    public List<C8582oj1> c() {
        return this.a;
    }

    public List<C8582oj1> d() {
        return this.c;
    }

    public boolean e() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }
}
