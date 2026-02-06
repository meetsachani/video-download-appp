package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.C3228Ie;
import o.InterfaceC10571ws1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ClientSettings {
    @InterfaceC10571ws1
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<Api<?>, zab> d;
    public final int e;
    @InterfaceC10571ws1
    public final View f;
    public final String g;
    public final String h;
    public final SignInOptions i;
    public Integer j;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class Builder {
        @InterfaceC10571ws1
        public Account a;
        public C3228Ie<Scope> b;
        public String c;
        public String d;
        public SignInOptions e = SignInOptions.e1;

        @InterfaceC5670cr1
        @KeepForSdk
        public ClientSettings a() {
            return new ClientSettings(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder b(@InterfaceC5670cr1 String str) {
            this.c = str;
            return this;
        }

        @InterfaceC5670cr1
        public final Builder c(@InterfaceC5670cr1 Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new C3228Ie<>();
            }
            this.b.addAll(collection);
            return this;
        }

        @InterfaceC5670cr1
        public final Builder d(@InterfaceC10571ws1 Account account) {
            this.a = account;
            return this;
        }

        @InterfaceC5670cr1
        public final Builder e(@InterfaceC5670cr1 String str) {
            this.d = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@InterfaceC5670cr1 Account account, @InterfaceC5670cr1 Set<Scope> set, @InterfaceC5670cr1 Map<Api<?>, zab> map, int i, @InterfaceC10571ws1 View view, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC10571ws1 SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static ClientSettings a(@InterfaceC5670cr1 Context context) {
        return new GoogleApiClient.Builder(context).p();
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Account b() {
        return this.a;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    @Deprecated
    public String c() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Account d() {
        Account account = this.a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", AccountType.a);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> e() {
        return this.c;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> f(@InterfaceC5670cr1 Api<?> api) {
        zab zabVar = this.d.get(api);
        if (zabVar != null && !zabVar.a.isEmpty()) {
            HashSet hashSet = new HashSet(this.b);
            hashSet.addAll(zabVar.a);
            return hashSet;
        }
        return this.b;
    }

    @KeepForSdk
    public int g() {
        return this.e;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String h() {
        return this.g;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Set<Scope> i() {
        return this.b;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public View j() {
        return this.f;
    }

    @InterfaceC5670cr1
    public final SignInOptions k() {
        return this.i;
    }

    @InterfaceC11300zs1
    public final Integer l() {
        return this.j;
    }

    @InterfaceC11300zs1
    public final String m() {
        return this.h;
    }

    @InterfaceC5670cr1
    public final Map<Api<?>, zab> n() {
        return this.d;
    }

    public final void o(@InterfaceC5670cr1 Integer num) {
        this.j = num;
    }

    public ClientSettings(@InterfaceC10571ws1 Account account, @InterfaceC5670cr1 Set<Scope> set, @InterfaceC5670cr1 Map<Api<?>, zab> map, int i, @InterfaceC10571ws1 View view, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC10571ws1 SignInOptions signInOptions, boolean z) {
        this.a = account;
        Set<Scope> unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = signInOptions == null ? SignInOptions.e1 : signInOptions;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (zab zabVar : map.values()) {
            hashSet.addAll(zabVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
