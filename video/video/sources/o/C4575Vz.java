package o;

import java.util.HashMap;
import o.C8068mc2;

/* renamed from: o.Vz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4575Vz extends C9210rH0 {
    public float q0;
    @Deprecated
    public HashMap<String, Float> r0;
    @Deprecated
    public HashMap<String, Float> s0;
    @Deprecated
    public HashMap<String, Float> t0;
    public HashMap<String, Float> u0;
    public HashMap<String, Float> v0;
    public C8068mc2.a w0;

    public C4575Vz(C8068mc2 c8068mc2, C8068mc2.d dVar) {
        super(c8068mc2, dVar);
        this.q0 = 0.5f;
        this.r0 = new HashMap<>();
        this.s0 = new HashMap<>();
        this.t0 = new HashMap<>();
        this.w0 = C8068mc2.a.SPREAD;
    }

    public void U0(Object obj, float f, float f2, float f3, float f4, float f5) {
        super.P0(obj);
        String obj2 = obj.toString();
        if (!Float.isNaN(f)) {
            this.r0.put(obj2, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            this.s0.put(obj2, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.t0.put(obj2, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            if (this.u0 == null) {
                this.u0 = new HashMap<>();
            }
            this.u0.put(obj2, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            if (this.v0 == null) {
                this.v0 = new HashMap<>();
            }
            this.v0.put(obj2, Float.valueOf(f5));
        }
    }

    public void V0(String str, float f, float f2, float f3) {
        U0(str, f, f2, f3, 0.0f, 0.0f);
    }

    @Override // o.QK
    /* renamed from: W0 */
    public C4575Vz n(float f) {
        this.q0 = f;
        return this;
    }

    public float X0() {
        return this.q0;
    }

    public float Y0(String str) {
        HashMap<String, Float> hashMap = this.v0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.v0.get(str).floatValue();
        }
        return 0.0f;
    }

    public float Z0(String str) {
        if (this.t0.containsKey(str)) {
            return this.t0.get(str).floatValue();
        }
        return 0.0f;
    }

    public float a1(String str) {
        HashMap<String, Float> hashMap = this.u0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.u0.get(str).floatValue();
        }
        return 0.0f;
    }

    public float b1(String str) {
        if (this.s0.containsKey(str)) {
            return this.s0.get(str).floatValue();
        }
        return 0.0f;
    }

    public C8068mc2.a c1() {
        return C8068mc2.a.SPREAD;
    }

    public float d1(String str) {
        if (this.r0.containsKey(str)) {
            return this.r0.get(str).floatValue();
        }
        return -1.0f;
    }

    public C4575Vz e1(C8068mc2.a aVar) {
        this.w0 = aVar;
        return this;
    }
}
