package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.cx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5694cx1 {
    public static final String d = "OutputSizesCorrector";
    public final String a;
    public final C3933Pj0 b = (C3933Pj0) X20.a(C3933Pj0.class);
    public final C4111Rf0 c;

    public C5694cx1(String str) {
        this.a = str;
        this.c = new C4111Rf0(str);
    }

    public final void a(List<Size> list, Class<?> cls) {
        C3933Pj0 c3933Pj0 = this.b;
        if (c3933Pj0 != null) {
            Size[] e = c3933Pj0.e(cls);
            if (e.length > 0) {
                list.addAll(Arrays.asList(e));
            }
        }
    }

    public final void b(List<Size> list, int i) {
        C3933Pj0 c3933Pj0 = this.b;
        if (c3933Pj0 != null) {
            Size[] d2 = c3933Pj0.d(i);
            if (d2.length > 0) {
                list.addAll(Arrays.asList(d2));
            }
        }
    }

    public Size[] c(Size[] sizeArr, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        b(arrayList, i);
        f(arrayList, i);
        if (arrayList.isEmpty()) {
            C7433k41.p(d, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public <T> Size[] d(Size[] sizeArr, Class<T> cls) {
        List<Size> arrayList = new ArrayList<>(Arrays.asList(sizeArr));
        a(arrayList, cls);
        e(arrayList, cls);
        if (arrayList.isEmpty()) {
            C7433k41.p(d, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final void e(List<Size> list, Class<?> cls) {
        List<Size> b = this.c.b(cls);
        if (b.isEmpty()) {
            return;
        }
        list.removeAll(b);
    }

    public final void f(List<Size> list, int i) {
        List<Size> a = this.c.a(i);
        if (a.isEmpty()) {
            return;
        }
        list.removeAll(a);
    }
}
