package o;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* renamed from: o.wW  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10485wW {
    boolean b();

    boolean d();

    boolean e();

    boolean f();

    void g(Menu menu, j.a aVar);

    CharSequence getTitle();

    boolean h();

    void i();

    boolean j();

    boolean k();

    void l(SparseArray<Parcelable> sparseArray);

    void m(int i);

    void q();

    void r(SparseArray<Parcelable> sparseArray);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setUiOptions(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
