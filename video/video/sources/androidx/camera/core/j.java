package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.AbstractC3393Jv;
import o.C10907yF1;
import o.C3881Ov;
import o.C5013a9;
import o.C7433k41;
import o.F22;
import o.InterfaceC3784Nv;
import o.InterfaceC8499oN0;
import o.YM0;

/* loaded from: classes.dex */
public class j implements InterfaceC8499oN0, b.a {
    public static final String n = "MetadataImageReader";
    public final Object a;
    public AbstractC3393Jv b;
    public int c;
    public InterfaceC8499oN0.a d;
    public boolean e;
    public final InterfaceC8499oN0 f;
    public InterfaceC8499oN0.a g;
    public Executor h;
    public final LongSparseArray<YM0> i;
    public final LongSparseArray<g> j;
    public int k;
    public final List<g> l;
    public final List<g> m;

    /* loaded from: classes.dex */
    public class a extends AbstractC3393Jv {
        public a() {
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            super.b(interfaceC3784Nv);
            j.this.q(interfaceC3784Nv);
        }
    }

    public j(int i, int i2, int i3, int i4) {
        this(j(i, i2, i3, i4));
    }

    public static /* synthetic */ void h(j jVar, InterfaceC8499oN0.a aVar) {
        jVar.getClass();
        aVar.a(jVar);
    }

    public static /* synthetic */ void i(j jVar, InterfaceC8499oN0 interfaceC8499oN0) {
        synchronized (jVar.a) {
            jVar.c++;
        }
        jVar.n(interfaceC8499oN0);
    }

    public static InterfaceC8499oN0 j(int i, int i2, int i3, int i4) {
        return new C5013a9(ImageReader.newInstance(i, i2, i3, i4));
    }

    @Override // o.InterfaceC8499oN0
    public g a() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k < this.l.size()) {
                    ArrayList<g> arrayList = new ArrayList();
                    for (int i = 0; i < this.l.size() - 1; i++) {
                        if (!this.m.contains(this.l.get(i))) {
                            arrayList.add(this.l.get(i));
                        }
                    }
                    for (g gVar : arrayList) {
                        gVar.close();
                    }
                    int size = this.l.size();
                    List<g> list = this.l;
                    this.k = size;
                    g gVar2 = list.get(size - 1);
                    this.m.add(gVar2);
                    return gVar2;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.b.a
    public void b(g gVar) {
        synchronized (this.a) {
            k(gVar);
        }
    }

    @Override // o.InterfaceC8499oN0
    public int c() {
        int c;
        synchronized (this.a) {
            c = this.f.c();
        }
        return c;
    }

    @Override // o.InterfaceC8499oN0
    public void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                for (g gVar : new ArrayList(this.l)) {
                    gVar.close();
                }
                this.l.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC8499oN0
    public void d() {
        synchronized (this.a) {
            this.f.d();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    @Override // o.InterfaceC8499oN0
    public int e() {
        int e;
        synchronized (this.a) {
            e = this.f.e();
        }
        return e;
    }

    @Override // o.InterfaceC8499oN0
    public void f(InterfaceC8499oN0.a aVar, Executor executor) {
        synchronized (this.a) {
            this.g = (InterfaceC8499oN0.a) C10907yF1.l(aVar);
            this.h = (Executor) C10907yF1.l(executor);
            this.f.f(this.d, executor);
        }
    }

    @Override // o.InterfaceC8499oN0
    public g g() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k < this.l.size()) {
                    List<g> list = this.l;
                    int i = this.k;
                    this.k = i + 1;
                    g gVar = list.get(i);
                    this.m.add(gVar);
                    return gVar;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC8499oN0
    public int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.f.getHeight();
        }
        return height;
    }

    @Override // o.InterfaceC8499oN0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // o.InterfaceC8499oN0
    public int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.f.getWidth();
        }
        return width;
    }

    public final void k(g gVar) {
        synchronized (this.a) {
            try {
                int indexOf = this.l.indexOf(gVar);
                if (indexOf >= 0) {
                    this.l.remove(indexOf);
                    int i = this.k;
                    if (indexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(gVar);
                if (this.c > 0) {
                    n(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(F22 f22) {
        final InterfaceC8499oN0.a aVar;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.l.size() < e()) {
                    f22.a(this);
                    this.l.add(f22);
                    aVar = this.g;
                    executor = this.h;
                } else {
                    C7433k41.a("TAG", "Maximum image number reached.");
                    f22.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: o.Zi1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.j.h(androidx.camera.core.j.this, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public AbstractC3393Jv m() {
        return this.b;
    }

    public void n(InterfaceC8499oN0 interfaceC8499oN0) {
        g gVar;
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.j.size() + this.l.size();
                if (size >= interfaceC8499oN0.e()) {
                    C7433k41.a(n, "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        gVar = interfaceC8499oN0.g();
                        if (gVar != null) {
                            this.c--;
                            size++;
                            this.j.put(gVar.I4().c(), gVar);
                            o();
                        }
                    } catch (IllegalStateException e) {
                        C7433k41.b(n, "Failed to acquire next image.", e);
                        gVar = null;
                    }
                    if (gVar == null || this.c <= 0) {
                        break;
                    }
                } while (size < interfaceC8499oN0.e());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    YM0 valueAt = this.i.valueAt(size);
                    long c = valueAt.c();
                    g gVar = this.j.get(c);
                    if (gVar != null) {
                        this.j.remove(c);
                        this.i.removeAt(size);
                        l(new F22(gVar, valueAt));
                    }
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        synchronized (this.a) {
            try {
                if (this.j.size() != 0 && this.i.size() != 0) {
                    long keyAt = this.j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.i.keyAt(0);
                    C10907yF1.a(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.j.size() - 1; size >= 0; size--) {
                            if (this.j.keyAt(size) < keyAt2) {
                                this.j.valueAt(size).close();
                                this.j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < keyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void q(InterfaceC3784Nv interfaceC3784Nv) {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                this.i.put(interfaceC3784Nv.c(), new C3881Ov(interfaceC3784Nv));
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public j(InterfaceC8499oN0 interfaceC8499oN0) {
        this.a = new Object();
        this.b = new a();
        this.c = 0;
        this.d = new InterfaceC8499oN0.a() { // from class: o.Yi1
            @Override // o.InterfaceC8499oN0.a
            public final void a(InterfaceC8499oN0 interfaceC8499oN02) {
                androidx.camera.core.j.i(androidx.camera.core.j.this, interfaceC8499oN02);
            }
        };
        this.e = false;
        this.i = new LongSparseArray<>();
        this.j = new LongSparseArray<>();
        this.m = new ArrayList();
        this.f = interfaceC8499oN0;
        this.k = 0;
        this.l = new ArrayList(e());
    }
}
