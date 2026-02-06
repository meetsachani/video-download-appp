package o;

import android.content.Context;
import java.util.concurrent.Executor;
import o.Vt2;

/* loaded from: classes2.dex */
public final class ZT extends Vt2 {
    public InterfaceC6272fK1<Executor> X;
    public InterfaceC6272fK1<Context> Y;
    public InterfaceC6272fK1 Y0;
    public InterfaceC6272fK1 Z;
    public InterfaceC6272fK1 Z0;
    public InterfaceC6272fK1<String> a1;
    public InterfaceC6272fK1<C7062iX1> b1;
    public InterfaceC6272fK1<AbstractC6822hY1> c1;
    public InterfaceC6272fK1<InterfaceC8257nN2> d1;
    public InterfaceC6272fK1<C10114v00> e1;
    public InterfaceC6272fK1<GC2> f1;
    public InterfaceC6272fK1<WM2> g1;
    public InterfaceC6272fK1<Ut2> h1;

    /* loaded from: classes2.dex */
    public static final class b implements Vt2.a {
        public Context a;

        public b() {
        }

        @Override // o.Vt2.a
        /* renamed from: b */
        public b a(Context context) {
            this.a = (Context) C10421wF1.b(context);
            return this;
        }

        @Override // o.Vt2.a
        public Vt2 build() {
            C10421wF1.a(this.a, Context.class);
            return new ZT(this.a);
        }
    }

    public static Vt2.a f() {
        return new b();
    }

    @Override // o.Vt2
    public InterfaceC4207Se0 a() {
        return this.b1.get();
    }

    @Override // o.Vt2
    public Ut2 d() {
        return this.h1.get();
    }

    public final void h(Context context) {
        this.X = Y40.b(C6110eg0.a());
        InterfaceC5884dk0 a2 = C10464wQ0.a(context);
        this.Y = a2;
        C6298fR a3 = C6298fR.a(a2, C4052Qo2.a(), C4149Ro2.a());
        this.Z = a3;
        this.Y0 = Y40.b(C4515Vi1.a(this.Y, a3));
        this.Z0 = C10979yY1.a(this.Y, C4498Ve0.a(), C4692Xe0.a());
        this.a1 = Y40.b(C4595We0.a(this.Y));
        this.b1 = Y40.b(C7303jX1.a(C4052Qo2.a(), C4149Ro2.a(), C4789Ye0.a(), this.Z0, this.a1));
        C8296nY1 b2 = C8296nY1.b(C4052Qo2.a());
        this.c1 = b2;
        C8783pY1 a4 = C8783pY1.a(this.Y, this.b1, b2, C4149Ro2.a());
        this.d1 = a4;
        InterfaceC6272fK1<Executor> interfaceC6272fK1 = this.X;
        InterfaceC6272fK1 interfaceC6272fK12 = this.Y0;
        InterfaceC6272fK1<C7062iX1> interfaceC6272fK13 = this.b1;
        this.e1 = C10360w00.a(interfaceC6272fK1, interfaceC6272fK12, a4, interfaceC6272fK13, interfaceC6272fK13);
        InterfaceC6272fK1<Context> interfaceC6272fK14 = this.Y;
        InterfaceC6272fK1 interfaceC6272fK15 = this.Y0;
        InterfaceC6272fK1<C7062iX1> interfaceC6272fK16 = this.b1;
        this.f1 = HC2.a(interfaceC6272fK14, interfaceC6272fK15, interfaceC6272fK16, this.d1, this.X, interfaceC6272fK16, C4052Qo2.a(), C4149Ro2.a(), this.b1);
        InterfaceC6272fK1<Executor> interfaceC6272fK17 = this.X;
        InterfaceC6272fK1<C7062iX1> interfaceC6272fK18 = this.b1;
        this.g1 = XM2.a(interfaceC6272fK17, interfaceC6272fK18, this.d1, interfaceC6272fK18);
        this.h1 = Y40.b(Wt2.a(C4052Qo2.a(), C4149Ro2.a(), this.e1, this.f1, this.g1));
    }

    public ZT(Context context) {
        h(context);
    }
}
