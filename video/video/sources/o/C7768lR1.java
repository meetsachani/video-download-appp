package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.appevents.C2315e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.HT1;
import o.InterfaceC8491oL0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* renamed from: o.lR1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7768lR1 {
    @NotNull
    public static final C7768lR1 a = new C7768lR1();
    public static final String b = C7768lR1.class.getSimpleName();
    @NotNull
    public static final String c = "ReceiverService";
    @NotNull
    public static final String d = "com.facebook.katana";
    @NotNull
    public static final String e = "com.facebook.wakizashi";
    @Nullable
    public static Boolean f;

    /* renamed from: o.lR1$a */
    /* loaded from: classes2.dex */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        @NotNull
        public final String X;

        a(String str) {
            this.X = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.X;
        }
    }

    /* renamed from: o.lR1$b */
    /* loaded from: classes2.dex */
    public static final class b implements ServiceConnection {
        @NotNull
        public final CountDownLatch X = new CountDownLatch(1);
        @Nullable
        public IBinder Y;

        @Nullable
        public final IBinder a() throws InterruptedException {
            this.X.await(5L, TimeUnit.SECONDS);
            return this.Y;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NotNull ComponentName componentName) {
            C6562gT0.p(componentName, "name");
            this.X.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
            C6562gT0.p(componentName, "name");
            C6562gT0.p(iBinder, "serviceBinder");
            this.Y = iBinder;
            this.X.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName componentName) {
            C6562gT0.p(componentName, "name");
        }
    }

    /* renamed from: o.lR1$c */
    /* loaded from: classes2.dex */
    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    @InterfaceC9511sW0
    public static final boolean b() {
        boolean z;
        if (SQ.e(C7768lR1.class)) {
            return false;
        }
        try {
            if (f == null) {
                com.facebook.M m = com.facebook.M.a;
                if (a.a(com.facebook.M.n()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f = Boolean.valueOf(z);
            }
            Boolean bool = f;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            SQ.c(th, C7768lR1.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final c c(@NotNull String str, @NotNull List<C2315e> list) {
        if (SQ.e(C7768lR1.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(list, "appEvents");
            return a.d(a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            SQ.c(th, C7768lR1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final c e(@NotNull String str) {
        if (SQ.e(C7768lR1.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "applicationId");
            return a.d(a.MOBILE_APP_INSTALL, str, C8222nF.H());
        } catch (Throwable th) {
            SQ.c(th, C7768lR1.class);
            return null;
        }
    }

    public final Intent a(Context context) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent(c);
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null) {
                    com.facebook.internal.r rVar = com.facebook.internal.r.a;
                    if (com.facebook.internal.r.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                }
                Intent intent2 = new Intent(c);
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    com.facebook.internal.r rVar2 = com.facebook.internal.r.a;
                    if (com.facebook.internal.r.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final c d(a aVar, String str, List<C2315e> list) {
        c cVar;
        String str2;
        if (SQ.e(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            C5370bd c5370bd = C5370bd.a;
            C5370bd.b();
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            Intent a2 = a(n);
            if (a2 != null) {
                b bVar = new b();
                if (n.bindService(a2, bVar, 1)) {
                    try {
                        IBinder a3 = bVar.a();
                        if (a3 != null) {
                            InterfaceC8491oL0 O0 = InterfaceC8491oL0.b.O0(a3);
                            C7525kR1 c7525kR1 = C7525kR1.a;
                            Bundle a4 = C7525kR1.a(aVar, str, list);
                            if (a4 != null) {
                                O0.L1(a4);
                                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                                com.facebook.internal.l0.m0(b, C6562gT0.C("Successfully sent events to the remote service: ", a4));
                            }
                            cVar2 = c.OPERATION_SUCCESS;
                        }
                        n.unbindService(bVar);
                        com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                        com.facebook.internal.l0.m0(b, "Unbound from the remote service");
                        return cVar2;
                    } catch (RemoteException e2) {
                        cVar = c.SERVICE_ERROR;
                        com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                        str2 = b;
                        com.facebook.internal.l0.l0(str2, e2);
                        n.unbindService(bVar);
                        com.facebook.internal.l0.m0(str2, "Unbound from the remote service");
                        return cVar;
                    } catch (InterruptedException e3) {
                        cVar = c.SERVICE_ERROR;
                        com.facebook.internal.l0 l0Var4 = com.facebook.internal.l0.a;
                        str2 = b;
                        com.facebook.internal.l0.l0(str2, e3);
                        n.unbindService(bVar);
                        com.facebook.internal.l0.m0(str2, "Unbound from the remote service");
                        return cVar;
                    }
                }
                return c.SERVICE_ERROR;
            }
            return cVar2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
