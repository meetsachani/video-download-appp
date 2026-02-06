package o;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.Locale;
import o.InterfaceC10687xL0;
import o.Pu2;

/* loaded from: classes.dex */
public abstract class Ou2 extends Service {
    public static final String Y0 = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String Z0 = "android.support.customtabs.trusted.SMALL_ICON";
    public static final String a1 = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String b1 = "androidx.browser.trusted.SUCCESS";
    public static final int c1 = -1;
    public NotificationManager X;
    public int Y = -1;
    public final InterfaceC10687xL0.b Z = new a();

    /* loaded from: classes.dex */
    public class a extends InterfaceC10687xL0.b {
        public a() {
        }

        @Override // o.InterfaceC10687xL0
        public Bundle C2(String str, Bundle bundle, IBinder iBinder) {
            g1();
            return Ou2.this.f(str, bundle, Ku2.a(iBinder));
        }

        @Override // o.InterfaceC10687xL0
        public Bundle D3(Bundle bundle) {
            g1();
            Pu2.e a = Pu2.e.a(bundle);
            return new Pu2.f(Ou2.this.j(a.a, a.b, a.c, a.d)).b();
        }

        @Override // o.InterfaceC10687xL0
        public int H6() {
            g1();
            return Ou2.this.i();
        }

        @Override // o.InterfaceC10687xL0
        public Bundle O6(Bundle bundle) {
            g1();
            return new Pu2.f(Ou2.this.d(Pu2.d.a(bundle).a)).b();
        }

        @Override // o.InterfaceC10687xL0
        public void V6(Bundle bundle) {
            g1();
            Pu2.c a = Pu2.c.a(bundle);
            Ou2.this.e(a.a, a.b);
        }

        @Override // o.InterfaceC10687xL0
        public Bundle c5() {
            g1();
            return new Pu2.b(Ou2.this.g()).b();
        }

        public final void g1() {
            Ou2 ou2 = Ou2.this;
            if (ou2.Y == -1) {
                String[] packagesForUid = ou2.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                C4544Vp2 a = Ou2.this.c().a();
                PackageManager packageManager = Ou2.this.getPackageManager();
                if (a != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (a.c(packagesForUid[i], packageManager)) {
                            Ou2.this.Y = Binder.getCallingUid();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (Ou2.this.Y == Binder.getCallingUid()) {
                return;
            }
            throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
        }

        @Override // o.InterfaceC10687xL0
        public Bundle h3() {
            g1();
            return Ou2.this.h();
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.X != null) {
            return;
        }
        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public abstract InterfaceC4835Yp2 c();

    public boolean d(String str) {
        b();
        if (!C4551Vr1.q(this).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return C3184Hr1.b(this.X, a(str));
    }

    public void e(String str, int i) {
        b();
        this.X.cancel(str, i);
    }

    public Bundle f(String str, Bundle bundle, Ku2 ku2) {
        return null;
    }

    public Parcelable[] g() {
        b();
        return C2585Br1.a(this.X);
    }

    public Bundle h() {
        int i = i();
        Bundle bundle = new Bundle();
        if (i == -1) {
            return bundle;
        }
        bundle.putParcelable(a1, BitmapFactory.decodeResource(getResources(), i));
        return bundle;
    }

    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(Z0, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean j(String str, int i, Notification notification, String str2) {
        b();
        if (!C4551Vr1.q(this).a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String a2 = a(str2);
            notification = C3184Hr1.a(this, this.X, notification, a2, str2);
            if (!C3184Hr1.b(this.X, a2)) {
                return false;
            }
        }
        this.X.notify(str, i, notification);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.Z;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.X = (NotificationManager) getSystemService(MessagingAnalytics.b);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.Y = -1;
        return super.onUnbind(intent);
    }
}
