package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class FastParser<T extends FastJsonResponse> {
    public static final char[] g = {'u', 'l', 'l'};
    public static final char[] h = {'r', 'u', 'e'};
    public static final char[] i = {'r', 'u', 'e', '\"'};
    public static final char[] j = {'a', 'l', 's', 'e'};
    public static final char[] k = {'a', 'l', 's', 'e', '\"'};
    public static final char[] l = {'\n'};
    public static final zai<Integer> m = new zaa();
    public static final zai<Long> n = new zab();

    /* renamed from: o  reason: collision with root package name */
    public static final zai<Float> f194o = new zac();
    public static final zai<Double> p = new zad();
    public static final zai<Boolean> q = new zae();
    public static final zai<String> r = new zaf();
    public static final zai<BigInteger> s = new zag();
    public static final zai<BigDecimal> t = new zah();
    public final char[] a = new char[1];
    public final char[] b = new char[32];
    public final char[] c = new char[1024];
    public final StringBuilder d = new StringBuilder(32);
    public final StringBuilder e = new StringBuilder(1024);
    public final Stack<Integer> f = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ParseException extends Exception {
        public ParseException(@InterfaceC5670cr1 String str) {
            super(str);
        }

        public ParseException(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(@InterfaceC5670cr1 Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String b(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @InterfaceC11300zs1 char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                for (int i2 = 0; i2 < read; i2++) {
                    char c = cArr[i2];
                    if (Character.isISOControl(c)) {
                        if (cArr2 == null) {
                            break loop0;
                        }
                        for (int i3 = 0; i3 <= 0; i3++) {
                            if (cArr2[i3] != c) {
                            }
                        }
                        break loop0;
                    }
                    if (c == '\"') {
                        if (!z2) {
                            sb.append(cArr, 0, i2);
                            bufferedReader.reset();
                            bufferedReader.skip(i2 + 1);
                            if (z) {
                                return JsonUtils.c(sb.toString());
                            }
                            return sb.toString();
                        }
                    } else if (c == '\\') {
                        z2 = !z2;
                        z = true;
                    }
                    z2 = false;
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
    }

    public final boolean A(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char[] cArr;
        char[] cArr2;
        char k2 = k(bufferedReader);
        if (k2 != '\"') {
            if (k2 != 'f') {
                if (k2 != 'n') {
                    if (k2 == 't') {
                        if (z) {
                            cArr2 = i;
                        } else {
                            cArr2 = h;
                        }
                        z(bufferedReader, cArr2);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(k2);
                    throw new ParseException(sb.toString());
                }
                z(bufferedReader, g);
                return false;
            }
            if (z) {
                cArr = k;
            } else {
                cArr = j;
            }
            z(bufferedReader, cArr);
            return false;
        } else if (!z) {
            return A(bufferedReader, true);
        } else {
            throw new ParseException("No boolean value found in string");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i2;
        HashMap hashMap;
        String str;
        String str2;
        Map<String, FastJsonResponse.Field<?, ?>> c = fastJsonResponse.c();
        String s2 = s(bufferedReader);
        if (s2 != null) {
            while (s2 != null) {
                FastJsonResponse.Field<?, ?> field = c.get(s2);
                if (field == null) {
                    s2 = t(bufferedReader);
                } else {
                    this.f.push(4);
                    int i3 = field.Y;
                    switch (i3) {
                        case 0:
                            if (field.Z) {
                                fastJsonResponse.d0(field, w(bufferedReader, m));
                            } else {
                                fastJsonResponse.c0(field, n(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 1:
                            if (field.Z) {
                                fastJsonResponse.J(field, w(bufferedReader, s));
                            } else {
                                fastJsonResponse.E(field, v(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 2:
                            if (field.Z) {
                                fastJsonResponse.g0(field, w(bufferedReader, n));
                            } else {
                                fastJsonResponse.f0(field, p(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 3:
                            if (field.Z) {
                                fastJsonResponse.Z(field, w(bufferedReader, f194o));
                            } else {
                                fastJsonResponse.X(field, m(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 4:
                            if (field.Z) {
                                fastJsonResponse.T(field, w(bufferedReader, p));
                            } else {
                                fastJsonResponse.R(field, l(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 5:
                            if (field.Z) {
                                fastJsonResponse.C(field, w(bufferedReader, t));
                            } else {
                                fastJsonResponse.A(field, u(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 6:
                            if (field.Z) {
                                fastJsonResponse.N(field, w(bufferedReader, q));
                            } else {
                                fastJsonResponse.L(field, A(bufferedReader, false));
                            }
                            i2 = 4;
                            break;
                        case 7:
                            if (field.Z) {
                                fastJsonResponse.v(field, w(bufferedReader, r));
                            } else {
                                fastJsonResponse.t(field, q(bufferedReader));
                            }
                            i2 = 4;
                            break;
                        case 8:
                            fastJsonResponse.P(field, Base64Utils.a(r(bufferedReader, this.c, this.e, l)));
                            i2 = 4;
                            break;
                        case 9:
                            fastJsonResponse.P(field, Base64Utils.b(r(bufferedReader, this.c, this.e, l)));
                            i2 = 4;
                            break;
                        case 10:
                            char k2 = k(bufferedReader);
                            if (k2 == 'n') {
                                z(bufferedReader, g);
                                hashMap = null;
                            } else if (k2 == '{') {
                                this.f.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char k3 = k(bufferedReader);
                                    if (k3 != 0) {
                                        if (k3 != '\"') {
                                            if (k3 == '}') {
                                                y(1);
                                            }
                                        } else {
                                            String b = b(bufferedReader, this.b, this.d, null);
                                            if (k(bufferedReader) != ':') {
                                                String valueOf = String.valueOf(b);
                                                if (valueOf.length() != 0) {
                                                    str = "No map value found for key ".concat(valueOf);
                                                } else {
                                                    str = new String("No map value found for key ");
                                                }
                                                throw new ParseException(str);
                                            } else if (k(bufferedReader) != '\"') {
                                                String valueOf2 = String.valueOf(b);
                                                if (valueOf2.length() != 0) {
                                                    str2 = "Expected String value for key ".concat(valueOf2);
                                                } else {
                                                    str2 = new String("Expected String value for key ");
                                                }
                                                throw new ParseException(str2);
                                            } else {
                                                hashMap.put(b, b(bufferedReader, this.b, this.d, null));
                                                char k4 = k(bufferedReader);
                                                if (k4 != ',') {
                                                    if (k4 == '}') {
                                                        y(1);
                                                    } else {
                                                        StringBuilder sb = new StringBuilder(48);
                                                        sb.append("Unexpected character while parsing string map: ");
                                                        sb.append(k4);
                                                        throw new ParseException(sb.toString());
                                                    }
                                                }
                                            }
                                        }
                                        i2 = 4;
                                        break;
                                    } else {
                                        throw new ParseException("Unexpected EOF");
                                    }
                                }
                            } else {
                                throw new ParseException("Expected start of a map object");
                            }
                            fastJsonResponse.u(field, hashMap);
                            i2 = 4;
                        case 11:
                            if (field.Z) {
                                char k5 = k(bufferedReader);
                                if (k5 == 'n') {
                                    z(bufferedReader, g);
                                    fastJsonResponse.a(field, field.a1, null);
                                } else {
                                    this.f.push(5);
                                    if (k5 == '[') {
                                        fastJsonResponse.a(field, field.a1, x(bufferedReader, field));
                                    } else {
                                        throw new ParseException("Expected array start");
                                    }
                                }
                            } else {
                                char k6 = k(bufferedReader);
                                if (k6 == 'n') {
                                    z(bufferedReader, g);
                                    fastJsonResponse.b(field, field.a1, null);
                                } else {
                                    this.f.push(1);
                                    if (k6 == '{') {
                                        try {
                                            FastJsonResponse c2 = field.c2();
                                            B(bufferedReader, c2);
                                            fastJsonResponse.b(field, field.a1, c2);
                                        } catch (IllegalAccessException e) {
                                            throw new ParseException("Error instantiating inner object", e);
                                        } catch (InstantiationException e2) {
                                            throw new ParseException("Error instantiating inner object", e2);
                                        }
                                    } else {
                                        throw new ParseException("Expected start of object");
                                    }
                                }
                            }
                            i2 = 4;
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder(30);
                            sb2.append("Invalid field type ");
                            sb2.append(i3);
                            throw new ParseException(sb2.toString());
                    }
                    y(i2);
                    y(2);
                    char k7 = k(bufferedReader);
                    if (k7 != ',') {
                        if (k7 == '}') {
                            s2 = null;
                        } else {
                            StringBuilder sb3 = new StringBuilder(55);
                            sb3.append("Expected end of object or field separator, but found: ");
                            sb3.append(k7);
                            throw new ParseException(sb3.toString());
                        }
                    } else {
                        s2 = s(bufferedReader);
                    }
                }
            }
            y(1);
            return true;
        }
        y(1);
        return false;
    }

    @KeepForSdk
    public void a(@InterfaceC5670cr1 InputStream inputStream, @InterfaceC5670cr1 T t2) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.f.push(0);
                char k2 = k(bufferedReader);
                if (k2 != 0) {
                    if (k2 != '[') {
                        if (k2 == '{') {
                            this.f.push(1);
                            B(bufferedReader, t2);
                        } else {
                            StringBuilder sb = new StringBuilder(19);
                            sb.append("Unexpected token: ");
                            sb.append(k2);
                            throw new ParseException(sb.toString());
                        }
                    } else {
                        this.f.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> c = t2.c();
                        if (c.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = c.entrySet().iterator().next().getValue();
                            t2.a(value, value.a1, x(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    }
                    y(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    public final char k(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.a) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.a[0])) {
            if (bufferedReader.read(this.a) == -1) {
                return (char) 0;
            }
        }
        return this.a[0];
    }

    public final double l(BufferedReader bufferedReader) throws ParseException, IOException {
        int o2 = o(bufferedReader, this.c);
        if (o2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.c, 0, o2));
    }

    public final float m(BufferedReader bufferedReader) throws ParseException, IOException {
        int o2 = o(bufferedReader, this.c);
        if (o2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.c, 0, o2));
    }

    public final int n(BufferedReader bufferedReader) throws ParseException, IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int o2 = o(bufferedReader, this.c);
        if (o2 == 0) {
            return 0;
        }
        char[] cArr = this.c;
        if (o2 > 0) {
            char c = cArr[0];
            if (c == '-') {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = C10323vs.f;
            }
            if (c == '-') {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 < o2) {
                i5 = i3 + 1;
                int digit = Character.digit(cArr[i3], 10);
                if (digit >= 0) {
                    i4 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i4 = 0;
                i5 = i3;
            }
            while (i5 < o2) {
                int i6 = i5 + 1;
                int digit2 = Character.digit(cArr[i5], 10);
                if (digit2 >= 0) {
                    if (i4 >= -214748364) {
                        int i7 = i4 * 10;
                        if (i7 >= i2 + digit2) {
                            i4 = i7 - digit2;
                            i5 = i6;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i3 != 0) {
                if (i5 > 1) {
                    return i4;
                }
                throw new ParseException("No digits to parse");
            }
            return -i4;
        }
        throw new ParseException("No number to parse");
    }

    public final int o(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2;
        char k2 = k(bufferedReader);
        if (k2 != 0) {
            if (k2 != ',') {
                if (k2 == 'n') {
                    z(bufferedReader, g);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (k2 == '\"') {
                    i2 = 0;
                    boolean z = false;
                    while (i2 < 1024 && bufferedReader.read(cArr, i2, 1) != -1) {
                        char c = cArr[i2];
                        if (!Character.isISOControl(c)) {
                            if (c == '\"') {
                                if (!z) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i2 + 1);
                                    return i2;
                                }
                            } else if (c == '\\') {
                                z = !z;
                                i2++;
                            }
                            z = false;
                            i2++;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = k2;
                    i2 = 1;
                    while (i2 < 1024 && bufferedReader.read(cArr, i2, 1) != -1) {
                        char c2 = cArr[i2];
                        if (c2 != '}' && c2 != ',' && !Character.isWhitespace(c2) && cArr[i2] != ']') {
                            i2++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i2 - 1);
                            cArr[i2] = 0;
                            return i2;
                        }
                    }
                }
                if (i2 == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    public final long p(BufferedReader bufferedReader) throws ParseException, IOException {
        long j2;
        long j3;
        int i2;
        int o2 = o(bufferedReader, this.c);
        if (o2 == 0) {
            return 0L;
        }
        char[] cArr = this.c;
        if (o2 > 0) {
            int i3 = 0;
            char c = cArr[0];
            if (c == '-') {
                j2 = Long.MIN_VALUE;
            } else {
                j2 = C10323vs.b;
            }
            if (c == '-') {
                i3 = 1;
            }
            int i4 = 10;
            if (i3 < o2) {
                i2 = i3 + 1;
                int digit = Character.digit(cArr[i3], 10);
                if (digit >= 0) {
                    j3 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j3 = 0;
                i2 = i3;
            }
            while (i2 < o2) {
                int i5 = i2 + 1;
                int digit2 = Character.digit(cArr[i2], i4);
                if (digit2 >= 0) {
                    if (j3 >= -922337203685477580L) {
                        long j4 = j3 * 10;
                        long j5 = j2;
                        long j6 = digit2;
                        if (j4 >= j5 + j6) {
                            j3 = j4 - j6;
                            i2 = i5;
                            j2 = j5;
                            i4 = 10;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i3 != 0) {
                if (i2 > 1) {
                    return j3;
                }
                throw new ParseException("No digits to parse");
            }
            return -j3;
        }
        throw new ParseException("No number to parse");
    }

    @InterfaceC11300zs1
    public final String q(BufferedReader bufferedReader) throws ParseException, IOException {
        return r(bufferedReader, this.b, this.d, null);
    }

    @InterfaceC11300zs1
    public final String r(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @InterfaceC11300zs1 char[] cArr2) throws ParseException, IOException {
        char k2 = k(bufferedReader);
        if (k2 != '\"') {
            if (k2 == 'n') {
                z(bufferedReader, g);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return b(bufferedReader, cArr, sb, cArr2);
    }

    @InterfaceC11300zs1
    public final String s(BufferedReader bufferedReader) throws ParseException, IOException {
        this.f.push(2);
        char k2 = k(bufferedReader);
        if (k2 != '\"') {
            if (k2 != ']') {
                if (k2 == '}') {
                    y(2);
                    return null;
                }
                StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(k2);
                throw new ParseException(sb.toString());
            }
            y(2);
            y(1);
            y(5);
            return null;
        }
        this.f.push(3);
        String b = b(bufferedReader, this.b, this.d, null);
        y(3);
        if (k(bufferedReader) == ':') {
            return b;
        }
        throw new ParseException("Expected key/value separator");
    }

    @InterfaceC11300zs1
    public final String t(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char k2 = k(bufferedReader);
        int i2 = 1;
        if (k2 != '\"') {
            if (k2 != ',') {
                if (k2 != '[') {
                    if (k2 != '{') {
                        bufferedReader.reset();
                        o(bufferedReader, this.c);
                    } else {
                        this.f.push(1);
                        bufferedReader.mark(32);
                        char k3 = k(bufferedReader);
                        if (k3 == '}') {
                            y(1);
                        } else if (k3 == '\"') {
                            bufferedReader.reset();
                            s(bufferedReader);
                            do {
                            } while (t(bufferedReader) != null);
                            y(1);
                        } else {
                            StringBuilder sb = new StringBuilder(18);
                            sb.append("Unexpected token ");
                            sb.append(k3);
                            throw new ParseException(sb.toString());
                        }
                    }
                } else {
                    this.f.push(5);
                    bufferedReader.mark(32);
                    if (k(bufferedReader) == ']') {
                        y(5);
                    } else {
                        bufferedReader.reset();
                        boolean z = false;
                        boolean z2 = false;
                        while (i2 > 0) {
                            char k4 = k(bufferedReader);
                            if (k4 != 0) {
                                if (!Character.isISOControl(k4)) {
                                    if (k4 == '\"') {
                                        if (!z2) {
                                            z = !z;
                                        }
                                        k4 = '\"';
                                    }
                                    if (k4 == '[') {
                                        if (!z) {
                                            i2++;
                                        }
                                        k4 = '[';
                                    }
                                    if (k4 == ']' && !z) {
                                        i2--;
                                    }
                                    if (k4 == '\\' && z) {
                                        z2 = !z2;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    throw new ParseException("Unexpected control character while reading array");
                                }
                            } else {
                                throw new ParseException("Unexpected EOF while parsing array");
                            }
                        }
                        y(5);
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader.read(this.a) != -1) {
            char c = this.a[0];
            boolean z3 = false;
            do {
                if (c == '\"') {
                    if (z3) {
                        z3 = true;
                        c = '\"';
                    }
                }
                if (c == '\\') {
                    z3 = !z3;
                } else {
                    z3 = false;
                }
                if (bufferedReader.read(this.a) != -1) {
                    c = this.a[0];
                } else {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char k5 = k(bufferedReader);
        if (k5 != ',') {
            if (k5 == '}') {
                y(2);
                return null;
            }
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(k5);
            throw new ParseException(sb2.toString());
        }
        y(2);
        return s(bufferedReader);
    }

    @InterfaceC11300zs1
    public final BigDecimal u(BufferedReader bufferedReader) throws ParseException, IOException {
        int o2 = o(bufferedReader, this.c);
        if (o2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.c, 0, o2));
    }

    @InterfaceC11300zs1
    public final BigInteger v(BufferedReader bufferedReader) throws ParseException, IOException {
        int o2 = o(bufferedReader, this.c);
        if (o2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.c, 0, o2));
    }

    @InterfaceC11300zs1
    public final <O> ArrayList<O> w(BufferedReader bufferedReader, zai<O> zaiVar) throws ParseException, IOException {
        char k2 = k(bufferedReader);
        if (k2 == 'n') {
            z(bufferedReader, g);
            return null;
        } else if (k2 == '[') {
            this.f.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char k3 = k(bufferedReader);
                if (k3 != 0) {
                    if (k3 != ',') {
                        if (k3 != ']') {
                            bufferedReader.reset();
                            arrayList.add(zaiVar.a(this, bufferedReader));
                        } else {
                            y(5);
                            return arrayList;
                        }
                    }
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11300zs1
    public final <T extends FastJsonResponse> ArrayList<T> x(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        char k2 = k(bufferedReader);
        if (k2 != ']') {
            if (k2 != 'n') {
                if (k2 == '{') {
                    this.f.push(1);
                    while (true) {
                        try {
                            FastJsonResponse c2 = field.c2();
                            if (B(bufferedReader, c2)) {
                                arrayList.add(c2);
                                char k3 = k(bufferedReader);
                                if (k3 != ',') {
                                    if (k3 == ']') {
                                        y(5);
                                        return arrayList;
                                    }
                                    StringBuilder sb = new StringBuilder(19);
                                    sb.append("Unexpected token: ");
                                    sb.append(k3);
                                    throw new ParseException(sb.toString());
                                } else if (k(bufferedReader) == '{') {
                                    this.f.push(1);
                                } else {
                                    throw new ParseException("Expected start of next object in array");
                                }
                            } else {
                                return arrayList;
                            }
                        } catch (IllegalAccessException e) {
                            throw new ParseException("Error instantiating inner object", e);
                        } catch (InstantiationException e2) {
                            throw new ParseException("Error instantiating inner object", e2);
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(k2);
                    throw new ParseException(sb2.toString());
                }
            } else {
                z(bufferedReader, g);
                y(5);
                return null;
            }
        } else {
            y(5);
            return arrayList;
        }
    }

    public final void y(int i2) throws ParseException {
        if (!this.f.isEmpty()) {
            int intValue = this.f.pop().intValue();
            if (intValue == i2) {
                return;
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i2);
            sb.append(" but had ");
            sb.append(intValue);
            throw new ParseException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i2);
        sb2.append(" but had empty stack");
        throw new ParseException(sb2.toString());
    }

    public final void z(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2 = 0;
        while (true) {
            int length = cArr.length;
            if (i2 < length) {
                int read = bufferedReader.read(this.b, 0, length - i2);
                if (read != -1) {
                    for (int i3 = 0; i3 < read; i3++) {
                        if (cArr[i3 + i2] != this.b[i3]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i2 += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }
}
