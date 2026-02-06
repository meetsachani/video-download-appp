package o;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import o.AbstractC5608cc;
import o.Q4;
import o.T4;

/* renamed from: o.cc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5608cc {
    public static final boolean X = false;
    public static final String Y = "AppCompatDelegate";
    public static final String Y0 = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    public static final int Z0 = -1;
    @Deprecated
    public static final int a1 = 0;
    @Deprecated
    public static final int b1 = 0;
    public static final int c1 = 1;
    public static final int d1 = 2;
    public static final int e1 = 3;
    public static final int f1 = -100;
    public static final int o1 = 108;
    public static final int p1 = 109;
    public static final int q1 = 10;
    public static d Z = new d(new e());
    public static int g1 = -100;
    public static C9637t21 h1 = null;
    public static C9637t21 i1 = null;
    public static Boolean j1 = null;
    public static boolean k1 = false;
    public static final C3228Ie<WeakReference<AbstractC5608cc>> l1 = new C3228Ie<>();
    public static final Object m1 = new Object();
    public static final Object n1 = new Object();

    /* renamed from: o.cc$a */
    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: o.cc$b */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cc$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* renamed from: o.cc$d */
    /* loaded from: classes.dex */
    public static class d implements Executor {
        public final Object X = new Object();
        public final Queue<Runnable> Y = new ArrayDeque();
        public Runnable Y0;
        public final Executor Z;

        public d(Executor executor) {
            this.Z = executor;
        }

        public static /* synthetic */ void b(d dVar, Runnable runnable) {
            dVar.getClass();
            try {
                runnable.run();
            } finally {
                dVar.c();
            }
        }

        public void c() {
            synchronized (this.X) {
                try {
                    Runnable poll = this.Y.poll();
                    this.Y0 = poll;
                    if (poll != null) {
                        this.Z.execute(poll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.X) {
                try {
                    this.Y.add(new Runnable() { // from class: o.dc
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5608cc.d.b(AbstractC5608cc.d.this, runnable);
                        }
                    });
                    if (this.Y0 == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: o.cc$e */
    /* loaded from: classes.dex */
    public static class e implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static C9637t21 A() {
        return h1;
    }

    public static C9637t21 B() {
        return i1;
    }

    public static boolean G(Context context) {
        if (j1 == null) {
            try {
                Bundle bundle = ServiceC8799pd.a(context).metaData;
                if (bundle != null) {
                    j1 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d(Y, "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                j1 = Boolean.FALSE;
            }
        }
        return j1.booleanValue();
    }

    public static boolean H() {
        return NE2.b();
    }

    public static void R(AbstractC5608cc abstractC5608cc) {
        synchronized (m1) {
            S(abstractC5608cc);
        }
    }

    public static void S(AbstractC5608cc abstractC5608cc) {
        synchronized (m1) {
            try {
                Iterator<WeakReference<AbstractC5608cc>> it = l1.iterator();
                while (it.hasNext()) {
                    AbstractC5608cc abstractC5608cc2 = it.next().get();
                    if (abstractC5608cc2 == abstractC5608cc || abstractC5608cc2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void U() {
        h1 = null;
        i1 = null;
    }

    public static void V(C9637t21 c9637t21) {
        Objects.requireNonNull(c9637t21);
        if (Build.VERSION.SDK_INT >= 33) {
            Object y = y();
            if (y != null) {
                b.b(y, a.a(c9637t21.m()));
            }
        } else if (!c9637t21.equals(h1)) {
            synchronized (m1) {
                h1 = c9637t21;
                j();
            }
        }
    }

    public static void W(boolean z) {
        NE2.c(z);
    }

    public static void a0(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d(Y, "setDefaultNightMode() called with an unknown mode");
        } else if (g1 != i) {
            g1 = i;
            i();
        }
    }

    public static /* synthetic */ void c(Context context) {
        j0(context);
        k1 = true;
    }

    public static void c0(boolean z) {
        j1 = Boolean.valueOf(z);
    }

    public static void e(AbstractC5608cc abstractC5608cc) {
        synchronized (m1) {
            S(abstractC5608cc);
            l1.add(new WeakReference<>(abstractC5608cc));
        }
    }

    public static void i() {
        synchronized (m1) {
            try {
                Iterator<WeakReference<AbstractC5608cc>> it = l1.iterator();
                while (it.hasNext()) {
                    AbstractC5608cc abstractC5608cc = it.next().get();
                    if (abstractC5608cc != null) {
                        abstractC5608cc.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void j() {
        Iterator<WeakReference<AbstractC5608cc>> it = l1.iterator();
        while (it.hasNext()) {
            AbstractC5608cc abstractC5608cc = it.next().get();
            if (abstractC5608cc != null) {
                abstractC5608cc.g();
            }
        }
    }

    public static void j0(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, Y0);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (t().j()) {
                    String b2 = C9042qd.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b2));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void k0(final Context context) {
        if (G(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!k1) {
                    Z.execute(new Runnable() { // from class: o.ac
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5608cc.c(context);
                        }
                    });
                    return;
                }
                return;
            }
            synchronized (n1) {
                try {
                    C9637t21 c9637t21 = h1;
                    if (c9637t21 == null) {
                        if (i1 == null) {
                            i1 = C9637t21.c(C9042qd.b(context));
                        }
                        if (i1.j()) {
                            return;
                        }
                        h1 = i1;
                    } else if (!c9637t21.equals(i1)) {
                        C9637t21 c9637t212 = h1;
                        i1 = c9637t212;
                        C9042qd.a(context, c9637t212.m());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static AbstractC5608cc n(Activity activity, InterfaceC4291Tb interfaceC4291Tb) {
        return new LayoutInflater$Factory2C6093ec(activity, interfaceC4291Tb);
    }

    public static AbstractC5608cc o(Dialog dialog, InterfaceC4291Tb interfaceC4291Tb) {
        return new LayoutInflater$Factory2C6093ec(dialog, interfaceC4291Tb);
    }

    public static AbstractC5608cc p(Context context, Activity activity, InterfaceC4291Tb interfaceC4291Tb) {
        return new LayoutInflater$Factory2C6093ec(context, activity, interfaceC4291Tb);
    }

    public static AbstractC5608cc q(Context context, Window window, InterfaceC4291Tb interfaceC4291Tb) {
        return new LayoutInflater$Factory2C6093ec(context, window, interfaceC4291Tb);
    }

    public static C9637t21 t() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object y = y();
            if (y != null) {
                return C9637t21.o(b.a(y));
            }
        } else {
            C9637t21 c9637t21 = h1;
            if (c9637t21 != null) {
                return c9637t21;
            }
        }
        return C9637t21.g();
    }

    public static int v() {
        return g1;
    }

    public static Object y() {
        Context u;
        Iterator<WeakReference<AbstractC5608cc>> it = l1.iterator();
        while (it.hasNext()) {
            AbstractC5608cc abstractC5608cc = it.next().get();
            if (abstractC5608cc != null && (u = abstractC5608cc.u()) != null) {
                return u.getSystemService("locale");
            }
        }
        return null;
    }

    public abstract O4 C();

    public abstract boolean D(int i);

    public abstract void E();

    public abstract void F();

    public abstract boolean I();

    public abstract void J(Configuration configuration);

    public abstract void K(Bundle bundle);

    public abstract void L();

    public abstract void M(Bundle bundle);

    public abstract void N();

    public abstract void O(Bundle bundle);

    public abstract void P();

    public abstract void Q();

    public abstract boolean T(int i);

    public abstract void X(int i);

    public abstract void Y(View view);

    public abstract void Z(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b0(boolean z);

    public abstract void d0(int i);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void f0(Toolbar toolbar);

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void h0(CharSequence charSequence);

    public abstract T4 i0(T4.a aVar);

    public void k(final Context context) {
        Z.execute(new Runnable() { // from class: o.bc
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC5608cc.k0(context);
            }
        });
    }

    public Context m(Context context) {
        l(context);
        return context;
    }

    public abstract View r(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T s(int i);

    public Context u() {
        return null;
    }

    public abstract Q4.b w();

    public int x() {
        return -100;
    }

    public abstract MenuInflater z();

    public void e0(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void g0(int i) {
    }

    @Deprecated
    public void l(Context context) {
    }
}
