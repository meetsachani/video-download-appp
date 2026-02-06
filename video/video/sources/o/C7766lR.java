package o;

import android.media.MediaCodec;

@Deprecated
/* renamed from: o.lR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7766lR {
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
    public final b j;

    @ES1(24)
    /* renamed from: o.lR$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        public final void b(int i, int i2) {
            this.b.set(i, i2);
            this.a.setPattern(this.b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C7766lR() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = TD2.a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void b(int i) {
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

    public void c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
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
        if (TD2.a >= 24) {
            ((b) C9542sf.g(this.j)).b(i3, i4);
        }
    }
}
