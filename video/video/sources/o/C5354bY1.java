package o;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.BM1;

/* renamed from: o.bY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5354bY1 {
    public Context a;
    public int b;
    public ViewGroup c;
    public View d;
    public Runnable e;
    public Runnable f;

    public C5354bY1(ViewGroup viewGroup) {
        this.b = -1;
        this.c = viewGroup;
    }

    public static C5354bY1 c(ViewGroup viewGroup) {
        return (C5354bY1) viewGroup.getTag(BM1.a.transition_current_scene);
    }

    public static C5354bY1 d(ViewGroup viewGroup, int i, Context context) {
        int i2 = BM1.a.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        C5354bY1 c5354bY1 = (C5354bY1) sparseArray.get(i);
        if (c5354bY1 != null) {
            return c5354bY1;
        }
        C5354bY1 c5354bY12 = new C5354bY1(viewGroup, i, context);
        sparseArray.put(i, c5354bY12);
        return c5354bY12;
    }

    public static void g(ViewGroup viewGroup, C5354bY1 c5354bY1) {
        viewGroup.setTag(BM1.a.transition_current_scene, c5354bY1);
    }

    public void a() {
        if (this.b > 0 || this.d != null) {
            e().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.a).inflate(this.b, this.c);
            } else {
                this.c.addView(this.d);
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.c) == this && (runnable = this.f) != null) {
            runnable.run();
        }
    }

    public ViewGroup e() {
        return this.c;
    }

    public boolean f() {
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    public void h(Runnable runnable) {
        this.e = runnable;
    }

    public void i(Runnable runnable) {
        this.f = runnable;
    }

    public C5354bY1(ViewGroup viewGroup, int i, Context context) {
        this.a = context;
        this.c = viewGroup;
        this.b = i;
    }

    public C5354bY1(ViewGroup viewGroup, View view) {
        this.b = -1;
        this.c = viewGroup;
        this.d = view;
    }
}
