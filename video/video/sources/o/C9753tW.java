package o;

import java.util.List;

/* renamed from: o.tW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9753tW {
    public final byte[] a;
    public int b;
    public final String c;
    public final List<byte[]> d;
    public final String e;
    public Integer f;
    public Integer g;
    public Object h;
    public final int i;
    public final int j;

    public C9753tW(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public Integer c() {
        return this.g;
    }

    public Integer d() {
        return this.f;
    }

    public int e() {
        return this.b;
    }

    public Object f() {
        return this.h;
    }

    public byte[] g() {
        return this.a;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public String j() {
        return this.c;
    }

    public boolean k() {
        if (this.i >= 0 && this.j >= 0) {
            return true;
        }
        return false;
    }

    public void l(Integer num) {
        this.g = num;
    }

    public void m(Integer num) {
        this.f = num;
    }

    public void n(int i) {
        this.b = i;
    }

    public void o(Object obj) {
        this.h = obj;
    }

    public C9753tW(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.a = bArr;
        this.b = bArr == null ? 0 : bArr.length * 8;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.i = i2;
        this.j = i;
    }
}
