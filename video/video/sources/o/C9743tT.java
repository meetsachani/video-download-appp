package o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.CT;
import o.XI0;

/* renamed from: o.tT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9743tT {
    public static final String d = "CustomTabsClient";
    public final YI0 a;
    public final ComponentName b;
    public final Context c;

    /* renamed from: o.tT$b */
    /* loaded from: classes.dex */
    public class b extends XI0.b {
        public Handler g1 = new Handler(Looper.getMainLooper());
        public final /* synthetic */ C9500sT h1;

        /* renamed from: o.tT$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Bundle X;

            public a(Bundle bundle) {
                this.X = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.j(this.X);
            }
        }

        /* renamed from: o.tT$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0342b implements Runnable {
            public final /* synthetic */ int X;
            public final /* synthetic */ Bundle Y;

            public RunnableC0342b(int i, Bundle bundle) {
                this.X = i;
                this.Y = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.g(this.X, this.Y);
            }
        }

        /* renamed from: o.tT$b$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ String X;
            public final /* synthetic */ Bundle Y;

            public c(String str, Bundle bundle) {
                this.X = str;
                this.Y = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.a(this.X, this.Y);
            }
        }

        /* renamed from: o.tT$b$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ Bundle X;

            public d(Bundle bundle) {
                this.X = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.e(this.X);
            }
        }

        /* renamed from: o.tT$b$e */
        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ String X;
            public final /* synthetic */ Bundle Y;

            public e(String str, Bundle bundle) {
                this.X = str;
                this.Y = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.h(this.X, this.Y);
            }
        }

        /* renamed from: o.tT$b$f */
        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ int X;
            public final /* synthetic */ Uri Y;
            public final /* synthetic */ Bundle Y0;
            public final /* synthetic */ boolean Z;

            public f(int i, Uri uri, boolean z, Bundle bundle) {
                this.X = i;
                this.Y = uri;
                this.Z = z;
                this.Y0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.i(this.X, this.Y, this.Z, this.Y0);
            }
        }

        /* renamed from: o.tT$b$g */
        /* loaded from: classes.dex */
        public class g implements Runnable {
            public final /* synthetic */ int X;
            public final /* synthetic */ int Y;
            public final /* synthetic */ Bundle Z;

            public g(int i, int i2, Bundle bundle) {
                this.X = i;
                this.Y = i2;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.d(this.X, this.Y, this.Z);
            }
        }

        /* renamed from: o.tT$b$h */
        /* loaded from: classes.dex */
        public class h implements Runnable {
            public final /* synthetic */ Bundle X;

            public h(Bundle bundle) {
                this.X = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.k(this.X);
            }
        }

        /* renamed from: o.tT$b$i */
        /* loaded from: classes.dex */
        public class i implements Runnable {
            public final /* synthetic */ int X;
            public final /* synthetic */ int Y;
            public final /* synthetic */ int Y0;
            public final /* synthetic */ int Z;
            public final /* synthetic */ int Z0;
            public final /* synthetic */ Bundle a1;

            public i(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                this.X = i;
                this.Y = i2;
                this.Z = i3;
                this.Y0 = i4;
                this.Z0 = i5;
                this.a1 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.c(this.X, this.Y, this.Z, this.Y0, this.Z0, this.a1);
            }
        }

        /* renamed from: o.tT$b$j */
        /* loaded from: classes.dex */
        public class j implements Runnable {
            public final /* synthetic */ Bundle X;

            public j(Bundle bundle) {
                this.X = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h1.f(this.X);
            }
        }

        public b(C9500sT c9500sT) {
            this.h1 = c9500sT;
        }

        @Override // o.XI0
        public void B7(Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new d(bundle));
        }

        @Override // o.XI0
        public void F7(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new f(i2, uri, z, bundle));
        }

        @Override // o.XI0
        public void G6(int i2, int i3, Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new g(i2, i3, bundle));
        }

        @Override // o.XI0
        public void H3(Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new h(bundle));
        }

        @Override // o.XI0
        public void W1(int i2, int i3, int i4, int i5, int i6, Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new i(i2, i3, i4, i5, i6, bundle));
        }

        @Override // o.XI0
        public void d7(int i2, Bundle bundle) {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new RunnableC0342b(i2, bundle));
        }

        @Override // o.XI0
        public void q6(Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new j(bundle));
        }

        @Override // o.XI0
        public void r1(String str, Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new e(str, bundle));
        }

        @Override // o.XI0
        public Bundle r2(String str, Bundle bundle) throws RemoteException {
            C9500sT c9500sT = this.h1;
            if (c9500sT == null) {
                return null;
            }
            return c9500sT.b(str, bundle);
        }

        @Override // o.XI0
        public void u6(Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new a(bundle));
        }

        @Override // o.XI0
        public void z3(String str, Bundle bundle) throws RemoteException {
            if (this.h1 == null) {
                return;
            }
            this.g1.post(new c(str, bundle));
        }
    }

    public C9743tT(YI0 yi0, ComponentName componentName, Context context) {
        this.a = yi0;
        this.b = componentName;
        this.c = context;
    }

    public static boolean b(Context context, String str, AbstractServiceConnectionC10961yT abstractServiceConnectionC10961yT) {
        abstractServiceConnectionC10961yT.c(context.getApplicationContext());
        Intent intent = new Intent(AbstractServiceC10718xT.Z);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC10961yT, 33);
    }

    public static boolean c(Context context, String str, AbstractServiceConnectionC10961yT abstractServiceConnectionC10961yT) {
        abstractServiceConnectionC10961yT.c(context.getApplicationContext());
        Intent intent = new Intent(AbstractServiceC10718xT.Z);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC10961yT, 1);
    }

    public static boolean d(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return b(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static PendingIntent f(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    public static String h(Context context, List<String> list) {
        return i(context, list, false);
    }

    public static String i(Context context, List<String> list, boolean z) {
        ArrayList arrayList;
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(AbstractServiceC10718xT.Z);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w(d, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    public static CT.d j(Context context, C9500sT c9500sT, int i) {
        return new CT.d(c9500sT, f(context, i));
    }

    public CT a(CT.d dVar) {
        return m(dVar.a(), dVar.b());
    }

    public final XI0.b e(C9500sT c9500sT) {
        return new b(c9500sT);
    }

    public Bundle g(String str, Bundle bundle) {
        try {
            return this.a.t2(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public CT k(C9500sT c9500sT) {
        return m(c9500sT, null);
    }

    public CT l(C9500sT c9500sT, int i) {
        return m(c9500sT, f(this.c, i));
    }

    public final CT m(C9500sT c9500sT, PendingIntent pendingIntent) {
        boolean u3;
        XI0.b e = e(c9500sT);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(C10229vT.e, pendingIntent);
                u3 = this.a.u5(e, bundle);
            } else {
                u3 = this.a.u3(e);
            }
            if (!u3) {
                return null;
            }
            return new CT(this.a, e, this.b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean n(long j) {
        try {
            return this.a.j6(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: o.tT$a */
    /* loaded from: classes.dex */
    public class a extends AbstractServiceConnectionC10961yT {
        public final /* synthetic */ Context Y;

        public a(Context context) {
            this.Y = context;
        }

        @Override // o.AbstractServiceConnectionC10961yT
        public final void b(ComponentName componentName, C9743tT c9743tT) {
            c9743tT.n(0L);
            this.Y.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
