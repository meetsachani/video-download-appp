package o;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o.TM2;

/* renamed from: o.oN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8501oN2 {
    public static final long t = -1;
    public String a;
    public TM2.a b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public XK j;
    public int k;
    public EnumC11023yk l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f826o;
    public long p;
    public boolean q;
    public EnumC2505Aw1 r;
    public static final String s = AbstractC6949i41.f("WorkSpec");
    public static final InterfaceC6490gB0<List<c>, List<TM2>> u = new a();

    /* renamed from: o.oN2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC6490gB0<List<c>, List<TM2>> {
        @Override // o.InterfaceC6490gB0
        /* renamed from: a */
        public List<TM2> apply(List<c> input) {
            if (input == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(input.size());
            for (c cVar : input) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* renamed from: o.oN2$b */
    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public TM2.a b;

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            if (!(o2 instanceof b)) {
                return false;
            }
            b bVar = (b) o2;
            if (this.b != bVar.b) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* renamed from: o.oN2$c */
    /* loaded from: classes.dex */
    public static class c {
        public String a;
        public TM2.a b;
        public androidx.work.b c;
        public int d;
        public List<String> e;
        public List<androidx.work.b> f;

        public TM2 a() {
            androidx.work.b bVar;
            List<androidx.work.b> list = this.f;
            if (list != null && !list.isEmpty()) {
                bVar = this.f.get(0);
            } else {
                bVar = androidx.work.b.c;
            }
            return new TM2(UUID.fromString(this.a), this.b, this.c, this.e, bVar, this.d);
        }

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            if (!(o2 instanceof c)) {
                return false;
            }
            c cVar = (c) o2;
            if (this.d != cVar.d) {
                return false;
            }
            String str = this.a;
            if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
                return false;
            }
            if (this.b != cVar.b) {
                return false;
            }
            androidx.work.b bVar = this.c;
            if (bVar == null ? cVar.c != null : !bVar.equals(cVar.c)) {
                return false;
            }
            List<String> list = this.e;
            if (list == null ? cVar.e != null : !list.equals(cVar.e)) {
                return false;
            }
            List<androidx.work.b> list2 = this.f;
            List<androidx.work.b> list3 = cVar.f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String str = this.a;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            TM2.a aVar = this.b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            androidx.work.b bVar = this.c;
            if (bVar != null) {
                i3 = bVar.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((i7 + i3) * 31) + this.d) * 31;
            List<String> list = this.e;
            if (list != null) {
                i4 = list.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            List<androidx.work.b> list2 = this.f;
            if (list2 != null) {
                i5 = list2.hashCode();
            }
            return i9 + i5;
        }
    }

    public C8501oN2(String id, String workerClassName) {
        this.b = TM2.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = XK.i;
        this.l = EnumC11023yk.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = EnumC2505Aw1.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = id;
        this.c = workerClassName;
    }

    public long a() {
        long j;
        long scalb;
        if (c()) {
            if (this.l == EnumC11023yk.LINEAR) {
                scalb = this.m * this.k;
            } else {
                scalb = Math.scalb((float) this.m, this.k - 1);
            }
            return this.n + Math.min((long) AbstractC7753lN2.e, scalb);
        }
        long j2 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.n;
            if (j3 == 0) {
                j = currentTimeMillis + this.g;
            } else {
                j = j3;
            }
            long j4 = this.i;
            long j5 = this.h;
            if (j4 != j5) {
                if (j3 == 0) {
                    j2 = j4 * (-1);
                }
                return j + j5 + j2;
            }
            if (j3 != 0) {
                j2 = j5;
            }
            return j + j2;
        }
        long j6 = this.n;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return j6 + this.g;
    }

    public boolean b() {
        return !XK.i.equals(this.j);
    }

    public boolean c() {
        if (this.b == TM2.a.ENQUEUED && this.k > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public void e(long backoffDelayDuration) {
        if (backoffDelayDuration > AbstractC7753lN2.e) {
            AbstractC6949i41.c().h(s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < 10000) {
            AbstractC6949i41.c().h(s, "Backoff delay duration less than minimum value", new Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.m = backoffDelayDuration;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 != null && C8501oN2.class == o2.getClass()) {
            C8501oN2 c8501oN2 = (C8501oN2) o2;
            if (this.g != c8501oN2.g || this.h != c8501oN2.h || this.i != c8501oN2.i || this.k != c8501oN2.k || this.m != c8501oN2.m || this.n != c8501oN2.n || this.f826o != c8501oN2.f826o || this.p != c8501oN2.p || this.q != c8501oN2.q || !this.a.equals(c8501oN2.a) || this.b != c8501oN2.b || !this.c.equals(c8501oN2.c)) {
                return false;
            }
            String str = this.d;
            if (str == null ? c8501oN2.d != null : !str.equals(c8501oN2.d)) {
                return false;
            }
            if (this.e.equals(c8501oN2.e) && this.f.equals(c8501oN2.f) && this.j.equals(c8501oN2.j) && this.l == c8501oN2.l && this.r == c8501oN2.r) {
                return true;
            }
        }
        return false;
    }

    public void f(long intervalDuration) {
        if (intervalDuration < DC1.g) {
            AbstractC6949i41.c().h(s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf((long) DC1.g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        g(intervalDuration, intervalDuration);
    }

    public void g(long intervalDuration, long flexDuration) {
        if (intervalDuration < DC1.g) {
            AbstractC6949i41.c().h(s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf((long) DC1.g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < 300000) {
            AbstractC6949i41.c().h(s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            AbstractC6949i41.c().h(s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.h = intervalDuration;
        this.i = flexDuration;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.f826o;
        long j7 = this.p;
        return ((((((((((((((((((((((((((((hashCode + i) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31) + this.r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public C8501oN2(C8501oN2 other) {
        this.b = TM2.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = XK.i;
        this.l = EnumC11023yk.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = EnumC2505Aw1.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = other.a;
        this.c = other.c;
        this.b = other.b;
        this.d = other.d;
        this.e = new androidx.work.b(other.e);
        this.f = new androidx.work.b(other.f);
        this.g = other.g;
        this.h = other.h;
        this.i = other.i;
        this.j = new XK(other.j);
        this.k = other.k;
        this.l = other.l;
        this.m = other.m;
        this.n = other.n;
        this.f826o = other.f826o;
        this.p = other.p;
        this.q = other.q;
        this.r = other.r;
    }
}
