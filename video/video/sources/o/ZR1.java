package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import o.RZ1;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ZR1 {
    public static final long j = -1;
    public final long b;
    public final C10833xx0 c;
    public final AbstractC5317bO0<C4134Rl> d;
    public final long e;
    public final List<C11097z20> f;
    public final List<C11097z20> g;
    public final List<C11097z20> h;
    public final XN1 i;

    /* loaded from: classes2.dex */
    public static class c extends ZR1 {
        public final Uri k;
        public final long l;
        @InterfaceC11300zs1
        public final String m;
        @InterfaceC11300zs1
        public final XN1 n;
        @InterfaceC11300zs1

        /* renamed from: o  reason: collision with root package name */
        public final C10880y82 f683o;

        public c(long j, C10833xx0 c10833xx0, List<C4134Rl> list, RZ1.e eVar, @InterfaceC11300zs1 List<C11097z20> list2, List<C11097z20> list3, List<C11097z20> list4, @InterfaceC11300zs1 String str, long j2) {
            super(j, c10833xx0, list, eVar, list2, list3, list4);
            C10880y82 c10880y82;
            this.k = Uri.parse(list.get(0).a);
            XN1 c = eVar.c();
            this.n = c;
            this.m = str;
            this.l = j2;
            if (c != null) {
                c10880y82 = null;
            } else {
                c10880y82 = new C10880y82(new XN1(null, 0L, j2));
            }
            this.f683o = c10880y82;
        }

        public static c q(long j, C10833xx0 c10833xx0, String str, long j2, long j3, long j4, long j5, List<C11097z20> list, @InterfaceC11300zs1 String str2, long j6) {
            return new c(j, c10833xx0, AbstractC5317bO0.M(new C4134Rl(str)), new RZ1.e(new XN1(null, j2, (j3 - j2) + 1), 1L, 0L, j4, (j5 - j4) + 1), list, AbstractC5317bO0.L(), AbstractC5317bO0.L(), str2, j6);
        }

        @Override // o.ZR1
        @InterfaceC11300zs1
        public String a() {
            return this.m;
        }

        @Override // o.ZR1
        @InterfaceC11300zs1
        public InterfaceC7292jU b() {
            return this.f683o;
        }

        @Override // o.ZR1
        @InterfaceC11300zs1
        public XN1 m() {
            return this.n;
        }
    }

    public static ZR1 o(long j2, C10833xx0 c10833xx0, List<C4134Rl> list, RZ1 rz1) {
        return p(j2, c10833xx0, list, rz1, null, AbstractC5317bO0.L(), AbstractC5317bO0.L(), null);
    }

    public static ZR1 p(long j2, C10833xx0 c10833xx0, List<C4134Rl> list, RZ1 rz1, @InterfaceC11300zs1 List<C11097z20> list2, List<C11097z20> list3, List<C11097z20> list4, @InterfaceC11300zs1 String str) {
        if (rz1 instanceof RZ1.e) {
            return new c(j2, c10833xx0, list, (RZ1.e) rz1, list2, list3, list4, str, -1L);
        }
        if (rz1 instanceof RZ1.a) {
            return new b(j2, c10833xx0, list, (RZ1.a) rz1, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    @InterfaceC11300zs1
    public abstract String a();

    @InterfaceC11300zs1
    public abstract InterfaceC7292jU b();

    @InterfaceC11300zs1
    public abstract XN1 m();

    @InterfaceC11300zs1
    public XN1 n() {
        return this.i;
    }

    public ZR1(long j2, C10833xx0 c10833xx0, List<C4134Rl> list, RZ1 rz1, @InterfaceC11300zs1 List<C11097z20> list2, List<C11097z20> list3, List<C11097z20> list4) {
        List<C11097z20> unmodifiableList;
        C9542sf.a(!list.isEmpty());
        this.b = j2;
        this.c = c10833xx0;
        this.d = AbstractC5317bO0.F(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f = unmodifiableList;
        this.g = list3;
        this.h = list4;
        this.i = rz1.a(this);
        this.e = rz1.b();
    }

    /* loaded from: classes2.dex */
    public static class b extends ZR1 implements InterfaceC7292jU {
        @InterfaceC5056aJ2
        public final RZ1.a k;

        public b(long j, C10833xx0 c10833xx0, List<C4134Rl> list, RZ1.a aVar, @InterfaceC11300zs1 List<C11097z20> list2, List<C11097z20> list3, List<C11097z20> list4) {
            super(j, c10833xx0, list, aVar, list2, list3, list4);
            this.k = aVar;
        }

        @Override // o.ZR1
        @InterfaceC11300zs1
        public String a() {
            return null;
        }

        @Override // o.InterfaceC7292jU
        public long c(long j) {
            return this.k.j(j);
        }

        @Override // o.InterfaceC7292jU
        public long d(long j, long j2) {
            return this.k.h(j, j2);
        }

        @Override // o.InterfaceC7292jU
        public long e(long j, long j2) {
            return this.k.d(j, j2);
        }

        @Override // o.InterfaceC7292jU
        public long f(long j, long j2) {
            return this.k.f(j, j2);
        }

        @Override // o.InterfaceC7292jU
        public XN1 g(long j) {
            return this.k.k(this, j);
        }

        @Override // o.InterfaceC7292jU
        public long h(long j, long j2) {
            return this.k.i(j, j2);
        }

        @Override // o.InterfaceC7292jU
        public long i(long j) {
            return this.k.g(j);
        }

        @Override // o.InterfaceC7292jU
        public boolean j() {
            return this.k.l();
        }

        @Override // o.InterfaceC7292jU
        public long k() {
            return this.k.e();
        }

        @Override // o.InterfaceC7292jU
        public long l(long j, long j2) {
            return this.k.c(j, j2);
        }

        @Override // o.ZR1
        @InterfaceC11300zs1
        public XN1 m() {
            return null;
        }

        @Override // o.ZR1
        public InterfaceC7292jU b() {
            return this;
        }
    }
}
