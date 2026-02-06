package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.facebook.internal.l0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C8869pu1;

/* loaded from: classes2.dex */
public final class zzapa {
    public static X509Certificate[][] a(String str) throws zzaow, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair c = zzapb.c(randomAccessFile);
            if (c != null) {
                ByteBuffer byteBuffer = (ByteBuffer) c.first;
                long longValue = ((Long) c.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzaow("ZIP64 APK not supported");
                    }
                }
                long a = zzapb.a(byteBuffer);
                if (a < longValue) {
                    if (zzapb.b(byteBuffer) + a == longValue) {
                        if (a >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(a - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                int i = 0;
                                long j2 = allocate.getLong(0);
                                if (j2 >= allocate.capacity() && j2 <= 2147483639) {
                                    int i2 = (int) (8 + j2);
                                    long j3 = a - i2;
                                    if (j3 >= 0) {
                                        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                                        allocate2.order(byteOrder);
                                        randomAccessFile.seek(j3);
                                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                        long j4 = allocate2.getLong(0);
                                        if (j4 == j2) {
                                            Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                            long longValue2 = ((Long) create.second).longValue();
                                            if (byteBuffer2.order() == byteOrder) {
                                                int capacity = byteBuffer2.capacity() - 24;
                                                if (capacity >= 8) {
                                                    int capacity2 = byteBuffer2.capacity();
                                                    if (capacity <= byteBuffer2.capacity()) {
                                                        int limit = byteBuffer2.limit();
                                                        int position = byteBuffer2.position();
                                                        byteBuffer2.position(0);
                                                        byteBuffer2.limit(capacity);
                                                        byteBuffer2.position(8);
                                                        ByteBuffer slice = byteBuffer2.slice();
                                                        slice.order(byteBuffer2.order());
                                                        byteBuffer2.position(0);
                                                        byteBuffer2.limit(limit);
                                                        byteBuffer2.position(position);
                                                        while (slice.hasRemaining()) {
                                                            i++;
                                                            if (slice.remaining() >= 8) {
                                                                long j5 = slice.getLong();
                                                                if (j5 >= 4 && j5 <= 2147483647L) {
                                                                    int i3 = (int) j5;
                                                                    int position2 = slice.position() + i3;
                                                                    if (i3 <= slice.remaining()) {
                                                                        if (slice.getInt() == 1896449818) {
                                                                            X509Certificate[][] l = l(randomAccessFile.getChannel(), new zzaov(e(slice, i3 - 4), longValue2, a, longValue, byteBuffer, null));
                                                                            randomAccessFile.close();
                                                                            try {
                                                                                randomAccessFile.close();
                                                                            } catch (IOException unused) {
                                                                            }
                                                                            return l;
                                                                        }
                                                                        long j6 = longValue2;
                                                                        slice.position(position2);
                                                                        longValue2 = j6;
                                                                    } else {
                                                                        throw new zzaow("APK Signing Block entry #" + i + " size out of range: " + i3 + ", available: " + slice.remaining());
                                                                    }
                                                                } else {
                                                                    throw new zzaow("APK Signing Block entry #" + i + " size out of range: " + j5);
                                                                }
                                                            } else {
                                                                throw new zzaow("Insufficient data to read size of APK Signing Block entry #" + i);
                                                            }
                                                        }
                                                        throw new zzaow("No APK Signature Scheme v2 block in APK Signing Block");
                                                    }
                                                    throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                }
                                                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                            }
                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                        }
                                        throw new zzaow("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                                    }
                                    throw new zzaow("APK Signing Block offset out of range: " + j3);
                                }
                                throw new zzaow("APK Signing Block size out of range: " + j2);
                            }
                            throw new zzaow("No APK Signing Block before ZIP Central Directory");
                        }
                        throw new zzaow("APK too small for APK Signing Block. ZIP Central Directory offset: " + a);
                    }
                    throw new zzaow("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                throw new zzaow("ZIP Central Directory offset out of range: " + a + ". ZIP End of Central Directory offset: " + longValue);
            }
            throw new zzaow("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return 32;
    }

    public static int c(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static String d(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return l0.e;
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 >= position && i2 <= limit) {
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return e(byteBuffer, i);
                }
                int remaining = byteBuffer.remaining();
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining);
            }
            throw new IllegalArgumentException("Negative length");
        }
        int remaining2 = byteBuffer.remaining();
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining2);
    }

    public static void g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static void h(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaou zzaouVar = new zzaou(fileChannel, 0L, j);
            zzaou zzaouVar2 = new zzaou(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzapb.d(duplicate, j);
            zzaos zzaosVar = new zzaos(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] k = k(iArr, new zzaot[]{zzaouVar, zzaouVar2, zzaosVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), k[i2])) {
                        throw new SecurityException(d(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    public static byte[] i(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            int remaining = byteBuffer.remaining();
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = c(r6);
        r12 = c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair create;
        ByteBuffer f = f(byteBuffer);
        ByteBuffer f2 = f(byteBuffer);
        byte[] i = i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i2 = -1;
        int i3 = 0;
        while (f2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer f3 = f(f2);
                if (f3.remaining() >= 8) {
                    int i4 = f3.getInt();
                    arrayList.add(Integer.valueOf(i4));
                    if (i4 != 513 && i4 != 514 && i4 != 769) {
                        switch (i4) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    bArr2 = i(f3);
                    i2 = i4;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException e) {
                e = e;
                throw new SecurityException("Failed to parse signature record #" + i3, e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException("Failed to parse signature record #" + i3, e);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 != 513 && i2 != 514) {
            if (i2 != 769) {
                switch (i2) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                }
            } else {
                str = "DSA";
            }
        } else {
            str = "EC";
        }
        if (i2 != 513) {
            if (i2 != 514) {
                if (i2 != 769) {
                    switch (i2) {
                        case 257:
                            create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(l0.e, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            break;
                        case 258:
                            create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            break;
                        case 259:
                            create = Pair.create(C8869pu1.c, null);
                            break;
                        case 260:
                            create = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                    }
                } else {
                    create = Pair.create("SHA256withDSA", null);
                }
            } else {
                create = Pair.create("SHA512withECDSA", null);
            }
        } else {
            create = Pair.create("SHA256withECDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(f);
            if (signature.verify(bArr2)) {
                f.clear();
                ByteBuffer f4 = f(f);
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                while (f4.hasRemaining()) {
                    i5++;
                    try {
                        ByteBuffer f5 = f(f4);
                        if (f5.remaining() >= 8) {
                            int i6 = f5.getInt();
                            arrayList2.add(Integer.valueOf(i6));
                            if (i6 == i2) {
                                bArr = i(f5);
                            }
                        } else {
                            throw new IOException("Record too short");
                        }
                    } catch (IOException e3) {
                        e = e3;
                        throw new IOException("Failed to parse digest record #" + i5, e);
                    } catch (BufferUnderflowException e4) {
                        e = e4;
                        throw new IOException("Failed to parse digest record #" + i5, e);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int c = c(i2);
                    byte[] bArr3 = (byte[]) map.put(Integer.valueOf(c), bArr);
                    if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                        throw new SecurityException(d(c).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer f6 = f(f);
                    ArrayList arrayList3 = new ArrayList();
                    int i7 = 0;
                    while (f6.hasRemaining()) {
                        i7++;
                        byte[] i8 = i(f6);
                        try {
                            arrayList3.add(new zzaox((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(i8)), i8));
                        } catch (CertificateException e5) {
                            throw new SecurityException("Failed to decode certificate #" + i7, e5);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (Arrays.equals(i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException("No certificates listed");
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    public static byte[][] k(int[] iArr, zzaot[] zzaotVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        String str;
        int i3 = 0;
        int i4 = 0;
        long j2 = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i4 >= 3) {
                break;
            }
            j2 += (zzaotVarArr[i4].a() + 1048575) / 1048576;
            i4++;
        }
        if (j2 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i5 = 0;
            while (true) {
                length = iArr.length;
                c = 5;
                i2 = 1;
                if (i5 >= length) {
                    break;
                }
                int i6 = (int) j2;
                byte[] bArr2 = new byte[(b(iArr[i5]) * i6) + 5];
                bArr2[0] = 90;
                g(i6, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i7 = 0;
            while (true) {
                str = " digest not supported";
                if (i7 >= iArr.length) {
                    break;
                }
                String d = d(iArr[i7]);
                try {
                    messageDigestArr[i7] = MessageDigest.getInstance(d);
                    i7++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < i) {
                zzaot zzaotVar = zzaotVarArr[i8];
                int i10 = i8;
                long a = zzaotVar.a();
                byte[][] bArr4 = bArr;
                long j3 = 0;
                while (a > 0) {
                    int i11 = i9;
                    String str2 = str;
                    int min = (int) Math.min(a, j);
                    g(min, bArr3, i2);
                    for (int i12 = 0; i12 < length; i12++) {
                        messageDigestArr[i12].update(bArr3);
                    }
                    try {
                        zzaotVar.b(messageDigestArr, j3, min);
                        int i13 = 0;
                        while (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            byte[] bArr5 = bArr4[i13];
                            int b = b(i14);
                            char c2 = c;
                            MessageDigest messageDigest = messageDigestArr[i13];
                            int digest = messageDigest.digest(bArr5, (i11 * b) + 5, b);
                            if (digest == b) {
                                i13++;
                                c = c2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        long j4 = min;
                        j3 += j4;
                        a -= j4;
                        i9 = i11 + 1;
                        str = str2;
                        j = 1048576;
                        i2 = 1;
                    } catch (IOException e2) {
                        throw new DigestException("Failed to digest chunk #" + i11 + " of section #" + i3, e2);
                    }
                }
                i3++;
                i8 = i10 + 1;
                bArr = bArr4;
                j = 1048576;
                i = 3;
                i2 = 1;
            }
            byte[][] bArr6 = bArr;
            String str3 = str;
            byte[][] bArr7 = new byte[iArr.length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                int i16 = iArr[i15];
                byte[] bArr8 = bArr6[i15];
                String d2 = d(i16);
                try {
                    bArr7[i15] = MessageDigest.getInstance(d2).digest(bArr8);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(str3), e3);
                }
            }
            return bArr7;
        }
        throw new DigestException("Too many chunks: " + j2);
    }

    public static X509Certificate[][] l(FileChannel fileChannel, zzaov zzaovVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaovVar.a;
                ByteBuffer f = f(byteBuffer);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(j(f(f), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        j = zzaovVar.b;
                        j2 = zzaovVar.c;
                        j3 = zzaovVar.d;
                        byteBuffer2 = zzaovVar.e;
                        h(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
