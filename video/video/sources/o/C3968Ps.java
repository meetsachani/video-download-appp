package o;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.zip.ZipException;

/* renamed from: o.Ps  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3968Ps implements Closeable, Iterable<String[]> {
    public static final boolean m1 = false;
    public static final boolean n1 = true;
    public static final int o1 = 100;
    public static final int p1 = 0;
    public static final int q1 = 0;
    public static final List<Class<? extends IOException>> r1 = Collections.unmodifiableList(Arrays.asList(CharacterCodingException.class, CharConversionException.class, UnsupportedEncodingException.class, UTFDataFormatException.class, ZipException.class, FileNotFoundException.class, MalformedInputException.class));
    public static final int s1 = 2;
    public static final int t1 = 100;
    public UI0 X;
    public int Y;
    public YZ0 Y0;
    public BufferedReader Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public int d1;
    public Locale e1;
    public long f1;
    public long g1;
    public String[] h1;
    public final Queue<C10344vw1<String>> i1;
    public final C5707d01 j1;
    public final C10970yV1 k1;
    public final InterfaceC9752tV1 l1;

    public C3968Ps(Reader reader) {
        this(reader, 0, new C3675Ms(',', '\"', '\\', false, true, false, UI0.j, Locale.getDefault()), false, true, 0, Locale.getDefault(), new C5707d01(), new C10970yV1(), null);
    }

    public String[] F() throws IOException {
        try {
            return f(false, false);
        } catch (C5817dS unused) {
            return null;
        }
    }

    public final void G() throws IOException {
        String str;
        long j = this.f1 + 1;
        int i = 0;
        do {
            String j2 = j();
            this.i1.add(new C10344vw1<>(j, j2));
            i++;
            if (!this.Z0) {
                if (this.X.h()) {
                    throw new RR(String.format(ResourceBundle.getBundle(UI0.k, this.e1).getString("unterminated.quote"), C4500Ve2.a(this.X.b(), 100)), j, this.X.b());
                }
                return;
            }
            int i2 = this.d1;
            if (i2 > 0 && i > i2) {
                long j3 = this.g1 + 1;
                String b = this.X.b();
                if (b.length() > 100) {
                    b = b.substring(0, 100);
                }
                throw new SR(String.format(this.e1, ResourceBundle.getBundle(UI0.k, this.e1).getString("multiline.limit.broken"), Integer.valueOf(this.d1), Long.valueOf(j3), b), j3, this.X.b(), this.d1);
            }
            String[] e = this.X.e(j2);
            if (e.length > 0) {
                String[] strArr = this.h1;
                if (strArr == null) {
                    this.h1 = e;
                } else {
                    this.h1 = d(strArr, e);
                }
            }
        } while (this.X.h());
        if (this.b1) {
            String[] strArr2 = this.h1;
            int length = strArr2.length - 1;
            String str2 = strArr2[length];
            if (str2 != null && str2.endsWith("\r")) {
                String[] strArr3 = this.h1;
                strArr3[length] = strArr3[length].substring(0, str.length() - 1);
            }
        }
    }

    public List<String[]> H() throws IOException, NR {
        LinkedList linkedList = new LinkedList();
        while (this.Z0) {
            String[] M = M();
            if (M != null) {
                linkedList.add(M);
            }
        }
        return linkedList;
    }

    public String[] M() throws IOException, C5817dS {
        return f(true, true);
    }

    public String[] Q() throws IOException {
        try {
            return f(true, false);
        } catch (C5817dS e) {
            throw new YR("A CSValidationException was thrown from the runNextSilently method which should not happen", e);
        }
    }

    public void U(Locale locale) {
        Locale locale2 = (Locale) C11304zt1.t(locale, Locale.getDefault());
        this.e1 = locale2;
        UI0 ui0 = this.X;
        if (ui0 != null) {
            ui0.d(locale2);
        }
    }

    public void V(int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            Q();
        }
    }

    public final void a0(long j, String str) throws C5817dS {
        try {
            this.j1.e(str);
        } catch (C5817dS e) {
            e.d(j);
            throw e;
        }
    }

    public void b0(String[] strArr, long j) throws C5817dS {
        if (strArr != null) {
            InterfaceC9752tV1 interfaceC9752tV1 = this.l1;
            if (interfaceC9752tV1 != null) {
                interfaceC9752tV1.a(strArr);
            }
            try {
                this.k1.e(strArr);
            } catch (C5817dS e) {
                e.d(j);
                throw e;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Z.close();
    }

    public String[] d(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public boolean e0() {
        return this.c1;
    }

    public final String[] f(boolean z, boolean z2) throws IOException, C5817dS {
        if (this.i1.isEmpty()) {
            G();
        }
        if (z2) {
            for (C10344vw1<String> c10344vw1 : this.i1) {
                a0(c10344vw1.b(), c10344vw1.a());
            }
            b0(this.h1, this.f1);
        }
        String[] strArr = this.h1;
        if (z) {
            this.i1.clear();
            this.h1 = null;
            if (strArr != null) {
                this.g1++;
            }
        }
        return strArr;
    }

    public long h() {
        return this.f1;
    }

    public int i() {
        return this.d1;
    }

    public boolean isClosed() throws IOException {
        if (!this.c1) {
            return false;
        }
        try {
            this.Z.mark(2);
            int read = this.Z.read();
            this.Z.reset();
            if (read != -1) {
                return false;
            }
            return true;
        } catch (IOException e) {
            if (!r1.contains(e.getClass())) {
                return true;
            }
            throw e;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<String[]> iterator() {
        try {
            C3577Ls c3577Ls = new C3577Ls(this);
            c3577Ls.c(this.e1);
            return c3577Ls;
        } catch (IOException | C5817dS e) {
            throw new RuntimeException(e);
        }
    }

    public String j() throws IOException {
        if (isClosed()) {
            this.Z0 = false;
            return null;
        }
        if (!this.a1) {
            for (int i = 0; i < this.Y; i++) {
                this.Y0.a();
                this.f1++;
            }
            this.a1 = true;
        }
        String a = this.Y0.a();
        if (a == null) {
            this.Z0 = false;
        } else {
            this.f1++;
        }
        if (!this.Z0) {
            return null;
        }
        return a;
    }

    public UI0 k() {
        return this.X;
    }

    public long l() {
        return this.g1;
    }

    public int p() {
        return this.Y;
    }

    public boolean r() {
        return this.b1;
    }

    public C3968Ps(Reader reader, int i, UI0 ui0, boolean z, boolean z2, int i2, Locale locale, C5707d01 c5707d01, C10970yV1 c10970yV1, InterfaceC9752tV1 interfaceC9752tV1) {
        this.Z0 = true;
        this.d1 = 0;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = null;
        this.i1 = new LinkedList();
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
        this.Z = bufferedReader;
        this.Y0 = new YZ0(bufferedReader, z);
        this.Y = i;
        this.X = ui0;
        this.b1 = z;
        this.c1 = z2;
        this.d1 = i2;
        this.e1 = (Locale) C11304zt1.t(locale, Locale.getDefault());
        this.j1 = c5707d01;
        this.k1 = c10970yV1;
        this.l1 = interfaceC9752tV1;
    }
}
