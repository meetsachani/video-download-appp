package o;

import com.facebook.internal.H;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
/* loaded from: classes4.dex */
public final class VZ1 extends C8859ps {
    @NotNull
    public final transient byte[][] a1;
    @NotNull
    public final transient int[] b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VZ1(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(C8859ps.Z0.w());
        C6562gT0.p(bArr, "segments");
        C6562gT0.p(iArr, "directory");
        this.a1 = bArr;
        this.b1 = iArr;
    }

    private final Object writeReplace() {
        C8859ps x0 = x0();
        C6562gT0.n(x0, "null cannot be cast to non-null type java.lang.Object");
        return x0;
    }

    @Override // o.C8859ps
    @NotNull
    public String A() {
        return x0().A();
    }

    @Override // o.C8859ps
    @NotNull
    public C8859ps B(@NotNull String str, @NotNull C8859ps c8859ps) {
        C6562gT0.p(str, "algorithm");
        C6562gT0.p(c8859ps, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c8859ps.r0(), str));
            int length = w0().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = v0()[length + i];
                int i4 = v0()[i];
                mac.update(w0()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = mac.doFinal();
            C6562gT0.o(doFinal, "doFinal(...)");
            return new C8859ps(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // o.C8859ps
    public int I(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "other");
        return x0().I(bArr, i);
    }

    @Override // o.C8859ps
    @NotNull
    public byte[] L() {
        return r0();
    }

    @Override // o.C8859ps
    public byte M(int i) {
        int i2;
        C8648p.e(v0()[w0().length - 1], i, 1L);
        int n = C8404o.n(this, i);
        if (n == 0) {
            i2 = 0;
        } else {
            i2 = v0()[n - 1];
        }
        return w0()[n][(i - i2) + v0()[w0().length + n]];
    }

    @Override // o.C8859ps
    public int Q(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "other");
        return x0().Q(bArr, i);
    }

