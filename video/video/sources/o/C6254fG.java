package o;

import android.graphics.drawable.ColorDrawable;

/* renamed from: o.fG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6254fG extends SJ1 {
    public final ColorDrawable r;
    public boolean s;
    public int t;

    public C6254fG(int i) {
        super(i);
        this.r = new ColorDrawable();
        this.t = 0;
    }

    public int B() {
        return this.t;
    }

    public void C(int i) {
        this.s = true;
        D(i);
    }

    public final void D(int i) {
        if (this.t != i) {
            this.t = i;
            this.r.setColor(i);
            s(this.r);
        }
    }

    @Override // o.SJ1
    public void g(int i) {
        if (!this.s) {
            D(i);
        }
    }

    @Override // o.SJ1
    public boolean o() {
        return true;
    }

    public C6254fG(int i, int i2) {
        this(i);
        C(i2);
    }
}
