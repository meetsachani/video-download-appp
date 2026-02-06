package org.jsoup.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.function.Supplier;
import o.C4185Rz0;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SoftPool;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.CharacterReader;

/* loaded from: classes4.dex */
public final class CharacterReader implements AutoCloseable {
    public static final char i1 = 65535;
    public static final int j1 = 12;
    public static final int k1 = 512;
    public static final int m1 = 2048;
    public static final int n1 = 1024;
    public static final int o1 = 1024;
    public String[] X;
    public Reader Y;
    public int Y0;
    public char[] Z;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public boolean d1;
    public ArrayList<Integer> e1;
    public int f1;
    public String g1;
    public int h1;
    public static final SoftPool<String[]> l1 = new SoftPool<>(new Supplier() { // from class: o.uB
        @Override // java.util.function.Supplier
        public final Object get() {
            return CharacterReader.m();
        }
    });
    public static final SoftPool<char[]> p1 = new SoftPool<>(new Supplier() { // from class: o.vB
        @Override // java.util.function.Supplier
        public final Object get() {
            return CharacterReader.i();
        }
    });

    @FunctionalInterface
    /* loaded from: classes4.dex */
    public interface CharPredicate {
        boolean a(char c);
    }

    public CharacterReader(Reader reader, int i) {
        this(reader);
    }

