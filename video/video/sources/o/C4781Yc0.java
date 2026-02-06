package o;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: o.Yc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4781Yc0 implements InterfaceC6575gX0 {
    public final Object c;
    public final int d;
    public final int e;
    public final Class<?> f;
    public final Class<?> g;
    public final InterfaceC6575gX0 h;
    public final Map<Class<?>, InterfaceC5675cs2<?>> i;
    public final C5448bw1 j;
    public int k;

    public C4781Yc0(Object obj, InterfaceC6575gX0 interfaceC6575gX0, int i, int i2, Map<Class<?>, InterfaceC5675cs2<?>> map, Class<?> cls, Class<?> cls2, C5448bw1 c5448bw1) {
        this.c = C10175vF1.e(obj);
        this.h = (InterfaceC6575gX0) C10175vF1.f(interfaceC6575gX0, "Signature must not be null");
        this.d = i;
        this.e = i2;
        this.i = (Map) C10175vF1.e(map);
        this.f = (Class) C10175vF1.f(cls, "Resource class must not be null");
        this.g = (Class) C10175vF1.f(cls2, "Transcode class must not be null");
        this.j = (C5448bw1) C10175vF1.e(c5448bw1);
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C4781Yc0) {
            C4781Yc0 c4781Yc0 = (C4781Yc0) obj;
            if (this.c.equals(c4781Yc0.c) && this.h.equals(c4781Yc0.h) && this.e == c4781Yc0.e && this.d == c4781Yc0.d && this.i.equals(c4781Yc0.i) && this.f.equals(c4781Yc0.f) && this.g.equals(c4781Yc0.g) && this.j.equals(c4781Yc0.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        if (this.k == 0) {
            int hashCode = this.c.hashCode();
            this.k = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.h.hashCode()) * 31) + this.d) * 31) + this.e;
            this.k = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.i.hashCode();
            this.k = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f.hashCode();
            this.k = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.g.hashCode();
            this.k = hashCode5;
            this.k = (hashCode5 * 31) + this.j.hashCode();
        }
        return this.k;
    }

    public String toString() {
        return "EngineKey{model=" + this.c + ", width=" + this.d + ", height=" + this.e + ", resourceClass=" + this.f + ", transcodeClass=" + this.g + ", signature=" + this.h + ", hashCode=" + this.k + ", transformations=" + this.i + ", options=" + this.j + '}';
    }
}
