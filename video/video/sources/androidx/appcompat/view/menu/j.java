package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar, boolean z);

        boolean b(e eVar);
    }

    void a(e eVar, boolean z);

    boolean c(e eVar, h hVar);

    void d(a aVar);

    void e(Parcelable parcelable);

    boolean f(m mVar);

    k g(ViewGroup viewGroup);

    int getId();

    Parcelable h();

    void i(boolean z);

    boolean j();

    boolean k(e eVar, h hVar);

    void l(Context context, e eVar);
}