    public static /* synthetic */ boolean a(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '>') {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean d(boolean z, char c) {
        if (c != 0 && c != '&') {
            if (z) {
                if (c != '\'') {
                    return true;
                }
                return false;
            } else if (c != '\"') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean f(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean h(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c == c2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ char[] i() {
        return new char[2048];
    }

    public static /* synthetic */ boolean j(char c) {
        if (c != '&' && c != '<' && c != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean k(char c) {
        if (c != '<' && c != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean l(char[] cArr, char c) {
        if (Arrays.binarySearch(cArr, c) < 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String[] m() {
        return new String[512];
    }

    public static String p(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        for (int i5 = i; i5 < i3; i5++) {
            i4 = (i4 * 31) + cArr[i5];
        }
        int i6 = i4 & C4185Rz0.u;
        String str = strArr[i6];
        if (str != null && u0(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    public static boolean u0(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 != 0) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                if (cArr[i] != str.charAt(i3)) {
                    return false;
                }
                i = i5;
                i2 = i4;
                i3 = i6;
            } else {
                return true;
            }
        }
    }

    public String A(CharPredicate charPredicate) {
        return C(charPredicate, -1);
    }

    public void A0() {
        int i = this.c1;
        if (i != -1) {
            this.Y0 = i;
            E0();
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    public final void B0() {
        if (T()) {
            if (this.e1.size() > 0) {
                int U = U(this.b1);
                if (U == -1) {
                    U = 0;
                }
                Integer num = this.e1.get(U);
                num.intValue();
                this.f1 += U;
                this.e1.clear();
                this.e1.add(num);
            }
            for (int i = this.Y0; i < this.Z0; i++) {
                if (this.Z[i] == '\n') {
                    this.e1.add(Integer.valueOf(this.b1 + 1 + i));
                }
            }
        }
    }

    public String C(CharPredicate charPredicate, int i) {
        o();
        int i2 = this.Y0;
        int i3 = this.Z0;
        char[] cArr = this.Z;
        int i4 = i2;
        while (i4 < i3 && ((i == -1 || i4 - i2 < i) && charPredicate.a(cArr[i4]))) {
            i4++;
        }
        this.Y0 = i4;
        if (i4 > i2) {
            return p(this.Z, this.X, i2, i4 - i2);
        }
        return "";
    }

    public void C0(boolean z) {
        if (z && this.e1 == null) {
            this.e1 = new ArrayList<>(25);
            B0();
        } else if (!z) {
            this.e1 = null;
        }
    }

    public void D0() {
        int i = this.Y0;
        if (i >= 1) {
            this.Y0 = i - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }

    public String E() {
        return A(new CharPredicate() { // from class: org.jsoup.parser.c
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.k(c);
            }
        });
    }

    public void E0() {
        this.c1 = -1;
    }

    public String F() {
        return A(new CharPredicate() { // from class: org.jsoup.parser.e
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.a(c);
            }
        });
    }

    public String G(char c) {
        int m0 = m0(c);
        if (m0 != -1) {
            String p = p(this.Z, this.X, this.Y0, m0);
            this.Y0 += m0;
            return p;
        }
        return N();
    }

    public String H(String str) {
        int n0 = n0(str);
        if (n0 != -1) {
            String p = p(this.Z, this.X, this.Y0, n0);
            this.Y0 += n0;
            return p;
        } else if (this.Z0 - this.Y0 < str.length()) {
            return N();
        } else {
            int length = (this.Z0 - str.length()) + 1;
            char[] cArr = this.Z;
            String[] strArr = this.X;
            int i = this.Y0;
            String p2 = p(cArr, strArr, i, length - i);
            this.Y0 = length;
            return p2;
        }
    }

    public String I(final char... cArr) {
        return A(new CharPredicate() { // from class: org.jsoup.parser.b
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.h(cArr, c);
            }
        });
    }

    public String M(final char... cArr) {
        return A(new CharPredicate() { // from class: org.jsoup.parser.d
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.l(cArr, c);
            }
        });
    }

    public String N() {
        o();
        char[] cArr = this.Z;
        String[] strArr = this.X;
        int i = this.Y0;
        String p = p(cArr, strArr, i, this.Z0 - i);
        this.Y0 = this.Z0;
        return p;
    }

    public boolean O(String str) {
        boolean z = false;
        int i = -1;
        if (str.equals(this.g1)) {
            int i2 = this.h1;
            if (i2 == -1) {
                return false;
            }
            if (i2 >= this.Y0) {
                return true;
            }
        }
        this.g1 = str;
        Locale locale = Locale.ENGLISH;
        int n0 = n0(str.toLowerCase(locale));
        if (n0 > -1) {
            this.h1 = this.Y0 + n0;
            return true;
        }
        int n02 = n0(str.toUpperCase(locale));
        if (n02 > -1) {
            z = true;
        }
        if (z) {
            i = this.Y0 + n02;
        }
        this.h1 = i;
        return z;
    }

    public char P() {
        o();
        if (S()) {
            return (char) 65535;
        }
        return this.Z[this.Y0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        r4.d1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i = this.b1;
        int i2 = this.Y0;
        this.b1 = i + i2;
        int i3 = this.Z0 - i2;
        this.Z0 = i3;
        if (i3 > 0) {
            char[] cArr = this.Z;
            System.arraycopy(cArr, i2, cArr, 0, i3);
        }
        this.Y0 = 0;
        while (true) {
            int i4 = this.Z0;
            if (i4 >= 2048) {
                break;
            }
            try {
                Reader reader = this.Y;
                char[] cArr2 = this.Z;
                int read = reader.read(cArr2, i4, cArr2.length - i4);
                if (read == -1) {
                    break;
                } else if (read == 0) {
                    break;
                } else {
                    this.Z0 += read;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        this.a1 = Math.min(this.Z0, 1024);
        B0();
        this.g1 = null;
    }

    public boolean R() {
        o();
        if (this.Y0 >= this.Z0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.Y0 >= this.Z0) {
            return true;
        }
        return false;
    }

    public boolean T() {
        if (this.e1 != null) {
            return true;
        }
        return false;
    }

    public final int U(int i) {
        if (!T()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.e1, Integer.valueOf(i));
        if (binarySearch < -1) {
            return Math.abs(binarySearch) - 2;
        }
        return binarySearch;
    }

    public int V() {
        return W(p0());
    }

    public int W(int i) {
        if (!T()) {
            return 1;
        }
        int U = U(i);
        if (U == -1) {
            return this.f1;
        }
        return U + this.f1 + 1;
    }

    public void Z() {
        if (this.Z0 - this.Y0 < 1024) {
            this.a1 = 0;
        }
        o();
        this.c1 = this.Y0;
    }

    public boolean a0(String str) {
        o();
        if (e0(str)) {
            this.Y0 += str.length();
            return true;
        }
        return false;
    }

    public boolean b0(String str) {
        if (l0(str)) {
            this.Y0 += str.length();
            return true;
        }
        return false;
    }

    public boolean c0(char c) {
        if (!R() && this.Z[this.Y0] == c) {
            return true;
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Reader reader = this.Y;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
            this.Y = null;
            Arrays.fill(this.Z, (char) 0);
            p1.d(this.Z);
            this.Z = null;
            l1.d(this.X);
        } catch (IOException unused) {
            this.Y = null;
            Arrays.fill(this.Z, (char) 0);
            p1.d(this.Z);
            this.Z = null;
            l1.d(this.X);
        } catch (Throwable th) {
            this.Y = null;
            Arrays.fill(this.Z, (char) 0);
            p1.d(this.Z);
            this.Z = null;
            l1.d(this.X);
            this.X = null;
            throw th;
        }
        this.X = null;
    }

    public boolean e0(String str) {
        o();
        int length = str.length();
        if (length > this.Z0 - this.Y0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.Z[this.Y0 + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean g0(char... cArr) {
        if (R()) {
            return false;
        }
        o();
        char c = this.Z[this.Y0];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public boolean i0(char[] cArr) {
        o();
        if (!R() && Arrays.binarySearch(cArr, this.Z[this.Y0]) >= 0) {
            return true;
        }
        return false;
    }

    public boolean j0() {
        if (R()) {
            return false;
        }
        return StringUtil.j(this.Z[this.Y0]);
    }

    public boolean k0() {
        if (R()) {
            return false;
        }
        return StringUtil.l(this.Z[this.Y0]);
    }

    public boolean l0(String str) {
        o();
        int length = str.length();
        if (length > this.Z0 - this.Y0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char c = this.Z[this.Y0 + i];
            if (charAt != c && Character.toUpperCase(charAt) != Character.toUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public int m0(char c) {
        o();
        for (int i = this.Y0; i < this.Z0; i++) {
            if (c == this.Z[i]) {
                return i - this.Y0;
            }
        }
        return -1;
    }

    public void n() {
        this.Y0++;
    }

    public int n0(CharSequence charSequence) {
        o();
        char charAt = charSequence.charAt(0);
        int i = this.Y0;
        while (i < this.Z0) {
            if (charAt != this.Z[i]) {
                do {
                    i++;
                    if (i >= this.Z0) {
                        break;
                    }
                } while (charAt != this.Z[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.Z0;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.Z[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.Y0;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final void o() {
        if (!this.d1 && this.Y0 >= this.a1 && this.c1 == -1) {
            Q();
        }
    }

    public int p0() {
        return this.b1 + this.Y0;
    }

    public int q() {
        return r(p0());
    }

    public String q0() {
        return V() + ":" + q();
    }

    public int r(int i) {
        if (!T()) {
            return i + 1;
        }
        int U = U(i);
        if (U == -1) {
            return i + 1;
        }
        return (i - this.e1.get(U).intValue()) + 1;
    }

    public boolean r0(int i, int i2, String str) {
        return u0(this.Z, i, i2, str);
    }

    public char s() {
        char c;
        o();
        if (S()) {
            c = 65535;
        } else {
            c = this.Z[this.Y0];
        }
        this.Y0++;
        return c;
    }

    public String t(final boolean z) {
        return A(new CharPredicate() { // from class: org.jsoup.parser.g
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.d(z, c);
            }
        });
    }

    public String toString() {
        int i = this.Z0;
        int i2 = this.Y0;
        if (i - i2 < 0) {
            return "";
        }
        return new String(this.Z, i2, i - i2);
    }

    public String u() {
        return A(new CharPredicate() { // from class: org.jsoup.parser.f
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.j(c);
            }
        });
    }

    public String v() {
        return A(new CharPredicate() { // from class: org.jsoup.parser.h
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return CharacterReader.f(c);
            }
        });
    }

    public String x() {
        return A(new i());
    }

    public String y() {
        return A(new CharPredicate() { // from class: org.jsoup.parser.a
            @Override // org.jsoup.parser.CharacterReader.CharPredicate
            public final boolean a(char c) {
                return Character.isLetter(c);
            }
        });
    }

    public boolean y0() {
        return this.d1;
    }

    public String z() {
        o();
        int i = this.Y0;
        while (true) {
            int i2 = this.Y0;
            if (i2 >= this.Z0 || !StringUtil.j(this.Z[i2])) {
                break;
            }
            this.Y0++;
        }
        while (!S() && StringUtil.l(this.Z[this.Y0])) {
            this.Y0++;
        }
        return p(this.Z, this.X, i, this.Y0 - i);
    }

    public CharacterReader(Reader reader) {
        this.a1 = 0;
        this.c1 = -1;
        this.e1 = null;
        this.f1 = 1;
        Validate.q(reader);
        this.Y = reader;
        this.Z = p1.b();
        this.X = l1.b();
        o();
    }

    public CharacterReader(String str) {
        this(new StringReader(str));
    }
}
