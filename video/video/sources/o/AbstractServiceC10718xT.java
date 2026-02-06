package o;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;
import o.YI0;

/* renamed from: o.xT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC10718xT extends Service {
    public static final String Y0 = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String Z = "android.support.customtabs.action.CustomTabsService";
    public static final String Z0 = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String a1 = "androidx.browser.trusted.category.TrustedWebActivities";
    public static final String b1 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final String c1 = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String d1 = "android.support.customtabs.otherurls.URL";
    public static final String e1 = "androidx.browser.customtabs.SUCCESS";
    public static final int f1 = 0;
    public static final int g1 = -1;
    public static final int h1 = -2;
    public static final int i1 = -3;
    public static final int j1 = 1;
    public static final int k1 = 2;
    public static final int l1 = 1;
    public static final String m1 = "CustomTabsService";
    public final C9654t62<IBinder, IBinder.DeathRecipient> X = new C9654t62<>();
    public YI0.b Y = new a();

    /* renamed from: o.xT$a */
    /* loaded from: classes.dex */
    public class a extends YI0.b {
        public a() {
        }

        @Override // o.YI0
        public boolean E5(XI0 xi0, Bundle bundle) {
            return AbstractServiceC10718xT.this.c(new GT(xi0, o1(bundle)), bundle);
        }

        @Override // o.YI0
        public int F2(XI0 xi0, String str, Bundle bundle) {
            return AbstractServiceC10718xT.this.f(new GT(xi0, o1(bundle)), str, bundle);
        }

        @Override // o.YI0
        public boolean H2(XI0 xi0, Uri uri, Bundle bundle) {
            return AbstractServiceC10718xT.this.i(new GT(xi0, o1(bundle)), uri, V3(bundle), bundle);
        }

        public final Uri V3(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return (Uri) C2809Ea.a(bundle, CT.g, Uri.class);
            }
            return (Uri) bundle.getParcelable(CT.g);
        }

        @Override // o.YI0
        public boolean W3(XI0 xi0, Uri uri, Bundle bundle, List<Bundle> list) {
            return AbstractServiceC10718xT.this.d(new GT(xi0, o1(bundle)), uri, bundle, list);
        }

        @Override // o.YI0
        public boolean X6(XI0 xi0, int i, Uri uri, Bundle bundle) {
            return AbstractServiceC10718xT.this.l(new GT(xi0, o1(bundle)), i, uri, bundle);
        }

        @Override // o.YI0
        public boolean d4(XI0 xi0, Uri uri, int i, Bundle bundle) {
            return AbstractServiceC10718xT.this.g(new GT(xi0, o1(bundle)), uri, i, bundle);
        }

        @Override // o.YI0
        public boolean j6(long j) {
            return AbstractServiceC10718xT.this.m(j);
        }

        public final PendingIntent o1(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(C10229vT.e);
            bundle.remove(C10229vT.e);
            return pendingIntent;
        }

        public final boolean r4(XI0 xi0, PendingIntent pendingIntent) {
            final GT gt = new GT(xi0, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: o.wT
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        AbstractServiceC10718xT.this.a(gt);
                    }
                };
                synchronized (AbstractServiceC10718xT.this.X) {
                    xi0.asBinder().linkToDeath(deathRecipient, 0);
                    AbstractServiceC10718xT.this.X.put(xi0.asBinder(), deathRecipient);
                }
                return AbstractServiceC10718xT.this.e(gt);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // o.YI0
        public boolean r6(XI0 xi0, IBinder iBinder, Bundle bundle) {
            return AbstractServiceC10718xT.this.j(new GT(xi0, o1(bundle)), C4393Uc0.a(iBinder), bundle);
        }

        @Override // o.YI0
        public Bundle t2(String str, Bundle bundle) {
            return AbstractServiceC10718xT.this.b(str, bundle);
        }

        @Override // o.YI0
        public boolean u3(XI0 xi0) {
            return r4(xi0, null);
        }

        @Override // o.YI0
        public boolean u5(XI0 xi0, Bundle bundle) {
            return r4(xi0, o1(bundle));
        }

        @Override // o.YI0
        public boolean v5(XI0 xi0, Bundle bundle) {
            return AbstractServiceC10718xT.this.k(new GT(xi0, o1(bundle)), bundle);
        }

        @Override // o.YI0
        public boolean x2(XI0 xi0, Uri uri) {
            return AbstractServiceC10718xT.this.i(new GT(xi0, null), uri, null, new Bundle());
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xT$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xT$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.xT$d */
    /* loaded from: classes.dex */
    public @interface d {
    }

    public boolean a(GT gt) {
        try {
            synchronized (this.X) {
                IBinder c2 = gt.c();
                if (c2 == null) {
                    return false;
                }
                c2.unlinkToDeath(this.X.get(c2), 0);
                this.X.remove(c2);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle b(String str, Bundle bundle);

    public boolean c(GT gt, Bundle bundle) {
        return false;
    }

    public abstract boolean d(GT gt, Uri uri, Bundle bundle, List<Bundle> list);

    public abstract boolean e(GT gt);

    public abstract int f(GT gt, String str, Bundle bundle);

    public abstract boolean g(GT gt, Uri uri, int i, Bundle bundle);

    public abstract boolean h(GT gt, Uri uri);

    public boolean i(GT gt, Uri uri, Uri uri2, Bundle bundle) {
        return h(gt, uri);
    }

    public boolean j(GT gt, InterfaceC4296Tc0 interfaceC4296Tc0, Bundle bundle) {
        return false;
    }

    public abstract boolean k(GT gt, Bundle bundle);

    public abstract boolean l(GT gt, int i, Uri uri, Bundle bundle);

    public abstract boolean m(long j);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.Y;
    }
}
