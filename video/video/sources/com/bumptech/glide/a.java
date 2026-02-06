package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.manager.b;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC10819xt2;
import o.AbstractC7322jd;
import o.ActivityC4864Yy0;
import o.B71;
import o.C10138v60;
import o.C10175vF1;
import o.C10938yN0;
import o.C4490Vc0;
import o.C5656co;
import o.C5770dG0;
import o.C8520oS1;
import o.ComponentCallbacks2C7772lS1;
import o.EnumC6362fi1;
import o.InterfaceC2727De;
import o.InterfaceC2856El2;
import o.InterfaceC4931Zn;
import o.InterfaceC5877di1;
import o.InterfaceC6270fK;
import o.InterfaceC7529kS1;
import o.JQ1;
import o.SD2;
import o.VV;
import o.WD0;
import o.WE1;

/* loaded from: classes.dex */
public class a implements ComponentCallbacks2 {
    public static final String g1 = "image_manager_disk_cache";
    public static final String h1 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";
    public static final String i1 = "Glide";
    public static volatile a j1;
    public static volatile boolean k1;
    public final C4490Vc0 X;
    public final InterfaceC4931Zn Y;
    public final c Y0;
    public final InterfaceC5877di1 Z;
    public final InterfaceC2727De Z0;
    public final com.bumptech.glide.manager.b a1;
    public final InterfaceC6270fK b1;
    public final InterfaceC0060a d1;
    public C5656co f1;
    public final List<ComponentCallbacks2C7772lS1> c1 = new ArrayList();
    public EnumC6362fi1 e1 = EnumC6362fi1.NORMAL;

