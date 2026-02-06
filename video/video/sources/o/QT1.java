package o;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class QT1 {
    public final String a;
    public final byte[] b;
    public final int c;
    public UT1[] d;
    public final EnumC3839Ok e;
    public Map<ST1, Object> f;
    public final long g;

    public QT1(String str, byte[] bArr, UT1[] ut1Arr, EnumC3839Ok enumC3839Ok) {
        this(str, bArr, ut1Arr, enumC3839Ok, System.currentTimeMillis());
    }

    public void a(UT1[] ut1Arr) {
        UT1[] ut1Arr2 = this.d;
        if (ut1Arr2 == null) {
            this.d = ut1Arr;
        } else if (ut1Arr != null && ut1Arr.length > 0) {
            UT1[] ut1Arr3 = new UT1[ut1Arr2.length + ut1Arr.length];
            System.arraycopy(ut1Arr2, 0, ut1Arr3, 0, ut1Arr2.length);
            System.arraycopy(ut1Arr, 0, ut1Arr3, ut1Arr2.length, ut1Arr.length);
            this.d = ut1Arr3;
        }
    }

    public EnumC3839Ok b() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public byte[] d() {
        return this.b;
    }

    public Map<ST1, Object> e() {
        return this.f;
    }

    public UT1[] f() {
        return this.d;
    }

    public String g() {
        return this.a;
    }

    public long h() {
        return this.g;
    }

    public void i(Map<ST1, Object> map) {
        if (map != null) {
            Map<ST1, Object> map2 = this.f;
            if (map2 == null) {
                this.f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void j(ST1 st1, Object obj) {
        if (this.f == null) {
            this.f = new EnumMap(ST1.class);
        }
        this.f.put(st1, obj);
    }

    public String toString() {
        return this.a;
    }

    public QT1(String str, byte[] bArr, UT1[] ut1Arr, EnumC3839Ok enumC3839Ok, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, ut1Arr, enumC3839Ok, j);
    }

    public QT1(String str, byte[] bArr, int i, UT1[] ut1Arr, EnumC3839Ok enumC3839Ok, long j) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = ut1Arr;
        this.e = enumC3839Ok;
        this.f = null;
        this.g = j;
    }
}
