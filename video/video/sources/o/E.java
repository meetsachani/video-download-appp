package o;

import com.facebook.S;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.HT1;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class E {
    public static final int b = 5;
    @NotNull
    public static final E a = new E();
    @NotNull
    public static final AtomicBoolean c = new AtomicBoolean(false);

    @InterfaceC9511sW0
    public static final synchronized void c() {
        synchronized (E.class) {
            if (SQ.e(E.class)) {
                return;
            }
            if (c.getAndSet(true)) {
                return;
            }
            com.facebook.M m = com.facebook.M.a;
            if (com.facebook.M.s()) {
                d();
            }
            B b2 = B.a;
            B.d();
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final void d() {
        if (!SQ.e(E.class)) {
            try {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                if (com.facebook.internal.l0.c0()) {
                    return;
                }
                C5086aR0 c5086aR0 = C5086aR0.a;
                File[] l = C5086aR0.l();
                ArrayList arrayList = new ArrayList(l.length);
                for (File file : l) {
                    SQ0.a aVar = SQ0.a.a;
                    arrayList.add(SQ0.a.d(file));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((SQ0) obj).f()) {
                        arrayList2.add(obj);
                    }
                }
                final List x5 = C10662xF.x5(arrayList2, new Comparator() { // from class: o.C
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        int e;
                        e = E.e((SQ0) obj2, (SQ0) obj3);
                        return e;
                    }
                });
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = C5075aO1.W1(0, Math.min(x5.size(), 5)).iterator();
                while (it.hasNext()) {
                    jSONArray.put(x5.get(((AbstractC8515oR0) it).nextInt()));
                }
                C5086aR0 c5086aR02 = C5086aR0.a;
                C5086aR0.s("anr_reports", jSONArray, new S.b() { // from class: o.D
                    @Override // com.facebook.S.b
                    public final void a(com.facebook.Y y) {
                        E.f(x5, y);
                    }
                });
            } catch (Throwable th) {
                SQ.c(th, E.class);
            }
        }
    }

    public static final int e(SQ0 sq0, SQ0 sq02) {
        if (SQ.e(E.class)) {
            return 0;
        }
        try {
            C6562gT0.o(sq02, "o2");
            return sq0.b(sq02);
        } catch (Throwable th) {
            SQ.c(th, E.class);
            return 0;
        }
    }

    public static final void f(List list, com.facebook.Y y) {
        Boolean valueOf;
        if (!SQ.e(E.class)) {
            try {
                C6562gT0.p(list, "$validReports");
                C6562gT0.p(y, "response");
                try {
                    if (y.g() == null) {
                        JSONObject k = y.k();
                        if (k == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(k.getBoolean("success"));
                        }
                        if (C6562gT0.g(valueOf, Boolean.TRUE)) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((SQ0) it.next()).a();
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                SQ.c(th, E.class);
            }
        }
    }
}
