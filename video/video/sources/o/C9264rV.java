package o;

import java.util.Date;

/* renamed from: o.rV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9264rV extends AbstractC9882u3 {
    public static final C9264rV c = new C9264rV();

    public final String g(long j, String str) {
        C8840pn0 y;
        if (str != null) {
            try {
                y = C8840pn0.y(str);
            } catch (Exception e) {
                throw C6036eM0.b(e, "Invalid date format: [%s]", str);
            }
        } else {
            y = null;
        }
        if (y == null) {
            y = C8840pn0.x();
        }
        return y.i(new Date(j));
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        return g(System.currentTimeMillis(), str);
    }
}
