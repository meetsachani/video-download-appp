package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.kP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1894kP implements InterfaceC0913Mh {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public C0920Mo A00;
    public boolean A01;
    public final AnonymousClass40 A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A03() {
        A07 = new byte[]{C8077mf.m, C8077mf.q, C8077mf.G};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C0912Mg> hashMap) throws IOException {
        try {
            C04553z A03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C0920Mo(A03);
            } else {
                this.A00.A00(A03);
            }
            C0920Mo c0920Mo = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c0920Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) C5C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) C5C.A0f(this.A04)).init(1, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c0920Mo, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (C0912Mg c0912Mg : hashMap.values()) {
                A04(c0912Mg, dataOutputStream);
                i += A00(c0912Mg, 2);
            }
            dataOutputStream.writeInt(i);
            this.A02.A06(dataOutputStream);
            C5C.A10(null);
        } catch (Throwable th) {
            C5C.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C0912Mg> hashMap, SparseArray<String> sparseArray) {
        if (this.A02.A07()) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
                DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
                int readInt = dataInputStream.readInt();
                if (readInt < 0 || readInt > 2) {
                    C5C.A10(dataInputStream);
                    return false;
                }
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.A04 == null) {
                        C5C.A10(dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.A04.init(2, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                } else if (this.A06) {
                    this.A01 = true;
                }
                int readInt2 = dataInputStream.readInt();
                int i = 0;
                for (int i2 = 0; i2 < readInt2; i2++) {
                    C0912Mg A01 = A01(readInt, dataInputStream);
                    hashMap.put(A01.A02, A01);
                    sparseArray.put(A01.A01, A01.A02);
                    i += A00(A01, readInt);
                }
                int readInt3 = dataInputStream.readInt();
                boolean z = dataInputStream.read() == -1;
                if (readInt3 == i && z) {
                    C5C.A10(dataInputStream);
                    return true;
                }
                C5C.A10(dataInputStream);
                return false;
            } catch (IOException unused) {
                if (0 != 0) {
                    C5C.A10(null);
                }
                return false;
            } catch (Throwable th) {
                if (0 != 0) {
                    C5C.A10(null);
                }
                throw th;
            }
        }
        return true;
    }

    static {
        A03();
    }

    public C1894kP(File file, byte[] bArr, boolean z) {
        AbstractC04543y.A08((bArr == null && z) ? false : true);
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC04543y.A07(bArr.length == 16);
            try {
                cipher = C0914Mi.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            AbstractC04543y.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipher;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new AnonymousClass40(file);
    }

    private int A00(C0912Mg c0912Mg, int i) {
        int result = c0912Mg.A01;
        int i2 = result * 31;
        int result2 = c0912Mg.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long A00 = AbstractC0915Mj.A00(c0912Mg.A03());
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + c0912Mg.A03().hashCode();
    }

    private C0912Mg A01(int i, DataInputStream dataInputStream) throws IOException {
        C1892kN A02;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i >= 2) {
            A02 = C0914Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            C0917Ml c0917Ml = new C0917Ml();
            C0917Ml.A00(c0917Ml, length);
            A02 = C1892kN.A03.A05(c0917Ml);
        }
        return new C0912Mg(readInt, readUTF, A02);
    }

    private void A04(C0912Mg c0912Mg, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c0912Mg.A01);
        dataOutputStream.writeUTF(c0912Mg.A02);
        C0914Mi.A08(c0912Mg.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AAF(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AAs(HashMap<String, C0912Mg> hashMap, SparseArray<String> sparseArray) {
        AbstractC04543y.A08(!this.A01);
        if (!A06(hashMap, sparseArray)) {
            hashMap.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AFd(C0912Mg c0912Mg, boolean z) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AGK(C0912Mg c0912Mg) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AKI(HashMap<String, C0912Mg> hashMap) throws IOException {
        A05(hashMap);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0913Mh
    public final void AKJ(HashMap<String, C0912Mg> hashMap) throws IOException {
        if (!this.A01) {
            return;
        }
        AKI(hashMap);
    }
}
