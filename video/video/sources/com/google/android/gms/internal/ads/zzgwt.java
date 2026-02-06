package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgws;
import com.google.android.gms.internal.ads.zzgwt;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzgwt<MessageType extends zzgwt<MessageType, BuilderType>, BuilderType extends zzgws<MessageType, BuilderType>> implements zzhad {
    protected int zzq = 0;

    public static <T> void U0(Iterable<T> iterable, List<? super T> list) {
        zzgws.C1(iterable, list);
    }

    public static void X0(zzgxk zzgxkVar) throws IllegalArgumentException {
        if (zzgxkVar.H()) {
            return;
        }
        throw new IllegalArgumentException("Byte string is not UTF-8.");
    }

    public int B0() {
        throw new UnsupportedOperationException();
    }

    public int E0(zzhaw zzhawVar) {
        return B0();
    }

    public zzhai G0() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhbh H0() {
        return new zzhbh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public zzgxk Q0() {
        try {
            int O0 = O0();
            zzgxk zzgxkVar = zzgxk.Y;
            byte[] bArr = new byte[O0];
            int i = zzgxx.d;
            zzgxt zzgxtVar = new zzgxt(bArr, 0, O0);
            W0(zzgxtVar);
            zzgxtVar.g();
            return new zzgxh(bArr);
        } catch (IOException e) {
            throw new RuntimeException(c1("ByteString"), e);
        }
    }

    public void Y0(int i) {
        throw new UnsupportedOperationException();
    }

    public void Z0(OutputStream outputStream) throws IOException {
        int O0 = O0();
        zzgxv zzgxvVar = new zzgxv(outputStream, zzgxx.c(zzgxx.e(O0) + O0));
        zzgxvVar.A(O0);
        W0(zzgxvVar);
        zzgxvVar.j();
    }

    public void a1(OutputStream outputStream) throws IOException {
        zzgxv zzgxvVar = new zzgxv(outputStream, zzgxx.c(O0()));
        W0(zzgxvVar);
        zzgxvVar.j();
    }

    public byte[] b1() {
        try {
            int O0 = O0();
            byte[] bArr = new byte[O0];
            int i = zzgxx.d;
            zzgxt zzgxtVar = new zzgxt(bArr, 0, O0);
            W0(zzgxtVar);
            zzgxtVar.g();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(c1("byte array"), e);
        }
    }

    public final String c1(String str) {
        String name = getClass().getName();
        return "Serializing " + name + " to a " + str + " threw an IOException (should never happen).";
    }
}
