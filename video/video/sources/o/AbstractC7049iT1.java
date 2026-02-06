package o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.iT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7049iT1 extends AbstractC9004qS {
    public int g1;
    public int h1;
    public LayoutInflater i1;

    @Deprecated
    public AbstractC7049iT1(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.h1 = i;
        this.g1 = i;
        this.i1 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // o.AbstractC9004qS
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.i1.inflate(this.h1, viewGroup, false);
    }

    @Override // o.AbstractC9004qS
    public View s(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.i1.inflate(this.g1, viewGroup, false);
    }

    public void w(int i) {
        this.h1 = i;
    }

    public void x(int i) {
        this.g1 = i;
    }

    @Deprecated
    public AbstractC7049iT1(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.h1 = i;
        this.g1 = i;
        this.i1 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public AbstractC7049iT1(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.h1 = i;
        this.g1 = i;
        this.i1 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
