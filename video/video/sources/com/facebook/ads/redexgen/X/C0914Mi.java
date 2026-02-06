package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o.C3307Iz;
import o.C8077mf;
import o.C9355rt;
import o.QC1;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.Mi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0914Mi {
    public static byte[] A06;
    public static String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public InterfaceC0913Mh A00;
    public InterfaceC0913Mh A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C0912Mg> A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{C8077mf.x, C8077mf.r, 6, 122, C8077mf.z, C8077mf.A, C8077mf.z, 122, 5, C8077mf.H, C8077mf.z, 6, 96, 5, C8077mf.x, 17, 17, 28, C8077mf.E, C8077mf.u, 32, C3307Iz.V, 66, 101, 125, 106, 103, 98, 111, C3307Iz.c0, 125, 106, 103, 126, 110, C3307Iz.c0, QC1.w, 98, 113, 110, 49, C3307Iz.c0, Byte.MAX_VALUE, 125, Byte.MAX_VALUE, 116, 121, QC1.w, 67, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 67, 117, 114, QC1.w, 121, 100, 50, 121, 100, 117};
    }

    static {
        A07();
    }

    public C0914Mi(C5O c5o, File file, byte[] bArr, boolean z, boolean z2) {
        AbstractC04543y.A08((c5o == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C1895kQ c1895kQ = c5o != null ? new C1895kQ(c5o) : null;
        InterfaceC0913Mh databaseStorage = file != null ? new C1894kP(new File(file, A04(42, 24, 47)), bArr, z) : null;
        if (c1895kQ == null || (databaseStorage != null && z2)) {
            InterfaceC0913Mh legacyStorage = (InterfaceC0913Mh) C5C.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c1895kQ;
            return;
        }
        this.A01 = c1895kQ;
        this.A00 = databaseStorage;
    }

    public static int A00(SparseArray<String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private C0912Mg A01(String str) {
        int A00 = A00(this.A02);
        C0912Mg c0912Mg = new C0912Mg(A00, str);
        this.A05.put(str, c0912Mg);
        this.A02.put(A00, str);
        this.A03.put(A00, true);
        this.A01.AGK(c0912Mg);
        return c0912Mg;
    }

    public static C1892kN A02(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < readInt; nextBytesToRead++) {
            String readUTF = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i = Math.min(bytesRead, (int) C9355rt.h);
                byte[] bArr = C5C.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i;
                    bArr = Arrays.copyOf(bArr, size);
                    dataInputStream.readFully(bArr, valueSize, i);
                    valueSize += i;
                    int size2 = bytesRead - valueSize;
                    i = Math.min(size2, (int) C9355rt.h);
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new C1892kN(hashMap);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = C5C.A02;
        String A04 = A04(0, 20, 102);
        if (i == 18) {
            try {
                return Cipher.getInstance(A04, A04(20, 2, 81));
            } catch (Throwable unused) {
            }
        }
        Cipher cipher = Cipher.getInstance(A04);
        String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(C1892kN c1892kN, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> A062 = c1892kN.A06();
        dataOutputStream.writeInt(A062.size());
        for (Map.Entry<String, byte[]> entry : A062) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C0912Mg A0C(String str) {
        return this.A05.get(str);
    }

    public final C0912Mg A0D(String str) {
        C0912Mg cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C1892kN A0E(String str) {
        C0912Mg cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C1892kN.A03;
    }

    public final String A0F(int i) {
        return this.A02.get(i);
    }

    public final Collection<C0912Mg> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    public final void A0H() {
        C4C A0N = BO.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean hasNext = A0N.hasNext();
            String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (hasNext) {
                A0K((String) A0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws IOException {
        this.A01.AKJ(this.A05);
        int size = this.A04.size();
        for (int i = 0; i < size; i++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws IOException {
        this.A01.AAF(j);
        if (this.A00 != null) {
            this.A00.AAF(j);
        }
        if (!this.A01.A6S() && this.A00 != null && this.A00.A6S()) {
            this.A00.AAs(this.A05, this.A02);
            this.A01.AKI(this.A05);
        } else {
            this.A01.AAs(this.A05, this.A02);
        }
        if (this.A00 != null) {
            InterfaceC0913Mh interfaceC0913Mh = this.A00;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            interfaceC0913Mh.A5p();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C0912Mg c0912Mg = this.A05.get(str);
        if (c0912Mg != null && c0912Mg.A09() && c0912Mg.A0A()) {
            this.A05.remove(str);
            int i = c0912Mg.A01;
            boolean z = this.A03.get(i);
            this.A01.AFd(c0912Mg, z);
            if (z) {
                this.A02.remove(i);
                this.A03.delete(i);
                return;
            }
            this.A02.put(i, null);
            this.A04.put(i, true);
        }
    }

    public final void A0L(String str, C0917Ml c0917Ml) {
        C0912Mg A0D = A0D(str);
        if (A0D.A0E(c0917Ml)) {
            this.A01.AGK(A0D);
        }
    }
}
