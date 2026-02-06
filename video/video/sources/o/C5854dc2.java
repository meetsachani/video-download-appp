package o;

import o.KZ1;

@Deprecated
/* renamed from: o.dc2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5854dc2 implements InterfaceC4518Vj0 {
    public final long X;
    public final InterfaceC4518Vj0 Y;

    /* renamed from: o.dc2$a */
    /* loaded from: classes2.dex */
    public class a implements KZ1 {
        public final /* synthetic */ KZ1 d;

        public a(KZ1 kz1) {
            this.d = kz1;
        }

        @Override // o.KZ1
        public KZ1.a e(long j) {
            KZ1.a e = this.d.e(j);
            MZ1 mz1 = e.a;
            MZ1 mz12 = new MZ1(mz1.a, mz1.b + C5854dc2.this.X);
            MZ1 mz13 = e.b;
            return new KZ1.a(mz12, new MZ1(mz13.a, mz13.b + C5854dc2.this.X));
        }

        @Override // o.KZ1
        public boolean h() {
            return this.d.h();
        }

        @Override // o.KZ1
        public long i() {
            return this.d.i();
        }
    }

    public C5854dc2(long j, InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.X = j;
        this.Y = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4518Vj0
    public InterfaceC10568wr2 b(int i, int i2) {
        return this.Y.b(i, i2);
    }

    @Override // o.InterfaceC4518Vj0
    public void n() {
        this.Y.n();
    }

    @Override // o.InterfaceC4518Vj0
    public void p(KZ1 kz1) {
        this.Y.p(new a(kz1));
    }
}
