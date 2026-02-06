package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.C9680tD0;

/* loaded from: classes2.dex */
final class zzauj {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);
    public static final /* synthetic */ int f = 0;

    public static zzatx a(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector c2 = c(bArr, 255);
        if (c2 != null && !c2.isEmpty()) {
            zzatx s2 = zzaty.s2();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                s2.Y1(zzgxk.U(h((byte[]) c2.get(i), str, false), 0, 256));
            }
            byte[] f2 = f(bArr);
            zzgxk zzgxkVar = zzgxk.Y;
            s2.Z1(zzgxk.U(f2, 0, f2.length));
            return s2;
        }
        return null;
    }

    public static String b(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] b1;
        zzatx a2 = a(bArr, str);
        if (a2 == null) {
            b1 = h(g(4096).b1(), str, true);
        } else {
            b1 = ((zzaty) a2.V1()).b1();
        }
        return zzauc.a(b1, true);
    }

    public static Vector c(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + C9680tD0.l;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void e() {
        synchronized (d) {
            try {
                if (!a) {
                    a = true;
                    new Thread(new zzauh(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzauj.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] f(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (c) {
            try {
                e();
                MessageDigest messageDigest2 = null;
                try {
                    if (e.await(2L, TimeUnit.SECONDS) && (messageDigest = b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static zzath g(int i) {
        zzask S2 = zzath.S2();
        S2.Z1(PlaybackStateCompat.t1);
        return (zzath) S2.V1();
    }

    public static byte[] h(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i;
        byte[] array;
        int length = bArr.length;
        if (true != z) {
            i = 255;
        } else {
            i = 239;
        }
        if (length > i) {
            bArr = g(4096).b1();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(f(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzauk[] zzaukVarArr = new zzauy().G2;
        int length3 = zzaukVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzaukVarArr[i3].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzaua(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
