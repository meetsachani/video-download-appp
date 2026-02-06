package o;

import o.C8718pH0;

/* renamed from: o.tF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9688tF0 extends C8718pH0 {
    public int g;
    public int h;
    public float i;

    public AbstractC9688tF0(String str) {
        super(str, new C8718pH0.a(""));
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Float.NaN;
    }

    public int g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public int i() {
        return this.g;
    }

    public void j(int i) {
        this.h = i;
        this.d.put("end", String.valueOf(i));
    }

    public void k(float f) {
        this.i = f;
        this.d.put("percent", String.valueOf(f));
    }

    public void l(int i) {
        this.g = i;
        this.d.put("start", String.valueOf(i));
    }
}
