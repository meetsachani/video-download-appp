package o;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.v92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10152v92 extends LinearLayoutManager {
    public static final float O = 100.0f;

    /* renamed from: o.v92$a */
    /* loaded from: classes3.dex */
    public class a extends androidx.recyclerview.widget.o {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o
        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public C10152v92(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.D d, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i);
        k2(aVar);
    }
}
