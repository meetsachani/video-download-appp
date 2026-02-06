package o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.RemoteViews;
import java.util.List;
import java.util.concurrent.Executor;
import o.CT;
import o.GT;
import o.InterfaceC5297bJ0;
import o.YI0;

/* loaded from: classes.dex */
public final class CT {
    public static final String f = "CustomTabsSession";
    public static final String g = "target_origin";
    public final Object a = new Object();
    public final YI0 b;
    public final XI0 c;
    public final ComponentName d;
    public final PendingIntent e;

    /* loaded from: classes.dex */
    public class a extends InterfaceC5297bJ0.b {
        public final Handler Y0 = new Handler(Looper.getMainLooper());
        public final /* synthetic */ InterfaceC4296Tc0 Z0;

        public a(InterfaceC4296Tc0 interfaceC4296Tc0) {
            CT.this = r1;
            this.Z0 = interfaceC4296Tc0;
        }

        public static /* synthetic */ void V3(InterfaceC4296Tc0 interfaceC4296Tc0, int i, Bundle bundle) {
            interfaceC4296Tc0.j1(i, bundle);
        }

        public static /* synthetic */ void g1(InterfaceC4296Tc0 interfaceC4296Tc0, boolean z, Bundle bundle) {
            interfaceC4296Tc0.a1(z, bundle);
        }

        public static /* synthetic */ void o1(InterfaceC4296Tc0 interfaceC4296Tc0, boolean z, Bundle bundle) {
            interfaceC4296Tc0.W0(z, bundle);
        }

        @Override // o.InterfaceC5297bJ0
        public void W0(final boolean z, final Bundle bundle) {
            Handler handler = this.Y0;
            final InterfaceC4296Tc0 interfaceC4296Tc0 = this.Z0;
            handler.post(new Runnable() { // from class: o.zT
                @Override // java.lang.Runnable
                public final void run() {
                    CT.a.o1(InterfaceC4296Tc0.this, z, bundle);
                }
            });
        }

        @Override // o.InterfaceC5297bJ0
        public void a1(final boolean z, final Bundle bundle) {
            Handler handler = this.Y0;
            final InterfaceC4296Tc0 interfaceC4296Tc0 = this.Z0;
            handler.post(new Runnable() { // from class: o.BT
                @Override // java.lang.Runnable
                public final void run() {
                    CT.a.g1(InterfaceC4296Tc0.this, z, bundle);
                }
            });
        }

