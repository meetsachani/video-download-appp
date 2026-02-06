package o;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* renamed from: o.Cp0 */
/* loaded from: classes4.dex */
public final class EnumC2674Cp0 {
    public static final EnumC2674Cp0 h1;
    public static final EnumC2674Cp0 i1;
    public static final EnumC2674Cp0 j1;
    public static final EnumC2674Cp0 k1;
    public static final boolean l1;
    public static final boolean m1;
    public static final String n1 = "Windows";
    public static final boolean o1;
    public static final EnumC2674Cp0 p1;
    public static final /* synthetic */ EnumC2674Cp0[] q1;
    public static final /* synthetic */ boolean r1 = false;
    public final int X;
    public final boolean Y;
    public final int[] Y0;
    public final boolean Z;
    public final int Z0;
    public final int a1;
    public final String[] b1;
    public final boolean c1;
    public final boolean d1;
    public final char e1;
    public final char f1;
    public final b g1;

    /* renamed from: o.Cp0$b */
    /* loaded from: classes4.dex */
    public static abstract class b {
        public static final b X = new a("BYTES", 0);
        public static final b Y = new C0170b("UTF16_CODE_UNITS", 1);
        public static final /* synthetic */ b[] Z = e();

        /* renamed from: o.Cp0$b$a */
        /* loaded from: classes4.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.EnumC2674Cp0.b
            public int g(CharSequence charSequence, Charset charset) {
                CharsetEncoder newEncoder = charset.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                try {
                    return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(charSequence)).remaining();
                } catch (CharacterCodingException unused) {
                    return Integer.MAX_VALUE;
                }
            }

            @Override // o.EnumC2674Cp0.b
            public CharSequence i(CharSequence charSequence, int i, Charset charset) {
                CharsetEncoder newEncoder = charset.newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                if (onUnmappableCharacter.canEncode(charSequence)) {
                    if (charSequence.length() > Math.floor(i / onUnmappableCharacter.maxBytesPerChar())) {
                        CharSequence[] H = EnumC2674Cp0.H(charSequence);
                        int g = g(H[1], charset);
                        if (g > 0 && g >= i) {
                            throw new IllegalArgumentException("The extension of " + ((Object) charSequence) + " is too long to fit within " + i + " bytes");
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(i - g);
                        CharBuffer wrap = CharBuffer.wrap(H[0]);
                        if (!onUnmappableCharacter.encode(wrap, allocate, true).isUnderflow()) {
                            CharSequence G = EnumC2674Cp0.G(charSequence, wrap.position());
                            if (g == 0) {
                                return G;
                            }
                            return G.toString() + ((Object) H[1]);
                        }
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("The value " + ((Object) charSequence) + " cannot be encoded using " + charset.name());
            }
        }

        /* renamed from: o.Cp0$b$b */
        /* loaded from: classes4.dex */
        public enum C0170b extends b {
            public C0170b(String str, int i) {
                super(str, i);
            }

            @Override // o.EnumC2674Cp0.b
            public int g(CharSequence charSequence, Charset charset) {
                return charSequence.length();
            }

            @Override // o.EnumC2674Cp0.b
            public CharSequence i(CharSequence charSequence, int i, Charset charset) {
                Charset charset2 = StandardCharsets.UTF_16;
                if (charset2.newEncoder().canEncode(charSequence)) {
                    if (charSequence.length() <= i) {
                        return charSequence;
                    }
                    CharSequence[] H = EnumC2674Cp0.H(charSequence);
                    int length = H[1].length();
                    if (length <= 0 || length < i) {
                        CharSequence G = EnumC2674Cp0.G(charSequence, i - length);
                        if (length == 0) {
                            return G;
                        }
                        return G.toString() + ((Object) H[1]);
                    }
                    throw new IllegalArgumentException("The extension of " + ((Object) charSequence) + " is too long to fit within " + i + " characters");
                }
                throw new IllegalArgumentException("The value " + ((Object) charSequence) + " can not be encoded using " + charset2.name());
            }
        }

        public b(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ b[] e() {
            return new b[]{X, Y};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Z.clone();
        }

        public abstract int g(CharSequence charSequence, Charset charset);

        public final boolean h(CharSequence charSequence, int i, Charset charset) {
            if (g(charSequence, charset) <= i) {
                return true;
            }
            return false;
        }

        public abstract CharSequence i(CharSequence charSequence, int i, Charset charset);
    }

    static {
        b bVar = b.X;
        h1 = new EnumC2674Cp0("GENERIC", 0, 4096, false, false, 1020, 1048576, new int[]{0}, new String[0], false, false, '/', bVar);
        i1 = new EnumC2674Cp0("LINUX", 1, 8192, true, true, 255, 4096, new int[]{0, 47}, new String[0], false, false, '/', bVar);
        j1 = new EnumC2674Cp0("MAC_OSX", 2, 4096, true, true, 255, 1024, new int[]{0, 47, 58}, new String[0], false, false, '/', bVar);
        k1 = new EnumC2674Cp0("WINDOWS", 3, 4096, false, true, 255, 32767, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, 124}, new String[]{"AUX", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM²", "COM³", "COM¹", "CON", "CONIN$", "CONOUT$", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "LPT²", "LPT³", "LPT¹", "NUL", "PRN"}, true, true, '\\', b.Y);
        q1 = h();
        l1 = t("Linux");
        m1 = t("Mac");
        o1 = t("Windows");
        p1 = j();
    }

    public EnumC2674Cp0(String str, int i, int i2, boolean z, boolean z2, int i3, int i4, int[] iArr, String[] strArr, boolean z3, boolean z4, char c, b bVar) {
        super(str, i);
        this.X = i2;
        this.Z0 = i3;
        this.a1 = i4;
        Objects.requireNonNull(iArr, "illegalFileNameChars");
        this.Y0 = iArr;
        Objects.requireNonNull(strArr, "reservedFileNames");
        this.b1 = strArr;
        this.c1 = z3;
        this.Z = z;
        this.Y = z2;
        this.d1 = z4;
        this.e1 = c;
        this.f1 = C4837Yq0.k(c);
        this.g1 = bVar;
    }

    public static boolean C(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).startsWith(str2.toUpperCase(locale));
    }

