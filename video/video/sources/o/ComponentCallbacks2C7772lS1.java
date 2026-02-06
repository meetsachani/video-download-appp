package o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC6027eK;

/* renamed from: o.lS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacks2C7772lS1 implements ComponentCallbacks2, IZ0, InterfaceC10050uk1<C5576cS1<Drawable>> {
    public static final C8520oS1 h1 = C8520oS1.h1(Bitmap.class).o0();
    public static final C8520oS1 i1 = C8520oS1.h1(C7468kD0.class).o0();
    public static final C8520oS1 j1 = C8520oS1.i1(AbstractC4994a40.c).D0(EnumC10672xH1.LOW).P0(true);
    public final com.bumptech.glide.a X;
    public final Context Y;
    public final C9498sS1 Y0;
    public final CZ0 Z;
    public final InterfaceC8276nS1 Z0;
    public final C3357Jl2 a1;
    public final Runnable b1;
    public final InterfaceC6027eK c1;
    public final CopyOnWriteArrayList<InterfaceC7529kS1<Object>> d1;
    public C8520oS1 e1;
    public boolean f1;
    public boolean g1;

    /* renamed from: o.lS1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1 = ComponentCallbacks2C7772lS1.this;
            componentCallbacks2C7772lS1.Z.a(componentCallbacks2C7772lS1);
        }
    }

    /* renamed from: o.lS1$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC6027eK.a {
        public final C9498sS1 a;

        public c(C9498sS1 c9498sS1) {
            this.a = c9498sS1;
        }

        @Override // o.InterfaceC6027eK.a
        public void a(boolean z) {
            if (z) {
                synchronized (ComponentCallbacks2C7772lS1.this) {
                    this.a.g();
                }
            }
        }
    }

    public ComponentCallbacks2C7772lS1(com.bumptech.glide.a aVar, CZ0 cz0, InterfaceC8276nS1 interfaceC8276nS1, Context context) {
        this(aVar, cz0, interfaceC8276nS1, new C9498sS1(), aVar.i(), context);
    }

    public synchronized ComponentCallbacks2C7772lS1 A() {
        this.g1 = true;
        return this;
    }

    public final synchronized void B() {
        try {
            for (InterfaceC2856El2<?> interfaceC2856El2 : this.a1.b()) {
                z(interfaceC2856El2);
            }
            this.a1.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5576cS1<File> C(Object obj) {
        return D().n(obj);
    }

    public C5576cS1<File> D() {
        return t(File.class).e(j1);
    }

    public List<InterfaceC7529kS1<Object>> E() {
        return this.d1;
    }

    public synchronized C8520oS1 F() {
        return this.e1;
    }

    public <T> AbstractC10819xt2<?, T> G(Class<T> cls) {
        return this.X.k().e(cls);
    }

    public synchronized boolean H() {
        return this.Y0.d();
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: I */
    public C5576cS1<Drawable> l(Bitmap bitmap) {
        return v().l(bitmap);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: J */
    public C5576cS1<Drawable> g(Drawable drawable) {
        return v().g(drawable);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: K */
    public C5576cS1<Drawable> c(Uri uri) {
        return v().c(uri);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: L */
    public C5576cS1<Drawable> f(File file) {
        return v().f(file);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: M */
    public C5576cS1<Drawable> p(Integer num) {
        return v().p(num);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: N */
    public C5576cS1<Drawable> n(Object obj) {
        return v().n(obj);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: O */
    public C5576cS1<Drawable> r(String str) {
        return v().r(str);
    }

    @Override // o.InterfaceC10050uk1
    @Deprecated
    /* renamed from: P */
    public C5576cS1<Drawable> b(URL url) {
        return v().b(url);
    }

    @Override // o.InterfaceC10050uk1
    /* renamed from: Q */
    public C5576cS1<Drawable> d(byte[] bArr) {
        return v().d(bArr);
    }

    public synchronized void R() {
        this.Y0.e();
    }

    public synchronized void S() {
        R();
        for (ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1 : this.Z0.a()) {
            componentCallbacks2C7772lS1.R();
        }
    }

    public synchronized void T() {
        this.Y0.f();
    }

    public synchronized void U() {
        T();
        for (ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1 : this.Z0.a()) {
            componentCallbacks2C7772lS1.T();
        }
    }

    public synchronized void V() {
        this.Y0.h();
    }

    public synchronized void W() {
        SD2.b();
        V();
        for (ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1 : this.Z0.a()) {
            componentCallbacks2C7772lS1.V();
        }
    }

    public synchronized ComponentCallbacks2C7772lS1 X(C8520oS1 c8520oS1) {
        Z(c8520oS1);
        return this;
    }

    public void Y(boolean z) {
        this.f1 = z;
    }

    public synchronized void Z(C8520oS1 c8520oS1) {
        this.e1 = c8520oS1.clone().h();
    }

    public ComponentCallbacks2C7772lS1 a(InterfaceC7529kS1<Object> interfaceC7529kS1) {
        this.d1.add(interfaceC7529kS1);
        return this;
    }

    public synchronized void a0(InterfaceC2856El2<?> interfaceC2856El2, InterfaceC5334bS1 interfaceC5334bS1) {
        this.a1.c(interfaceC2856El2);
        this.Y0.i(interfaceC5334bS1);
    }

    public synchronized boolean b0(InterfaceC2856El2<?> interfaceC2856El2) {
        InterfaceC5334bS1 j = interfaceC2856El2.j();
        if (j == null) {
            return true;
        }
        if (this.Y0.b(j)) {
            this.a1.d(interfaceC2856El2);
            interfaceC2856El2.q(null);
            return true;
        }
        return false;
    }

    public final void c0(InterfaceC2856El2<?> interfaceC2856El2) {
        boolean b0 = b0(interfaceC2856El2);
        InterfaceC5334bS1 j = interfaceC2856El2.j();
        if (!b0 && !this.X.x(interfaceC2856El2) && j != null) {
            interfaceC2856El2.q(null);
            j.clear();
        }
    }

    public final synchronized void d0(C8520oS1 c8520oS1) {
        this.e1 = this.e1.e(c8520oS1);
    }

    @Override // o.IZ0
    public synchronized void onDestroy() {
        this.a1.onDestroy();
        B();
        this.Y0.c();
        this.Z.b(this);
        this.Z.b(this.c1);
        SD2.A(this.b1);
        this.X.C(this);
    }

    @Override // o.IZ0
    public synchronized void onStart() {
        V();
        this.a1.onStart();
    }

    @Override // o.IZ0
    public synchronized void onStop() {
        try {
            this.a1.onStop();
            if (this.g1) {
                B();
            } else {
                T();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f1) {
            S();
        }
    }

    public synchronized ComponentCallbacks2C7772lS1 s(C8520oS1 c8520oS1) {
        d0(c8520oS1);
        return this;
    }

    public <ResourceType> C5576cS1<ResourceType> t(Class<ResourceType> cls) {
        return new C5576cS1<>(this.X, this, cls, this.Y);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.Y0 + ", treeNode=" + this.Z0 + "}";
    }

    public C5576cS1<Bitmap> u() {
        return t(Bitmap.class).e(h1);
    }

    public C5576cS1<Drawable> v() {
        return t(Drawable.class);
    }

    public C5576cS1<File> w() {
        return t(File.class).e(C8520oS1.C1(true));
    }

    public C5576cS1<C7468kD0> x() {
        return t(C7468kD0.class).e(i1);
    }

    public void y(View view) {
        z(new b(view));
    }

    public void z(InterfaceC2856El2<?> interfaceC2856El2) {
        if (interfaceC2856El2 == null) {
            return;
        }
        c0(interfaceC2856El2);
    }

    public ComponentCallbacks2C7772lS1(com.bumptech.glide.a aVar, CZ0 cz0, InterfaceC8276nS1 interfaceC8276nS1, C9498sS1 c9498sS1, InterfaceC6270fK interfaceC6270fK, Context context) {
        this.a1 = new C3357Jl2();
        a aVar2 = new a();
        this.b1 = aVar2;
        this.X = aVar;
        this.Z = cz0;
        this.Z0 = interfaceC8276nS1;
        this.Y0 = c9498sS1;
        this.Y = context;
        InterfaceC6027eK a2 = interfaceC6270fK.a(context.getApplicationContext(), new c(c9498sS1));
        this.c1 = a2;
        aVar.w(this);
        if (SD2.u()) {
            SD2.z(aVar2);
        } else {
            cz0.a(this);
        }
        cz0.a(a2);
        this.d1 = new CopyOnWriteArrayList<>(aVar.k().c());
        Z(aVar.k().d());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* renamed from: o.lS1$b */
    /* loaded from: classes.dex */
    public static class b extends OT<View, Object> {
        public b(View view) {
            super(view);
        }

        @Override // o.OT
        public void g(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void m(Drawable drawable) {
        }

        @Override // o.InterfaceC2856El2
        public void o(Object obj, InterfaceC8136mt2<? super Object> interfaceC8136mt2) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