    @Override // o.C8859ps
    public boolean X(int i, @NotNull C8859ps c8859ps, int i2, int i3) {
        int i4;
        C6562gT0.p(c8859ps, "other");
        if (i < 0 || i > g0() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = C8404o.n(this, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = v0()[n - 1];
            }
            int i6 = v0()[w0().length + n];
            int min = Math.min(i5, (v0()[n] - i4) + i4) - i;
            if (!c8859ps.Y(i2, w0()[n], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @Override // o.C8859ps
    public boolean Y(int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4;
        C6562gT0.p(bArr, "other");
        if (i < 0 || i > g0() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int n = C8404o.n(this, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = v0()[n - 1];
            }
            int i6 = v0()[w0().length + n];
            int min = Math.min(i5, (v0()[n] - i4) + i4) - i;
            if (!C8648p.d(w0()[n], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @Override // o.C8859ps
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8859ps) {
            C8859ps c8859ps = (C8859ps) obj;
            if (c8859ps.g0() == g0() && X(0, c8859ps, 0, g0())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C8859ps
    @NotNull
    public ByteBuffer h() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(r0()).asReadOnlyBuffer();
        C6562gT0.o(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    @Override // o.C8859ps
    public int hashCode() {
        int x = x();
        if (x != 0) {
            return x;
        }
        int length = w0().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = v0()[length + i];
            int i5 = v0()[i];
            byte[] bArr = w0()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        b0(i2);
        return i2;
    }

    @Override // o.C8859ps
    @NotNull
    public String i() {
        return x0().i();
    }

    @Override // o.C8859ps
    @NotNull
    public String j() {
        return x0().j();
    }

    @Override // o.C8859ps
    @NotNull
    public String j0(@NotNull Charset charset) {
        C6562gT0.p(charset, C4317Th1.g);
        return x0().j0(charset);
    }

    @Override // o.C8859ps
    public void m(int i, @NotNull byte[] bArr, int i2, int i3) {
        int i4;
        C6562gT0.p(bArr, "target");
        long j = i3;
        C8648p.e(g0(), i, j);
        C8648p.e(bArr.length, i2, j);
        int i5 = i3 + i;
        int n = C8404o.n(this, i);
        while (i < i5) {
            if (n == 0) {
                i4 = 0;
            } else {
                i4 = v0()[n - 1];
            }
            int i6 = v0()[w0().length + n];
            int min = Math.min(i5, (v0()[n] - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            C4788Ye.v0(w0()[n], bArr, i2, i7, i7 + min);
            i2 += min;
            i += min;
            n++;
        }
    }

    @Override // o.C8859ps
    @NotNull
    public C8859ps n0(int i, int i2) {
        int l = C8648p.l(this, i2);
        if (i >= 0) {
            if (l <= g0()) {
                int i3 = l - i;
                if (i3 >= 0) {
                    if (i == 0 && l == g0()) {
                        return this;
                    }
                    if (i == l) {
                        return C8859ps.Z0;
                    }
                    int n = C8404o.n(this, i);
                    int n2 = C8404o.n(this, l - 1);
                    byte[][] bArr = (byte[][]) C4788Ye.l1(w0(), n, n2 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    int i4 = 0;
                    if (n <= n2) {
                        int i5 = n;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(v0()[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr.length] = v0()[w0().length + i5];
                            if (i5 == n2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (n != 0) {
                        i4 = v0()[n - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i - i4);
                    return new VZ1(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + l + " < beginIndex=" + i).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + l + " > length(" + g0() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
    }

    @Override // o.C8859ps
    @NotNull
    public C8859ps p0() {
        return x0().p0();
    }

    @Override // o.C8859ps
    @NotNull
    public C8859ps q(@NotNull String str) {
        C6562gT0.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = w0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = v0()[length + i];
            int i4 = v0()[i];
            messageDigest.update(w0()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        C6562gT0.m(digest);
        return new C8859ps(digest);
    }

    @Override // o.C8859ps
    @NotNull
    public C8859ps q0() {
        return x0().q0();
    }

    @Override // o.C8859ps
    @NotNull
    public byte[] r0() {
        byte[] bArr = new byte[g0()];
        int length = w0().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = v0()[length + i];
            int i5 = v0()[i];
            int i6 = i5 - i2;
            C4788Ye.v0(w0()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o.C8859ps
    public void t0(@NotNull OutputStream outputStream) throws IOException {
        C6562gT0.p(outputStream, "out");
        int length = w0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = v0()[length + i];
            int i4 = v0()[i];
            outputStream.write(w0()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // o.C8859ps
    @NotNull
    public String toString() {
        return x0().toString();
    }

    @Override // o.C8859ps
    public void u0(@NotNull C5422bq c5422bq, int i, int i2) {
        int i3;
        C6562gT0.p(c5422bq, H.a.b);
        int i4 = i + i2;
        int n = C8404o.n(this, i);
        while (i < i4) {
            if (n == 0) {
                i3 = 0;
            } else {
                i3 = v0()[n - 1];
            }
            int i5 = v0()[w0().length + n];
            int min = Math.min(i4, (v0()[n] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            PZ1 pz1 = new PZ1(w0()[n], i6, i6 + min, true, false);
            PZ1 pz12 = c5422bq.X;
            if (pz12 == null) {
                pz1.g = pz1;
                pz1.f = pz1;
                c5422bq.X = pz1;
            } else {
                C6562gT0.m(pz12);
                PZ1 pz13 = pz12.g;
                C6562gT0.m(pz13);
                pz13.c(pz1);
            }
            i += min;
            n++;
        }
        c5422bq.R(c5422bq.size() + i2);
    }

    @NotNull
    public final int[] v0() {
        return this.b1;
    }

    @NotNull
    public final byte[][] w0() {
        return this.a1;
    }

    public final C8859ps x0() {
        return new C8859ps(r0());
    }

    @Override // o.C8859ps
    public int y() {
        return v0()[w0().length - 1];
    }
}
