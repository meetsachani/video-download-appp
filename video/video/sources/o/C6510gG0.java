package o;

import o.OL1;

/* renamed from: o.gG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6510gG0 {
    @InterfaceC6509gG
    @InterfaceC5670cr1
    public final int[] a;
    @InterfaceC11300zs1
    public final C6012eG0 b;
    @InterfaceC8568og
    public final int c;

    /* renamed from: o.gG0$b */
    /* loaded from: classes3.dex */
    public static class b {
        @InterfaceC11300zs1
        public C6012eG0 b;
        @InterfaceC6509gG
        @InterfaceC5670cr1
        public int[] a = new int[0];
        @InterfaceC8568og
        public int c = OL1.b.J0;

        @InterfaceC5670cr1
        public C6510gG0 d() {
            return new C6510gG0(this);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b e(@InterfaceC8568og int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b f(@InterfaceC11300zs1 C6012eG0 c6012eG0) {
            this.b = c6012eG0;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b g(@InterfaceC6509gG @InterfaceC5670cr1 int[] iArr) {
            this.a = iArr;
            return this;
        }
    }

    @InterfaceC5670cr1
    public static C6510gG0 a() {
        return new b().f(C6012eG0.c()).d();
    }

    @InterfaceC8568og
    public int b() {
        return this.c;
    }

    @InterfaceC11300zs1
    public C6012eG0 c() {
        return this.b;
    }

    @InterfaceC6509gG
    @InterfaceC5670cr1
    public int[] d() {
        return this.a;
    }

    @InterfaceC4698Xf2
    public int e(@InterfaceC4698Xf2 int i) {
        C6012eG0 c6012eG0 = this.b;
        if (c6012eG0 != null && c6012eG0.e() != 0) {
            return this.b.e();
        }
        return i;
    }

    public C6510gG0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}
