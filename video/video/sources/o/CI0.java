package o;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class CI0 {
    public final int a;
    public final List<MG0> b;
    public final int c;
    public final InputStream d;
    public final byte[] e;

    public CI0(int i, List<MG0> list) {
        this(i, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.e != null) {
            return new ByteArrayInputStream(this.e);
        }
        return null;
    }

    public final byte[] b() {
        return this.e;
    }

    public final int c() {
        return this.c;
    }

    public final List<MG0> d() {
        return Collections.unmodifiableList(this.b);
    }

    public final int e() {
        return this.a;
    }

    public CI0(int i, List<MG0> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }

    public CI0(int i, List<MG0> list, byte[] bArr) {
        this.a = i;
        this.b = list;
        this.c = bArr.length;
        this.e = bArr;
        this.d = null;
    }
}
