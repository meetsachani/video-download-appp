package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zaaj implements zabf {
    public final zabi a;
    public boolean b = false;

    public zaaj(zabi zabiVar) {
        this.a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(@InterfaceC11300zs1 Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.s(new zaai(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e(int i) {
        this.a.e(null);
        this.a.j1.b(i, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T f(T t) {
        h(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean g() {
        if (this.b) {
            return false;
        }
        Set<zada> set = this.a.i1.z;
        if (set != null && !set.isEmpty()) {
            this.b = true;
            for (zada zadaVar : set) {
                zadaVar.k();
            }
            return false;
        }
        this.a.e(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T h(T t) {
        try {
            this.a.i1.A.a(t);
            zabe zabeVar = this.a.i1;
            Api.Client client = zabeVar.r.get(t.y());
            Preconditions.s(client, "Appropriate Api was not requested.");
            if (!client.a() && this.a.b1.containsKey(t.y())) {
                t.b(new Status(17));
                return t;
            }
            t.A(client);
            return t;
        } catch (DeadObjectException unused) {
            this.a.s(new zaah(this, this));
            return t;
        }
    }

    public final void j() {
        if (this.b) {
            this.b = false;
            this.a.i1.A.b();
            g();
        }
    }
}
