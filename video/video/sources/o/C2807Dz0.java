package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Dz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2807Dz0 {
    public static final C2807Dz0 a;
    public static final AbstractC3014Fz0 b;
    public static final AbstractC3014Fz0 c;

    static {
        C2807Dz0 c2807Dz0 = new C2807Dz0();
        a = c2807Dz0;
        b = new C2905Ez0();
        c = c2807Dz0.c();
    }

    @InterfaceC9511sW0
    public static final void a(Fragment fragment, Fragment fragment2, boolean z, C2531Be<String, View> c2531Be, boolean z2) {
        U32 y;
        C6562gT0.p(fragment, "inFragment");
        C6562gT0.p(fragment2, "outFragment");
        C6562gT0.p(c2531Be, "sharedElements");
        if (z) {
            y = fragment2.y();
        } else {
            y = fragment.y();
        }
        if (y != null) {
            ArrayList arrayList = new ArrayList(c2531Be.size());
            for (Map.Entry<String, View> entry : c2531Be.entrySet()) {
                arrayList.add(entry.getValue());
            }
            ArrayList arrayList2 = new ArrayList(c2531Be.size());
            for (Map.Entry<String, View> entry2 : c2531Be.entrySet()) {
                arrayList2.add(entry2.getKey());
            }
            if (z2) {
                y.g(arrayList2, arrayList, null);
            } else {
                y.f(arrayList2, arrayList, null);
            }
        }
    }

    @InterfaceC9511sW0
    public static final String b(C2531Be<String, String> c2531Be, String str) {
        C6562gT0.p(c2531Be, "<this>");
        C6562gT0.p(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c2531Be.entrySet()) {
            if (C6562gT0.g(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add((String) entry2.getKey());
        }
        return (String) C10662xF.J2(arrayList);
    }

    @InterfaceC9511sW0
    public static final void d(C2531Be<String, String> c2531Be, C2531Be<String, View> c2531Be2) {
        C6562gT0.p(c2531Be, "<this>");
        C6562gT0.p(c2531Be2, "namedViews");
        int size = c2531Be.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (!c2531Be2.containsKey(c2531Be.l(size))) {
                    c2531Be.j(size);
                }
            } else {
                return;
            }
        }
    }

    @InterfaceC9511sW0
    public static final void e(List<? extends View> list, int i) {
        C6562gT0.p(list, "views");
        for (View view : list) {
            view.setVisibility(i);
        }
    }

    @InterfaceC9511sW0
    public static final boolean f() {
        if (b == null && c == null) {
            return false;
        }
        return true;
    }

    public final AbstractC3014Fz0 c() {
        try {
            C6562gT0.n(C3210Hz0.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (AbstractC3014Fz0) C3210Hz0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
