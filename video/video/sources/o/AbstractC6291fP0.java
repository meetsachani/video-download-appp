package o;

import android.animation.Animator;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC6717h70;
import o.InterfaceC8441o9;

/* renamed from: o.fP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6291fP0<T extends Animator> {
    public C6546gP0 a;
    public final List<AbstractC6717h70.a> b = new ArrayList();

    public AbstractC6291fP0(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new AbstractC6717h70.a());
        }
    }

    public abstract void a();

    public float b(int i, int i2, int i3) {
        return C9293rd1.d((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void c();

    public abstract void d(@InterfaceC5670cr1 InterfaceC8441o9.a aVar);

    public void e(@InterfaceC5670cr1 C6546gP0 c6546gP0) {
        this.a = c6546gP0;
    }

    public abstract void f();

    @InterfaceC5056aJ2
    public abstract void g();

    @InterfaceC5056aJ2
    public abstract void h(float f);

    public abstract void i();

    public abstract void j();
}
