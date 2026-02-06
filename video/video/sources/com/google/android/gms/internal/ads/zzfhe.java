package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfhe implements zzfhc {
    public final Context a;
    public final int p;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int q = 2;
    public int r = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public zzfhs j = zzfhs.SCAR_REQUEST_TYPE_UNSPECIFIED;
    public String k = "";
    public String l = "";
    public String m = "";
    public boolean n = false;

    /* renamed from: o */
    public boolean f281o = false;

    public zzfhe(Context context, int i) {
        this.a = context;
        this.p = i;
    }

    public static /* bridge */ /* synthetic */ int A(zzfhe zzfheVar) {
        return zzfheVar.e;
    }

    public static /* bridge */ /* synthetic */ long B(zzfhe zzfheVar) {
        return zzfheVar.b;
    }

    public static /* bridge */ /* synthetic */ long C(zzfhe zzfheVar) {
        return zzfheVar.c;
    }

    public static /* bridge */ /* synthetic */ zzfhs h(zzfhe zzfheVar) {
        return zzfheVar.j;
    }

    public static /* bridge */ /* synthetic */ String n(zzfhe zzfheVar) {
        return zzfheVar.g;
    }

    public static /* bridge */ /* synthetic */ String o(zzfhe zzfheVar) {
        return zzfheVar.m;
    }

    public static /* bridge */ /* synthetic */ String p(zzfhe zzfheVar) {
        return zzfheVar.f;
    }

    public static /* bridge */ /* synthetic */ String q(zzfhe zzfheVar) {
        return zzfheVar.h;
    }

    public static /* bridge */ /* synthetic */ String r(zzfhe zzfheVar) {
        return zzfheVar.i;
    }

    public static /* bridge */ /* synthetic */ String s(zzfhe zzfheVar) {
        return zzfheVar.l;
    }

    public static /* bridge */ /* synthetic */ String t(zzfhe zzfheVar) {
        return zzfheVar.k;
    }

    public static /* bridge */ /* synthetic */ boolean v(zzfhe zzfheVar) {
        return zzfheVar.d;
    }

    public static /* bridge */ /* synthetic */ int x(zzfhe zzfheVar) {
        return zzfheVar.p;
    }

    public static /* bridge */ /* synthetic */ int y(zzfhe zzfheVar) {
        return zzfheVar.q;
    }

    public static /* bridge */ /* synthetic */ int z(zzfhe zzfheVar) {
        return zzfheVar.r;
    }

    public final synchronized zzfhe D(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.Z0;
            if (iBinder != null) {
                zzcvm zzcvmVar = (zzcvm) iBinder;
                String l = zzcvmVar.l();
                if (!TextUtils.isEmpty(l)) {
                    this.f = l;
                }
                String i = zzcvmVar.i();
                if (!TextUtils.isEmpty(i)) {
                    this.g = i;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002a, code lost:
        r2.g = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfhe E(zzfcf zzfcfVar) {
        try {
            String str = zzfcfVar.b.b;
            if (!TextUtils.isEmpty(str)) {
                this.f = str;
            }
            Iterator it = zzfcfVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = ((zzfbu) it.next()).b0;
                if (!TextUtils.isEmpty(str2)) {
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhe F(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e9)).booleanValue()) {
            this.m = str;
        }
        return this;
    }

    public final synchronized zzfhe G(String str) {
        this.h = str;
        return this;
    }

    public final synchronized zzfhe H(String str) {
        this.i = str;
        return this;
    }

    public final synchronized zzfhe I(zzfhs zzfhsVar) {
        this.j = zzfhsVar;
        return this;
    }

    public final synchronized zzfhe J(boolean z) {
        this.d = z;
        return this;
    }

    public final synchronized zzfhe K(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e9)).booleanValue()) {
            this.l = zzbui.h(th);
            this.k = (String) zzfvr.b(zzfun.c('\n')).d(zzbui.g(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfhe L() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzaa w = com.google.android.gms.ads.internal.zzv.w();
        Context context = this.a;
        this.e = w.k(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.r = i;
        this.b = com.google.android.gms.ads.internal.zzv.d().b();
        this.f281o = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc Q(String str) {
        F(str);
        return this;
    }

    public final synchronized zzfhe a() {
        this.c = com.google.android.gms.ads.internal.zzv.d().b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc b(int i) {
        w(i);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc c(boolean z) {
        J(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc d(zzfhs zzfhsVar) {
        I(zzfhsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc e(zzfcf zzfcfVar) {
        E(zzfcfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc f(Throwable th) {
        K(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc g(com.google.android.gms.ads.internal.client.zze zzeVar) {
        D(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc i() {
        L();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc j() {
        a();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final synchronized boolean k() {
        return this.f281o;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final boolean l() {
        if (!TextUtils.isEmpty(this.h)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    @InterfaceC11300zs1
    public final synchronized zzfhg m() {
        try {
            if (this.n) {
                return null;
            }
            this.n = true;
            if (!this.f281o) {
                L();
            }
            if (this.c < 0) {
                a();
            }
            return new zzfhg(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc p0(String str) {
        G(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final /* bridge */ /* synthetic */ zzfhc u(String str) {
        H(str);
        return this;
    }

    public final synchronized zzfhe w(int i) {
        this.q = i;
        return this;
    }
}
