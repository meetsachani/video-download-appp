package o;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o.C5700cz;

/* renamed from: o.cz */
/* loaded from: classes.dex */
public class C5700cz {
    public final Executor a;
    public final Object b = new Object();
    public final Set<InterfaceC10290vj2> c = new LinkedHashSet();
    public final Set<InterfaceC10290vj2> d = new LinkedHashSet();
    public final Set<InterfaceC10290vj2> e = new LinkedHashSet();
    public final CameraDevice.StateCallback f = new a();

    public C5700cz(Executor executor) {
        this.a = executor;
    }

    public static void b(Set<InterfaceC10290vj2> set) {
        for (InterfaceC10290vj2 interfaceC10290vj2 : set) {
            interfaceC10290vj2.e().w(interfaceC10290vj2);
        }
    }

    public final void a(InterfaceC10290vj2 interfaceC10290vj2) {
        InterfaceC10290vj2 next;
        Iterator<InterfaceC10290vj2> it = g().iterator();
        while (it.hasNext() && (next = it.next()) != interfaceC10290vj2) {
            next.j();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f;
    }

    public List<InterfaceC10290vj2> d() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public List<InterfaceC10290vj2> e() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }

    public List<InterfaceC10290vj2> f() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public List<InterfaceC10290vj2> g() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(f());
        }
        return arrayList;
    }

    public void h(InterfaceC10290vj2 interfaceC10290vj2) {
        synchronized (this.b) {
            this.c.remove(interfaceC10290vj2);
            this.d.remove(interfaceC10290vj2);
        }
    }

    public void i(InterfaceC10290vj2 interfaceC10290vj2) {
        synchronized (this.b) {
            this.d.add(interfaceC10290vj2);
        }
    }

    public void j(InterfaceC10290vj2 interfaceC10290vj2) {
        a(interfaceC10290vj2);
        synchronized (this.b) {
            this.e.remove(interfaceC10290vj2);
        }
    }

    public void k(InterfaceC10290vj2 interfaceC10290vj2) {
        synchronized (this.b) {
            this.c.add(interfaceC10290vj2);
            this.e.remove(interfaceC10290vj2);
        }
        a(interfaceC10290vj2);
    }

    public void l(InterfaceC10290vj2 interfaceC10290vj2) {
        synchronized (this.b) {
            this.e.add(interfaceC10290vj2);
        }
    }

    /* renamed from: o.cz$a */
    /* loaded from: classes.dex */
    public class a extends CameraDevice.StateCallback {
        public a() {
            C5700cz.this = r1;
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet) {
            C5700cz.b(linkedHashSet);
        }

        public final void b() {
            List<InterfaceC10290vj2> g;
            synchronized (C5700cz.this.b) {
                g = C5700cz.this.g();
                C5700cz.this.e.clear();
                C5700cz.this.c.clear();
                C5700cz.this.d.clear();
            }
            for (InterfaceC10290vj2 interfaceC10290vj2 : g) {
                interfaceC10290vj2.j();
            }
        }

        public final void c() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C5700cz.this.b) {
                linkedHashSet.addAll(C5700cz.this.e);
                linkedHashSet.addAll(C5700cz.this.c);
            }
            C5700cz.this.a.execute(new Runnable() { // from class: o.bz
                @Override // java.lang.Runnable
                public final void run() {
                    C5700cz.a.a(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            c();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }
}