    /* renamed from: com.bumptech.glide.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060a {
        C8520oS1 build();
    }

    public a(Context context, C4490Vc0 c4490Vc0, InterfaceC5877di1 interfaceC5877di1, InterfaceC4931Zn interfaceC4931Zn, InterfaceC2727De interfaceC2727De, com.bumptech.glide.manager.b bVar, InterfaceC6270fK interfaceC6270fK, int i, InterfaceC0060a interfaceC0060a, Map<Class<?>, AbstractC10819xt2<?, ?>> map, List<InterfaceC7529kS1<Object>> list, List<WD0> list2, AbstractC7322jd abstractC7322jd, d dVar) {
        this.X = c4490Vc0;
        this.Y = interfaceC4931Zn;
        this.Z0 = interfaceC2727De;
        this.Z = interfaceC5877di1;
        this.a1 = bVar;
        this.b1 = interfaceC6270fK;
        this.d1 = interfaceC0060a;
        this.Y0 = new c(context, interfaceC2727De, e.d(this, list2, abstractC7322jd), new C10938yN0(), interfaceC0060a, map, list, c4490Vc0, dVar, i);
    }

    public static void A(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @Deprecated
    public static ComponentCallbacks2C7772lS1 D(Activity activity) {
        return F(activity.getApplicationContext());
    }

    @Deprecated
    public static ComponentCallbacks2C7772lS1 E(Fragment fragment) {
        Activity activity = fragment.getActivity();
        C10175vF1.f(activity, h1);
        return F(activity.getApplicationContext());
    }

    public static ComponentCallbacks2C7772lS1 F(Context context) {
        return p(context).h(context);
    }

    public static ComponentCallbacks2C7772lS1 G(View view) {
        return p(view.getContext()).i(view);
    }

    public static ComponentCallbacks2C7772lS1 H(androidx.fragment.app.Fragment fragment) {
        return p(fragment.v()).j(fragment);
    }

    public static ComponentCallbacks2C7772lS1 I(ActivityC4864Yy0 activityC4864Yy0) {
        return p(activityC4864Yy0).k(activityC4864Yy0);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!k1) {
            k1 = true;
            try {
                s(context, generatedAppGlideModule);
                return;
            } finally {
                k1 = false;
            }
        }
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
    }

    public static void d() {
        C5770dG0.c().i();
    }

    public static a e(Context context) {
        if (j1 == null) {
            GeneratedAppGlideModule f = f(context.getApplicationContext());
            synchronized (a.class) {
                try {
                    if (j1 == null) {
                        a(context, f);
                    }
                } finally {
                }
            }
        }
        return j1;
    }

    public static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            A(e);
            return null;
        } catch (InstantiationException e2) {
            A(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            A(e3);
            return null;
        } catch (InvocationTargetException e4) {
            A(e4);
            return null;
        }
    }

    public static File l(Context context) {
        return m(context, "image_manager_disk_cache");
    }

    public static File m(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (!file.isDirectory() && !file.mkdirs()) {
                return null;
            }
            return file;
        }
        if (Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    public static com.bumptech.glide.manager.b p(Context context) {
        C10175vF1.f(context, h1);
        return e(context).o();
    }

    public static void q(Context context, b bVar) {
        GeneratedAppGlideModule f = f(context);
        synchronized (a.class) {
            try {
                if (j1 != null) {
                    z();
                }
                t(context, bVar, f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static synchronized void r(a aVar) {
        synchronized (a.class) {
            try {
                if (j1 != null) {
                    z();
                }
                j1 = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void s(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new b(), generatedAppGlideModule);
    }

    public static void t(Context context, b bVar, GeneratedAppGlideModule generatedAppGlideModule) {
        b.InterfaceC0066b interfaceC0066b;
        Context applicationContext = context.getApplicationContext();
        List<WD0> list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            list = new B71(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.d();
            Iterator<WD0> it = list.iterator();
            while (it.hasNext()) {
                WD0 next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<WD0> it2 = list.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            interfaceC0066b = generatedAppGlideModule.e();
        } else {
            interfaceC0066b = null;
        }
        bVar.x(interfaceC0066b);
        for (WD0 wd0 : list) {
            wd0.a(applicationContext, bVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, bVar);
        }
        a b = bVar.b(applicationContext, list, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(b);
        j1 = b;
    }

    public static synchronized boolean u() {
        boolean z;
        synchronized (a.class) {
            if (j1 != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void z() {
        synchronized (a.class) {
            try {
                if (j1 != null) {
                    j1.j().getApplicationContext().unregisterComponentCallbacks(j1);
                    j1.X.m();
                }
                j1 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(int i) {
        SD2.b();
        synchronized (this.c1) {
            try {
                for (ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1 : this.c1) {
                    componentCallbacks2C7772lS1.onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Z.a(i);
        this.Y.a(i);
        this.Z0.a(i);
    }

    public void C(ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1) {
        synchronized (this.c1) {
            try {
                if (this.c1.contains(componentCallbacks2C7772lS1)) {
                    this.c1.remove(componentCallbacks2C7772lS1);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        SD2.a();
        this.X.e();
    }

    public void c() {
        SD2.b();
        this.Z.b();
        this.Y.b();
        this.Z0.b();
    }

    public InterfaceC2727De g() {
        return this.Z0;
    }

    public InterfaceC4931Zn h() {
        return this.Y;
    }

    public InterfaceC6270fK i() {
        return this.b1;
    }

    public Context j() {
        return this.Y0.getBaseContext();
    }

    public c k() {
        return this.Y0;
    }

    public JQ1 n() {
        return this.Y0.i();
    }

    public com.bumptech.glide.manager.b o() {
        return this.a1;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        B(i);
    }

    public synchronized void v(WE1.a... aVarArr) {
        try {
            if (this.f1 == null) {
                this.f1 = new C5656co(this.Z, this.Y, (VV) this.d1.build().L().c(C10138v60.g));
            }
            this.f1.c(aVarArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void w(ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1) {
        synchronized (this.c1) {
            try {
                if (!this.c1.contains(componentCallbacks2C7772lS1)) {
                    this.c1.add(componentCallbacks2C7772lS1);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean x(InterfaceC2856El2<?> interfaceC2856El2) {
        synchronized (this.c1) {
            try {
                for (ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1 : this.c1) {
                    if (componentCallbacks2C7772lS1.b0(interfaceC2856El2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public EnumC6362fi1 y(EnumC6362fi1 enumC6362fi1) {
        SD2.b();
        this.Z.c(enumC6362fi1.g());
        this.Y.c(enumC6362fi1.g());
        EnumC6362fi1 enumC6362fi12 = this.e1;
        this.e1 = enumC6362fi1;
        return enumC6362fi12;
    }
}
