package o;

import android.util.Log;
import com.facebook.S;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.HT1;
import o.RQ;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class RQ implements Thread.UncaughtExceptionHandler {
    @NotNull
    public static final a b = new a(null);
    public static final String c = RQ.class.getCanonicalName();
    public static final int d = 5;
    @Nullable
    public static RQ e;
    @Nullable
    public final Thread.UncaughtExceptionHandler a;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static final int e(SQ0 sq0, SQ0 sq02) {
            C6562gT0.o(sq02, "o2");
            return sq0.b(sq02);
        }

        public static final void f(List list, com.facebook.Y y) {
            Boolean valueOf;
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
        }

        @InterfaceC9511sW0
        public final synchronized void c() {
            try {
                com.facebook.M m = com.facebook.M.a;
                if (com.facebook.M.s()) {
                    d();
                }
                if (RQ.e == null) {
                    RQ.e = new RQ(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(RQ.e);
                    return;
                }
                Log.w(RQ.c, "Already enabled!");
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void d() {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.c0()) {
                return;
            }
            C5086aR0 c5086aR0 = C5086aR0.a;
            File[] p = C5086aR0.p();
            ArrayList arrayList = new ArrayList(p.length);
            for (File file : p) {
                SQ0.a aVar = SQ0.a.a;
                arrayList.add(SQ0.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((SQ0) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List x5 = C10662xF.x5(arrayList2, new Comparator() { // from class: o.PQ
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e;
                    e = RQ.a.e((SQ0) obj2, (SQ0) obj3);
                    return e;
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = C5075aO1.W1(0, Math.min(x5.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(x5.get(((AbstractC8515oR0) it).nextInt()));
            }
            C5086aR0 c5086aR02 = C5086aR0.a;
            C5086aR0.s("crash_reports", jSONArray, new S.b() { // from class: o.QQ
                @Override // com.facebook.S.b
                public final void a(com.facebook.Y y) {
                    RQ.a.f(x5, y);
                }
            });
        }

        public a() {
        }
    }

    public /* synthetic */ RQ(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C9516sY c9516sY) {
        this(uncaughtExceptionHandler);
    }

    @InterfaceC9511sW0
    public static final synchronized void d() {
        synchronized (RQ.class) {
            b.c();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable th) {
        C6562gT0.p(thread, "t");
        C6562gT0.p(th, W12.i);
        C5086aR0 c5086aR0 = C5086aR0.a;
        if (C5086aR0.j(th)) {
            C6349ff0 c6349ff0 = C6349ff0.a;
            C6349ff0.c(th);
            SQ0.a aVar = SQ0.a.a;
            SQ0.a.b(th, SQ0.c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public RQ(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }
}
