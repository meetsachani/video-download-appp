package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import o.InterfaceC10389w71;
import o.InterfaceC10697xN2;
import o.InterfaceC10810xr1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    public final Context a;
    @InterfaceC11300zs1
    public final String b;
    public final Api<O> c;
    public final O d;
    public final ApiKey<O> e;
    public final Looper f;
    public final int g;
    @InterfaceC10810xr1
    public final GoogleApiClient h;
    public final StatusExceptionMapper i;
    @InterfaceC5670cr1
    public final GoogleApiManager j;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Settings {
        @InterfaceC5670cr1
        @KeepForSdk
        public static final Settings c = new Builder().a();
        @InterfaceC5670cr1
        public final StatusExceptionMapper a;
        @InterfaceC5670cr1
        public final Looper b;

        @KeepForSdk
        /* loaded from: classes2.dex */
        public static class Builder {
            public StatusExceptionMapper a;
            public Looper b;

            @InterfaceC5670cr1
            @KeepForSdk
            public Settings a() {
                if (this.a == null) {
                    this.a = new ApiExceptionMapper();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new Settings(this.a, this.b);
            }

            @InterfaceC5670cr1
            @KeepForSdk
            public Builder b(@InterfaceC5670cr1 Looper looper) {
                Preconditions.s(looper, "Looper must not be null.");
                this.b = looper;
                return this;
            }

            @InterfaceC5670cr1
            @KeepForSdk
            public Builder c(@InterfaceC5670cr1 StatusExceptionMapper statusExceptionMapper) {
                Preconditions.s(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.a = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        public Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.a = statusExceptionMapper;
            this.b = looper;
        }
    }

    @KeepForSdk
    @InterfaceC10389w71
    public GoogleApi(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 Settings settings) {
        this(activity, activity, api, o2, settings);
    }

    public final <TResult, A extends Api.AnyClient> Task<TResult> A(int i, @InterfaceC5670cr1 TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.j.K(this, i, taskApiCall, taskCompletionSource, this.i);
        return taskCompletionSource.a();
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @InterfaceC5670cr1
    public final ApiKey<O> c() {
        return this.e;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public GoogleApiClient d() {
        return this.h;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public ClientSettings.Builder e() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount e0;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o2 = this.d;
        if ((o2 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) && (e0 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o2).e0()) != null) {
            account = e0.l0();
        } else {
            O o3 = this.d;
            if (o3 instanceof Api.ApiOptions.HasAccountOptions) {
                account = ((Api.ApiOptions.HasAccountOptions) o3).l0();
            } else {
                account = null;
            }
        }
        builder.d(account);
        O o4 = this.d;
        if (o4 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount e02 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o4).e0();
            if (e02 == null) {
                set = Collections.EMPTY_SET;
            } else {
                set = e02.Z0();
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        builder.c(set);
        builder.e(this.a.getClass().getName());
        builder.b(this.a.getPackageName());
        return builder;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Task<Boolean> f() {
        return this.j.C(this);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T g(@InterfaceC5670cr1 T t) {
        z(2, t);
        return t;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> h(@InterfaceC5670cr1 TaskApiCall<A, TResult> taskApiCall) {
        return A(2, taskApiCall);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T i(@InterfaceC5670cr1 T t) {
        z(0, t);
        return t;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> j(@InterfaceC5670cr1 TaskApiCall<A, TResult> taskApiCall) {
        return A(0, taskApiCall);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> k(@InterfaceC5670cr1 T t, @InterfaceC5670cr1 U u) {
        Preconditions.r(t);
        Preconditions.r(u);
        Preconditions.s(t.b(), "Listener has already been released.");
        Preconditions.s(u.a(), "Listener has already been released.");
        Preconditions.b(Objects.b(t.b(), u.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.j.D(this, t, u, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> l(@InterfaceC5670cr1 RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.r(registrationMethods);
        Preconditions.s(registrationMethods.a.b(), "Listener has already been released.");
        Preconditions.s(registrationMethods.b.a(), "Listener has already been released.");
        return this.j.D(this, registrationMethods.a, registrationMethods.b, registrationMethods.c);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Task<Boolean> m(@InterfaceC5670cr1 ListenerHolder.ListenerKey<?> listenerKey) {
        return n(listenerKey, 0);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Task<Boolean> n(@InterfaceC5670cr1 ListenerHolder.ListenerKey<?> listenerKey, int i) {
        Preconditions.s(listenerKey, "Listener key cannot be null.");
        return this.j.E(this, listenerKey, i);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T o(@InterfaceC5670cr1 T t) {
        z(1, t);
        return t;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> p(@InterfaceC5670cr1 TaskApiCall<A, TResult> taskApiCall) {
        return A(1, taskApiCall);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public O q() {
        return this.d;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Context r() {
        return this.a;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public String s() {
        return this.b;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    @Deprecated
    public String t() {
        return this.b;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Looper u() {
        return this.f;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public <L> ListenerHolder<L> v(@InterfaceC5670cr1 L l, @InterfaceC5670cr1 String str) {
        return ListenerHolders.a(l, this.f, str);
    }

    public final int w() {
        return this.g;
    }

    @InterfaceC10697xN2
    public final Api.Client x(Looper looper, zabq<O> zabqVar) {
        Api.Client c = ((Api.AbstractClientBuilder) Preconditions.r(this.c.a())).c(this.a, looper, e().a(), this.d, zabqVar, zabqVar);
        String s = s();
        if (s != null && (c instanceof BaseGmsClient)) {
            ((BaseGmsClient) c).W(s);
        }
        if (s != null && (c instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) c).z(s);
        }
        return c;
    }

    public final zact y(Context context, Handler handler) {
        return new zact(context, handler, e().a());
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T z(int i, @InterfaceC5670cr1 T t) {
        t.s();
        this.j.J(this, i, t);
        return t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleApi(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 StatusExceptionMapper statusExceptionMapper) {
        this(activity, (Api) api, (Api.ApiOptions) o2, r0.a());
        Settings.Builder builder = new Settings.Builder();
        builder.c(statusExceptionMapper);
        builder.b(activity.getMainLooper());
    }

    public GoogleApi(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 Activity activity, Api<O> api, O o2, Settings settings) {
        Preconditions.s(context, "Null context is not permitted.");
        Preconditions.s(api, "Api must not be null.");
        Preconditions.s(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        String str = null;
        if (PlatformVersion.q()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.b = str;
        this.c = api;
        this.d = o2;
        this.f = settings.b;
        ApiKey<O> a = ApiKey.a(api, o2, str);
        this.e = a;
        this.h = new zabv(this);
        GoogleApiManager z = GoogleApiManager.z(this.a);
        this.j = z;
        this.g = z.n();
        this.i = settings.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.v(activity, z, a);
        }
        z.c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleApi(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o2, r0.a());
        Settings.Builder builder = new Settings.Builder();
        builder.b(looper);
        builder.c(statusExceptionMapper);
    }

    @KeepForSdk
    public GoogleApi(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 Settings settings) {
        this(context, (Activity) null, api, o2, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleApi(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Api<O> api, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o2, r0.a());
        Settings.Builder builder = new Settings.Builder();
        builder.c(statusExceptionMapper);
    }
}
