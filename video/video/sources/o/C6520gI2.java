package o;

import android.view.View;

/* renamed from: o.gI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6520gI2 {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void a(View view) {
        this.b = view.getLeft();
        this.c = view.getTop();
        this.d = view.getRight();
        this.e = view.getBottom();
        this.a = view.getRotation();
    }

    public int b() {
        return this.e - this.c;
    }

    public int c() {
        return this.d - this.b;
    }
}
