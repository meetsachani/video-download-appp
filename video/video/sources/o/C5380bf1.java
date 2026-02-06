package o;

import android.view.Surface;

@Deprecated
/* renamed from: o.bf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5380bf1 extends C3034Ge1 {
    public final boolean Y0;
    public final int Z;

    public C5380bf1(Throwable th, @InterfaceC11300zs1 C3621Me1 c3621Me1, @InterfaceC11300zs1 Surface surface) {
        super(th, c3621Me1);
        boolean z;
        this.Z = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z = false;
        } else {
            z = true;
        }
        this.Y0 = z;
    }
}
