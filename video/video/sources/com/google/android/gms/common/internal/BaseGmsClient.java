package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4500Ve2;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC7980mF0;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    @KeepForSdk
    public static final int A1 = 5;
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String B1 = "pendingIntent";
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String C1 = "<<default account>>";
    @KeepForSdk
    public static final int y1 = 1;
    @KeepForSdk
    public static final int z1 = 4;
    public int X;
    public long Y;
    public int Y0;
    public long Z;
    public long Z0;
    @InterfaceC11300zs1
    public volatile String a1;
    @InterfaceC5056aJ2
    public zzv b1;
    public final Context c1;
    public final Looper d1;
    public final GmsClientSupervisor e1;
    public final GoogleApiAvailabilityLight f1;
    public final Handler g1;
    public final Object h1;
    public final Object i1;
    @InterfaceC7980mF0("serviceBrokerLock")
    @InterfaceC11300zs1
    public IGmsServiceBroker j1;
    @InterfaceC5056aJ2
    @InterfaceC5670cr1
    public ConnectionProgressReportCallbacks k1;
    @InterfaceC7980mF0("lock")
    @InterfaceC11300zs1
    public IInterface l1;
    public final ArrayList m1;
    @InterfaceC7980mF0("lock")
    @InterfaceC11300zs1
    public zze n1;
    @InterfaceC7980mF0("lock")
    public int o1;
    @InterfaceC11300zs1
    public final BaseConnectionCallbacks p1;
    @InterfaceC11300zs1
    public final BaseOnConnectionFailedListener q1;
    public final int r1;
    @InterfaceC11300zs1
    public final String s1;
    @InterfaceC11300zs1
    public volatile String t1;
    @InterfaceC11300zs1
    public ConnectionResult u1;
    public boolean v1;
    @InterfaceC11300zs1
    public volatile zzk w1;
    @InterfaceC5056aJ2
    @InterfaceC5670cr1
    public AtomicInteger x1;
    public static final Feature[] E1 = new Feature[0];
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String[] D1 = {"service_esmobile", "service_googleme"};

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        public static final int f = 1;
        @KeepForSdk
        public static final int g = 3;

        @KeepForSdk
        void O0(@InterfaceC11300zs1 Bundle bundle);

        @KeepForSdk
        void g1(int i);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void o1(@InterfaceC5670cr1 ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void a(@InterfaceC5670cr1 ConnectionResult connectionResult);
    }

    /* loaded from: classes2.dex */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void a(@InterfaceC5670cr1 ConnectionResult connectionResult) {
            if (connectionResult.H0()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.p(null, baseGmsClient.K());
            } else if (BaseGmsClient.this.q1 != null) {
                BaseGmsClient.this.q1.o1(connectionResult);
            }
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface SignOutCallbacks {
        @KeepForSdk
        void a();
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public BaseGmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Handler handler, @InterfaceC5670cr1 GmsClientSupervisor gmsClientSupervisor, @InterfaceC5670cr1 GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, @InterfaceC11300zs1 BaseConnectionCallbacks baseConnectionCallbacks, @InterfaceC11300zs1 BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.a1 = null;
        this.h1 = new Object();
        this.i1 = new Object();
        this.m1 = new ArrayList();
        this.o1 = 1;
        this.u1 = null;
        this.v1 = false;
        this.w1 = null;
        this.x1 = new AtomicInteger(0);
        Preconditions.s(context, "Context must not be null");
        this.c1 = context;
        Preconditions.s(handler, "Handler must not be null");
        this.g1 = handler;
        this.d1 = handler.getLooper();
        Preconditions.s(gmsClientSupervisor, "Supervisor must not be null");
        this.e1 = gmsClientSupervisor;
        Preconditions.s(googleApiAvailabilityLight, "API availability must not be null");
        this.f1 = googleApiAvailabilityLight;
        this.r1 = i;
        this.p1 = baseConnectionCallbacks;
        this.q1 = baseOnConnectionFailedListener;
        this.s1 = null;
    }

    public static /* bridge */ /* synthetic */ void j0(BaseGmsClient baseGmsClient, zzk zzkVar) {
        RootTelemetryConfiguration I0;
        baseGmsClient.w1 = zzkVar;
        if (baseGmsClient.Z()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.Y0;
            RootTelemetryConfigManager b = RootTelemetryConfigManager.b();
            if (connectionTelemetryConfiguration == null) {
                I0 = null;
            } else {
                I0 = connectionTelemetryConfiguration.I0();
            }
            b.c(I0);
        }
    }

    public static /* bridge */ /* synthetic */ void k0(BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        synchronized (baseGmsClient.h1) {
            i2 = baseGmsClient.o1;
        }
        if (i2 == 3) {
            baseGmsClient.v1 = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = baseGmsClient.g1;
        handler.sendMessage(handler.obtainMessage(i3, baseGmsClient.x1.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean n0(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        synchronized (baseGmsClient.h1) {
            try {
                if (baseGmsClient.o1 != i) {
                    return false;
                }
                baseGmsClient.p0(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean o0(BaseGmsClient baseGmsClient) {
        if (baseGmsClient.v1 || TextUtils.isEmpty(baseGmsClient.M()) || TextUtils.isEmpty(baseGmsClient.I())) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.M());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @KeepForSdk
    public boolean A() {
        return false;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Account B() {
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Feature[] C() {
        return E1;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Executor D() {
        return null;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Bundle E() {
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public final Context F() {
        return this.c1;
    }

    @KeepForSdk
    public int G() {
        return this.r1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Bundle H() {
        return new Bundle();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String I() {
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public final Looper J() {
        return this.d1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> K() {
        return Collections.EMPTY_SET;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public final T L() throws DeadObjectException {
        T t;
        synchronized (this.h1) {
            try {
                if (this.o1 != 5) {
                    y();
                    t = (T) this.l1;
                    Preconditions.s(t, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract String M();

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract String N();

    @InterfaceC5670cr1
    @KeepForSdk
    public String O() {
        return "com.google.android.gms";
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public ConnectionTelemetryConfiguration P() {
        zzk zzkVar = this.w1;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.Y0;
    }

    @KeepForSdk
    public boolean Q() {
        if (s() >= 211700000) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public boolean R() {
        return this.w1 != null;
    }

    @KeepForSdk
    @InterfaceC2591Bt
    public void S(@InterfaceC5670cr1 T t) {
        this.Z = System.currentTimeMillis();
    }

    @KeepForSdk
    @InterfaceC2591Bt
    public void T(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        this.Y0 = connectionResult.m0();
        this.Z0 = System.currentTimeMillis();
    }

    @KeepForSdk
    @InterfaceC2591Bt
    public void U(int i) {
        this.X = i;
        this.Y = System.currentTimeMillis();
    }

    @KeepForSdk
    public void V(int i, @InterfaceC11300zs1 IBinder iBinder, @InterfaceC11300zs1 Bundle bundle, int i2) {
        this.g1.sendMessage(this.g1.obtainMessage(1, i2, -1, new zzf(this, i, iBinder, bundle)));
    }

    @KeepForSdk
    public void W(@InterfaceC5670cr1 String str) {
        this.t1 = str;
    }

    @KeepForSdk
    public void X(int i) {
        this.g1.sendMessage(this.g1.obtainMessage(6, this.x1.get(), i));
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public void Y(@InterfaceC5670cr1 ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, @InterfaceC11300zs1 PendingIntent pendingIntent) {
        Preconditions.s(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.k1 = connectionProgressReportCallbacks;
        this.g1.sendMessage(this.g1.obtainMessage(3, this.x1.get(), i, pendingIntent));
    }

    @KeepForSdk
    public boolean Z() {
        return false;
    }

    @KeepForSdk
    public boolean a() {
        boolean z;
        synchronized (this.h1) {
            if (this.o1 == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    public boolean b() {
        return false;
    }

    @KeepForSdk
    public void c() {
        this.x1.incrementAndGet();
        synchronized (this.m1) {
            try {
                int size = this.m1.size();
                for (int i = 0; i < size; i++) {
                    ((zzc) this.m1.get(i)).d();
                }
                this.m1.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.i1) {
            this.j1 = null;
        }
        p0(1, null);
    }

    @KeepForSdk
    public void dump(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 FileDescriptor fileDescriptor, @InterfaceC5670cr1 PrintWriter printWriter, @InterfaceC5670cr1 String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.h1) {
            i = this.o1;
            iInterface = this.l1;
        }
        synchronized (this.i1) {
            iGmsServiceBroker = this.j1;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) M()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.Z > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.Z;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + C4500Ve2.b + format);
        }
        if (this.Y > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.X;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i2));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.Y;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + C4500Ve2.b + format2);
        }
        if (this.Z0 > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.a(this.Y0));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.Z0;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + C4500Ve2.b + format3);
        }
    }

    @KeepForSdk
    public boolean e() {
        return false;
    }

    @InterfaceC5670cr1
    public final String e0() {
        String str = this.s1;
        if (str == null) {
            return this.c1.getClass().getName();
        }
        return str;
    }

    @KeepForSdk
    public void g(@InterfaceC5670cr1 String str) {
        this.a1 = str;
        c();
    }

    @KeepForSdk
    public boolean h() {
        boolean z;
        synchronized (this.h1) {
            int i = this.o1;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String i() {
        zzv zzvVar;
        if (a() && (zzvVar = this.b1) != null) {
            return zzvVar.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    public void j(@InterfaceC5670cr1 ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.s(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.k1 = connectionProgressReportCallbacks;
        p0(2, null);
    }

    @KeepForSdk
    public boolean l() {
        return true;
    }

    public final void l0(int i, @InterfaceC11300zs1 Bundle bundle, int i2) {
        this.g1.sendMessage(this.g1.obtainMessage(7, i2, -1, new zzg(this, i, null)));
    }

    @KeepForSdk
    public boolean m() {
        return false;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public IBinder n() {
        synchronized (this.i1) {
            try {
                IGmsServiceBroker iGmsServiceBroker = this.j1;
                if (iGmsServiceBroker == null) {
                    return null;
                }
                return iGmsServiceBroker.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    @InterfaceC10697xN2
    public void p(@InterfaceC11300zs1 IAccountAccessor iAccountAccessor, @InterfaceC5670cr1 Set<Scope> set) {
        Bundle H = H();
        String str = this.t1;
        int i = GoogleApiAvailabilityLight.a;
        Scope[] scopeArr = GetServiceRequest.j1;
        Bundle bundle = new Bundle();
        int i2 = this.r1;
        Feature[] featureArr = GetServiceRequest.k1;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.Y0 = this.c1.getPackageName();
        getServiceRequest.b1 = H;
        if (set != null) {
            getServiceRequest.a1 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account B = B();
            if (B == null) {
                B = new Account("<<default account>>", AccountType.a);
            }
            getServiceRequest.c1 = B;
            if (iAccountAccessor != null) {
                getServiceRequest.Z0 = iAccountAccessor.asBinder();
            }
        } else if (b()) {
            getServiceRequest.c1 = B();
        }
        getServiceRequest.d1 = E1;
        getServiceRequest.e1 = C();
        if (Z()) {
            getServiceRequest.h1 = true;
        }
        try {
            synchronized (this.i1) {
                try {
                    IGmsServiceBroker iGmsServiceBroker = this.j1;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.q5(new zzd(this, this.x1.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            X(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            V(8, null, null, this.x1.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            V(8, null, null, this.x1.get());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(int i, @InterfaceC11300zs1 IInterface iInterface) {
        boolean z;
        boolean z2;
        zzv zzvVar;
        zzv zzvVar2;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        Preconditions.a(z3);
        synchronized (this.h1) {
            try {
                this.o1 = i;
                this.l1 = iInterface;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            Preconditions.r(iInterface);
                            S(iInterface);
                        }
                    } else {
                        zze zzeVar = this.n1;
                        if (zzeVar != null && (zzvVar2 = this.b1) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzvVar2.b() + " on " + zzvVar2.a());
                            GmsClientSupervisor gmsClientSupervisor = this.e1;
                            String b = this.b1.b();
                            Preconditions.r(b);
                            gmsClientSupervisor.m(b, this.b1.a(), 4225, zzeVar, e0(), this.b1.c());
                            this.x1.incrementAndGet();
                        }
                        zze zzeVar2 = new zze(this, this.x1.get());
                        this.n1 = zzeVar2;
                        if (this.o1 == 3 && I() != null) {
                            zzvVar = new zzv(F().getPackageName(), I(), true, 4225, false);
                        } else {
                            zzvVar = new zzv(O(), N(), false, 4225, Q());
                        }
                        this.b1 = zzvVar;
                        if (zzvVar.c() && s() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b1.b())));
                        }
                        GmsClientSupervisor gmsClientSupervisor2 = this.e1;
                        String b2 = this.b1.b();
                        Preconditions.r(b2);
                        if (!gmsClientSupervisor2.n(new zzo(b2, this.b1.a(), 4225, this.b1.c()), zzeVar2, e0(), D())) {
                            Log.w("GmsClient", "unable to connect to service: " + this.b1.b() + " on " + this.b1.a());
                            l0(16, null, this.x1.get());
                        }
                    }
                } else {
                    zze zzeVar3 = this.n1;
                    if (zzeVar3 != null) {
                        GmsClientSupervisor gmsClientSupervisor3 = this.e1;
                        String b3 = this.b1.b();
                        Preconditions.r(b3);
                        gmsClientSupervisor3.m(b3, this.b1.a(), 4225, zzeVar3, e0(), this.b1.c());
                        this.n1 = null;
                    }
                }
            } finally {
            }
        }
    }

    @KeepForSdk
    public void q(@InterfaceC5670cr1 SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    @KeepForSdk
    public int s() {
        return GoogleApiAvailabilityLight.a;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public final Feature[] t() {
        zzk zzkVar = this.w1;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.Y;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String v() {
        return this.a1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Intent w() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @KeepForSdk
    public void x() {
        int k = this.f1.k(this.c1, s());
        if (k != 0) {
            p0(1, null);
            Y(new LegacyClientCallbackAdapter(), k, null);
            return;
        }
        j(new LegacyClientCallbackAdapter());
    }

    @KeepForSdk
    public final void y() {
        if (a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public abstract T z(@InterfaceC5670cr1 IBinder iBinder);

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseGmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, int i, @InterfaceC11300zs1 BaseConnectionCallbacks baseConnectionCallbacks, @InterfaceC11300zs1 BaseOnConnectionFailedListener baseOnConnectionFailedListener, @InterfaceC11300zs1 String str) {
        this(context, looper, r3, r4, i, baseConnectionCallbacks, baseOnConnectionFailedListener, str);
        GmsClientSupervisor e = GmsClientSupervisor.e(context);
        GoogleApiAvailabilityLight i2 = GoogleApiAvailabilityLight.i();
        Preconditions.r(baseConnectionCallbacks);
        Preconditions.r(baseOnConnectionFailedListener);
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public BaseGmsClient(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 GmsClientSupervisor gmsClientSupervisor, @InterfaceC5670cr1 GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, @InterfaceC11300zs1 BaseConnectionCallbacks baseConnectionCallbacks, @InterfaceC11300zs1 BaseOnConnectionFailedListener baseOnConnectionFailedListener, @InterfaceC11300zs1 String str) {
        this.a1 = null;
        this.h1 = new Object();
        this.i1 = new Object();
        this.m1 = new ArrayList();
        this.o1 = 1;
        this.u1 = null;
        this.v1 = false;
        this.w1 = null;
        this.x1 = new AtomicInteger(0);
        Preconditions.s(context, "Context must not be null");
        this.c1 = context;
        Preconditions.s(looper, "Looper must not be null");
        this.d1 = looper;
        Preconditions.s(gmsClientSupervisor, "Supervisor must not be null");
        this.e1 = gmsClientSupervisor;
        Preconditions.s(googleApiAvailabilityLight, "API availability must not be null");
        this.f1 = googleApiAvailabilityLight;
        this.g1 = new zzb(this, looper);
        this.r1 = i;
        this.p1 = baseConnectionCallbacks;
        this.q1 = baseOnConnectionFailedListener;
        this.s1 = str;
    }
}
