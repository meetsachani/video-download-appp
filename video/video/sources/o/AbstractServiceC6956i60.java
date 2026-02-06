package o;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.HashMap;
import java.util.List;
import o.AbstractServiceC6956i60;
import o.Y50;

@Deprecated
/* renamed from: o.i60  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC6956i60 extends Service {
    public static final String f1 = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String g1 = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String h1 = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String i1 = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    public static final String j1 = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String k1 = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String l1 = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String m1 = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final String n1 = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String o1 = "download_request";
    public static final String p1 = "content_id";
    public static final String q1 = "stop_reason";
    public static final String r1 = "requirements";
    public static final String s1 = "foreground";
    public static final int t1 = 0;
    public static final long u1 = 1000;
    public static final String v1 = "DownloadService";
    public static final HashMap<Class<? extends AbstractServiceC6956i60>, b> w1 = new HashMap<>();
    @InterfaceC11300zs1
    public final c X;
    @InterfaceC11300zs1
    public final String Y;
    @InterfaceC3329Je2
    public final int Y0;
    @InterfaceC3329Je2
    public final int Z;
    public b Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;

    /* renamed from: o.i60$b */
    /* loaded from: classes2.dex */
    public static final class b implements Y50.d {
        public final Context a;
        public final Y50 b;
        public final boolean c;
        @InterfaceC11300zs1
        public final InterfaceC6324fY1 d;
        public final Class<? extends AbstractServiceC6956i60> e;
        @InterfaceC11300zs1
        public AbstractServiceC6956i60 f;
        public AS1 g;

        @Override // o.Y50.d
        public void a(Y50 y50, G50 g50, @InterfaceC11300zs1 Exception exc) {
            AbstractServiceC6956i60 abstractServiceC6956i60 = this.f;
            if (abstractServiceC6956i60 != null) {
                abstractServiceC6956i60.z(g50);
            }
            if (o() && AbstractServiceC6956i60.y(g50.b)) {
                I31.n(AbstractServiceC6956i60.v1, "DownloadService wasn't running. Restarting.");
                m();
            }
        }

        @Override // o.Y50.d
        public final void b(Y50 y50) {
            AbstractServiceC6956i60 abstractServiceC6956i60 = this.f;
            if (abstractServiceC6956i60 != null) {
                abstractServiceC6956i60.C();
            }
        }

        @Override // o.Y50.d
        public void c(Y50 y50, boolean z) {
            if (!z && !y50.i() && o()) {
                List<G50> g = y50.g();
                for (int i = 0; i < g.size(); i++) {
                    if (g.get(i).b == 0) {
                        m();
                        return;
                    }
                }
            }
        }

        @Override // o.Y50.d
        public void d(Y50 y50) {
            AbstractServiceC6956i60 abstractServiceC6956i60 = this.f;
            if (abstractServiceC6956i60 != null) {
                abstractServiceC6956i60.B(y50.g());
            }
        }

        @Override // o.Y50.d
        public void e(Y50 y50, G50 g50) {
            AbstractServiceC6956i60 abstractServiceC6956i60 = this.f;
            if (abstractServiceC6956i60 != null) {
                abstractServiceC6956i60.A();
            }
        }

        @Override // o.Y50.d
        public void f(Y50 y50, AS1 as1, int i) {
            p();
        }

        public void j(final AbstractServiceC6956i60 abstractServiceC6956i60) {
            boolean z;
            if (this.f == null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            this.f = abstractServiceC6956i60;
            if (this.b.p()) {
                TD2.E().postAtFrontOfQueue(new Runnable() { // from class: o.j60
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractServiceC6956i60.B(AbstractServiceC6956i60.b.this.b.g());
                    }
                });
            }
        }

        @HS1({"scheduler"})
        public final void k() {
            AS1 as1 = new AS1(0);
            if (n(as1)) {
                this.d.cancel();
                this.g = as1;
            }
        }

        public void l(AbstractServiceC6956i60 abstractServiceC6956i60) {
            boolean z;
            if (this.f == abstractServiceC6956i60) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            this.f = null;
        }

        public final void m() {
            if (this.c) {
                try {
                    TD2.M1(this.a, AbstractServiceC6956i60.t(this.a, this.e, AbstractServiceC6956i60.g1));
                    return;
                } catch (IllegalStateException unused) {
                    I31.n(AbstractServiceC6956i60.v1, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.a.startService(AbstractServiceC6956i60.t(this.a, this.e, AbstractServiceC6956i60.f1));
            } catch (IllegalStateException unused2) {
                I31.n(AbstractServiceC6956i60.v1, "Failed to restart (process is idle)");
            }
        }

        public final boolean n(AS1 as1) {
            return !TD2.g(this.g, as1);
        }

        public final boolean o() {
            AbstractServiceC6956i60 abstractServiceC6956i60 = this.f;
            if (abstractServiceC6956i60 != null && !abstractServiceC6956i60.x()) {
                return false;
            }
            return true;
        }

        public boolean p() {
            boolean q = this.b.q();
            if (this.d == null) {
                return !q;
            }
            if (!q) {
                k();
                return true;
            }
            AS1 m = this.b.m();
            if (!this.d.b(m).equals(m)) {
                k();
                return false;
            } else if (!n(m)) {
                return true;
            } else {
                if (this.d.a(m, this.a.getPackageName(), AbstractServiceC6956i60.g1)) {
                    this.g = m;
                    return true;
                }
                I31.n(AbstractServiceC6956i60.v1, "Failed to schedule restart");
                k();
                return false;
            }
        }

        public b(Context context, Y50 y50, boolean z, @InterfaceC11300zs1 InterfaceC6324fY1 interfaceC6324fY1, Class<? extends AbstractServiceC6956i60> cls) {
            this.a = context;
            this.b = y50;
            this.c = z;
            this.d = interfaceC6324fY1;
            this.e = cls;
            y50.e(this);
            p();
        }
    }

    /* renamed from: o.i60$c */
    /* loaded from: classes2.dex */
    public final class c {
        public final int a;
        public final long b;
        public final Handler c = new Handler(Looper.getMainLooper());
        public boolean d;
        public boolean e;

        public c(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public void b() {
            if (this.e) {
                f();
            }
        }

        public void c() {
            if (!this.e) {
                f();
            }
        }

        public void d() {
            this.d = true;
            f();
        }

        public void e() {
            this.d = false;
            this.c.removeCallbacksAndMessages(null);
        }

        public final void f() {
            Y50 y50 = ((b) C9542sf.g(AbstractServiceC6956i60.this.Z0)).b;
            Notification s = AbstractServiceC6956i60.this.s(y50.g(), y50.l());
            if (!this.e) {
                AbstractServiceC6956i60.this.startForeground(this.a, s);
                this.e = true;
            } else {
                ((NotificationManager) AbstractServiceC6956i60.this.getSystemService(MessagingAnalytics.b)).notify(this.a, s);
            }
            if (this.d) {
                this.c.removeCallbacksAndMessages(null);
                this.c.postDelayed(new Runnable() { // from class: o.k60
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractServiceC6956i60.c.this.f();
                    }
                }, this.b);
            }
        }
    }

    public AbstractServiceC6956i60(int i) {
        this(i, 1000L);
    }

    public static void D(Context context, Class<? extends AbstractServiceC6956i60> cls, C5972e60 c5972e60, int i, boolean z) {
        N(context, i(context, cls, c5972e60, i, z), z);
    }

    public static void E(Context context, Class<? extends AbstractServiceC6956i60> cls, C5972e60 c5972e60, boolean z) {
        N(context, j(context, cls, c5972e60, z), z);
    }

    public static void F(Context context, Class<? extends AbstractServiceC6956i60> cls, boolean z) {
        N(context, k(context, cls, z), z);
    }

    public static void G(Context context, Class<? extends AbstractServiceC6956i60> cls, boolean z) {
        N(context, l(context, cls, z), z);
    }

    public static void H(Context context, Class<? extends AbstractServiceC6956i60> cls, String str, boolean z) {
        N(context, m(context, cls, str, z), z);
    }

    public static void I(Context context, Class<? extends AbstractServiceC6956i60> cls, boolean z) {
        N(context, n(context, cls, z), z);
    }

    public static void J(Context context, Class<? extends AbstractServiceC6956i60> cls, AS1 as1, boolean z) {
        N(context, o(context, cls, as1, z), z);
    }

    public static void K(Context context, Class<? extends AbstractServiceC6956i60> cls, @InterfaceC11300zs1 String str, int i, boolean z) {
        N(context, p(context, cls, str, i, z), z);
    }

    public static void L(Context context, Class<? extends AbstractServiceC6956i60> cls) {
        context.startService(t(context, cls, f1));
    }

    public static void M(Context context, Class<? extends AbstractServiceC6956i60> cls) {
        TD2.M1(context, u(context, cls, f1, true));
    }

    public static void N(Context context, Intent intent, boolean z) {
        if (z) {
            TD2.M1(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent i(Context context, Class<? extends AbstractServiceC6956i60> cls, C5972e60 c5972e60, int i, boolean z) {
        return u(context, cls, h1, z).putExtra(o1, c5972e60).putExtra("stop_reason", i);
    }

    public static Intent j(Context context, Class<? extends AbstractServiceC6956i60> cls, C5972e60 c5972e60, boolean z) {
        return i(context, cls, c5972e60, 0, z);
    }

    public static Intent k(Context context, Class<? extends AbstractServiceC6956i60> cls, boolean z) {
        return u(context, cls, l1, z);
    }

    public static Intent l(Context context, Class<? extends AbstractServiceC6956i60> cls, boolean z) {
        return u(context, cls, j1, z);
    }

    public static Intent m(Context context, Class<? extends AbstractServiceC6956i60> cls, String str, boolean z) {
        return u(context, cls, i1, z).putExtra(p1, str);
    }

    public static Intent n(Context context, Class<? extends AbstractServiceC6956i60> cls, boolean z) {
        return u(context, cls, k1, z);
    }

    public static Intent o(Context context, Class<? extends AbstractServiceC6956i60> cls, AS1 as1, boolean z) {
        return u(context, cls, n1, z).putExtra("requirements", as1);
    }

    public static Intent p(Context context, Class<? extends AbstractServiceC6956i60> cls, @InterfaceC11300zs1 String str, int i, boolean z) {
        return u(context, cls, m1, z).putExtra(p1, str).putExtra("stop_reason", i);
    }

    public static void q() {
        w1.clear();
    }

    public static Intent t(Context context, Class<? extends AbstractServiceC6956i60> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public static Intent u(Context context, Class<? extends AbstractServiceC6956i60> cls, String str, boolean z) {
        return t(context, cls, str).putExtra(s1, z);
    }

    public static boolean y(int i) {
        if (i != 2 && i != 5 && i != 7) {
            return false;
        }
        return true;
    }

    public final void A() {
        c cVar = this.X;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void B(List<G50> list) {
        if (this.X != null) {
            for (int i = 0; i < list.size(); i++) {
                if (y(list.get(i).b)) {
                    this.X.d();
                    return;
                }
            }
        }
    }

    public final void C() {
        c cVar = this.X;
        if (cVar != null) {
            cVar.e();
        }
        if (!((b) C9542sf.g(this.Z0)).p()) {
            return;
        }
        if (TD2.a < 28 && this.c1) {
            stopSelf();
            this.d1 = true;
            return;
        }
        this.d1 |= stopSelfResult(this.a1);
    }

    @Override // android.app.Service
    @InterfaceC11300zs1
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        boolean z;
        InterfaceC6324fY1 interfaceC6324fY1;
        String str = this.Y;
        if (str != null) {
            C4949Zr1.a(this, str, this.Z, this.Y0, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends AbstractServiceC6956i60>, b> hashMap = w1;
        b bVar = (b) hashMap.get(cls);
        if (bVar == null) {
            boolean z2 = false;
            if (this.X != null) {
                z = true;
            } else {
                z = false;
            }
            if (TD2.a < 31) {
                z2 = true;
            }
            if (z && z2) {
                interfaceC6324fY1 = v();
            } else {
                interfaceC6324fY1 = null;
            }
            InterfaceC6324fY1 interfaceC6324fY12 = interfaceC6324fY1;
            Y50 r = r();
            r.C();
            b bVar2 = new b(getApplicationContext(), r, z, interfaceC6324fY12, cls);
            hashMap.put(cls, bVar2);
            bVar = bVar2;
        }
        this.Z0 = bVar;
        bVar.j(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.e1 = true;
        ((b) C9542sf.g(this.Z0)).l(this);
        c cVar = this.X;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@InterfaceC11300zs1 Intent intent, int i, int i2) {
        String str;
        String str2;
        c cVar;
        boolean z;
        this.a1 = i2;
        this.c1 = false;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra(p1);
            boolean z2 = this.b1;
            if (!intent.getBooleanExtra(s1, false) && !g1.equals(str)) {
                z = false;
            } else {
                z = true;
            }
            this.b1 = z2 | z;
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = f1;
        }
        Y50 y50 = ((b) C9542sf.g(this.Z0)).b;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1931239035:
                if (str.equals(h1)) {
                    c2 = 0;
                    break;
                }
                break;
            case -932047176:
                if (str.equals(k1)) {
                    c2 = 1;
                    break;
                }
                break;
            case -871181424:
                if (str.equals(g1)) {
                    c2 = 2;
                    break;
                }
                break;
            case -650547439:
                if (str.equals(j1)) {
                    c2 = 3;
                    break;
                }
                break;
            case -119057172:
                if (str.equals(n1)) {
                    c2 = 4;
                    break;
                }
                break;
            case 191112771:
                if (str.equals(l1)) {
                    c2 = 5;
                    break;
                }
                break;
            case 671523141:
                if (str.equals(m1)) {
                    c2 = 6;
                    break;
                }
                break;
            case 1015676687:
                if (str.equals(f1)) {
                    c2 = 7;
                    break;
                }
                break;
            case 1547520644:
                if (str.equals(i1)) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                C5972e60 c5972e60 = (C5972e60) ((Intent) C9542sf.g(intent)).getParcelableExtra(o1);
                if (c5972e60 == null) {
                    I31.d(v1, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    y50.d(c5972e60, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case 1:
                y50.C();
                break;
            case 2:
            case 7:
                break;
            case 3:
                y50.z();
                break;
            case 4:
                AS1 as1 = (AS1) ((Intent) C9542sf.g(intent)).getParcelableExtra("requirements");
                if (as1 == null) {
                    I31.d(v1, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    y50.G(as1);
                    break;
                }
            case 5:
                y50.x();
                break;
            case 6:
                if (!((Intent) C9542sf.g(intent)).hasExtra("stop_reason")) {
                    I31.d(v1, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    y50.H(str2, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case '\b':
                if (str2 == null) {
                    I31.d(v1, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    y50.A(str2);
                    break;
                }
            default:
                I31.d(v1, "Ignored unrecognized action: " + str);
                break;
        }
        if (TD2.a >= 26 && this.b1 && (cVar = this.X) != null) {
            cVar.c();
        }
        this.d1 = false;
        if (y50.o()) {
            C();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.c1 = true;
    }

    public abstract Y50 r();

    public abstract Notification s(List<G50> list, int i);

    @InterfaceC11300zs1
    public abstract InterfaceC6324fY1 v();

    public final void w() {
        c cVar = this.X;
        if (cVar != null && !this.e1) {
            cVar.b();
        }
    }

    public final boolean x() {
        return this.d1;
    }

    public final void z(G50 g50) {
        if (this.X != null) {
            if (y(g50.b)) {
                this.X.d();
            } else {
                this.X.b();
            }
        }
    }

    public AbstractServiceC6956i60(int i, long j) {
        this(i, j, null, 0, 0);
    }

    public AbstractServiceC6956i60(int i, long j, @InterfaceC11300zs1 String str, @InterfaceC3329Je2 int i2, @InterfaceC3329Je2 int i3) {
        if (i == 0) {
            this.X = null;
            this.Y = null;
            this.Z = 0;
            this.Y0 = 0;
            return;
        }
        this.X = new c(i, j);
        this.Y = str;
        this.Z = i2;
        this.Y0 = i3;
    }
}
