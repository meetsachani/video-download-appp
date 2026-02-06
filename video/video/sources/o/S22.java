package o;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.NV0;

/* loaded from: classes.dex */
public class S22 implements GE2<R22> {
    public static final S22 a = new S22();
    public static final NV0.a b = NV0.a.a("c", "v", "i", W12.e);

    @Override // o.GE2
    /* renamed from: b */
    public R22 a(NV0 nv0, float f) throws IOException {
        if (nv0.q() == NV0.b.BEGIN_ARRAY) {
            nv0.d();
        }
        nv0.f();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (nv0.j()) {
            int s = nv0.s(b);
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            nv0.t();
                            nv0.u();
                        } else {
                            list3 = C5347bW0.f(nv0, f);
                        }
                    } else {
                        list2 = C5347bW0.f(nv0, f);
                    }
                } else {
                    list = C5347bW0.f(nv0, f);
                }
            } else {
                z = nv0.k();
            }
        }
        nv0.i();
        if (nv0.q() == NV0.b.END_ARRAY) {
            nv0.h();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new R22(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C6557gS(C4713Xj1.a(list.get(i2), list3.get(i2)), C4713Xj1.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C6557gS(C4713Xj1.a(list.get(i3), list3.get(i3)), C4713Xj1.a(pointF3, list2.get(0)), pointF3));
            }
            return new R22(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
