package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C2416z;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C6562gT0;
import o.C9516sY;
import o.HT1;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2358c {
    @NotNull
    public static final a f = new a(null);
    public static final String g = C2358c.class.getCanonicalName();
    @NotNull
    public static final String h = "com.facebook.katana.provider.AttributionIdProvider";
    @NotNull
    public static final String i = "com.facebook.wakizashi.provider.AttributionIdProvider";
    @NotNull
    public static final String j = "aid";
    @NotNull
    public static final String k = "androidid";
    @NotNull
    public static final String l = "limit_tracking";
    public static final int m = 0;
    public static final long n = 3600000;
    @InterfaceC7058iW0
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public static C2358c f113o;
    @Nullable
    public String a;
    public long b;
    @Nullable
    public String c;
    @Nullable
    public String d;
    public boolean e;

    /* renamed from: com.facebook.internal.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC5056aJ2(otherwise = 2)
        public static /* synthetic */ void b() {
        }

        @InterfaceC5056aJ2(otherwise = 2)
        public static /* synthetic */ void g() {
        }

        public final C2358c a(C2358c c2358c) {
            c2358c.b = System.currentTimeMillis();
            C2358c.f113o = c2358c;
            return c2358c;
        }

        public final C2358c c(Context context) {
            C2358c d = d(context);
            if (d == null) {
                C2358c e = e(context);
                if (e == null) {
                    return new C2358c();
                }
                return e;
            }
            return d;
        }

        public final C2358c d(Context context) {
            Object V;
            try {
                if (!i(context)) {
                    return null;
                }
                l0 l0Var = l0.a;
                Method M = l0.M("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (M == null || (V = l0.V(null, M, context)) == null) {
                    return null;
                }
                boolean z = false;
                Method L = l0.L(V.getClass(), "getId", new Class[0]);
                Method L2 = l0.L(V.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (L != null && L2 != null) {
                    C2358c c2358c = new C2358c();
                    c2358c.a = (String) l0.V(V, L, new Object[0]);
                    Boolean bool = (Boolean) l0.V(V, L2, new Object[0]);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    c2358c.e = z;
                    return c2358c;
                }
                return null;
            } catch (Exception e) {
                l0 l0Var2 = l0.a;
                l0.l0("android_id", e);
                return null;
            }
        }

        public final C2358c e(Context context) {
            if (!i(context)) {
                return null;
            }
            ServiceConnectionC0082c serviceConnectionC0082c = new ServiceConnectionC0082c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, serviceConnectionC0082c, 1)) {
                        b bVar = new b(serviceConnectionC0082c.a());
                        C2358c c2358c = new C2358c();
                        c2358c.a = bVar.O0();
                        c2358c.e = bVar.g1();
                        return c2358c;
                    }
                } catch (Exception e) {
                    l0 l0Var = l0.a;
                    l0.l0("android_id", e);
                } finally {
                    context.unbindService(serviceConnectionC0082c);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0066, B:25:0x0087, B:27:0x008d, B:29:0x0092, B:31:0x0097, B:21:0x0070, B:23:0x007f, B:54:0x00f6, B:55:0x00fd), top: B:70:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0066, B:25:0x0087, B:27:0x008d, B:29:0x0092, B:31:0x0097, B:21:0x0070, B:23:0x007f, B:54:0x00f6, B:55:0x00fd), top: B:70:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0033, Exception -> 0x0037, TRY_LEAVE, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0066, B:25:0x0087, B:27:0x008d, B:29:0x0092, B:31:0x0097, B:21:0x0070, B:23:0x007f, B:54:0x00f6, B:55:0x00fd), top: B:70:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
        @InterfaceC9511sW0
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C2358c f(@NotNull Context context) {
            Exception exc;
            Cursor cursor;
            Throwable th;
            Uri uri;
            Uri parse;
            String h;
            C6562gT0.p(context, "context");
            C2358c c = c(context);
            Cursor cursor2 = null;
            try {
                if (!C6562gT0.g(Looper.myLooper(), Looper.getMainLooper())) {
                    C2358c c2358c = C2358c.f113o;
                    if (c2358c != null && System.currentTimeMillis() - c2358c.b < 3600000) {
                        return c2358c;
                    }
                    String[] strArr = {C2358c.j, C2358c.k, C2358c.l};
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(C2358c.h, 0);
                    ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider(C2358c.i, 0);
                    if (resolveContentProvider != null) {
                        r rVar = r.a;
                        String str = resolveContentProvider.packageName;
                        C6562gT0.o(str, "contentProviderInfo.packageName");
                        if (r.a(context, str)) {
                            parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                            uri = parse;
                            h = h(context);
                            if (h != null) {
                                c.d = h;
                            }
                            if (uri == null) {
                                return a(c);
                            }
                            Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                            if (query != null) {
                                try {
                                    if (query.moveToFirst()) {
                                        int columnIndex = query.getColumnIndex(C2358c.j);
                                        int columnIndex2 = query.getColumnIndex(C2358c.k);
                                        int columnIndex3 = query.getColumnIndex(C2358c.l);
                                        c.c = query.getString(columnIndex);
                                        if (columnIndex2 > 0 && columnIndex3 > 0 && c.h() == null) {
                                            c.a = query.getString(columnIndex2);
                                            c.e = Boolean.parseBoolean(query.getString(columnIndex3));
                                        }
                                        query.close();
                                        return a(c);
                                    }
                                } catch (Exception e) {
                                    cursor = query;
                                    exc = e;
                                    try {
                                        l0 l0Var = l0.a;
                                        l0.m0(C2358c.g, C6562gT0.C("Caught unexpected exception in getAttributionId(): ", exc));
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = query;
                                    th = th;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            C2358c a = a(c);
                            if (query == null) {
                                return a;
                            }
                            query.close();
                            return a;
                        }
                    }
                    if (resolveContentProvider2 != null) {
                        r rVar2 = r.a;
                        String str2 = resolveContentProvider2.packageName;
                        C6562gT0.o(str2, "wakizashiProviderInfo.packageName");
                        if (r.a(context, str2)) {
                            parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = parse;
                            h = h(context);
                            if (h != null) {
                            }
                            if (uri == null) {
                            }
                        }
                    }
                    uri = null;
                    h = h(context);
                    if (h != null) {
                    }
                    if (uri == null) {
                    }
                } else {
                    throw new C2416z("getAttributionIdentifiers cannot be called on the main thread.");
                }
            } catch (Exception e2) {
                exc = e2;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final String h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        public final boolean i(Context context) {
            l0 l0Var = l0.a;
            Method M = l0.M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (M == null) {
                return false;
            }
            Object V = l0.V(null, M, context);
            if (!(V instanceof Integer) || !C6562gT0.g(V, 0)) {
                return false;
            }
            return true;
        }

        @InterfaceC9511sW0
        @HT1({HT1.a.Y})
        public final boolean j(@NotNull Context context) {
            C6562gT0.p(context, "context");
            C2358c f = f(context);
            if (f != null && f.l()) {
                return true;
            }
            return false;
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    /* loaded from: classes2.dex */
    public static final class b implements IInterface {
        @NotNull
        public static final a Y = new a(null);
        public static final int Y0 = 2;
        public static final int Z = 1;
        @NotNull
        public final IBinder X;

        /* renamed from: com.facebook.internal.c$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public b(@NotNull IBinder iBinder) {
            C6562gT0.p(iBinder, "binder");
            this.X = iBinder;
        }

        @Nullable
        public final String O0() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C6562gT0.o(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C6562gT0.o(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.X.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.X;
        }

        public final boolean g1() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            C6562gT0.o(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C6562gT0.o(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.X.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class ServiceConnectionC0082c implements ServiceConnection {
        @NotNull
        public final AtomicBoolean X = new AtomicBoolean(false);
        @NotNull
        public final BlockingQueue<IBinder> Y = new LinkedBlockingDeque();

        @NotNull
        public final IBinder a() throws InterruptedException {
            if (!this.X.compareAndSet(true, true)) {
                IBinder take = this.Y.take();
                C6562gT0.o(take, "queue.take()");
                return take;
            }
            throw new IllegalStateException("Binder already consumed");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.Y.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName componentName) {
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2358c k(@NotNull Context context) {
        return f.f(context);
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    public static final boolean m(@NotNull Context context) {
        return f.j(context);
    }

    @Nullable
    public final String h() {
        com.facebook.M m2 = com.facebook.M.a;
        if (com.facebook.M.N() && com.facebook.M.m()) {
            return this.a;
        }
        return null;
    }

    @Nullable
    public final String i() {
        return this.d;
    }

    @Nullable
    public final String j() {
        return this.c;
    }

    public final boolean l() {
        return this.e;
    }
}
