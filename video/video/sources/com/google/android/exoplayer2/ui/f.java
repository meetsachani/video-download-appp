package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.ui.g;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.BR0;
import o.C10323vs;
import o.C3771Nr1;
import o.C3966Pr1;
import o.C4551Vr1;
import o.C4949Zr1;
import o.C9542sf;
import o.HD1;
import o.InterfaceC11300zs1;
import o.K60;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class f {
    public static final String O = "com.google.android.exoplayer.play";
    public static final String P = "com.google.android.exoplayer.pause";
    public static final String Q = "com.google.android.exoplayer.prev";
    public static final String R = "com.google.android.exoplayer.next";
    public static final String S = "com.google.android.exoplayer.ffwd";
    public static final String T = "com.google.android.exoplayer.rewind";
    public static final String U = "com.google.android.exoplayer.stop";
    public static final String V = "INSTANCE_ID";
    public static final String W = "com.google.android.exoplayer.dismiss";
    public static final int X = 0;
    public static final int Y = 1;
    public static int Z;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    @K60
    public int J;
    public int K;
    public int L;
    public boolean M;
    @InterfaceC11300zs1
    public String N;
    public final Context a;
    public final String b;
    public final int c;
    public final e d;
    @InterfaceC11300zs1
    public final g e;
    @InterfaceC11300zs1
    public final d f;
    public final Handler g;
    public final C4551Vr1 h;
    public final IntentFilter i;
    public final HD1.g j;
    public final C0101f k;
    public final Map<String, C3771Nr1.b> l;
    public final Map<String, C3771Nr1.b> m;
    public final PendingIntent n;

    /* renamed from: o  reason: collision with root package name */
    public final int f164o;
    @InterfaceC11300zs1
    public C3771Nr1.n p;
    @InterfaceC11300zs1
    public List<C3771Nr1.b> q;
    @InterfaceC11300zs1
    public HD1 r;
    public boolean s;
    public int t;
    @InterfaceC11300zs1
    public MediaSessionCompat.Token u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes2.dex */
    public final class b {
        public final int a;

        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                f.this.s(bitmap, this.a);
            }
        }

        public b(int i) {
            this.a = i;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(HD1 hd1, String str, Intent intent);

        Map<String, C3771Nr1.b> b(Context context, int i);

        List<String> c(HD1 hd1);
    }

    /* loaded from: classes2.dex */
    public interface e {
        @InterfaceC11300zs1
        CharSequence a(HD1 hd1);

        @InterfaceC11300zs1
        PendingIntent b(HD1 hd1);

        @InterfaceC11300zs1
        Bitmap c(HD1 hd1, b bVar);

        CharSequence d(HD1 hd1);

        @InterfaceC11300zs1
        default CharSequence e(HD1 hd1) {
            return null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0101f extends BroadcastReceiver {
        public C0101f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HD1 hd1 = f.this.r;
            if (hd1 != null && f.this.s && intent.getIntExtra(f.V, f.this.f164o) == f.this.f164o) {
                String action = intent.getAction();
                if (f.O.equals(action)) {
                    TD2.J0(hd1);
                } else if (f.P.equals(action)) {
                    TD2.I0(hd1);
                } else if (f.Q.equals(action)) {
                    if (hd1.T0(7)) {
                        hd1.z0();
                    }
                } else if (f.T.equals(action)) {
                    if (hd1.T0(11)) {
                        hd1.r2();
                    }
                } else if (f.S.equals(action)) {
                    if (hd1.T0(12)) {
                        hd1.p2();
                    }
                } else if (f.R.equals(action)) {
                    if (hd1.T0(9)) {
                        hd1.j1();
                    }
                } else if (f.U.equals(action)) {
                    if (hd1.T0(3)) {
                        hd1.stop();
                    }
                    if (hd1.T0(20)) {
                        hd1.T();
                    }
                } else if (f.W.equals(action)) {
                    f.this.P(true);
                } else if (action != null && f.this.f != null && f.this.m.containsKey(action)) {
                    f.this.f.a(hd1, action, intent);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        default void a(int i, Notification notification, boolean z) {
        }

        default void b(int i, boolean z) {
        }
    }

    /* loaded from: classes2.dex */
    public class h implements HD1.g {
        public h() {
        }

        @Override // o.HD1.g
        public void c0(HD1 hd1, HD1.f fVar) {
            if (fVar.b(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                f.this.r();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface i {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface j {
    }

    public f(Context context, String str, int i2, e eVar, @InterfaceC11300zs1 g gVar, @InterfaceC11300zs1 d dVar, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, @InterfaceC11300zs1 String str2) {
        Map<String, C3771Nr1.b> map;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.c = i2;
        this.d = eVar;
        this.e = gVar;
        this.f = dVar;
        this.J = i3;
        this.N = str2;
        int i11 = Z;
        Z = i11 + 1;
        this.f164o = i11;
        this.g = TD2.B(Looper.getMainLooper(), new Handler.Callback() { // from class: o.PD1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean p;
                p = com.google.android.exoplayer2.ui.f.this.p(message);
                return p;
            }
        });
        this.h = C4551Vr1.q(applicationContext);
        this.j = new h();
        this.k = new C0101f();
        this.i = new IntentFilter();
        this.v = true;
        this.w = true;
        this.D = true;
        this.z = true;
        this.A = true;
        this.G = true;
        this.M = true;
        this.I = 0;
        this.H = 0;
        this.L = -1;
        this.F = 1;
        this.K = 1;
        Map<String, C3771Nr1.b> l = l(applicationContext, i11, i4, i5, i6, i7, i8, i9, i10);
        this.l = l;
        for (String str3 : l.keySet()) {
            this.i.addAction(str3);
        }
        if (dVar != null) {
            map = dVar.b(applicationContext, this.f164o);
        } else {
            map = Collections.EMPTY_MAP;
        }
        this.m = map;
        for (String str4 : map.keySet()) {
            this.i.addAction(str4);
        }
        this.n = j(W, applicationContext, this.f164o);
        this.i.addAction(W);
    }

    public static PendingIntent j(String str, Context context, int i2) {
        int i3;
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(V, i2);
        if (TD2.a >= 23) {
            i3 = 201326592;
        } else {
            i3 = C10323vs.Q0;
        }
        return PendingIntent.getBroadcast(context, i2, intent, i3);
    }

    public static Map<String, C3771Nr1.b> l(Context context, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put(O, new C3771Nr1.b(i3, context.getString(g.k.l), j(O, context, i2)));
        hashMap.put(P, new C3771Nr1.b(i4, context.getString(g.k.k), j(P, context, i2)));
        hashMap.put(U, new C3771Nr1.b(i5, context.getString(g.k.x), j(U, context, i2)));
        hashMap.put(T, new C3771Nr1.b(i6, context.getString(g.k.r), j(T, context, i2)));
        hashMap.put(S, new C3771Nr1.b(i7, context.getString(g.k.d), j(S, context, i2)));
        hashMap.put(Q, new C3771Nr1.b(i8, context.getString(g.k.n), j(Q, context, i2)));
        hashMap.put(R, new C3771Nr1.b(i9, context.getString(g.k.h), j(R, context, i2)));
        return hashMap;
    }

    public static void x(C3771Nr1.n nVar, @InterfaceC11300zs1 Bitmap bitmap) {
        nVar.b0(bitmap);
    }

    public final void A(int i2) {
        if (this.L == i2) {
            return;
        }
        if (i2 != -2 && i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.L = i2;
        q();
    }

    public final void B(@K60 int i2) {
        if (this.J != i2) {
            this.J = i2;
            q();
        }
    }

    public final void C(boolean z) {
        if (this.M != z) {
            this.M = z;
            q();
        }
    }

    public final void D(boolean z) {
        if (this.A != z) {
            this.A = z;
            q();
        }
    }

    public final void E(boolean z) {
        if (this.C != z) {
            this.C = z;
            if (z) {
                this.y = false;
            }
            q();
        }
    }

    public final void F(boolean z) {
        if (this.w != z) {
            this.w = z;
            q();
        }
    }

    public final void G(boolean z) {
        if (this.y != z) {
            this.y = z;
            if (z) {
                this.C = false;
            }
            q();
        }
    }

    public final void H(boolean z) {
        if (this.D != z) {
            this.D = z;
            q();
        }
    }

    public final void I(boolean z) {
        if (this.v != z) {
            this.v = z;
            q();
        }
    }

    public final void J(boolean z) {
        if (this.x != z) {
            this.x = z;
            if (z) {
                this.B = false;
            }
            q();
        }
    }

    public final void K(boolean z) {
        if (this.z != z) {
            this.z = z;
            q();
        }
    }

    public final void L(boolean z) {
        if (this.B != z) {
            this.B = z;
            if (z) {
                this.x = false;
            }
            q();
        }
    }

    public final void M(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        q();
    }

    public final void N(int i2) {
        if (this.K == i2) {
            return;
        }
        if (i2 != -1 && i2 != 0 && i2 != 1) {
            throw new IllegalStateException();
        }
        this.K = i2;
        q();
    }

    public final void O(HD1 hd1, @InterfaceC11300zs1 Bitmap bitmap) {
        boolean o2 = o(hd1);
        C3771Nr1.n k = k(hd1, this.p, o2, bitmap);
        this.p = k;
        boolean z = false;
        if (k == null) {
            P(false);
            return;
        }
        Notification h2 = k.h();
        this.h.F(this.c, h2);
        if (!this.s) {
            TD2.y1(this.a, this.k, this.i);
        }
        g gVar = this.e;
        if (gVar != null) {
            int i2 = this.c;
            if (o2 || !this.s) {
                z = true;
            }
            gVar.a(i2, h2, z);
        }
        this.s = true;
    }

    public final void P(boolean z) {
        if (this.s) {
            this.s = false;
            this.g.removeMessages(0);
            this.h.c(this.c);
            this.a.unregisterReceiver(this.k);
            g gVar = this.e;
            if (gVar != null) {
                gVar.b(this.c, z);
            }
        }
    }

    @InterfaceC11300zs1
    public C3771Nr1.n k(HD1 hd1, @InterfaceC11300zs1 C3771Nr1.n nVar, boolean z, @InterfaceC11300zs1 Bitmap bitmap) {
        C3771Nr1.b bVar;
        if (hd1.X() == 1 && hd1.T0(17) && hd1.e1().x()) {
            this.q = null;
            return null;
        }
        List<String> n = n(hd1);
        ArrayList arrayList = new ArrayList(n.size());
        for (int i2 = 0; i2 < n.size(); i2++) {
            String str = n.get(i2);
            if (this.l.containsKey(str)) {
                bVar = this.l.get(str);
            } else {
                bVar = this.m.get(str);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (nVar == null || !arrayList.equals(this.q)) {
            nVar = new C3771Nr1.n(this.a, this.b);
            this.q = arrayList;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                nVar.b((C3771Nr1.b) arrayList.get(i3));
            }
        }
        C3966Pr1.e eVar = new C3966Pr1.e();
        MediaSessionCompat.Token token = this.u;
        if (token != null) {
            eVar.H(token);
        }
        eVar.I(m(n, hd1));
        eVar.J(!z);
        eVar.G(this.n);
        nVar.z0(eVar);
        nVar.T(this.n);
        nVar.D(this.F).i0(z).I(this.I).J(this.G).t0(this.J).G0(this.K).k0(this.L).S(this.H);
        if (TD2.a >= 21 && this.M && hd1.T0(16) && hd1.isPlaying() && !hd1.O() && !hd1.X0() && hd1.h().X == 1.0f) {
            nVar.H0(System.currentTimeMillis() - hd1.P1()).r0(true).E0(true);
        } else {
            nVar.r0(false).E0(false);
        }
        nVar.O(this.d.d(hd1));
        nVar.N(this.d.a(hd1));
        nVar.A0(this.d.e(hd1));
        if (bitmap == null) {
            e eVar2 = this.d;
            int i4 = this.t + 1;
            this.t = i4;
            bitmap = eVar2.c(hd1, new b(i4));
        }
        x(nVar, bitmap);
        nVar.M(this.d.b(hd1));
        String str2 = this.N;
        if (str2 != null) {
            nVar.Y(str2);
        }
        nVar.j0(true);
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int[] m(List<String> list, HD1 hd1) {
        int i2;
        int i3;
        int i4;
        int indexOf = list.indexOf(P);
        int indexOf2 = list.indexOf(O);
        if (this.x) {
            i2 = list.indexOf(Q);
        } else if (this.B) {
            i2 = list.indexOf(T);
        } else {
            i2 = -1;
        }
        if (this.y) {
            i3 = list.indexOf(R);
        } else if (this.C) {
            i3 = list.indexOf(S);
        } else {
            i3 = -1;
        }
        int[] iArr = new int[3];
        int i5 = 0;
        if (i2 != -1) {
            iArr[0] = i2;
            i5 = 1;
        }
        boolean G1 = TD2.G1(hd1);
        if (indexOf != -1 && !G1) {
            i4 = i5 + 1;
            iArr[i5] = indexOf;
        } else {
            if (indexOf2 != -1 && G1) {
                i4 = i5 + 1;
                iArr[i5] = indexOf2;
            }
            if (i3 != -1) {
                iArr[i5] = i3;
                i5++;
            }
            return Arrays.copyOf(iArr, i5);
        }
        i5 = i4;
        if (i3 != -1) {
        }
        return Arrays.copyOf(iArr, i5);
    }

    public List<String> n(HD1 hd1) {
        boolean T0 = hd1.T0(7);
        boolean T02 = hd1.T0(11);
        boolean T03 = hd1.T0(12);
        boolean T04 = hd1.T0(9);
        ArrayList arrayList = new ArrayList();
        if (this.v && T0) {
            arrayList.add(Q);
        }
        if (this.z && T02) {
            arrayList.add(T);
        }
        if (this.D) {
            if (TD2.G1(hd1)) {
                arrayList.add(O);
            } else {
                arrayList.add(P);
            }
        }
        if (this.A && T03) {
            arrayList.add(S);
        }
        if (this.w && T04) {
            arrayList.add(R);
        }
        d dVar = this.f;
        if (dVar != null) {
            arrayList.addAll(dVar.c(hd1));
        }
        if (this.E) {
            arrayList.add(U);
        }
        return arrayList;
    }

    public boolean o(HD1 hd1) {
        int X2 = hd1.X();
        if ((X2 == 2 || X2 == 3) && hd1.u1()) {
            return true;
        }
        return false;
    }

    public final boolean p(Message message) {
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            HD1 hd1 = this.r;
            if (hd1 != null && this.s && this.t == message.arg1) {
                O(hd1, (Bitmap) message.obj);
            }
        } else {
            HD1 hd12 = this.r;
            if (hd12 != null) {
                O(hd12, null);
            }
        }
        return true;
    }

    public final void q() {
        if (this.s) {
            r();
        }
    }

    public final void r() {
        if (!this.g.hasMessages(0)) {
            this.g.sendEmptyMessage(0);
        }
    }

    public final void s(Bitmap bitmap, int i2) {
        this.g.obtainMessage(1, i2, -1, bitmap).sendToTarget();
    }

    public final void t(int i2) {
        if (this.F == i2) {
            return;
        }
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.F = i2;
        q();
    }

    public final void u(int i2) {
        if (this.I != i2) {
            this.I = i2;
            q();
        }
    }

    public final void v(boolean z) {
        if (this.G != z) {
            this.G = z;
            q();
        }
    }

    public final void w(int i2) {
        if (this.H != i2) {
            this.H = i2;
            q();
        }
    }

    public final void y(MediaSessionCompat.Token token) {
        if (!TD2.g(this.u, token)) {
            this.u = token;
            q();
        }
    }

    public final void z(@InterfaceC11300zs1 HD1 hd1) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        if (hd1 != null && hd1.h1() != Looper.getMainLooper()) {
            z2 = false;
        }
        C9542sf.a(z2);
        HD1 hd12 = this.r;
        if (hd12 != hd1) {
            if (hd12 != null) {
                hd12.f1(this.j);
                if (hd1 == null) {
                    P(false);
                }
            }
            this.r = hd1;
            if (hd1 != null) {
                hd1.l1(this.j);
                r();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public final Context a;
        public final int b;
        public final String c;
        @InterfaceC11300zs1
        public g d;
        @InterfaceC11300zs1
        public d e;
        public e f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f165o;
        public int p;
        public int q;
        @InterfaceC11300zs1
        public String r;

        @Deprecated
        public c(Context context, int i, String str, e eVar) {
            this(context, i, str);
            this.f = eVar;
        }

        public f a() {
            int i = this.g;
            if (i != 0) {
                C4949Zr1.a(this.a, this.c, i, this.h, this.i);
            }
            return new f(this.a, this.c, this.b, this.f, this.d, this.e, this.j, this.l, this.m, this.n, this.k, this.f165o, this.p, this.q, this.r);
        }

        public c b(int i) {
            this.h = i;
            return this;
        }

        public c c(int i) {
            this.i = i;
            return this;
        }

        public c d(int i) {
            this.g = i;
            return this;
        }

        public c e(d dVar) {
            this.e = dVar;
            return this;
        }

        public c f(int i) {
            this.f165o = i;
            return this;
        }

        public c g(String str) {
            this.r = str;
            return this;
        }

        public c h(e eVar) {
            this.f = eVar;
            return this;
        }

        public c i(int i) {
            this.q = i;
            return this;
        }

        public c j(g gVar) {
            this.d = gVar;
            return this;
        }

        public c k(int i) {
            this.m = i;
            return this;
        }

        public c l(int i) {
            this.l = i;
            return this;
        }

        public c m(int i) {
            this.p = i;
            return this;
        }

        public c n(int i) {
            this.k = i;
            return this;
        }

        public c o(int i) {
            this.j = i;
            return this;
        }

        public c p(int i) {
            this.n = i;
            return this;
        }

        public c(Context context, @BR0(from = 1) int i, String str) {
            C9542sf.a(i > 0);
            this.a = context;
            this.b = i;
            this.c = str;
            this.i = 2;
            this.f = new com.google.android.exoplayer2.ui.b(null);
            this.j = g.e.c0;
            this.l = g.e.Z;
            this.m = g.e.Y;
            this.n = g.e.d0;
            this.k = g.e.b0;
            this.f165o = g.e.W;
            this.p = g.e.a0;
            this.q = g.e.X;
        }
    }
}
