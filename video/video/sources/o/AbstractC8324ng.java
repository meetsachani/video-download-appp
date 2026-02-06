package o;

import android.util.Range;
import android.util.Size;
import java.util.List;
import o.AbstractC4008Qd2;
import o.InterfaceC6986iD2;

/* renamed from: o.ng  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8324ng {
    public static AbstractC8324ng a(AbstractC4609Wh2 abstractC4609Wh2, int i, Size size, N80 n80, List<InterfaceC6986iD2.b> list, HJ hj, Range<Integer> range) {
        return new C7100ii(abstractC4609Wh2, i, size, n80, list, hj, range);
    }

    public abstract List<InterfaceC6986iD2.b> b();

    public abstract N80 c();

    public abstract int d();

    public abstract HJ e();

    public abstract Size f();

    public abstract AbstractC4609Wh2 g();

    public abstract Range<Integer> h();

    public AbstractC4008Qd2 i(HJ hj) {
        AbstractC4008Qd2.a d = AbstractC4008Qd2.a(f()).b(c()).d(hj);
        if (h() != null) {
            d.c(h());
        }
        return d.a();
    }
}
