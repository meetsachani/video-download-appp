package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3228Ie;
import o.InterfaceC10697xN2;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC8223nF0;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiManager implements Handler.Callback {
    @InterfaceC5670cr1
    public static final Status m1 = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status n1 = new Status(4, "The user must be signed in to make this API call.");
    public static final Object o1 = new Object();
    @InterfaceC11300zs1
    @InterfaceC8223nF0("lock")
    public static GoogleApiManager p1;
    @InterfaceC11300zs1
    public TelemetryData Z0;
    @InterfaceC11300zs1
    public TelemetryLoggingClient a1;
    public final Context b1;
    public final GoogleApiAvailability c1;
    public final com.google.android.gms.common.internal.zal d1;
    @InterfaceC10810xr1
    public final Handler k1;
    public volatile boolean l1;
    public long X = 5000;
    public long Y = 120000;
    public long Z = 10000;
    public boolean Y0 = false;
    public final AtomicInteger e1 = new AtomicInteger(1);
    public final AtomicInteger f1 = new AtomicInteger(0);
    public final Map<ApiKey<?>, zabq<?>> g1 = new ConcurrentHashMap(5, 0.75f, 1);
    @InterfaceC11300zs1
    @InterfaceC8223nF0("lock")
    public zaae h1 = null;
    @InterfaceC8223nF0("lock")
    public final Set<ApiKey<?>> i1 = new C3228Ie();
    public final Set<ApiKey<?>> j1 = new C3228Ie();

    @KeepForSdk
    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.l1 = true;
        this.b1 = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.k1 = zaqVar;
        this.c1 = googleApiAvailability;
        this.d1 = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.a(context)) {
            this.l1 = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    @KeepForSdk
    public static void a() {
        synchronized (o1) {
            try {
                GoogleApiManager googleApiManager = p1;
                if (googleApiManager != null) {
                    googleApiManager.f1.incrementAndGet();
                    Handler handler = googleApiManager.k1;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status i(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String b = apiKey.b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    @InterfaceC5670cr1
    public static GoogleApiManager y() {
        GoogleApiManager googleApiManager;
        synchronized (o1) {
            Preconditions.s(p1, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = p1;
        }
        return googleApiManager;
    }

    @InterfaceC5670cr1
    public static GoogleApiManager z(@InterfaceC5670cr1 Context context) {
        GoogleApiManager googleApiManager;
        synchronized (o1) {
            try {
                if (p1 == null) {
                    p1 = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.f().getLooper(), GoogleApiAvailability.x());
                }
                googleApiManager = p1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    @InterfaceC5670cr1
    public final Task<Map<ApiKey<?>, String>> B(@InterfaceC5670cr1 Iterable<? extends HasApiKey<?>> iterable) {
        zal zalVar = new zal(iterable);
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.a();
    }

    @InterfaceC5670cr1
    public final Task<Boolean> C(@InterfaceC5670cr1 GoogleApi<?> googleApi) {
        zaaf zaafVar = new zaaf(googleApi.c());
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(14, zaafVar));
        return zaafVar.b().a();
    }

    @InterfaceC5670cr1
    public final <O extends Api.ApiOptions> Task<Void> D(@InterfaceC5670cr1 GoogleApi<O> googleApi, @InterfaceC5670cr1 RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @InterfaceC5670cr1 UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @InterfaceC5670cr1 Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(taskCompletionSource, registerListenerMethod.e(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(8, new zach(zafVar, this.f1.get(), googleApi)));
        return taskCompletionSource.a();
    }

    @InterfaceC5670cr1
    public final <O extends Api.ApiOptions> Task<Boolean> E(@InterfaceC5670cr1 GoogleApi<O> googleApi, @InterfaceC5670cr1 ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(taskCompletionSource, i, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(13, new zach(zahVar, this.f1.get(), googleApi)));
        return taskCompletionSource.a();
    }

    public final <O extends Api.ApiOptions> void J(@InterfaceC5670cr1 GoogleApi<O> googleApi, int i, @InterfaceC5670cr1 BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i, apiMethodImpl);
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, this.f1.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void K(@InterfaceC5670cr1 GoogleApi<O> googleApi, int i, @InterfaceC5670cr1 TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @InterfaceC5670cr1 TaskCompletionSource<ResultT> taskCompletionSource, @InterfaceC5670cr1 StatusExceptionMapper statusExceptionMapper) {
        m(taskCompletionSource, taskApiCall.d(), googleApi);
        zag zagVar = new zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(4, new zach(zagVar, this.f1.get(), googleApi)));
    }

    public final void L(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i, j, i2)));
    }

    public final void M(@InterfaceC5670cr1 ConnectionResult connectionResult, int i) {
        if (!h(connectionResult, i)) {
            Handler handler = this.k1;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void b() {
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(@InterfaceC5670cr1 GoogleApi<?> googleApi) {
        Handler handler = this.k1;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void d(@InterfaceC5670cr1 zaae zaaeVar) {
        synchronized (o1) {
            try {
                if (this.h1 != zaaeVar) {
                    this.h1 = zaaeVar;
                    this.i1.clear();
                }
                this.i1.addAll(zaaeVar.u());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(@InterfaceC5670cr1 zaae zaaeVar) {
        synchronized (o1) {
            try {
                if (this.h1 == zaaeVar) {
                    this.h1 = null;
                    this.i1.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC10697xN2
    public final boolean g() {
        if (this.Y0) {
            return false;
        }
        RootTelemetryConfiguration a = RootTelemetryConfigManager.b().a();
        if (a != null && !a.E0()) {
            return false;
        }
        int a2 = this.d1.a(this.b1, 203400000);
        if (a2 != -1 && a2 != 0) {
            return false;
        }
        return true;
    }

    public final boolean h(ConnectionResult connectionResult, int i) {
        return this.c1.L(this.b1, connectionResult, i);
    }

    @Override // android.os.Handler.Callback
    @InterfaceC10697xN2
    public final boolean handleMessage(@InterfaceC5670cr1 Message message) {
        int i = message.what;
        long j = 300000;
        zabq<?> zabqVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.Z = j;
                this.k1.removeMessages(12);
                for (ApiKey<?> apiKey : this.g1.keySet()) {
                    Handler handler = this.k1;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.Z);
                }
                break;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator<ApiKey<?>> it = zalVar.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey<?> next = it.next();
                        zabq<?> zabqVar2 = this.g1.get(next);
                        if (zabqVar2 == null) {
                            zalVar.c(next, new ConnectionResult(13), null);
                            break;
                        } else if (zabqVar2.L()) {
                            zalVar.c(next, ConnectionResult.y1, zabqVar2.s().i());
                        } else {
                            ConnectionResult q = zabqVar2.q();
                            if (q != null) {
                                zalVar.c(next, q, null);
                            } else {
                                zabqVar2.G(zalVar);
                                zabqVar2.B();
                            }
                        }
                    }
                }
            case 3:
                for (zabq<?> zabqVar3 : this.g1.values()) {
                    zabqVar3.A();
                    zabqVar3.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVar4 = this.g1.get(zachVar.c.c());
                if (zabqVar4 == null) {
                    zabqVar4 = j(zachVar.c);
                }
                if (zabqVar4.M() && this.f1.get() != zachVar.b) {
                    zachVar.a.a(m1);
                    zabqVar4.I();
                    break;
                } else {
                    zabqVar4.C(zachVar.a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zabq<?>> it2 = this.g1.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq<?> next2 = it2.next();
                        if (next2.o() == i2) {
                            zabqVar = next2;
                        }
                    }
                }
                if (zabqVar != null) {
                    if (connectionResult.m0() == 13) {
                        String h = this.c1.h(connectionResult.m0());
                        String B0 = connectionResult.B0();
                        StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 69 + String.valueOf(B0).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(h);
                        sb.append(": ");
                        sb.append(B0);
                        zabq.v(zabqVar, new Status(17, sb.toString()));
                        break;
                    } else {
                        zabq.v(zabqVar, i(zabq.t(zabqVar), connectionResult));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.b1.getApplicationContext() instanceof Application) {
                    BackgroundDetector.c((Application) this.b1.getApplicationContext());
                    BackgroundDetector.b().a(new zabl(this));
                    if (!BackgroundDetector.b().e(true)) {
                        this.Z = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                j((GoogleApi) message.obj);
                break;
            case 9:
                if (this.g1.containsKey(message.obj)) {
                    this.g1.get(message.obj).H();
                    break;
                }
                break;
            case 10:
                for (ApiKey<?> apiKey2 : this.j1) {
                    zabq<?> remove = this.g1.remove(apiKey2);
                    if (remove != null) {
                        remove.I();
                    }
                }
                this.j1.clear();
                break;
            case 11:
                if (this.g1.containsKey(message.obj)) {
                    this.g1.get(message.obj).J();
                    break;
                }
                break;
            case 12:
                if (this.g1.containsKey(message.obj)) {
                    this.g1.get(message.obj).a();
                    break;
                }
                break;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey<?> a = zaafVar.a();
                if (!this.g1.containsKey(a)) {
                    zaafVar.b().c(Boolean.FALSE);
                    break;
                } else {
                    zaafVar.b().c(Boolean.valueOf(zabq.K(this.g1.get(a), false)));
                    break;
                }
            case 15:
                zabs zabsVar = (zabs) message.obj;
                if (this.g1.containsKey(zabs.b(zabsVar))) {
                    zabq.y(this.g1.get(zabs.b(zabsVar)), zabsVar);
                    break;
                }
                break;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                if (this.g1.containsKey(zabs.b(zabsVar2))) {
                    zabq.z(this.g1.get(zabs.b(zabsVar2)), zabsVar2);
                    break;
                }
                break;
            case 17:
                l();
                break;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.c == 0) {
                    k().a(new TelemetryData(zaceVar.b, Arrays.asList(zaceVar.a)));
                    break;
                } else {
                    TelemetryData telemetryData = this.Z0;
                    if (telemetryData != null) {
                        List<MethodInvocation> m0 = telemetryData.m0();
                        if (telemetryData.d() == zaceVar.b && (m0 == null || m0.size() < zaceVar.d)) {
                            this.Z0.B0(zaceVar.a);
                        } else {
                            this.k1.removeMessages(17);
                            l();
                        }
                    }
                    if (this.Z0 == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.a);
                        this.Z0 = new TelemetryData(zaceVar.b, arrayList);
                        Handler handler2 = this.k1;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.c);
                        break;
                    }
                }
                break;
            case 19:
                this.Y0 = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    @InterfaceC10697xN2
    public final zabq<?> j(GoogleApi<?> googleApi) {
        ApiKey<?> c = googleApi.c();
        zabq<?> zabqVar = this.g1.get(c);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            this.g1.put(c, zabqVar);
        }
        if (zabqVar.M()) {
            this.j1.add(c);
        }
        zabqVar.B();
        return zabqVar;
    }

    @InterfaceC10697xN2
    public final TelemetryLoggingClient k() {
        if (this.a1 == null) {
            this.a1 = TelemetryLogging.a(this.b1);
        }
        return this.a1;
    }

    @InterfaceC10697xN2
    public final void l() {
        TelemetryData telemetryData = this.Z0;
        if (telemetryData != null) {
            if (telemetryData.d() > 0 || g()) {
                k().a(telemetryData);
            }
            this.Z0 = null;
        }
    }

    public final <T> void m(TaskCompletionSource<T> taskCompletionSource, int i, GoogleApi googleApi) {
        zacd b;
        if (i != 0 && (b = zacd.b(this, i, googleApi.c())) != null) {
            Task<T> a = taskCompletionSource.a();
            final Handler handler = this.k1;
            handler.getClass();
            a.f(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b);
        }
    }

    public final int n() {
        return this.e1.getAndIncrement();
    }

    @InterfaceC11300zs1
    public final zabq x(ApiKey<?> apiKey) {
        return this.g1.get(apiKey);
    }
}
