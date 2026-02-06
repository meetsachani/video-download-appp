package o;

import android.util.SparseArray;

@Deprecated
/* renamed from: o.vp2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10314vp2 {
    public final SparseArray<C10071up2> a = new SparseArray<>();

    public C10071up2 a(int i) {
        C10071up2 c10071up2 = this.a.get(i);
        if (c10071up2 == null) {
            C10071up2 c10071up22 = new C10071up2(C10071up2.f);
            this.a.put(i, c10071up22);
            return c10071up22;
        }
        return c10071up2;
    }

    public void b() {
        this.a.clear();
    }
}