        @Override // o.InterfaceC5297bJ0
        public void j1(final int i, final Bundle bundle) {
            Handler handler = this.Y0;
            final InterfaceC4296Tc0 interfaceC4296Tc0 = this.Z0;
            handler.post(new Runnable() { // from class: o.AT
                @Override // java.lang.Runnable
                public final void run() {
                    CT.a.V3(InterfaceC4296Tc0.this, i, bundle);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class b extends InterfaceC5297bJ0.b {
        public final Executor Y0;
        public final /* synthetic */ Executor Z0;
        public final /* synthetic */ InterfaceC4296Tc0 a1;

        public b(Executor executor, InterfaceC4296Tc0 interfaceC4296Tc0) {
            CT.this = r1;
            this.Z0 = executor;
            this.a1 = interfaceC4296Tc0;
            this.Y0 = executor;
        }

        public static /* synthetic */ void V3(InterfaceC4296Tc0 interfaceC4296Tc0, boolean z, Bundle bundle) {
            interfaceC4296Tc0.a1(z, bundle);
        }

        public static /* synthetic */ void g1(InterfaceC4296Tc0 interfaceC4296Tc0, int i, Bundle bundle) {
            interfaceC4296Tc0.j1(i, bundle);
        }

        public static /* synthetic */ void o1(InterfaceC4296Tc0 interfaceC4296Tc0, boolean z, Bundle bundle) {
            interfaceC4296Tc0.W0(z, bundle);
        }

        @Override // o.InterfaceC5297bJ0
        public void W0(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.Y0;
                final InterfaceC4296Tc0 interfaceC4296Tc0 = this.a1;
                executor.execute(new Runnable() { // from class: o.FT
                    @Override // java.lang.Runnable
                    public final void run() {
                        CT.b.o1(InterfaceC4296Tc0.this, z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // o.InterfaceC5297bJ0
        public void a1(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.Y0;
                final InterfaceC4296Tc0 interfaceC4296Tc0 = this.a1;
                executor.execute(new Runnable() { // from class: o.DT
                    @Override // java.lang.Runnable
                    public final void run() {
                        CT.b.V3(InterfaceC4296Tc0.this, z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // o.InterfaceC5297bJ0
        public void j1(final int i, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.Y0;
                final InterfaceC4296Tc0 interfaceC4296Tc0 = this.a1;
                executor.execute(new Runnable() { // from class: o.ET
                    @Override // java.lang.Runnable
                    public final void run() {
                        CT.b.g1(InterfaceC4296Tc0.this, i, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends YI0.b {
        @Override // o.YI0
        public boolean E5(XI0 xi0, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public int F2(XI0 xi0, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // o.YI0
        public boolean H2(XI0 xi0, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean W3(XI0 xi0, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean X6(XI0 xi0, int i, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean d4(XI0 xi0, Uri uri, int i, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean j6(long j) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean r6(XI0 xi0, IBinder iBinder, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public Bundle t2(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // o.YI0
        public boolean u3(XI0 xi0) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean u5(XI0 xi0, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean v5(XI0 xi0, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // o.YI0
        public boolean x2(XI0 xi0, Uri uri) throws RemoteException {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final C9500sT a;
        public final PendingIntent b;

        public d(C9500sT c9500sT, PendingIntent pendingIntent) {
            this.a = c9500sT;
            this.b = pendingIntent;
        }

        public C9500sT a() {
            return this.a;
        }

        public PendingIntent b() {
            return this.b;
        }
    }

    public CT(YI0 yi0, XI0 xi0, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = yi0;
        this.c = xi0;
        this.d = componentName;
        this.e = pendingIntent;
    }

    public static CT e(ComponentName componentName) {
        return new CT(new c(), new GT.b(), componentName, null);
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable(C10229vT.e, pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public final InterfaceC5297bJ0.b c(InterfaceC4296Tc0 interfaceC4296Tc0) {
        return new a(interfaceC4296Tc0);
    }

    public final InterfaceC5297bJ0.b d(InterfaceC4296Tc0 interfaceC4296Tc0, Executor executor) {
        return new b(executor, interfaceC4296Tc0);
    }

    public final Bundle f(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable(g, uri);
        }
        if (this.e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder g() {
        return this.c.asBinder();
    }

    public ComponentName h() {
        return this.d;
    }

    public PendingIntent i() {
        return this.e;
    }

    public boolean j(Bundle bundle) throws RemoteException {
        try {
            return this.b.E5(this.c, b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean k(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.b.W3(this.c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int l(String str, Bundle bundle) {
        int F2;
        Bundle b2 = b(bundle);
        synchronized (this.a) {
            try {
                try {
                    F2 = this.b.F2(this.c, str, b2);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return F2;
    }

    public boolean m(Uri uri, int i, Bundle bundle) {
        try {
            return this.b.d4(this.c, uri, i, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean n(Uri uri) {
        return o(uri, null, new Bundle());
    }

    public boolean o(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle f2 = f(uri2);
            if (f2 != null) {
                bundle.putAll(f2);
                return this.b.H2(this.c, uri, bundle);
            }
            return this.b.x2(this.c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean p(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C10229vT.z, bitmap);
        bundle.putString(C10229vT.A, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(C10229vT.w, bundle);
        a(bundle);
        try {
            return this.b.v5(this.c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean q(Executor executor, InterfaceC4296Tc0 interfaceC4296Tc0, Bundle bundle) throws RemoteException {
        try {
            return this.b.r6(this.c, d(interfaceC4296Tc0, executor).asBinder(), b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean r(InterfaceC4296Tc0 interfaceC4296Tc0, Bundle bundle) throws RemoteException {
        try {
            return this.b.r6(this.c, c(interfaceC4296Tc0).asBinder(), b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean s(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C10229vT.t, pendingIntent);
        a(bundle);
        try {
            return this.b.v5(this.c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean t(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C10229vT.M, remoteViews);
        bundle.putIntArray(C10229vT.N, iArr);
        bundle.putParcelable(C10229vT.O, pendingIntent);
        a(bundle);
        try {
            return this.b.v5(this.c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean u(int i, Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(C10229vT.z0, i);
        bundle.putParcelable(C10229vT.z, bitmap);
        bundle.putString(C10229vT.A, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(C10229vT.w, bundle);
        a(bundle2);
        try {
            return this.b.v5(this.c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean v(int i, Uri uri, Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.b.X6(this.c, i, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
