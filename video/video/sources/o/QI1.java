package o;

import com.google.firebase.messaging.TopicOperation;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class QI1 {
    public static final int a = 1;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 4;
    public static final int f = 6;
    public static final int g = 7;
    public static final byte[] h = {112, 114, 111, 0};
    public static final byte[] i = {112, 114, 109, 0};

    public static void A(byte[] bArr, int i2, int i3, C5718d30 c5718d30) {
        int m = m(i2, i3, c5718d30.g);
        int i4 = m / 8;
        bArr[i4] = (byte) ((1 << (m % 8)) | bArr[i4]);
    }

    public static void B(InputStream inputStream) throws IOException {
        C3221Ic0.h(inputStream);
        int j = C3221Ic0.j(inputStream);
        if (j != 6 && j != 7) {
            while (j > 0) {
                C3221Ic0.j(inputStream);
                for (int j2 = C3221Ic0.j(inputStream); j2 > 0; j2--) {
                    C3221Ic0.h(inputStream);
                }
                j--;
            }
        }
    }

    public static boolean C(OutputStream outputStream, byte[] bArr, C5718d30[] c5718d30Arr) throws IOException {
        if (Arrays.equals(bArr, RI1.a)) {
            P(outputStream, c5718d30Arr);
            return true;
        } else if (Arrays.equals(bArr, RI1.b)) {
            O(outputStream, c5718d30Arr);
            return true;
        } else if (Arrays.equals(bArr, RI1.d)) {
            M(outputStream, c5718d30Arr);
            return true;
        } else if (Arrays.equals(bArr, RI1.c)) {
            N(outputStream, c5718d30Arr);
            return true;
        } else if (Arrays.equals(bArr, RI1.e)) {
            L(outputStream, c5718d30Arr);
            return true;
        } else {
            return false;
        }
    }

    public static void D(OutputStream outputStream, C5718d30 c5718d30) throws IOException {
        int[] iArr = c5718d30.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            C3221Ic0.p(outputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
    }

    public static MN2 E(C5718d30[] c5718d30Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C3221Ic0.p(byteArrayOutputStream, c5718d30Arr.length);
            int i2 = 2;
            for (C5718d30 c5718d30 : c5718d30Arr) {
                C3221Ic0.q(byteArrayOutputStream, c5718d30.c);
                C3221Ic0.q(byteArrayOutputStream, c5718d30.d);
                C3221Ic0.q(byteArrayOutputStream, c5718d30.g);
                String j = j(c5718d30.a, c5718d30.b, RI1.a);
                int k = C3221Ic0.k(j);
                C3221Ic0.p(byteArrayOutputStream, k);
                i2 = i2 + 14 + k;
                C3221Ic0.n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i2 == byteArray.length) {
                MN2 mn2 = new MN2(EnumC10312vp0.DEX_FILES, i2, byteArray, false);
                byteArrayOutputStream.close();
                return mn2;
            }
            throw C3221Ic0.c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(h);
        outputStream.write(bArr);
    }

    public static void G(OutputStream outputStream, C5718d30 c5718d30) throws IOException {
        K(outputStream, c5718d30);
        D(outputStream, c5718d30);
        I(outputStream, c5718d30);
    }

    public static void H(OutputStream outputStream, C5718d30 c5718d30, String str) throws IOException {
        C3221Ic0.p(outputStream, C3221Ic0.k(str));
        C3221Ic0.p(outputStream, c5718d30.e);
        C3221Ic0.q(outputStream, c5718d30.f);
        C3221Ic0.q(outputStream, c5718d30.c);
        C3221Ic0.q(outputStream, c5718d30.g);
        C3221Ic0.n(outputStream, str);
    }

    public static void I(OutputStream outputStream, C5718d30 c5718d30) throws IOException {
        byte[] bArr = new byte[k(c5718d30.g)];
        for (Map.Entry<Integer, Integer> entry : c5718d30.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, c5718d30);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, c5718d30);
            }
        }
        outputStream.write(bArr);
    }

    public static void J(OutputStream outputStream, int i2, C5718d30 c5718d30) throws IOException {
        byte[] bArr = new byte[l(i2, c5718d30.g)];
        for (Map.Entry<Integer, Integer> entry : c5718d30.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i2) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (c5718d30.g * i3) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static void K(OutputStream outputStream, C5718d30 c5718d30) throws IOException {
        int i2 = 0;
        for (Map.Entry<Integer, Integer> entry : c5718d30.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C3221Ic0.p(outputStream, intValue - i2);
                C3221Ic0.p(outputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static void L(OutputStream outputStream, C5718d30[] c5718d30Arr) throws IOException {
        C3221Ic0.p(outputStream, c5718d30Arr.length);
        for (C5718d30 c5718d30 : c5718d30Arr) {
            String j = j(c5718d30.a, c5718d30.b, RI1.e);
            C3221Ic0.p(outputStream, C3221Ic0.k(j));
            C3221Ic0.p(outputStream, c5718d30.i.size());
            C3221Ic0.p(outputStream, c5718d30.h.length);
            C3221Ic0.q(outputStream, c5718d30.c);
            C3221Ic0.n(outputStream, j);
            for (Integer num : c5718d30.i.keySet()) {
                C3221Ic0.p(outputStream, num.intValue());
            }
            for (int i2 : c5718d30.h) {
                C3221Ic0.p(outputStream, i2);
            }
        }
    }

    public static void M(OutputStream outputStream, C5718d30[] c5718d30Arr) throws IOException {
        C3221Ic0.r(outputStream, c5718d30Arr.length);
        for (C5718d30 c5718d30 : c5718d30Arr) {
            String j = j(c5718d30.a, c5718d30.b, RI1.d);
            C3221Ic0.p(outputStream, C3221Ic0.k(j));
            C3221Ic0.p(outputStream, c5718d30.h.length);
            C3221Ic0.q(outputStream, c5718d30.i.size() * 4);
            C3221Ic0.q(outputStream, c5718d30.c);
            C3221Ic0.n(outputStream, j);
            for (Integer num : c5718d30.i.keySet()) {
                C3221Ic0.p(outputStream, num.intValue());
                C3221Ic0.p(outputStream, 0);
            }
            for (int i2 : c5718d30.h) {
                C3221Ic0.p(outputStream, i2);
            }
        }
    }

    public static void N(OutputStream outputStream, C5718d30[] c5718d30Arr) throws IOException {
        byte[] b2 = b(c5718d30Arr, RI1.c);
        C3221Ic0.r(outputStream, c5718d30Arr.length);
        C3221Ic0.m(outputStream, b2);
    }

    public static void O(OutputStream outputStream, C5718d30[] c5718d30Arr) throws IOException {
        byte[] b2 = b(c5718d30Arr, RI1.b);
        C3221Ic0.r(outputStream, c5718d30Arr.length);
        C3221Ic0.m(outputStream, b2);
    }

    public static void P(OutputStream outputStream, C5718d30[] c5718d30Arr) throws IOException {
        Q(outputStream, c5718d30Arr);
    }

    public static void Q(OutputStream outputStream, C5718d30[] c5718d30Arr) throws IOException {
        int length;
        byte[] bArr;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(c5718d30Arr));
        arrayList.add(c(c5718d30Arr));
        arrayList.add(d(c5718d30Arr));
        long length2 = RI1.a.length + h.length + 4 + (arrayList.size() * 16);
        C3221Ic0.q(outputStream, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MN2 mn2 = (MN2) arrayList.get(i2);
            C3221Ic0.q(outputStream, mn2.a.h());
            C3221Ic0.q(outputStream, length2);
            if (mn2.d) {
                byte[] b2 = C3221Ic0.b(mn2.c);
                arrayList2.add(b2);
                C3221Ic0.q(outputStream, b2.length);
                C3221Ic0.q(outputStream, bArr.length);
                length = b2.length;
            } else {
                arrayList2.add(mn2.c);
                C3221Ic0.q(outputStream, mn2.c.length);
                C3221Ic0.q(outputStream, 0L);
                length = mn2.c.length;
            }
            length2 += length;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }

    public static int a(C5718d30 c5718d30) {
        int i2 = 0;
        for (Map.Entry<Integer, Integer> entry : c5718d30.i.entrySet()) {
            i2 |= entry.getValue().intValue();
        }
        return i2;
    }

    public static byte[] b(C5718d30[] c5718d30Arr, byte[] bArr) throws IOException {
        int i2 = 0;
        int i3 = 0;
        for (C5718d30 c5718d30 : c5718d30Arr) {
            i3 += C3221Ic0.k(j(c5718d30.a, c5718d30.b, bArr)) + 16 + (c5718d30.e * 2) + c5718d30.f + k(c5718d30.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, RI1.c)) {
            int length = c5718d30Arr.length;
            while (i2 < length) {
                C5718d30 c5718d302 = c5718d30Arr[i2];
                H(byteArrayOutputStream, c5718d302, j(c5718d302.a, c5718d302.b, bArr));
                G(byteArrayOutputStream, c5718d302);
                i2++;
            }
        } else {
            for (C5718d30 c5718d303 : c5718d30Arr) {
                H(byteArrayOutputStream, c5718d303, j(c5718d303.a, c5718d303.b, bArr));
            }
            int length2 = c5718d30Arr.length;
            while (i2 < length2) {
                G(byteArrayOutputStream, c5718d30Arr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C3221Ic0.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static MN2 c(C5718d30[] c5718d30Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        for (int i3 = 0; i3 < c5718d30Arr.length; i3++) {
            try {
                C5718d30 c5718d30 = c5718d30Arr[i3];
                C3221Ic0.p(byteArrayOutputStream, i3);
                C3221Ic0.p(byteArrayOutputStream, c5718d30.e);
                i2 = i2 + 4 + (c5718d30.e * 2);
                D(byteArrayOutputStream, c5718d30);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            MN2 mn2 = new MN2(EnumC10312vp0.CLASSES, i2, byteArray, true);
            byteArrayOutputStream.close();
            return mn2;
        }
        throw C3221Ic0.c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
    }

    public static MN2 d(C5718d30[] c5718d30Arr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        for (int i3 = 0; i3 < c5718d30Arr.length; i3++) {
            try {
                C5718d30 c5718d30 = c5718d30Arr[i3];
                int a2 = a(c5718d30);
                byte[] e2 = e(a2, c5718d30);
                byte[] f2 = f(c5718d30);
                C3221Ic0.p(byteArrayOutputStream, i3);
                int length = e2.length + 2 + f2.length;
                C3221Ic0.q(byteArrayOutputStream, length);
                C3221Ic0.p(byteArrayOutputStream, a2);
                byteArrayOutputStream.write(e2);
                byteArrayOutputStream.write(f2);
                i2 = i2 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            MN2 mn2 = new MN2(EnumC10312vp0.METHODS, i2, byteArray, true);
            byteArrayOutputStream.close();
            return mn2;
        }
        throw C3221Ic0.c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(int i2, C5718d30 c5718d30) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i2, c5718d30);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(C5718d30 c5718d30) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, c5718d30);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        if (TopicOperation.d.equals(str2)) {
            return str.replace(":", TopicOperation.d);
        }
        if (":".equals(str2)) {
            return str.replace(TopicOperation.d, ":");
        }
        return str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf(TopicOperation.d);
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    public static C5718d30 i(C5718d30[] c5718d30Arr, String str) {
        if (c5718d30Arr.length <= 0) {
            return null;
        }
        String h2 = h(str);
        for (int i2 = 0; i2 < c5718d30Arr.length; i2++) {
            if (c5718d30Arr[i2].b.equals(h2)) {
                return c5718d30Arr[i2];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a2 = RI1.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains(TopicOperation.d) && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + RI1.a(bArr) + str2;
        }
        return g(str2, a2);
    }

    public static int k(int i2) {
        return z(i2 * 2) / 8;
    }

    public static int l(int i2, int i3) {
        return z(Integer.bitCount(i2 & (-2)) * i3) / 8;
    }

    public static int m(int i2, int i3, int i4) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 4) {
                    return i3 + i4;
                }
                throw C3221Ic0.c("Unexpected flag: " + i2);
            }
            return i3;
        }
        throw C3221Ic0.c("HOT methods are not stored in the bitmap");
    }

    public static int[] n(InputStream inputStream, int i2) throws IOException {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += C3221Ic0.h(inputStream);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static int o(BitSet bitSet, int i2, int i3) {
        int i4 = 2;
        if (!bitSet.get(m(2, i2, i3))) {
            i4 = 0;
        }
        if (bitSet.get(m(4, i2, i3))) {
            return i4 | 4;
        }
        return i4;
    }

    public static byte[] p(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, C3221Ic0.d(inputStream, bArr.length))) {
            return C3221Ic0.d(inputStream, RI1.b.length);
        }
        throw C3221Ic0.c("Invalid magic");
    }

    public static void q(InputStream inputStream, C5718d30 c5718d30) throws IOException {
        int available = inputStream.available() - c5718d30.f;
        int i2 = 0;
        while (inputStream.available() > available) {
            i2 += C3221Ic0.h(inputStream);
            c5718d30.i.put(Integer.valueOf(i2), 1);
            for (int h2 = C3221Ic0.h(inputStream); h2 > 0; h2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() == available) {
            return;
        }
        throw C3221Ic0.c("Read too much data during profile line parse");
    }

    public static C5718d30[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, C5718d30[] c5718d30Arr) throws IOException {
        if (Arrays.equals(bArr, RI1.f)) {
            if (!Arrays.equals(RI1.a, bArr2)) {
                return s(inputStream, bArr, c5718d30Arr);
            }
            throw C3221Ic0.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, RI1.g)) {
            return u(inputStream, bArr2, c5718d30Arr);
        } else {
            throw C3221Ic0.c("Unsupported meta version");
        }
    }

    public static C5718d30[] s(InputStream inputStream, byte[] bArr, C5718d30[] c5718d30Arr) throws IOException {
        if (Arrays.equals(bArr, RI1.f)) {
            int j = C3221Ic0.j(inputStream);
            byte[] e2 = C3221Ic0.e(inputStream, (int) C3221Ic0.i(inputStream), (int) C3221Ic0.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e2);
                try {
                    C5718d30[] t = t(byteArrayInputStream, j, c5718d30Arr);
                    byteArrayInputStream.close();
                    return t;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw C3221Ic0.c("Content found after the end of file");
        }
        throw C3221Ic0.c("Unsupported meta version");
    }

    public static C5718d30[] t(InputStream inputStream, int i2, C5718d30[] c5718d30Arr) throws IOException {
        if (inputStream.available() == 0) {
            return new C5718d30[0];
        }
        if (i2 == c5718d30Arr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int h2 = C3221Ic0.h(inputStream);
                iArr[i3] = C3221Ic0.h(inputStream);
                strArr[i3] = C3221Ic0.f(inputStream, h2);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                C5718d30 c5718d30 = c5718d30Arr[i4];
                if (c5718d30.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    c5718d30.e = i5;
                    c5718d30.h = n(inputStream, i5);
                } else {
                    throw C3221Ic0.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c5718d30Arr;
        }
        throw C3221Ic0.c("Mismatched number of dex files found in metadata");
    }

    public static C5718d30[] u(InputStream inputStream, byte[] bArr, C5718d30[] c5718d30Arr) throws IOException {
        int h2 = C3221Ic0.h(inputStream);
        byte[] e2 = C3221Ic0.e(inputStream, (int) C3221Ic0.i(inputStream), (int) C3221Ic0.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e2);
            try {
                C5718d30[] v = v(byteArrayInputStream, bArr, h2, c5718d30Arr);
                byteArrayInputStream.close();
                return v;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C3221Ic0.c("Content found after the end of file");
    }

    public static C5718d30[] v(InputStream inputStream, byte[] bArr, int i2, C5718d30[] c5718d30Arr) throws IOException {
        if (inputStream.available() == 0) {
            return new C5718d30[0];
        }
        if (i2 == c5718d30Arr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                C3221Ic0.h(inputStream);
                String f2 = C3221Ic0.f(inputStream, C3221Ic0.h(inputStream));
                long i4 = C3221Ic0.i(inputStream);
                int h2 = C3221Ic0.h(inputStream);
                C5718d30 i5 = i(c5718d30Arr, f2);
                if (i5 != null) {
                    i5.d = i4;
                    int[] n = n(inputStream, h2);
                    if (Arrays.equals(bArr, RI1.e)) {
                        i5.e = h2;
                        i5.h = n;
                    }
                } else {
                    throw C3221Ic0.c("Missing profile key: " + f2);
                }
            }
            return c5718d30Arr;
        }
        throw C3221Ic0.c("Mismatched number of dex files found in metadata");
    }

    public static void w(InputStream inputStream, C5718d30 c5718d30) throws IOException {
        BitSet valueOf = BitSet.valueOf(C3221Ic0.d(inputStream, C3221Ic0.a(c5718d30.g * 2)));
        int i2 = 0;
        while (true) {
            int i3 = c5718d30.g;
            if (i2 < i3) {
                int o2 = o(valueOf, i2, i3);
                if (o2 != 0) {
                    Integer num = c5718d30.i.get(Integer.valueOf(i2));
                    if (num == null) {
                        num = 0;
                    }
                    c5718d30.i.put(Integer.valueOf(i2), Integer.valueOf(o2 | num.intValue()));
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static C5718d30[] x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, RI1.b)) {
            int j = C3221Ic0.j(inputStream);
            byte[] e2 = C3221Ic0.e(inputStream, (int) C3221Ic0.i(inputStream), (int) C3221Ic0.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e2);
                try {
                    C5718d30[] y = y(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return y;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw C3221Ic0.c("Content found after the end of file");
        }
        throw C3221Ic0.c("Unsupported version");
    }

    public static C5718d30[] y(InputStream inputStream, String str, int i2) throws IOException {
        if (inputStream.available() == 0) {
            return new C5718d30[0];
        }
        C5718d30[] c5718d30Arr = new C5718d30[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h2 = C3221Ic0.h(inputStream);
            int h3 = C3221Ic0.h(inputStream);
            c5718d30Arr[i3] = new C5718d30(str, C3221Ic0.f(inputStream, h2), C3221Ic0.i(inputStream), 0L, h3, (int) C3221Ic0.i(inputStream), (int) C3221Ic0.i(inputStream), new int[h3], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C5718d30 c5718d30 = c5718d30Arr[i4];
            q(inputStream, c5718d30);
            c5718d30.h = n(inputStream, c5718d30.e);
            w(inputStream, c5718d30);
        }
        return c5718d30Arr;
    }

    public static int z(int i2) {
        return (i2 + 7) & (-8);
    }
}
