package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.qD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8945qD0 {
    public final InterfaceC7225jD0 a;
    public final Handler b;
    public final List<b> c;
    public final ComponentCallbacks2C7772lS1 d;
    public final InterfaceC4931Zn e;
    public boolean f;
    public boolean g;
    public boolean h;
    public C5576cS1<Bitmap> i;
    public a j;
    public boolean k;
    public a l;
    public Bitmap m;
    public InterfaceC5675cs2<Bitmap> n;

    /* renamed from: o  reason: collision with root package name */
    public a f838o;
    public d p;
    public int q;
    public int r;
    public int s;

    /* renamed from: o.qD0$a */
    /* loaded from: classes.dex */
    public static class a extends HT<Bitmap> {
        public final Handler Y0;
        public final int Z0;
        public final long a1;
        public Bitmap b1;

        public a(Handler handler, int i, long j) {
            this.Y0 = handler;
            this.Z0 = i;
            this.a1 = j;
        }

        public Bitmap a() {
            return this.b1;
        }

        @Override // o.InterfaceC2856El2
        /* renamed from: b */
        public void o(Bitmap bitmap, InterfaceC8136mt2<? super Bitmap> interfaceC8136mt2) {
            this.b1 = bitmap;
            this.Y0.sendMessageAtTime(this.Y0.obtainMessage(1, this), this.a1);
        }

        @Override // o.InterfaceC2856El2
        public void k(Drawable drawable) {
            this.b1 = null;
        }
    }

    /* renamed from: o.qD0$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* renamed from: o.qD0$c */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public static final int Y = 1;
        public static final int Z = 2;

        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C8945qD0.this.o((a) message.obj);
                return true;
            } else if (i == 2) {
                C8945qD0.this.d.z((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: o.qD0$d */
    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public C8945qD0(com.bumptech.glide.a aVar, InterfaceC7225jD0 interfaceC7225jD0, int i, int i2, InterfaceC5675cs2<Bitmap> interfaceC5675cs2, Bitmap bitmap) {
        this(aVar.h(), com.bumptech.glide.a.F(aVar.j()), interfaceC7225jD0, null, k(com.bumptech.glide.a.F(aVar.j()), i, i2), interfaceC5675cs2, bitmap);
    }

    public static InterfaceC6575gX0 g() {
        return new C7874lt1(Double.valueOf(Math.random()));
    }

    public static C5576cS1<Bitmap> k(ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1, int i, int i2) {
        return componentCallbacks2C7772lS1.u().e(C8520oS1.i1(AbstractC4994a40.b).b1(true).P0(true).z0(i, i2));
    }

    public void a() {
        this.c.clear();
        p();
        u();
        a aVar = this.j;
        if (aVar != null) {
            this.d.z(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.z(aVar2);
            this.l = null;
        }
        a aVar3 = this.f838o;
        if (aVar3 != null) {
            this.d.z(aVar3);
            this.f838o = null;
        }
        this.a.clear();
        this.k = true;
    }

    public ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.a();
        }
        return this.m;
    }

    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.Z0;
        }
        return -1;
    }

    public Bitmap e() {
        return this.m;
    }

    public int f() {
        return this.a.d();
    }

    public InterfaceC5675cs2<Bitmap> h() {
        return this.n;
    }

    public int i() {
        return this.s;
    }

    public int j() {
        return this.a.g();
    }

    public int l() {
        return this.a.q() + this.q;
    }

    public int m() {
        return this.r;
    }

    public final void n() {
        boolean z;
        if (this.f && !this.g) {
            if (this.h) {
                if (this.f838o == null) {
                    z = true;
                } else {
                    z = false;
                }
                C10175vF1.b(z, "Pending target must be null when starting from the first frame");
                this.a.l();
                this.h = false;
            }
            a aVar = this.f838o;
            if (aVar != null) {
                this.f838o = null;
                o(aVar);
                return;
            }
            this.g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.a.j();
            this.a.c();
            this.l = new a(this.b, this.a.n(), uptimeMillis);
            this.i.e(C8520oS1.A1(g())).n(this.a).z1(this.l);
        }
    }

    public void o(a aVar) {
        d dVar = this.p;
        if (dVar != null) {
            dVar.a();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            if (this.h) {
                this.b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.f838o = aVar;
            }
        } else {
            if (aVar.a() != null) {
                p();
                a aVar2 = this.j;
                this.j = aVar;
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            n();
        }
    }

    public final void p() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.d(bitmap);
            this.m = null;
        }
    }

    public void q(InterfaceC5675cs2<Bitmap> interfaceC5675cs2, Bitmap bitmap) {
        this.n = (InterfaceC5675cs2) C10175vF1.e(interfaceC5675cs2);
        this.m = (Bitmap) C10175vF1.e(bitmap);
        this.i = this.i.e(new C8520oS1().W0(interfaceC5675cs2));
        this.q = SD2.i(bitmap);
        this.r = bitmap.getWidth();
        this.s = bitmap.getHeight();
    }

    public void r() {
        C10175vF1.b(!this.f, "Can't restart a running animation");
        this.h = true;
        a aVar = this.f838o;
        if (aVar != null) {
            this.d.z(aVar);
            this.f838o = null;
        }
    }

    public void s(d dVar) {
        this.p = dVar;
    }

    public final void t() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        n();
    }

    public final void u() {
        this.f = false;
    }

    public void v(b bVar) {
        if (!this.k) {
            if (!this.c.contains(bVar)) {
                boolean isEmpty = this.c.isEmpty();
                this.c.add(bVar);
                if (isEmpty) {
                    t();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    public void w(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            u();
        }
    }

    public C8945qD0(InterfaceC4931Zn interfaceC4931Zn, ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1, InterfaceC7225jD0 interfaceC7225jD0, Handler handler, C5576cS1<Bitmap> c5576cS1, InterfaceC5675cs2<Bitmap> interfaceC5675cs2, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = componentCallbacks2C7772lS1;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = interfaceC4931Zn;
        this.b = handler;
        this.i = c5576cS1;
        this.a = interfaceC7225jD0;
        q(interfaceC5675cs2, bitmap);
    }
}
