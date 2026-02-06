package o;

import androidx.camera.core.m;
import o.HJ;

/* renamed from: o.kD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7470kD2 extends CO1 {
    public static final HJ.a<m.b> J = HJ.a.a("camerax.core.useCaseEventCallback", m.b.class);

    /* renamed from: o.kD2$a */
    /* loaded from: classes.dex */
    public interface a<B> {
        B c(m.b bVar);
    }

    default m.b O() {
        return (m.b) j(J);
    }

    default m.b p0(m.b bVar) {
        return (m.b) h(J, bVar);
    }
}
