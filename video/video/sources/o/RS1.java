package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC4609Wh2;

/* loaded from: classes.dex */
public class RS1 {
    public final C3738Nj0 a;

    public RS1() {
        this((C3738Nj0) X20.a(C3738Nj0.class));
    }

    public List<Size> a(AbstractC4609Wh2.b bVar, List<Size> list) {
        Size d;
        C3738Nj0 c3738Nj0 = this.a;
        if (c3738Nj0 == null || (d = c3738Nj0.d(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        for (Size size : list) {
            if (!size.equals(d)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public RS1(C3738Nj0 c3738Nj0) {
        this.a = c3738Nj0;
    }
}
