package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* loaded from: classes3.dex */
public final class zad {
    public static final Api.ClientKey<SignInClientImpl> a;
    @ShowFirstParty
    public static final Api.ClientKey<SignInClientImpl> b;
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> c;
    public static final Api.AbstractClientBuilder<SignInClientImpl, zac> d;
    public static final Scope e;
    public static final Scope f;
    public static final Api<SignInOptions> g;
    public static final Api<zac> h;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        a = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        b = clientKey2;
        zaa zaaVar = new zaa();
        c = zaaVar;
        zab zabVar = new zab();
        d = zabVar;
        e = new Scope(Scopes.a);
        f = new Scope("email");
        g = new Api<>("SignIn.API", zaaVar, clientKey);
        h = new Api<>("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
