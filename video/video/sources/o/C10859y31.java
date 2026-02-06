package o;

import o.C6126ek0;
import o.FE1;

/* renamed from: o.y31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10859y31<Z> implements InterfaceC5580cT1<Z>, C6126ek0.f {
    public static final FE1.a<C10859y31<?>> Z0 = C6126ek0.e(20, new a());
    public final AbstractC2428Ac2 X = AbstractC2428Ac2.a();
    public InterfaceC5580cT1<Z> Y;
    public boolean Y0;
    public boolean Z;

    /* renamed from: o.y31$a */
    /* loaded from: classes.dex */
    public class a implements C6126ek0.d<C10859y31<?>> {
        @Override // o.C6126ek0.d
        /* renamed from: b */
        public C10859y31<?> a() {
            return new C10859y31<>();
        }
    }

    public static <Z> C10859y31<Z> c(InterfaceC5580cT1<Z> interfaceC5580cT1) {
        C10859y31<Z> c10859y31 = (C10859y31) C10175vF1.e(Z0.a());
        c10859y31.b(interfaceC5580cT1);
        return c10859y31;
    }

    private void d() {
        this.Y = null;
        Z0.b(this);
    }

    @Override // o.InterfaceC5580cT1
    public synchronized void a() {
        this.X.c();
        this.Y0 = true;
        if (!this.Z) {
            this.Y.a();
            d();
        }
    }

    public final void b(InterfaceC5580cT1<Z> interfaceC5580cT1) {
        this.Y0 = false;
        this.Z = true;
        this.Y = interfaceC5580cT1;
    }

    @Override // o.C6126ek0.f
    public AbstractC2428Ac2 e() {
        return this.X;
    }

    public synchronized void f() {
        this.X.c();
        if (this.Z) {
            this.Z = false;
            if (this.Y0) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // o.InterfaceC5580cT1
    public Z get() {
        return this.Y.get();
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return this.Y.h0();
    }

    @Override // o.InterfaceC5580cT1
    public Class<Z> i0() {
        return this.Y.i0();
    }
}
