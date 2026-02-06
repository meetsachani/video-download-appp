package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DataBufferRef {
    @InterfaceC5670cr1
    @KeepForSdk
    public final DataHolder a;
    @KeepForSdk
    public int b;
    public int c;

    @KeepForSdk
    public DataBufferRef(@InterfaceC5670cr1 DataHolder dataHolder, int i) {
        this.a = (DataHolder) Preconditions.r(dataHolder);
        n(i);
    }

    @KeepForSdk
    public void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 CharArrayBuffer charArrayBuffer) {
        this.a.I1(str, this.b, this.c, charArrayBuffer);
    }

    @KeepForSdk
    public boolean b(@InterfaceC5670cr1 String str) {
        return this.a.E0(str, this.b, this.c);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public byte[] c(@InterfaceC5670cr1 String str) {
        return this.a.G0(str, this.b, this.c);
    }

    @KeepForSdk
    public int d() {
        return this.b;
    }

    @KeepForSdk
    public double e(@InterfaceC5670cr1 String str) {
        return this.a.e1(str, this.b, this.c);
    }

    @KeepForSdk
    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.b(Integer.valueOf(dataBufferRef.b), Integer.valueOf(this.b)) && Objects.b(Integer.valueOf(dataBufferRef.c), Integer.valueOf(this.c)) && dataBufferRef.a == this.a) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public float f(@InterfaceC5670cr1 String str) {
        return this.a.x1(str, this.b, this.c);
    }

    @KeepForSdk
    public int g(@InterfaceC5670cr1 String str) {
        return this.a.H0(str, this.b, this.c);
    }

    @KeepForSdk
    public long h(@InterfaceC5670cr1 String str) {
        return this.a.I0(str, this.b, this.c);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.c(Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String i(@InterfaceC5670cr1 String str) {
        return this.a.S0(str, this.b, this.c);
    }

    @KeepForSdk
    public boolean j(@InterfaceC5670cr1 String str) {
        return this.a.V0(str);
    }

    @KeepForSdk
    public boolean k(@InterfaceC5670cr1 String str) {
        return this.a.Z0(str, this.b, this.c);
    }

    @KeepForSdk
    public boolean l() {
        if (!this.a.isClosed()) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Uri m(@InterfaceC5670cr1 String str) {
        String S0 = this.a.S0(str, this.b, this.c);
        if (S0 == null) {
            return null;
        }
        return Uri.parse(S0);
    }

    public final void n(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.getCount()) {
            z = true;
        }
        Preconditions.x(z);
        this.b = i;
        this.c = this.a.U0(i);
    }
}
