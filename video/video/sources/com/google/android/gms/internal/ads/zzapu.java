package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import o.C4500Ve2;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public abstract class zzapu implements Comparable {
    public final zzaqf X;
    public final int Y;
    public final int Y0;
    public final String Z;
    public final Object Z0;
    @InterfaceC8710pF0("mLock")
    @InterfaceC11300zs1
    public final zzapy a1;
    public Integer b1;
    public zzapx c1;
    @InterfaceC8710pF0("mLock")
    public boolean d1;
    @InterfaceC11300zs1
    public zzapd e1;
    @InterfaceC8710pF0("mLock")
    public zzapt f1;
    public final zzapi g1;

    public zzapu(int i, String str, @InterfaceC11300zs1 zzapy zzapyVar) {
        zzaqf zzaqfVar;
        Uri parse;
        String host;
        if (zzaqf.c) {
            zzaqfVar = new zzaqf();
        } else {
            zzaqfVar = null;
        }
        this.X = zzaqfVar;
        this.Z0 = new Object();
        int i2 = 0;
        this.d1 = false;
        this.e1 = null;
        this.Y = i;
        this.Z = str;
        this.a1 = zzapyVar;
        this.g1 = new zzapi();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.Y0 = i2;
    }

    public final boolean A() {
        boolean z;
        synchronized (this.Z0) {
            z = this.d1;
        }
        return z;
    }

    public final boolean B() {
        synchronized (this.Z0) {
        }
        return false;
    }

    public byte[] C() throws zzapc {
        return null;
    }

    public final zzapi D() {
        return this.g1;
    }

    public final int a() {
        return this.Y;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b1.intValue() - ((zzapu) obj).b1.intValue();
    }

    public final int e() {
        return this.g1.b();
    }

    public final int g() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    public final zzapd h() {
        return this.e1;
    }

    public final zzapu i(zzapd zzapdVar) {
        this.e1 = zzapdVar;
        return this;
    }

    public final zzapu j(zzapx zzapxVar) {
        this.c1 = zzapxVar;
        return this;
    }

    public final zzapu l(int i) {
        this.b1 = Integer.valueOf(i);
        return this;
    }

    public abstract zzaqa m(zzapq zzapqVar);

    public final String o() {
        int i = this.Y;
        String str = this.Z;
        if (i != 0) {
            String num = Integer.toString(1);
            return num + "-" + str;
        }
        return str;
    }

    public final String p() {
        return this.Z;
    }

    public Map q() throws zzapc {
        return Collections.EMPTY_MAP;
    }

    public final void r(String str) {
        if (zzaqf.c) {
            this.X.a(str, Thread.currentThread().getId());
        }
    }

    public final void s(zzaqd zzaqdVar) {
        zzapy zzapyVar;
        synchronized (this.Z0) {
            zzapyVar = this.a1;
        }
        zzapyVar.a(zzaqdVar);
    }

    public abstract void t(Object obj);

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.Y0));
        B();
        Integer num = this.b1;
        return "[ ] " + this.Z + C4500Ve2.b + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final void u(String str) {
        zzapx zzapxVar = this.c1;
        if (zzapxVar != null) {
            zzapxVar.b(this);
        }
        if (zzaqf.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaps(this, str, id));
                return;
            }
            zzaqf zzaqfVar = this.X;
            zzaqfVar.a(str, id);
            zzaqfVar.b(toString());
        }
    }

    public final void v() {
        synchronized (this.Z0) {
            this.d1 = true;
        }
    }

    public final void w() {
        zzapt zzaptVar;
        synchronized (this.Z0) {
            zzaptVar = this.f1;
        }
        if (zzaptVar != null) {
            zzaptVar.a(this);
        }
    }

    public final void x(zzaqa zzaqaVar) {
        zzapt zzaptVar;
        synchronized (this.Z0) {
            zzaptVar = this.f1;
        }
        if (zzaptVar != null) {
            zzaptVar.b(this, zzaqaVar);
        }
    }

    public final void y(int i) {
        zzapx zzapxVar = this.c1;
        if (zzapxVar != null) {
            zzapxVar.c(this, i);
        }
    }

    public final void z(zzapt zzaptVar) {
        synchronized (this.Z0) {
            this.f1 = zzaptVar;
        }
    }
}
