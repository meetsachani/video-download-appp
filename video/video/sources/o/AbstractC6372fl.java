package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;

@InterfaceC7797la0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.fl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6372fl {
    public static final AbstractC6372fl a = new h("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final AbstractC6372fl b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final AbstractC6372fl c = new k("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final AbstractC6372fl d = new k("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    public static final AbstractC6372fl e = new g("base16()", C10671xH0.b);

    /* renamed from: o.fl$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC7382js {
        public final /* synthetic */ AbstractC7216jB a;

        public a(AbstractC7216jB abstractC7216jB) {
            this.a = abstractC7216jB;
        }

        @Override // o.AbstractC7382js
        public OutputStream c() throws IOException {
            return AbstractC6372fl.this.p(this.a.b());
        }
    }

    /* renamed from: o.fl$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC7625ks {
        public final /* synthetic */ AbstractC7459kB a;

        public b(AbstractC7459kB abstractC7459kB) {
            this.a = abstractC7459kB;
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return AbstractC6372fl.this.k(this.a.m());
        }
    }

    /* renamed from: o.fl$e */
    /* loaded from: classes3.dex */
    public class e extends Writer {
        public final /* synthetic */ Appendable X;
        public final /* synthetic */ Writer Y;

        public e(Appendable appendable, Writer writer) {
            this.X = appendable;
            this.Y = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.Y.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.Y.flush();
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.X.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.fl$f */
    /* loaded from: classes3.dex */
    public static final class f {
        public final String a;
        public final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        public final boolean[] h;

        public f(String str, char[] cArr) {
            String str2;
            boolean z;
            boolean z2;
            this.a = (String) C10664xF1.E(str);
            this.b = (char[]) C10664xF1.E(cArr);
            try {
                int p = C9979uR0.p(cArr.length, RoundingMode.UNNECESSARY);
                this.d = p;
                int min = Math.min(8, Integer.lowestOneBit(p));
                try {
                    this.e = 8 / min;
                    this.f = p / min;
                    this.c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        if (c < 128) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C10664xF1.f(z, "Non-ASCII character: %s", c);
                        if (bArr[c] == -1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C10664xF1.f(z2, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[C9979uR0.g(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                } catch (ArithmeticException e) {
                    String str3 = new String(cArr);
                    if (str3.length() != 0) {
                        str2 = "Illegal alphabet ".concat(str3);
                    } else {
                        str2 = new String("Illegal alphabet ");
                    }
                    throw new IllegalArgumentException(str2, e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        public boolean b(char c) {
            if (c <= 127 && this.g[c] != -1) {
                return true;
            }
            return false;
        }

        public int c(char c) throws i {
            String str;
            String str2;
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                if (valueOf.length() != 0) {
                    str2 = "Unrecognized character: 0x".concat(valueOf);
                } else {
                    str2 = new String("Unrecognized character: 0x");
                }
                throw new i(str2);
            }
            byte b = this.g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("Unrecognized character: ");
                    sb.append(c);
                    throw new i(sb.toString());
                }
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                if (valueOf2.length() != 0) {
                    str = "Unrecognized character: 0x".concat(valueOf2);
                } else {
                    str = new String("Unrecognized character: 0x");
                }
                throw new i(str);
            }
            return b;
        }

        public char d(int i) {
            return this.b[i];
        }

        public final boolean e() {
            for (char c : this.b) {
                if (C8077mf.c(c)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof f) {
                return Arrays.equals(this.b, ((f) obj).b);
            }
            return false;
        }

        public final boolean f() {
            for (char c : this.b) {
                if (C8077mf.d(c)) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i) {
            return this.h[i % this.e];
        }

        public f h() {
            if (!f()) {
                return this;
            }
            C10664xF1.h0(!e(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.b;
                if (i < cArr2.length) {
                    cArr[i] = C8077mf.e(cArr2[i]);
                    i++;
                } else {
                    return new f(String.valueOf(this.a).concat(".lowerCase()"), cArr);
                }
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public boolean i(char c) {
            byte[] bArr = this.g;
            if (c < bArr.length && bArr[c] != -1) {
                return true;
            }
            return false;
        }

        public f j() {
            if (!e()) {
                return this;
            }
            C10664xF1.h0(!f(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.b;
                if (i < cArr2.length) {
                    cArr[i] = C8077mf.h(cArr2[i]);
                    i++;
                } else {
                    return new f(String.valueOf(this.a).concat(".upperCase()"), cArr);
                }
            }
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: o.fl$g */
    /* loaded from: classes3.dex */
    public static final class g extends k {
        public final char[] j;

        public g(String str, String str2) {
            this(new f(str, str2.toCharArray()));
        }

        @Override // o.AbstractC6372fl.k
        public AbstractC6372fl D(f fVar, @MB Character ch) {
            return new g(fVar);
        }

        @Override // o.AbstractC6372fl.k, o.AbstractC6372fl
        public int i(byte[] bArr, CharSequence charSequence) throws i {
            C10664xF1.E(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f.c(charSequence.charAt(i)) << 4) | this.f.c(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new i(sb.toString());
        }

        @Override // o.AbstractC6372fl.k, o.AbstractC6372fl
        public void n(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C10664xF1.E(appendable);
            C10664xF1.f0(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.j[i4]);
                appendable.append(this.j[i4 | 256]);
            }
        }

        public g(f fVar) {
            super(fVar, null);
            this.j = new char[512];
            C10664xF1.d(fVar.b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.j[i] = fVar.d(i >>> 4);
                this.j[i | 256] = fVar.d(i & 15);
            }
        }
    }

    /* renamed from: o.fl$h */
    /* loaded from: classes3.dex */
    public static final class h extends k {
        public h(String str, String str2, @MB Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // o.AbstractC6372fl.k
        public AbstractC6372fl D(f fVar, @MB Character ch) {
            return new h(fVar, ch);
        }

        @Override // o.AbstractC6372fl.k, o.AbstractC6372fl
        public int i(byte[] bArr, CharSequence charSequence) throws i {
            C10664xF1.E(bArr);
            CharSequence y = y(charSequence);
            if (this.f.g(y.length())) {
                int i = 0;
                int i2 = 0;
                while (i < y.length()) {
                    int i3 = i + 2;
                    int c = (this.f.c(y.charAt(i)) << 18) | (this.f.c(y.charAt(i + 1)) << 12);
                    int i4 = i2 + 1;
                    bArr[i2] = (byte) (c >>> 16);
                    if (i3 < y.length()) {
                        int i5 = i + 3;
                        int c2 = c | (this.f.c(y.charAt(i3)) << 6);
                        int i6 = i2 + 2;
                        bArr[i4] = (byte) ((c2 >>> 8) & 255);
                        if (i5 < y.length()) {
                            i += 4;
                            i2 += 3;
                            bArr[i6] = (byte) ((c2 | this.f.c(y.charAt(i5))) & 255);
                        } else {
                            i2 = i6;
                            i = i5;
                        }
                    } else {
                        i2 = i4;
                        i = i3;
                    }
                }
                return i2;
            }
            int length = y.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new i(sb.toString());
        }

        @Override // o.AbstractC6372fl.k, o.AbstractC6372fl
        public void n(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C10664xF1.E(appendable);
            int i3 = i + i2;
            C10664xF1.f0(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 2;
                int i5 = (bArr[i + 1] & 255) << 8;
                i += 3;
                int i6 = i5 | ((bArr[i] & 255) << 16) | (bArr[i4] & 255);
                appendable.append(this.f.d(i6 >>> 18));
                appendable.append(this.f.d((i6 >>> 12) & 63));
                appendable.append(this.f.d((i6 >>> 6) & 63));
                appendable.append(this.f.d(i6 & 63));
                i2 -= 3;
            }
            if (i < i3) {
                C(appendable, bArr, i, i3 - i);
            }
        }

        public h(f fVar, @MB Character ch) {
            super(fVar, ch);
            C10664xF1.d(fVar.b.length == 64);
        }
    }

    /* renamed from: o.fl$i */
    /* loaded from: classes3.dex */
    public static final class i extends IOException {
        public i(String str) {
            super(str);
        }

        public i(Throwable th) {
            super(th);
        }
    }

    /* renamed from: o.fl$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC6372fl {
        public final AbstractC6372fl f;
        public final String g;
        public final int h;

        public j(AbstractC6372fl abstractC6372fl, String str, int i) {
            boolean z;
            this.f = (AbstractC6372fl) C10664xF1.E(abstractC6372fl);
            this.g = (String) C10664xF1.E(str);
            this.h = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.k(z, "Cannot add a separator after every %s chars", i);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl A(char c) {
            return this.f.A(c).B(this.g, this.h);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl B(String str, int i) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override // o.AbstractC6372fl
        public boolean f(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f.f(sb);
        }

        @Override // o.AbstractC6372fl
        public int i(byte[] bArr, CharSequence charSequence) throws i {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (this.g.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f.i(bArr, sb);
        }

        @Override // o.AbstractC6372fl
        @InterfaceC11149zF0
        public InputStream k(Reader reader) {
            return this.f.k(AbstractC6372fl.r(reader, this.g));
        }

        @Override // o.AbstractC6372fl
        public void n(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            this.f.n(AbstractC6372fl.w(appendable, this.g, this.h), bArr, i, i2);
        }

        @Override // o.AbstractC6372fl
        @InterfaceC11149zF0
        public OutputStream p(Writer writer) {
            return this.f.p(AbstractC6372fl.x(writer, this.g, this.h));
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl s() {
            return this.f.s().B(this.g, this.h);
        }

        @Override // o.AbstractC6372fl
        public int t(int i) {
            return this.f.t(i);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f);
            String str = this.g;
            int i = this.h;
            StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(".withSeparator(\"");
            sb.append(str);
            sb.append("\", ");
            sb.append(i);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        @Override // o.AbstractC6372fl
        public int u(int i) {
            int u = this.f.u(i);
            return u + (this.g.length() * C9979uR0.g(Math.max(0, u - 1), this.h, RoundingMode.FLOOR));
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl v() {
            return this.f.v().B(this.g, this.h);
        }

        @Override // o.AbstractC6372fl
        public CharSequence y(CharSequence charSequence) {
            return this.f.y(charSequence);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl z() {
            return this.f.z().B(this.g, this.h);
        }
    }

    /* renamed from: o.fl$k */
    /* loaded from: classes3.dex */
    public static class k extends AbstractC6372fl {
        public final f f;
        @MB
        public final Character g;
        @MB
        @SY0
        public transient AbstractC6372fl h;
        @MB
        @SY0
        public transient AbstractC6372fl i;

        /* renamed from: o.fl$k$a */
        /* loaded from: classes3.dex */
        public class a extends OutputStream {
            public final /* synthetic */ Writer Y0;
            public int X = 0;
            public int Y = 0;
            public int Z = 0;

            public a(Writer writer) {
                this.Y0 = writer;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i = this.Y;
                if (i > 0) {
                    int i2 = this.X;
                    f fVar = k.this.f;
                    this.Y0.write(fVar.d((i2 << (fVar.d - i)) & fVar.c));
                    this.Z++;
                    if (k.this.g != null) {
                        while (true) {
                            int i3 = this.Z;
                            k kVar = k.this;
                            if (i3 % kVar.f.e == 0) {
                                break;
                            }
                            this.Y0.write(kVar.g.charValue());
                            this.Z++;
                        }
                    }
                }
                this.Y0.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.Y0.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                this.X = (i & 255) | (this.X << 8);
                this.Y += 8;
                while (true) {
                    int i2 = this.Y;
                    f fVar = k.this.f;
                    int i3 = fVar.d;
                    if (i2 >= i3) {
                        this.Y0.write(fVar.d((this.X >> (i2 - i3)) & fVar.c));
                        this.Z++;
                        this.Y -= k.this.f.d;
                    } else {
                        return;
                    }
                }
            }
        }

        public k(String str, String str2, @MB Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl A(char c) {
            Character ch;
            if (8 % this.f.d != 0 && ((ch = this.g) == null || ch.charValue() != c)) {
                return D(this.f, Character.valueOf(c));
            }
            return this;
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl B(String str, int i) {
            boolean z = false;
            for (int i2 = 0; i2 < str.length(); i2++) {
                C10664xF1.u(!this.f.i(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.g;
            if (ch != null) {
                if (str.indexOf(ch.charValue()) < 0) {
                    z = true;
                }
                C10664xF1.u(z, "Separator (%s) cannot contain padding character", str);
            }
            return new j(this, str, i);
        }

        public void C(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            boolean z;
            C10664xF1.E(appendable);
            C10664xF1.f0(i, i + i2, bArr.length);
            int i3 = 0;
            if (i2 <= this.f.f) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f.d;
            while (i3 < i2 * 8) {
                f fVar = this.f;
                appendable.append(fVar.d(((int) (j >>> (i5 - i3))) & fVar.c));
                i3 += this.f.d;
            }
            if (this.g != null) {
                while (i3 < this.f.f * 8) {
                    appendable.append(this.g.charValue());
                    i3 += this.f.d;
                }
            }
        }

        public AbstractC6372fl D(f fVar, @MB Character ch) {
            return new k(fVar, ch);
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (this.f.equals(kVar.f) && C2593Bt1.a(this.g, kVar.g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC6372fl
        public boolean f(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            CharSequence y = y(charSequence);
            if (!this.f.g(y.length())) {
                return false;
            }
            for (int i = 0; i < y.length(); i++) {
                if (!this.f.b(y.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f.hashCode() ^ C2593Bt1.b(this.g);
        }

        @Override // o.AbstractC6372fl
        public int i(byte[] bArr, CharSequence charSequence) throws i {
            f fVar;
            C10664xF1.E(bArr);
            CharSequence y = y(charSequence);
            if (this.f.g(y.length())) {
                int i = 0;
                int i2 = 0;
                while (i < y.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        fVar = this.f;
                        if (i3 >= fVar.e) {
                            break;
                        }
                        j <<= fVar.d;
                        if (i + i3 < y.length()) {
                            j |= this.f.c(y.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = fVar.f;
                    int i6 = (i5 * 8) - (i4 * fVar.d);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((j >>> i7) & 255);
                        i7 -= 8;
                        i2++;
                    }
                    i += this.f.e;
                }
                return i2;
            }
            int length = y.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new i(sb.toString());
        }

        @Override // o.AbstractC6372fl
        @InterfaceC11149zF0
        public InputStream k(Reader reader) {
            C10664xF1.E(reader);
            return new b(reader);
        }

        @Override // o.AbstractC6372fl
        public void n(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C10664xF1.E(appendable);
            C10664xF1.f0(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                C(appendable, bArr, i + i3, Math.min(this.f.f, i2 - i3));
                i3 += this.f.f;
            }
        }

        @Override // o.AbstractC6372fl
        @InterfaceC11149zF0
        public OutputStream p(Writer writer) {
            C10664xF1.E(writer);
            return new a(writer);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl s() {
            AbstractC6372fl abstractC6372fl = this.i;
            if (abstractC6372fl == null) {
                f h = this.f.h();
                if (h == this.f) {
                    abstractC6372fl = this;
                } else {
                    abstractC6372fl = D(h, this.g);
                }
                this.i = abstractC6372fl;
            }
            return abstractC6372fl;
        }

        @Override // o.AbstractC6372fl
        public int t(int i) {
            return (int) (((this.f.d * i) + 7) / 8);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f.toString());
            if (8 % this.f.d != 0) {
                if (this.g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // o.AbstractC6372fl
        public int u(int i) {
            f fVar = this.f;
            return fVar.e * C9979uR0.g(i, fVar.f, RoundingMode.CEILING);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl v() {
            if (this.g == null) {
                return this;
            }
            return D(this.f, null);
        }

        @Override // o.AbstractC6372fl
        public CharSequence y(CharSequence charSequence) {
            C10664xF1.E(charSequence);
            Character ch = this.g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // o.AbstractC6372fl
        public AbstractC6372fl z() {
            AbstractC6372fl abstractC6372fl = this.h;
            if (abstractC6372fl == null) {
                f j = this.f.j();
                if (j == this.f) {
                    abstractC6372fl = this;
                } else {
                    abstractC6372fl = D(j, this.g);
                }
                this.h = abstractC6372fl;
            }
            return abstractC6372fl;
        }

        public k(f fVar, @MB Character ch) {
            this.f = (f) C10664xF1.E(fVar);
            C10664xF1.u(ch == null || !fVar.i(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.g = ch;
        }

        /* renamed from: o.fl$k$b */
        /* loaded from: classes3.dex */
        public class b extends InputStream {
            public final /* synthetic */ Reader Z0;
            public int X = 0;
            public int Y = 0;
            public int Z = 0;
            public boolean Y0 = false;

            public b(Reader reader) {
                this.Z0 = reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.Z0.close();
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
                r1 = r5.Z;
                r2 = new java.lang.StringBuilder(41);
                r2.append("Padding cannot start at index ");
                r2.append(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
                throw new o.AbstractC6372fl.i(r2.toString());
             */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int read() throws IOException {
                int i;
                while (true) {
                    int read = this.Z0.read();
                    if (read == -1) {
                        if (this.Y0 || k.this.f.g(this.Z)) {
                            return -1;
                        }
                        int i2 = this.Z;
                        StringBuilder sb = new StringBuilder(32);
                        sb.append("Invalid input length ");
                        sb.append(i2);
                        throw new i(sb.toString());
                    }
                    this.Z++;
                    char c = (char) read;
                    Character ch = k.this.g;
                    if (ch != null && ch.charValue() == c) {
                        if (this.Y0 || ((i = this.Z) != 1 && k.this.f.g(i - 1))) {
                            this.Y0 = true;
                        }
                    } else if (!this.Y0) {
                        int i3 = this.X;
                        f fVar = k.this.f;
                        int i4 = i3 << fVar.d;
                        this.X = i4;
                        int c2 = fVar.c(c) | i4;
                        this.X = c2;
                        int i5 = this.Y + k.this.f.d;
                        this.Y = i5;
                        if (i5 >= 8) {
                            int i6 = i5 - 8;
                            this.Y = i6;
                            return (c2 >> i6) & 255;
                        }
                    } else {
                        int i7 = this.Z;
                        StringBuilder sb2 = new StringBuilder(61);
                        sb2.append("Expected padding character but found '");
                        sb2.append(c);
                        sb2.append("' at index ");
                        sb2.append(i7);
                        throw new i(sb2.toString());
                    }
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = i2 + i;
                C10664xF1.f0(i, i3, bArr.length);
                int i4 = i;
                while (i4 < i3) {
                    int read = read();
                    if (read == -1) {
                        int i5 = i4 - i;
                        if (i5 == 0) {
                            return -1;
                        }
                        return i5;
                    }
                    bArr[i4] = (byte) read;
                    i4++;
                }
                return i4 - i;
            }
        }
    }

    public static AbstractC6372fl a() {
        return e;
    }

    public static AbstractC6372fl b() {
        return c;
    }

    public static AbstractC6372fl c() {
        return d;
    }

    public static AbstractC6372fl d() {
        return a;
    }

    public static AbstractC6372fl e() {
        return b;
    }

    public static byte[] q(byte[] bArr, int i2) {
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    @InterfaceC11149zF0
    public static Reader r(Reader reader, String str) {
        C10664xF1.E(reader);
        C10664xF1.E(str);
        return new c(reader, str);
    }

    public static Appendable w(Appendable appendable, String str, int i2) {
        boolean z;
        C10664xF1.E(appendable);
        C10664xF1.E(str);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        return new d(i2, appendable, str);
    }

    @InterfaceC11149zF0
    public static Writer x(Writer writer, String str, int i2) {
        return new e(w(writer, str, i2), writer);
    }

    public abstract AbstractC6372fl A(char c2);

    public abstract AbstractC6372fl B(String str, int i2);

    public abstract boolean f(CharSequence charSequence);

    public final byte[] g(CharSequence charSequence) {
        try {
            return h(charSequence);
        } catch (i e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final byte[] h(CharSequence charSequence) throws i {
        CharSequence y = y(charSequence);
        byte[] bArr = new byte[t(y.length())];
        return q(bArr, i(bArr, y));
    }

    public abstract int i(byte[] bArr, CharSequence charSequence) throws i;

    @InterfaceC11149zF0
    public final AbstractC7625ks j(AbstractC7459kB abstractC7459kB) {
        C10664xF1.E(abstractC7459kB);
        return new b(abstractC7459kB);
    }

    @InterfaceC11149zF0
    public abstract InputStream k(Reader reader);

    public String l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public final String m(byte[] bArr, int i2, int i3) {
        C10664xF1.f0(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(u(i3));
        try {
            n(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void n(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    @InterfaceC11149zF0
    public final AbstractC7382js o(AbstractC7216jB abstractC7216jB) {
        C10664xF1.E(abstractC7216jB);
        return new a(abstractC7216jB);
    }

    @InterfaceC11149zF0
    public abstract OutputStream p(Writer writer);

    public abstract AbstractC6372fl s();

    public abstract int t(int i2);

    public abstract int u(int i2);

    public abstract AbstractC6372fl v();

    public CharSequence y(CharSequence charSequence) {
        return (CharSequence) C10664xF1.E(charSequence);
    }

    public abstract AbstractC6372fl z();

    /* renamed from: o.fl$c */
    /* loaded from: classes3.dex */
    public class c extends Reader {
        public final /* synthetic */ Reader X;
        public final /* synthetic */ String Y;

        public c(Reader reader, String str) {
            this.X = reader;
            this.Y = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.X.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int read;
            do {
                read = this.X.read();
                if (read == -1) {
                    break;
                }
            } while (this.Y.indexOf((char) read) >= 0);
            return read;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.fl$d */
    /* loaded from: classes3.dex */
    public class d implements Appendable {
        public int X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ String Y0;
        public final /* synthetic */ Appendable Z;

        public d(int i, Appendable appendable, String str) {
            this.Y = i;
            this.Z = appendable;
            this.Y0 = str;
            this.X = i;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.X == 0) {
                this.Z.append(this.Y0);
                this.X = this.Y;
            }
            this.Z.append(c);
            this.X--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@MB CharSequence charSequence, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@MB CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }
}