    public static String F(String str, char c, char c2) {
        if (str == null) {
            return null;
        }
        return str.replace(c, c2);
    }

    public static CharSequence G(CharSequence charSequence, int i) {
        String str;
        if (charSequence.length() <= i) {
            return charSequence;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.ROOT);
        String charSequence2 = charSequence.toString();
        characterInstance.setText(charSequence2);
        int preceding = characterInstance.preceding(i + 1);
        if (preceding == 0) {
            if (i <= 1) {
                str = "1 character";
            } else {
                str = i + " characters";
            }
            throw new IllegalArgumentException("The value " + ((Object) charSequence) + " can not be truncated to " + str + " without breaking the first codepoint or grapheme cluster");
        }
        return charSequence2.substring(0, preceding);
    }

    public static CharSequence[] H(CharSequence charSequence) {
        int w = w(charSequence);
        return w < 1 ? new CharSequence[]{charSequence, ""} : new CharSequence[]{charSequence.subSequence(0, w), charSequence.subSequence(w, charSequence.length())};
    }

    public static CharSequence L(CharSequence charSequence) {
        int w = w(charSequence);
        if (w < 1) {
            return charSequence;
        }
        return charSequence.subSequence(0, w);
    }

    public static /* synthetic */ int e(EnumC2674Cp0 enumC2674Cp0, char c, int i) {
        if (enumC2674Cp0.z(i)) {
            return c;
        }
        return i;
    }

    public static /* synthetic */ boolean g(EnumC2674Cp0 enumC2674Cp0, int i) {
        return enumC2674Cp0.z(i);
    }

    public static /* synthetic */ EnumC2674Cp0[] h() {
        return new EnumC2674Cp0[]{h1, i1, j1, k1};
    }

    public static EnumC2674Cp0 j() {
        if (l1) {
            return i1;
        }
        if (m1) {
            return j1;
        }
        if (o1) {
            return k1;
        }
        return h1;
    }

    public static EnumC2674Cp0 m() {
        return p1;
    }

    public static boolean t(String str) {
        return C(v("os.name"), str);
    }

    public static String v(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            printStream.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static EnumC2674Cp0 valueOf(String str) {
        return (EnumC2674Cp0) Enum.valueOf(EnumC2674Cp0.class, str);
    }

    public static EnumC2674Cp0[] values() {
        return (EnumC2674Cp0[]) q1.clone();
    }

    public static int w(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(46);
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == '.') {
                return i;
            }
        }
        return -1;
    }

    public boolean A(CharSequence charSequence) {
        return B(charSequence, Charset.defaultCharset());
    }

    public boolean B(CharSequence charSequence, Charset charset) {
        if (charSequence != null && charSequence.length() != 0 && this.g1.h(charSequence, p(), charset) && !D(charSequence) && charSequence.chars().noneMatch(new IntPredicate() { // from class: o.Ap0
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return EnumC2674Cp0.g(EnumC2674Cp0.this, i);
            }
        })) {
            return true;
        }
        return false;
    }

    public boolean D(CharSequence charSequence) {
        if (this.c1) {
            charSequence = L(charSequence);
        }
        if (Arrays.binarySearch(this.b1, charSequence) >= 0) {
            return true;
        }
        return false;
    }

    public String E(String str) {
        return F(str, this.f1, this.e1);
    }

    public boolean I() {
        return this.d1;
    }

    public String J(CharSequence charSequence, final char c, Charset charset) {
        Object valueOf;
        Objects.requireNonNull(charSequence, "candidate");
        if (charSequence.length() != 0) {
            if (z(c)) {
                if (c == 0) {
                    valueOf = "\\0";
                } else {
                    valueOf = Character.valueOf(c);
                }
                throw new IllegalArgumentException(String.format("The replacement character '%s' cannot be one of the %s illegal characters: %s", valueOf, name(), Arrays.toString(this.Y0)));
            }
            int[] array = this.g1.i(charSequence, p(), charset).chars().map(new IntUnaryOperator() { // from class: o.zp0
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i) {
                    return EnumC2674Cp0.e(EnumC2674Cp0.this, c, i);
                }
            }).toArray();
            return new String(array, 0, array.length);
        }
        throw new IllegalArgumentException("The candidate file name is empty");
    }

    public String K(String str, char c) {
        return J(str, c, Charset.defaultCharset());
    }

    public int l() {
        return this.X;
    }

    public char[] n() {
        char[] cArr = new char[this.Y0.length];
        int i = 0;
        while (true) {
            int[] iArr = this.Y0;
            if (i < iArr.length) {
                cArr[i] = (char) iArr[i];
                i++;
            } else {
                return cArr;
            }
        }
    }

    public int[] o() {
        return (int[]) this.Y0.clone();
    }

    public int p() {
        return this.Z0;
    }

    public int q() {
        return this.a1;
    }

    public b r() {
        return this.g1;
    }

    public char s() {
        return this.e1;
    }

    public String[] u() {
        return (String[]) this.b1.clone();
    }

    public boolean x() {
        return this.Y;
    }

    public boolean y() {
        return this.Z;
    }

    public final boolean z(int i) {
        if (Arrays.binarySearch(this.Y0, i) >= 0) {
            return true;
        }
        return false;
    }
}
