package o;

import com.facebook.internal.H;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
/* renamed from: o.ps  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8859ps implements Serializable, Comparable<C8859ps> {
    @NotNull
    public static final a Y0 = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final C8859ps Z0 = new C8859ps(new byte[0]);
    private static final long serialVersionUID = 1;
    @NotNull
    public final byte[] X;
    public transient int Y;
    @Nullable
    public transient String Z;

    @InterfaceC8303na2({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    /* renamed from: o.ps$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ C8859ps k(a aVar, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = HB.b;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ C8859ps p(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C8648p.f();
            }
            return aVar.o(bArr, i, i2);
        }

        @InterfaceC8046mW0(name = "-deprecated_decodeBase64")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @Nullable
        public final C8859ps a(@NotNull String str) {
            C6562gT0.p(str, "string");
            return h(str);
        }

        @InterfaceC8046mW0(name = "-deprecated_decodeHex")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @NotNull
        public final C8859ps b(@NotNull String str) {
            C6562gT0.p(str, "string");
            return i(str);
        }

        @InterfaceC8046mW0(name = "-deprecated_encodeString")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @NotNull
        public final C8859ps c(@NotNull String str, @NotNull Charset charset) {
            C6562gT0.p(str, "string");
            C6562gT0.p(charset, C4317Th1.g);
            return j(str, charset);
        }

        @InterfaceC8046mW0(name = "-deprecated_encodeUtf8")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @NotNull
        public final C8859ps d(@NotNull String str) {
            C6562gT0.p(str, "string");
            return l(str);
        }

        @InterfaceC8046mW0(name = "-deprecated_of")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @NotNull
        public final C8859ps e(@NotNull ByteBuffer byteBuffer) {
            C6562gT0.p(byteBuffer, H.a.b);
            return m(byteBuffer);
        }

        @InterfaceC8046mW0(name = "-deprecated_of")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @NotNull
        public final C8859ps f(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "array");
            return o(bArr, i, i2);
        }

        @InterfaceC8046mW0(name = "-deprecated_read")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @NotNull
        public final C8859ps g(@NotNull InputStream inputStream, int i) {
            C6562gT0.p(inputStream, "inputstream");
            return q(inputStream, i);
        }

        @InterfaceC9511sW0
        @Nullable
        public final C8859ps h(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            byte[] a = C4976a.a(str);
            if (a != null) {
                return new C8859ps(a);
            }
            return null;
        }

        @InterfaceC9511sW0
        @NotNull
        public final C8859ps i(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) ((C5461c.b(str.charAt(i2)) << 4) + C5461c.b(str.charAt(i2 + 1)));
                }
                return new C8859ps(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "encodeString")
        @NotNull
        public final C8859ps j(@NotNull String str, @NotNull Charset charset) {
            C6562gT0.p(str, "<this>");
            C6562gT0.p(charset, C4317Th1.g);
            byte[] bytes = str.getBytes(charset);
            C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return new C8859ps(bytes);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C8859ps l(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            C8859ps c8859ps = new C8859ps(GO2.a(str));
            c8859ps.c0(str);
            return c8859ps;
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "of")
        @NotNull
        public final C8859ps m(@NotNull ByteBuffer byteBuffer) {
            C6562gT0.p(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C8859ps(bArr);
        }

        @InterfaceC9511sW0
        @NotNull
        public final C8859ps n(@NotNull byte... bArr) {
            C6562gT0.p(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C6562gT0.o(copyOf, "copyOf(this, size)");
            return new C8859ps(copyOf);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "of")
        @NotNull
        public final C8859ps o(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "<this>");
            int m = C8648p.m(bArr, i2);
            C8648p.e(bArr.length, i, m);
            return new C8859ps(C4788Ye.f1(bArr, i, m + i));
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "read")
        @NotNull
        public final C8859ps q(@NotNull InputStream inputStream, int i) throws IOException {
            C6562gT0.p(inputStream, "<this>");
            if (i >= 0) {
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C8859ps(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }

        public a() {
        }
    }

    public C8859ps(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "data");
        this.X = bArr;
    }

    public static /* synthetic */ int J(C8859ps c8859ps, C8859ps c8859ps2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c8859ps.G(c8859ps2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int K(C8859ps c8859ps, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c8859ps.I(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int R(C8859ps c8859ps, C8859ps c8859ps2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C8648p.f();
            }
            return c8859ps.O(c8859ps2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int S(C8859ps c8859ps, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C8648p.f();
            }
            return c8859ps.Q(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "of")
    @NotNull
    public static final C8859ps U(@NotNull ByteBuffer byteBuffer) {
        return Y0.m(byteBuffer);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C8859ps V(@NotNull byte... bArr) {
        return Y0.n(bArr);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "of")
    @NotNull
    public static final C8859ps W(@NotNull byte[] bArr, int i, int i2) {
        return Y0.o(bArr, i, i2);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "read")
    @NotNull
    public static final C8859ps Z(@NotNull InputStream inputStream, int i) throws IOException {
        return Y0.q(inputStream, i);
    }

    public static /* synthetic */ void n(C8859ps c8859ps, int i, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i = 0;
            }
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            c8859ps.m(i, bArr, i2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C8859ps o(@NotNull String str) {
        return Y0.h(str);
    }

    public static /* synthetic */ C8859ps o0(C8859ps c8859ps, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = C8648p.f();
            }
            return c8859ps.n0(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C8859ps p(@NotNull String str) {
        return Y0.i(str);
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "encodeString")
    @NotNull
    public static final C8859ps r(@NotNull String str, @NotNull Charset charset) {
        return Y0.j(str, charset);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        C8859ps q = Y0.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = C8859ps.class.getDeclaredField("X");
        declaredField.setAccessible(true);
        declaredField.set(this, q.X);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C8859ps s(@NotNull String str) {
        return Y0.l(str);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.X.length);
        objectOutputStream.write(this.X);
    }

    @NotNull
    public String A() {
        byte[] w;
        char[] cArr = new char[w().length * 2];
        int i = 0;
        for (byte b : w()) {
            int i2 = i + 1;
            cArr[i] = C5461c.J()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = C5461c.J()[b & C8077mf.q];
        }
        return C9545sf2.L1(cArr);
    }

    @NotNull
    public C8859ps B(@NotNull String str, @NotNull C8859ps c8859ps) {
        C6562gT0.p(str, "algorithm");
        C6562gT0.p(c8859ps, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c8859ps.r0(), str));
            byte[] doFinal = mac.doFinal(this.X);
            C6562gT0.o(doFinal, "doFinal(...)");
            return new C8859ps(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public C8859ps C(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "key");
        return B("HmacSHA1", c8859ps);
    }

    @NotNull
    public C8859ps D(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "key");
        return B("HmacSHA256", c8859ps);
    }

    @NotNull
    public C8859ps E(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "key");
        return B("HmacSHA512", c8859ps);
    }

    @InterfaceC8289nW0
    public final int F(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "other");
        return J(this, c8859ps, 0, 2, null);
    }

    @InterfaceC8289nW0
    public final int G(@NotNull C8859ps c8859ps, int i) {
        C6562gT0.p(c8859ps, "other");
        return I(c8859ps.L(), i);
    }

    @InterfaceC8289nW0
    public final int H(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "other");
        return K(this, bArr, 0, 2, null);
    }

    @InterfaceC8289nW0
    public int I(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "other");
        int length = w().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C8648p.d(w(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    @NotNull
    public byte[] L() {
        return w();
    }

    public byte M(int i) {
        return w()[i];
    }

    @InterfaceC8289nW0
    public final int N(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "other");
        return R(this, c8859ps, 0, 2, null);
    }

    @InterfaceC8289nW0
    public final int O(@NotNull C8859ps c8859ps, int i) {
        C6562gT0.p(c8859ps, "other");
        return Q(c8859ps.L(), i);
    }

    @InterfaceC8289nW0
    public final int P(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "other");
        return S(this, bArr, 0, 2, null);
    }

    @InterfaceC8289nW0
    public int Q(@NotNull byte[] bArr, int i) {
        C6562gT0.p(bArr, "other");
        for (int min = Math.min(C8648p.l(this, i), w().length - bArr.length); -1 < min; min--) {
            if (C8648p.d(w(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public final C8859ps T() {
        return q("MD5");
    }

    public boolean X(int i, @NotNull C8859ps c8859ps, int i2, int i3) {
        C6562gT0.p(c8859ps, "other");
        return c8859ps.Y(i2, w(), i, i3);
    }

    public boolean Y(int i, @NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "other");
        if (i >= 0 && i <= w().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C8648p.d(w(), i, bArr, i2, i3)) {
            return true;
        }
        return false;
    }

    public final void b0(int i) {
        this.Y = i;
    }

    public final void c0(@Nullable String str) {
        this.Z = str;
    }

    @NotNull
    public final C8859ps d0() {
        return q("SHA-1");
    }

    @InterfaceC8046mW0(name = "-deprecated_getByte")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to operator function", replaceWith = @IR1(expression = "this[index]", imports = {}))
    public final byte e(int i) {
        return v(i);
    }

    @NotNull
    public final C8859ps e0() {
        return q(com.facebook.internal.l0.e);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8859ps) {
            C8859ps c8859ps = (C8859ps) obj;
            if (c8859ps.g0() == w().length && c8859ps.Y(0, w(), 0, w().length)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final C8859ps f0() {
        return q("SHA-512");
    }

    @InterfaceC8046mW0(name = "-deprecated_size")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "size", imports = {}))
    public final int g() {
        return g0();
    }

    @InterfaceC8046mW0(name = "size")
    public final int g0() {
        return y();
    }

    @NotNull
    public ByteBuffer h() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.X).asReadOnlyBuffer();
        C6562gT0.o(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    public final boolean h0(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "prefix");
        return X(0, c8859ps, 0, c8859ps.g0());
    }

    public int hashCode() {
        int x = x();
        if (x != 0) {
            return x;
        }
        int hashCode = Arrays.hashCode(w());
        b0(hashCode);
        return hashCode;
    }

    @NotNull
    public String i() {
        return C4976a.c(w(), null, 1, null);
    }

    public final boolean i0(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "prefix");
        return Y(0, bArr, 0, bArr.length);
    }

    @NotNull
    public String j() {
        return C4976a.b(w(), C4976a.f());
    }

    @NotNull
    public String j0(@NotNull Charset charset) {
        C6562gT0.p(charset, C4317Th1.g);
        return new String(this.X, charset);
    }

    @InterfaceC8289nW0
    @NotNull
    public final C8859ps k0() {
        return o0(this, 0, 0, 3, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: l */
    public int compareTo(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "other");
        int g0 = g0();
        int g02 = c8859ps.g0();
        int min = Math.min(g0, g02);
        for (int i = 0; i < min; i++) {
            int v = v(i) & 255;
            int v2 = c8859ps.v(i) & 255;
            if (v != v2) {
                if (v < v2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (g0 == g02) {
            return 0;
        }
        if (g0 < g02) {
            return -1;
        }
        return 1;
    }

    @InterfaceC8289nW0
    @NotNull
    public final C8859ps l0(int i) {
        return o0(this, i, 0, 2, null);
    }

    public void m(int i, @NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(bArr, "target");
        C4788Ye.v0(w(), bArr, i2, i, i3 + i);
    }

    @InterfaceC8289nW0
    @NotNull
    public C8859ps n0(int i, int i2) {
        int l = C8648p.l(this, i2);
        if (i >= 0) {
            if (l <= w().length) {
                if (l - i >= 0) {
                    if (i == 0 && l == w().length) {
                        return this;
                    }
                    return new C8859ps(C4788Ye.f1(w(), i, l));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + w().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    @NotNull
    public C8859ps p0() {
        for (int i = 0; i < w().length; i++) {
            byte b = w()[i];
            if (b >= 65 && b <= 90) {
                byte[] w = w();
                byte[] copyOf = Arrays.copyOf(w, w.length);
                C6562gT0.o(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C8859ps(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public C8859ps q(@NotNull String str) {
        C6562gT0.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.X, 0, g0());
        byte[] digest = messageDigest.digest();
        C6562gT0.m(digest);
        return new C8859ps(digest);
    }

    @NotNull
    public C8859ps q0() {
        for (int i = 0; i < w().length; i++) {
            byte b = w()[i];
            if (b >= 97 && b <= 122) {
                byte[] w = w();
                byte[] copyOf = Arrays.copyOf(w, w.length);
                C6562gT0.o(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new C8859ps(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] r0() {
        byte[] w = w();
        byte[] copyOf = Arrays.copyOf(w, w.length);
        C6562gT0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public String s0() {
        String z = z();
        if (z == null) {
            String c = GO2.c(L());
            c0(c);
            return c;
        }
        return z;
    }

    public final boolean t(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "suffix");
        return X(g0() - c8859ps.g0(), c8859ps, 0, c8859ps.g0());
    }

    public void t0(@NotNull OutputStream outputStream) throws IOException {
        C6562gT0.p(outputStream, "out");
        outputStream.write(this.X);
    }

    @NotNull
    public String toString() {
        C8859ps c8859ps;
        if (w().length == 0) {
            return "[size=0]";
        }
        int a2 = C5461c.a(w(), 64);
        if (a2 == -1) {
            if (w().length <= 64) {
                return "[hex=" + A() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(w().length);
            sb.append(" hex=");
            int l = C8648p.l(this, 64);
            if (l <= w().length) {
                if (l >= 0) {
                    if (l == w().length) {
                        c8859ps = this;
                    } else {
                        c8859ps = new C8859ps(C4788Ye.f1(w(), 0, l));
                    }
                    sb.append(c8859ps.A());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + w().length + ')').toString());
        }
        String s0 = s0();
        String substring = s0.substring(0, a2);
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String z2 = C9545sf2.z2(C9545sf2.z2(C9545sf2.z2(substring, C11298zs.h, "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (a2 < s0.length()) {
            return "[size=" + w().length + " text=" + z2 + "…]";
        }
        return "[text=" + z2 + ']';
    }

    public final boolean u(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "suffix");
        return Y(g0() - bArr.length, bArr, 0, bArr.length);
    }

    public void u0(@NotNull C5422bq c5422bq, int i, int i2) {
        C6562gT0.p(c5422bq, H.a.b);
        C5461c.H(this, c5422bq, i, i2);
    }

    @InterfaceC8046mW0(name = "getByte")
    public final byte v(int i) {
        return M(i);
    }

    @NotNull
    public final byte[] w() {
        return this.X;
    }

    public final int x() {
        return this.Y;
    }

    public int y() {
        return w().length;
    }

    @Nullable
    public final String z() {
        return this.Z;
    }
}
