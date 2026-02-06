package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import o.C2531Be;
import o.C6566gU0;
import o.InterfaceC10697xN2;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {
    @InterfaceC10810xr1
    public final Api.Client Y;
    public final zaad Y0;
    public final ApiKey<O> Z;
    public final int b1;
    @InterfaceC11300zs1
    public final zact c1;
    public boolean d1;
    public final /* synthetic */ GoogleApiManager h1;
    public final Queue<zai> X = new LinkedList();
    public final Set<zal> Z0 = new HashSet();
    public final Map<ListenerHolder.ListenerKey<?>, zaci> a1 = new HashMap();
    public final List<zabs> e1 = new ArrayList();
    @InterfaceC11300zs1
    public ConnectionResult f1 = null;
    public int g1 = 0;

    @InterfaceC10697xN2
    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        Handler handler;
        Context context;
        Handler handler2;
        this.h1 = googleApiManager;
        handler = googleApiManager.k1;
        Api.Client x = googleApi.x(handler.getLooper(), this);
        this.Y = x;
        this.Z = googleApi.c();
        this.Y0 = new zaad();
        this.b1 = googleApi.w();
        if (x.m()) {
            context = googleApiManager.b1;
            handler2 = googleApiManager.k1;
            this.c1 = googleApi.y(context, handler2);
            return;
        }
        this.c1 = null;
    }

    public static /* bridge */ /* synthetic */ boolean K(zabq zabqVar, boolean z) {
        return zabqVar.n(false);
    }

    public static /* bridge */ /* synthetic */ ApiKey t(zabq zabqVar) {
        return zabqVar.Z;
    }

    public static /* bridge */ /* synthetic */ void v(zabq zabqVar, Status status) {
        zabqVar.d(status);
    }

    public static /* bridge */ /* synthetic */ void y(zabq zabqVar, zabs zabsVar) {
        if (zabqVar.e1.contains(zabsVar) && !zabqVar.d1) {
            if (!zabqVar.Y.a()) {
                zabqVar.B();
            } else {
                zabqVar.f();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(zabq zabqVar, zabs zabsVar) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] g;
        if (zabqVar.e1.remove(zabsVar)) {
            handler = zabqVar.h1.k1;
            handler.removeMessages(15, zabsVar);
            handler2 = zabqVar.h1.k1;
            handler2.removeMessages(16, zabsVar);
            feature = zabsVar.b;
            ArrayList arrayList = new ArrayList(zabqVar.X.size());
            for (zai zaiVar : zabqVar.X) {
                if ((zaiVar instanceof zac) && (g = ((zac) zaiVar).g(zabqVar)) != null && ArrayUtils.d(g, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zaiVar2 = (zai) arrayList.get(i);
                zabqVar.X.remove(zaiVar2);
                zaiVar2.b(new UnsupportedApiCallException(feature));
            }
        }
    }

    @InterfaceC10697xN2
    public final void A() {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        this.f1 = null;
    }

    @InterfaceC10697xN2
    public final void B() {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        Context context;
        handler = this.h1.k1;
        Preconditions.h(handler);
        if (!this.Y.a() && !this.Y.h()) {
            try {
                GoogleApiManager googleApiManager = this.h1;
                zalVar = googleApiManager.d1;
                context = googleApiManager.b1;
                int b = zalVar.b(context, this.Y);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, null);
                    String name = this.Y.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    E(connectionResult, null);
                    return;
                }
                GoogleApiManager googleApiManager2 = this.h1;
                Api.Client client = this.Y;
                zabu zabuVar = new zabu(googleApiManager2, client, this.Z);
                if (client.m()) {
                    ((zact) Preconditions.r(this.c1)).s7(zabuVar);
                }
                try {
                    this.Y.j(zabuVar);
                } catch (SecurityException e) {
                    E(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                E(new ConnectionResult(10), e2);
            }
        }
    }

    @InterfaceC10697xN2
    public final void C(zai zaiVar) {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        if (this.Y.a()) {
            if (l(zaiVar)) {
                i();
                return;
            } else {
                this.X.add(zaiVar);
                return;
            }
        }
        this.X.add(zaiVar);
        ConnectionResult connectionResult = this.f1;
        if (connectionResult != null && connectionResult.G0()) {
            E(this.f1, null);
        } else {
            B();
        }
    }

    @InterfaceC10697xN2
    public final void D() {
        this.g1++;
    }

    @InterfaceC10697xN2
    public final void E(@InterfaceC5670cr1 ConnectionResult connectionResult, @InterfaceC11300zs1 Exception exc) {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        boolean z;
        Status i;
        Status i2;
        Status i3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.h1.k1;
        Preconditions.h(handler);
        zact zactVar = this.c1;
        if (zactVar != null) {
            zactVar.S7();
        }
        A();
        zalVar = this.h1.d1;
        zalVar.c();
        c(connectionResult);
        if ((this.Y instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.m0() != 24) {
            this.h1.Y0 = true;
            GoogleApiManager googleApiManager = this.h1;
            handler5 = googleApiManager.k1;
            handler6 = googleApiManager.k1;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.m0() == 4) {
            status = GoogleApiManager.n1;
            d(status);
        } else if (this.X.isEmpty()) {
            this.f1 = connectionResult;
        } else if (exc != null) {
            handler4 = this.h1.k1;
            Preconditions.h(handler4);
            e(null, exc, false);
        } else {
            z = this.h1.l1;
            if (z) {
                i2 = GoogleApiManager.i(this.Z, connectionResult);
                e(i2, null, true);
                if (!this.X.isEmpty() && !m(connectionResult) && !this.h1.h(connectionResult, this.b1)) {
                    if (connectionResult.m0() == 18) {
                        this.d1 = true;
                    }
                    if (!this.d1) {
                        i3 = GoogleApiManager.i(this.Z, connectionResult);
                        d(i3);
                        return;
                    }
                    GoogleApiManager googleApiManager2 = this.h1;
                    handler2 = googleApiManager2.k1;
                    handler3 = googleApiManager2.k1;
                    Message obtain = Message.obtain(handler3, 9, this.Z);
                    j = this.h1.X;
                    handler2.sendMessageDelayed(obtain, j);
                    return;
                }
                return;
            }
            i = GoogleApiManager.i(this.Z, connectionResult);
            d(i);
        }
    }

    @InterfaceC10697xN2
    public final void F(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        Api.Client client = this.Y;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        client.g(sb.toString());
        E(connectionResult, null);
    }

    @InterfaceC10697xN2
    public final void G(zal zalVar) {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        this.Z0.add(zalVar);
    }

    @InterfaceC10697xN2
    public final void H() {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        if (this.d1) {
            B();
        }
    }

    @InterfaceC10697xN2
    public final void I() {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        d(GoogleApiManager.m1);
        this.Y0.f();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.a1.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            C(new zah(listenerKey, new TaskCompletionSource()));
        }
        c(new ConnectionResult(4));
        if (this.Y.a()) {
            this.Y.q(new zabp(this));
        }
    }

    @InterfaceC10697xN2
    public final void J() {
        Handler handler;
        GoogleApiAvailability googleApiAvailability;
        Context context;
        Status status;
        handler = this.h1.k1;
        Preconditions.h(handler);
        if (this.d1) {
            k();
            GoogleApiManager googleApiManager = this.h1;
            googleApiAvailability = googleApiManager.c1;
            context = googleApiManager.b1;
            if (googleApiAvailability.j(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            d(status);
            this.Y.g("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.Y.a();
    }

    public final boolean M() {
        return this.Y.m();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.h1.k1;
        if (myLooper != handler.getLooper()) {
            handler2 = this.h1.k1;
            handler2.post(new zabm(this));
            return;
        }
        g();
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void V3(ConnectionResult connectionResult, Api<?> api, boolean z) {
        throw null;
    }

    @InterfaceC10697xN2
    public final boolean a() {
        return n(true);
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final Feature b(@InterfaceC11300zs1 Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] t = this.Y.t();
            if (t == null) {
                t = new Feature[0];
            }
            C2531Be c2531Be = new C2531Be(t.length);
            for (Feature feature : t) {
                c2531Be.put(feature.m0(), Long.valueOf(feature.B0()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c2531Be.get(feature2.m0());
                if (l == null || l.longValue() < feature2.B0()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @InterfaceC10697xN2
    public final void c(ConnectionResult connectionResult) {
        String str;
        for (zal zalVar : this.Z0) {
            if (Objects.b(connectionResult, ConnectionResult.y1)) {
                str = this.Y.i();
            } else {
                str = null;
            }
            zalVar.c(this.Z, connectionResult, str);
        }
        this.Z0.clear();
    }

    @InterfaceC10697xN2
    public final void d(Status status) {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        e(status, null, false);
    }

    @InterfaceC10697xN2
    public final void e(@InterfaceC11300zs1 Status status, @InterfaceC11300zs1 Exception exc, boolean z) {
        Handler handler;
        boolean z2;
        handler = this.h1.k1;
        Preconditions.h(handler);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator<zai> it = this.X.iterator();
            while (it.hasNext()) {
                zai next = it.next();
                if (!z || next.a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @InterfaceC10697xN2
    public final void f() {
        ArrayList arrayList = new ArrayList(this.X);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (this.Y.a()) {
                if (l(zaiVar)) {
                    this.X.remove(zaiVar);
                }
            } else {
                return;
            }
        }
    }

    @InterfaceC10697xN2
    public final void g() {
        A();
        c(ConnectionResult.y1);
        k();
        Iterator<zaci> it = this.a1.values().iterator();
        while (it.hasNext()) {
            zaci next = it.next();
            if (b(next.a.c()) != null) {
                it.remove();
            } else {
                try {
                    next.a.d(this.Y, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    g1(3);
                    this.Y.g("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        i();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g1(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.h1.k1;
        if (myLooper != handler.getLooper()) {
            handler2 = this.h1.k1;
            handler2.post(new zabn(this, i));
            return;
        }
        h(i);
    }

    @InterfaceC10697xN2
    public final void h(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        com.google.android.gms.common.internal.zal zalVar;
        A();
        this.d1 = true;
        this.Y0.e(i, this.Y.v());
        GoogleApiManager googleApiManager = this.h1;
        handler = googleApiManager.k1;
        handler2 = googleApiManager.k1;
        Message obtain = Message.obtain(handler2, 9, this.Z);
        j = this.h1.X;
        handler.sendMessageDelayed(obtain, j);
        GoogleApiManager googleApiManager2 = this.h1;
        handler3 = googleApiManager2.k1;
        handler4 = googleApiManager2.k1;
        Message obtain2 = Message.obtain(handler4, 11, this.Z);
        j2 = this.h1.Y;
        handler3.sendMessageDelayed(obtain2, j2);
        zalVar = this.h1.d1;
        zalVar.c();
        for (zaci zaciVar : this.a1.values()) {
            zaciVar.c.run();
        }
    }

    public final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.h1.k1;
        handler.removeMessages(12, this.Z);
        GoogleApiManager googleApiManager = this.h1;
        handler2 = googleApiManager.k1;
        handler3 = googleApiManager.k1;
        Message obtainMessage = handler3.obtainMessage(12, this.Z);
        j = this.h1.Z;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    @InterfaceC10697xN2
    public final void j(zai zaiVar) {
        zaiVar.d(this.Y0, M());
        try {
            zaiVar.c(this);
        } catch (DeadObjectException unused) {
            g1(1);
            this.Y.g("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @InterfaceC10697xN2
    public final void k() {
        Handler handler;
        Handler handler2;
        if (this.d1) {
            handler = this.h1.k1;
            handler.removeMessages(11, this.Z);
            handler2 = this.h1.k1;
            handler2.removeMessages(9, this.Z);
            this.d1 = false;
        }
    }

    @InterfaceC10697xN2
    public final boolean l(zai zaiVar) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(zaiVar instanceof zac)) {
            j(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature b = b(zacVar.g(this));
        if (b == null) {
            j(zaiVar);
            return true;
        }
        String name = this.Y.getClass().getName();
        String m0 = b.m0();
        long B0 = b.B0();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(m0).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(m0);
        sb.append(C6566gU0.h);
        sb.append(B0);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        z = this.h1.l1;
        if (z && zacVar.f(this)) {
            zabs zabsVar = new zabs(this.Z, b, null);
            int indexOf = this.e1.indexOf(zabsVar);
            if (indexOf >= 0) {
                zabs zabsVar2 = this.e1.get(indexOf);
                handler5 = this.h1.k1;
                handler5.removeMessages(15, zabsVar2);
                GoogleApiManager googleApiManager = this.h1;
                handler6 = googleApiManager.k1;
                handler7 = googleApiManager.k1;
                Message obtain = Message.obtain(handler7, 15, zabsVar2);
                j3 = this.h1.X;
                handler6.sendMessageDelayed(obtain, j3);
                return false;
            }
            this.e1.add(zabsVar);
            GoogleApiManager googleApiManager2 = this.h1;
            handler = googleApiManager2.k1;
            handler2 = googleApiManager2.k1;
            Message obtain2 = Message.obtain(handler2, 15, zabsVar);
            j = this.h1.X;
            handler.sendMessageDelayed(obtain2, j);
            GoogleApiManager googleApiManager3 = this.h1;
            handler3 = googleApiManager3.k1;
            handler4 = googleApiManager3.k1;
            Message obtain3 = Message.obtain(handler4, 16, zabsVar);
            j2 = this.h1.Y;
            handler3.sendMessageDelayed(obtain3, j2);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!m(connectionResult)) {
                this.h1.h(connectionResult, this.b1);
                return false;
            }
            return false;
        }
        zacVar.b(new UnsupportedApiCallException(b));
        return true;
    }

    @InterfaceC10697xN2
    public final boolean m(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Object obj;
        zaae zaaeVar;
        Set set;
        zaae zaaeVar2;
        obj = GoogleApiManager.o1;
        synchronized (obj) {
            try {
                GoogleApiManager googleApiManager = this.h1;
                zaaeVar = googleApiManager.h1;
                if (zaaeVar != null) {
                    set = googleApiManager.i1;
                    if (set.contains(this.Z)) {
                        zaaeVar2 = this.h1.h1;
                        zaaeVar2.t(connectionResult, this.b1);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10697xN2
    public final boolean n(boolean z) {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        if (!this.Y.a() || this.a1.size() != 0) {
            return false;
        }
        if (this.Y0.g()) {
            if (z) {
                i();
            }
            return false;
        }
        this.Y.g("Timing out service connection.");
        return true;
    }

    public final int o() {
        return this.b1;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @InterfaceC10697xN2
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        E(connectionResult, null);
    }

    @InterfaceC10697xN2
    public final int p() {
        return this.g1;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final ConnectionResult q() {
        Handler handler;
        handler = this.h1.k1;
        Preconditions.h(handler);
        return this.f1;
    }

    public final Api.Client s() {
        return this.Y;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zaci> u() {
        return this.a1;
    }
}
