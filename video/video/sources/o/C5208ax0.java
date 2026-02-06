package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C5935dx0;

/* renamed from: o.ax0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5208ax0 {
    public static final Y61<String, Typeface> a = new Y61<>(16);
    public static final ExecutorService b = C6559gS1.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    public static final C9654t62<String, ArrayList<InterfaceC10929yL<e>>> d = new C9654t62<>();

    /* renamed from: o.ax0$a */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ C4761Xw0 c;
        public final /* synthetic */ int d;

        public a(String str, Context context, C4761Xw0 c4761Xw0, int i) {
            this.a = str;
            this.b = context;
            this.c = c4761Xw0;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            List a;
            String str = this.a;
            Context context = this.b;
            a = C8878pw2.a(new Object[]{this.c});
            return C5208ax0.c(str, context, a, this.d);
        }
    }

    /* renamed from: o.ax0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC10929yL<e> {
        public final /* synthetic */ C3778Nt X;

        public b(C3778Nt c3778Nt) {
            this.X = c3778Nt;
        }

        @Override // o.InterfaceC10929yL
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.X.b(eVar);
        }
    }

    /* renamed from: o.ax0$c */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;

        public c(String str, Context context, List list, int i) {
            this.a = str;
            this.b = context;
            this.c = list;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return C5208ax0.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* renamed from: o.ax0$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC10929yL<e> {
        public final /* synthetic */ String X;

        public d(String str) {
            this.X = str;
        }

        @Override // o.InterfaceC10929yL
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (C5208ax0.c) {
                try {
                    C9654t62<String, ArrayList<InterfaceC10929yL<e>>> c9654t62 = C5208ax0.d;
                    ArrayList<InterfaceC10929yL<e>> arrayList = c9654t62.get(this.X);
                    if (arrayList == null) {
                        return;
                    }
                    c9654t62.remove(this.X);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(List<C4761Xw0> list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).d());
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static int b(C5935dx0.b bVar) {
        int i = 1;
        if (bVar.e() != 0) {
            if (bVar.e() != 1) {
                return -3;
            }
            return -2;
        }
        C5935dx0.c[] c2 = bVar.c();
        if (c2 != null && c2.length != 0) {
            i = 0;
            for (C5935dx0.c cVar : c2) {
                int b2 = cVar.b();
                if (b2 != 0) {
                    if (b2 < 0) {
                        return -3;
                    }
                    return b2;
                }
            }
        }
        return i;
    }

    public static e c(String str, Context context, List<C4761Xw0> list, int i) {
        Typeface d2;
        C6399fr2.c("getFontSync");
        try {
            Y61<String, Typeface> y61 = a;
            Typeface f = y61.f(str);
            if (f != null) {
                return new e(f);
            }
            C5935dx0.b f2 = C4664Ww0.f(context, list, null);
            int b2 = b(f2);
            if (b2 != 0) {
                return new e(b2);
            }
            if (f2.f() && Build.VERSION.SDK_INT >= 29) {
                d2 = C9128qw2.e(context, null, f2.d(), i);
            } else {
                d2 = C9128qw2.d(context, null, f2.c(), i);
            }
            if (d2 != null) {
                y61.j(str, d2);
                return new e(d2);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            C6399fr2.f();
        }
    }

    public static Typeface d(Context context, List<C4761Xw0> list, int i, Executor executor, C3778Nt c3778Nt) {
        String a2 = a(list, i);
        Typeface f = a.f(a2);
        if (f != null) {
            c3778Nt.b(new e(f));
            return f;
        }
        b bVar = new b(c3778Nt);
        synchronized (c) {
            try {
                C9654t62<String, ArrayList<InterfaceC10929yL<e>>> c9654t62 = d;
                ArrayList<InterfaceC10929yL<e>> arrayList = c9654t62.get(a2);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC10929yL<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                c9654t62.put(a2, arrayList2);
                c cVar = new c(a2, context, list, i);
                if (executor == null) {
                    executor = b;
                }
                C6559gS1.c(executor, cVar, new d(a2));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, C4761Xw0 c4761Xw0, C3778Nt c3778Nt, int i, int i2) {
        List a2;
        List a3;
        a2 = C8878pw2.a(new Object[]{c4761Xw0});
        String a4 = a(a2, i);
        Typeface f = a.f(a4);
        if (f != null) {
            c3778Nt.b(new e(f));
            return f;
        } else if (i2 == -1) {
            a3 = C8878pw2.a(new Object[]{c4761Xw0});
            e c2 = c(a4, context, a3, i);
            c3778Nt.b(c2);
            return c2.a;
        } else {
            try {
                e eVar = (e) C6559gS1.d(b, new a(a4, context, c4761Xw0, i), i2);
                c3778Nt.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                c3778Nt.b(new e(-3));
                return null;
            }
        }
    }

    public static void f() {
        a.d();
    }

    /* renamed from: o.ax0$e */
    /* loaded from: classes.dex */
    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        public boolean a() {
            if (this.b == 0) {
                return true;
            }
            return false;
        }

        public e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
