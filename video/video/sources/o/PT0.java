package o;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.C8982qM1;

/* loaded from: classes.dex */
public class PT0 implements OT0 {
    public static final OT0 a = new PT0();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float V = C6516gH2.V(childAt);
                if (V > f) {
                    f = V;
                }
            }
        }
        return f;
    }

    @Override // o.OT0
    public void a(View view) {
        int i = C8982qM1.c.a;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            C6516gH2.W1(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // o.OT0
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C8982qM1.c.a;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C6516gH2.V(view));
                C6516gH2.W1(view, e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // o.OT0
    public void b(View view) {
    }

    @Override // o.OT0
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
