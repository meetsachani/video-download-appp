package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: o.Lo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3562Lo extends AbstractC9141r0 {
    @Deprecated
    public static final Object h = new Object();
    public String[] f;
    public String[] g;

    public C3562Lo() {
        this.f = new String[]{"true", C3855Oo.f, C5738d80.b, "on", "1"};
        this.g = new String[]{C3855Oo.a, C3855Oo.b, GoogleApiAvailabilityLight.e, "off", "0"};
    }

    public static String[] p(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i].toLowerCase();
        }
        return strArr2;
    }

    @Override // o.AbstractC9141r0
    public <T> T g(Class<T> cls, Object obj) throws Throwable {
        if (Boolean.class.equals(cls) || Boolean.TYPE.equals(cls)) {
            String lowerCase = obj.toString().toLowerCase();
            for (String str : this.f) {
                if (str.equals(lowerCase)) {
                    return cls.cast(Boolean.TRUE);
                }
            }
            for (String str2 : this.g) {
                if (str2.equals(lowerCase)) {
                    return cls.cast(Boolean.FALSE);
                }
            }
        }
        throw c(cls, obj);
    }

    @Override // o.AbstractC9141r0
    public Class<Boolean> i() {
        return Boolean.class;
    }

    public C3562Lo(Object obj) {
        this.f = new String[]{"true", C3855Oo.f, C5738d80.b, "on", "1"};
        this.g = new String[]{C3855Oo.a, C3855Oo.b, GoogleApiAvailabilityLight.e, "off", "0"};
        if (obj != h) {
            n(obj);
        }
    }

    public C3562Lo(String[] strArr, String[] strArr2) {
        this.f = new String[]{"true", C3855Oo.f, C5738d80.b, "on", "1"};
        this.g = new String[]{C3855Oo.a, C3855Oo.b, GoogleApiAvailabilityLight.e, "off", "0"};
        this.f = p(strArr);
        this.g = p(strArr2);
    }

    public C3562Lo(String[] strArr, String[] strArr2, Object obj) {
        this.f = new String[]{"true", C3855Oo.f, C5738d80.b, "on", "1"};
        this.g = new String[]{C3855Oo.a, C3855Oo.b, GoogleApiAvailabilityLight.e, "off", "0"};
        this.f = p(strArr);
        this.g = p(strArr2);
        if (obj != h) {
            n(obj);
        }
    }
}
