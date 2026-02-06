package o;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import o.InterfaceC10444wL0;

/* loaded from: classes.dex */
public final class Pu2 {
    public static final String c = "android.support.customtabs.trusted.PLATFORM_TAG";
    public static final String d = "android.support.customtabs.trusted.PLATFORM_ID";
    public static final String e = "android.support.customtabs.trusted.NOTIFICATION";
    public static final String f = "android.support.customtabs.trusted.CHANNEL_NAME";
    public static final String g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    public static final String h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
    public final InterfaceC10687xL0 a;
    public final ComponentName b;

    /* loaded from: classes.dex */
    public class a extends InterfaceC10444wL0.b {
        public final /* synthetic */ Ju2 Y;

        public a(Ju2 ju2) {
            this.Y = ju2;
        }

        @Override // o.InterfaceC10444wL0
        public void A7(String str, Bundle bundle) throws RemoteException {
            this.Y.a(str, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Parcelable[] a;

        public b(Parcelable[] parcelableArr) {
            this.a = parcelableArr;
        }

        public static b a(Bundle bundle) {
            Pu2.c(bundle, Pu2.g);
            return new b(bundle.getParcelableArray(Pu2.g));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(Pu2.g, this.a);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final int b;

        public c(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public static c a(Bundle bundle) {
            Pu2.c(bundle, Pu2.c);
            Pu2.c(bundle, Pu2.d);
            return new c(bundle.getString(Pu2.c), bundle.getInt(Pu2.d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(Pu2.c, this.a);
            bundle.putInt(Pu2.d, this.b);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public static d a(Bundle bundle) {
            Pu2.c(bundle, Pu2.f);
            return new d(bundle.getString(Pu2.f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(Pu2.f, this.a);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final String a;
        public final int b;
        public final Notification c;
        public final String d;

        public e(String str, int i, Notification notification, String str2) {
            this.a = str;
            this.b = i;
            this.c = notification;
            this.d = str2;
        }

        public static e a(Bundle bundle) {
            Pu2.c(bundle, Pu2.c);
            Pu2.c(bundle, Pu2.d);
            Pu2.c(bundle, Pu2.e);
            Pu2.c(bundle, Pu2.f);
            return new e(bundle.getString(Pu2.c), bundle.getInt(Pu2.d), (Notification) bundle.getParcelable(Pu2.e), bundle.getString(Pu2.f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(Pu2.c, this.a);
            bundle.putInt(Pu2.d, this.b);
            bundle.putParcelable(Pu2.e, this.c);
            bundle.putString(Pu2.f, this.d);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public static f a(Bundle bundle) {
            Pu2.c(bundle, Pu2.h);
            return new f(bundle.getBoolean(Pu2.h));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(Pu2.h, this.a);
            return bundle;
        }
    }

    public Pu2(InterfaceC10687xL0 interfaceC10687xL0, ComponentName componentName) {
        this.a = interfaceC10687xL0;
        this.b = componentName;
    }

    public static void c(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    public static InterfaceC10444wL0 j(Ju2 ju2) {
        if (ju2 == null) {
            return null;
        }
        return new a(ju2);
    }

    public boolean a(String str) throws RemoteException {
        return f.a(this.a.O6(new d(str).b())).a;
    }

    public void b(String str, int i) throws RemoteException {
        this.a.V6(new c(str, i).b());
    }

    public Parcelable[] d() throws RemoteException {
        return b.a(this.a.c5()).a;
    }

    public ComponentName e() {
        return this.b;
    }

    public Bitmap f() throws RemoteException {
        return (Bitmap) this.a.h3().getParcelable(Ou2.a1);
    }

    public int g() throws RemoteException {
        return this.a.H6();
    }

    public boolean h(String str, int i, Notification notification, String str2) throws RemoteException {
        return f.a(this.a.D3(new e(str, i, notification, str2).b())).a;
    }

    public Bundle i(String str, Bundle bundle, Ju2 ju2) throws RemoteException {
        IBinder asBinder;
        InterfaceC10444wL0 j = j(ju2);
        if (j == null) {
            asBinder = null;
        } else {
            asBinder = j.asBinder();
        }
        return this.a.C2(str, bundle, asBinder);
    }
}
