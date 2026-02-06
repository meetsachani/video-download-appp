package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class Api<O extends ApiOptions> {
    public final AbstractClientBuilder<?, O> a;
    public final ClientKey<?> b;
    public final String c;

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @InterfaceC5670cr1
        @KeepForSdk
        @Deprecated
        public T c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 ClientSettings clientSettings, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return d(context, looper, clientSettings, o2, connectionCallbacks, onConnectionFailedListener);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public T d(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Looper looper, @InterfaceC5670cr1 ClientSettings clientSettings, @InterfaceC5670cr1 O o2, @InterfaceC5670cr1 ConnectionCallbacks connectionCallbacks, @InterfaceC5670cr1 OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface AnyClient {
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* loaded from: classes2.dex */
    public interface ApiOptions {
        @InterfaceC5670cr1
        public static final NoOptions c = new NoOptions(null);

        /* loaded from: classes2.dex */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @InterfaceC5670cr1
            Account l0();
        }

        /* loaded from: classes2.dex */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @InterfaceC11300zs1
            GoogleSignInAccount e0();
        }

        /* loaded from: classes2.dex */
        public interface HasOptions extends ApiOptions {
        }

        /* loaded from: classes2.dex */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            public /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        /* loaded from: classes2.dex */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* loaded from: classes2.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        public static final int a = 1;
        @KeepForSdk
        public static final int b = 2;
        @KeepForSdk
        public static final int c = Integer.MAX_VALUE;

        @InterfaceC5670cr1
        @KeepForSdk
        public List<Scope> a(@InterfaceC11300zs1 O o2) {
            return Collections.EMPTY_LIST;
        }

        @KeepForSdk
        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Client extends AnyClient {
        @KeepForSdk
        boolean a();

        @KeepForSdk
        boolean b();

        @KeepForSdk
        void c();

        @KeepForSdk
        void dump(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 FileDescriptor fileDescriptor, @InterfaceC5670cr1 PrintWriter printWriter, @InterfaceC11300zs1 String[] strArr);

        @KeepForSdk
        boolean e();

        @KeepForSdk
        void g(@InterfaceC5670cr1 String str);

        @KeepForSdk
        boolean h();

        @InterfaceC5670cr1
        @KeepForSdk
        String i();

        @KeepForSdk
        void j(@InterfaceC5670cr1 BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @InterfaceC5670cr1
        @KeepForSdk
        Feature[] k();

        @KeepForSdk
        boolean l();

        @KeepForSdk
        boolean m();

        @InterfaceC11300zs1
        @KeepForSdk
        IBinder n();

        @InterfaceC5670cr1
        @KeepForSdk
        Set<Scope> o();

        @KeepForSdk
        void p(@InterfaceC11300zs1 IAccountAccessor iAccountAccessor, @InterfaceC11300zs1 Set<Scope> set);

        @KeepForSdk
        void q(@InterfaceC5670cr1 BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        int s();

        @InterfaceC5670cr1
        @KeepForSdk
        Feature[] t();

        @InterfaceC11300zs1
        @KeepForSdk
        String v();

        @InterfaceC5670cr1
        @KeepForSdk
        Intent w();
    }

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public <C extends Client> Api(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 AbstractClientBuilder<C, O> abstractClientBuilder, @InterfaceC5670cr1 ClientKey<C> clientKey) {
        Preconditions.s(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.s(clientKey, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abstractClientBuilder;
        this.b = clientKey;
    }

    @InterfaceC5670cr1
    public final AbstractClientBuilder<?, O> a() {
        return this.a;
    }

    @InterfaceC5670cr1
    public final AnyClientKey<?> b() {
        return this.b;
    }

    @InterfaceC5670cr1
    public final BaseClientBuilder<?, O> c() {
        return this.a;
    }

    @InterfaceC5670cr1
    public final String d() {
        return this.c;
    }
}
