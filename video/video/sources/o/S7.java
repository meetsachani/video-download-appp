package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
/* loaded from: classes2.dex */
public final class S7 {
    public final Cipher a;
    public final int b;
    public final byte[] c;
    public final byte[] d;
    public int e;

    public S7(int i, byte[] bArr, @InterfaceC11300zs1 String str, long j) {
        this(i, bArr, a(str), j);
    }

    public static long a(@InterfaceC11300zs1 String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        for (int i = 0; i < str.length(); i++) {
            long charAt = j ^ str.charAt(i);
            j = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j;
    }

    public final byte[] b(long j, long j2) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j2).array();
    }

    public final int c(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.a.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        do {
            int i7 = this.e;
            if (i7 > 0) {
                bArr2[i6] = (byte) (bArr[i4] ^ this.d[this.b - i7]);
                i6++;
                i4++;
                this.e = i7 - 1;
                i5--;
            } else {
                int c = c(bArr, i4, i5, bArr2, i6);
                if (i5 != c) {
                    int i8 = i5 - c;
                    int i9 = 0;
                    boolean z2 = true;
                    if (i8 < this.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9542sf.i(z);
                    int i10 = i6 + c;
                    int i11 = this.b - i8;
                    this.e = i11;
                    if (c(this.c, 0, i11, this.d, 0) != this.b) {
                        z2 = false;
                    }
                    C9542sf.i(z2);
                    while (i9 < i8) {
                        bArr2[i10] = this.d[i9];
                        i9++;
                        i10++;
                    }
                    return;
                }
                return;
            }
        } while (i5 != 0);
    }

    public void e(byte[] bArr, int i, int i2) {
        d(bArr, i, i2, bArr, i);
    }

    public S7(int i, byte[] bArr, long j, long j2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher;
            int blockSize = cipher.getBlockSize();
            this.b = blockSize;
            this.c = new byte[blockSize];
            this.d = new byte[blockSize];
            long j3 = j2 / blockSize;
            int i2 = (int) (j2 % blockSize);
            cipher.init(i, new SecretKeySpec(bArr, TD2.K1(cipher.getAlgorithm(), RemoteSettings.i)[0]), new IvParameterSpec(b(j, j3)));
            if (i2 != 0) {
                e(new byte[i2], 0, i2);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
