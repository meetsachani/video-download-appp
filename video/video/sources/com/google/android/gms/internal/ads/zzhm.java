package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzhm {
    @InterfaceC11300zs1
    public byte[] a;
    @InterfaceC11300zs1
    public byte[] b;
    public int c;
    @InterfaceC11300zs1
    public int[] d;
    @InterfaceC11300zs1
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    @InterfaceC11300zs1
    public final zzhk j;

    public zzhm() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new zzhk(cryptoInfo, null);
    }

    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public final void b(int i) {
        if (i == 0) {
            return;
        }
        if (this.d == null) {
            int[] iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[0] + i;
    }

    public final void c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        zzhk zzhkVar = this.j;
        zzhkVar.getClass();
        zzhk.a(zzhkVar, i3, i4);
    }
}
