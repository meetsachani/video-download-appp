package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Rf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4111Rf0 {
    public final String a;

    public C4111Rf0(String str) {
        this.a = str;
    }

    public List<Size> a(int i) {
        C4211Sf0 c4211Sf0 = (C4211Sf0) X20.a(C4211Sf0.class);
        if (c4211Sf0 == null) {
            return new ArrayList();
        }
        return c4211Sf0.d(this.a, i);
    }

    public List<Size> b(Class<?> cls) {
        C4211Sf0 c4211Sf0 = (C4211Sf0) X20.a(C4211Sf0.class);
        if (c4211Sf0 == null) {
            return new ArrayList();
        }
        return c4211Sf0.e(this.a, cls);
    }
}
