package o;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class NH<T> extends C8684p82 implements Runnable {
    public final InterfaceC5332bS Y0;
    public final InterfaceC7449k81<? extends T> Z0;
    public final OR a1;
    public final List<InterfaceC3944Pm<T>> b1;
    public long c1;
    public Throwable d1;
    public TZ0<T> e1;

    public NH(C3968Ps c3968Ps, InterfaceC5332bS interfaceC5332bS, boolean z, InterfaceC7449k81<? extends T> interfaceC7449k81, OR or, List<InterfaceC3944Pm<T>> list) {
        super(c3968Ps, z);
        this.Y0 = interfaceC5332bS;
        this.Z0 = interfaceC7449k81;
        this.a1 = or;
        this.b1 = (List) C11304zt1.t(list, Collections.EMPTY_LIST);
    }

    public long e() {
        return this.c1;
    }

    public Throwable f() {
        return this.d1;
    }

    public void g(TZ0<T> tz0) {
        if (this.e1 == null) {
            this.e1 = tz0;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (d() != null) {
            try {
                long h = this.X.h();
                this.c1 = h;
                this.e1.n(h, this.Z0, this.Y0, this.b1, this.Z, this.a1);
            } catch (Exception e) {
                this.d1 = e;
                return;
            }
        }
        this.e1.i();
    }
}
