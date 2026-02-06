package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzj extends com.google.android.gms.common.internal.zzz {
    public final int X;

    public zzj(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        this.X = Arrays.hashCode(bArr);
    }

    public static byte[] o1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] V3();

    @Override // com.google.android.gms.common.internal.zzaa
    public final int c() {
        return this.X;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        IObjectWrapper f;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.c() != this.X || (f = zzaaVar.f()) == null) {
                    return false;
                }
                return Arrays.equals(V3(), (byte[]) ObjectWrapper.o1(f));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper f() {
        return ObjectWrapper.V3(V3());
    }

    public final int hashCode() {
        return this.X;
    }
}
